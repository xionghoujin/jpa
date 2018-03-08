package com.example.demo.service.Impl;

import com.example.demo.common.ServerResponse;
import com.example.demo.dao.PeopleRepository;
import com.example.demo.pojo.People;
import com.example.demo.service.IPersonService;
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
    private PeopleRepository peopleRepository;

    @Override
    public ServerResponse<String> SavePerson(Register Register) {
        People people = peopleRepository.save(new People(Register.getUsername(),
                    Register.getPassword(),Register.getAge(), Register.getAddress()));
            if (people != null) {
                return ServerResponse.createBySuccessMessage("注册成功");
            }
              return ServerResponse.createByErrorMessage("注册失败");


    }


//
//    /**
//     * 注册
//     *
//     * @param Register
//     * @return
//     */
//    @Override
//    public ServerResponse<String> SavePerson(Register Register) {
//        if (personRepository.findByName(Register.getUsername()) == null) {
//            Person people = personRepository.save(new Person(Register.getUsername(),
//                    Register.getPassword(),Register.getAge(), Register.getAddress()));
//            if (people != null) {
//                return ServerResponse.createBySuccessMessage("注册成功");
//            } else {
//                return ServerResponse.createByErrorMessage("注册失败");
//            }
//        }
//        return ServerResponse.createByErrorMessage("name已存在");
//    }
//
    /**
     * 分页数据查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public ServerResponse<Page> page(int page, int size) {
        Page<People> personPage = peopleRepository.findAll(new PageRequest(page, size));
        return ServerResponse.createBySuccess(personPage);
    }
}
