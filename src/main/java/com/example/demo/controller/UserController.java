package com.example.demo.controller;

import com.example.demo.common.Const;
import com.example.demo.common.ServerResponse;
import com.example.demo.pojo.User;
import com.example.demo.vo.Login;
import com.example.demo.vo.Register;
import com.example.demo.service.IPersonService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * @author XHJ
 * @date 2018/3/7
 */
@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private IPersonService iPersonService;

    @PostMapping("注册")
    @ApiOperation("注册")
    public ServerResponse<String> savePerson(@Valid Register Register, BindingResult bindingResult) {
       return iPersonService.savePerson(Register);
    }
    @PostMapping("登陆")
    @ApiOperation("登陆")
    public ServerResponse<User> login(@Valid  Login login, HttpSession session, BindingResult bindingResult) {
       ServerResponse<User> peopleServerResponse= iPersonService.login(login);
        if (peopleServerResponse.isSuccess()) {
            //确认身份后将身份信息存储在session中
            session.setAttribute(Const.CURRENT_USER,peopleServerResponse.getData());
        }
        return peopleServerResponse;
    }

    public ServerResponse<String> lgout(HttpSession session) {
        //从session中移除当前用户
        session.removeAttribute(Const.CURRENT_USER);
        return ServerResponse.createBySuccessMessage("退出登录");
    }
    @GetMapping("分页获取数据")
    @ApiOperation("分页获取数据 未完待续")
    public ServerResponse<Page> page(int page, int size) {
        return iPersonService.page(page, size);
    }
}
