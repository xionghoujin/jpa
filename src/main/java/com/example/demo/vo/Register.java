package com.example.demo.vo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


/**
 * Created by XHJ on 2018/3/7.
 */
public class Register {
    @NotBlank(message = "name不能为空")
    private String username;
    @NotBlank(message = "password不能为空")
    private String password;
    @NotNull(message = "age不能为空，且不能小于18岁")
    @Min(18)
    private Integer age;
    @NotNull(message = "address不能为空")
    private String address;

    public Register() {
    }

    public Register(String username,String password,Integer age,String address) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public Register setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Register setPassword(String password) {
        this.password = password;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Register setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Register setAddress(String address) {
        this.address = address;
        return this;
    }
}
