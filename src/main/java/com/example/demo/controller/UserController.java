package com.example.demo.controller;

import com.example.demo.common.ServerResponse;
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
       return iPersonService.SavePerson(Register);
    }
//
//    public ServerResponse<String> login() {
//        return null;
//    }
    @GetMapping("分页获取数据")
    @ApiOperation("分页获取数据")
    public ServerResponse<Page> page(int page, int size) {
        return iPersonService.page(page, size);
    }
}
