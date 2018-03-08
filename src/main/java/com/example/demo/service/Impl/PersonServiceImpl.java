package com.example.demo.service.Impl;

import com.example.demo.common.Const;
import com.example.demo.common.ServerResponse;
import com.example.demo.dao.UserRepository;
import com.example.demo.pojo.User;
import com.example.demo.service.IPersonService;
import com.example.demo.util.MD5Util;
import com.example.demo.vo.Login;
import com.example.demo.vo.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * Created by XHJ on 2018/3/7.
 */
@Service
public class PersonServiceImpl implements IPersonService {
    @Autowired
    private UserRepository userRepository;

    /**
     *注册
     * @param register
     * @return
     */
    @Override
    public ServerResponse<String> savePerson(Register register) {
        if (userRepository.findByUsername(register.getUsername()) == null) {
            //设置密码进行MD5加密
            register.setPassword(MD5Util.MD5EncodeUtf8(register.getPassword()));
            User user = userRepository.save(new User(register.getUsername(),
                    register.getPassword(), register.getAge(),register.getPhone(), Const.Role.ROLE_CUSTOMER,
                    register.getAddress(),register.getQuestion(),register.getAnswer()));
            if (user != null) {
                return ServerResponse.createBySuccessMessage("注册成功");
            }
            return ServerResponse.createByErrorMessage("注册失败");
        }
        return ServerResponse.createByErrorMessage("name已存在");
    }

    /**
     * 登录
     * @param login
     * @return
     */
    @Override
    public ServerResponse<User> login(Login login) {
        User user = userRepository.findByUsernameAndPassword(login.getUsername(),MD5Util.MD5EncodeUtf8(login.getPassword()));
        if (user != null) {
            user.setPassword("");
            return ServerResponse.createBySuccess("欢迎登录", user);
        }
        return ServerResponse.createByErrorMessage("用户名或密码错误");
    }


    /**
     * 分页数据查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public ServerResponse<Page> page(int page, int size) {
        Page<User> personPage = userRepository.findAll(new PageRequest(page, size));
        return ServerResponse.createBySuccess(personPage);
    }
}
