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
    @NotBlank(message = "phone不能为空")
    private String phone;
    @NotNull(message = "address不能为空")
    private String address;
    @NotBlank(message = "question不能为空")
    private String question;
    @NotBlank(message = "answer不能为空")
    private String answer;

    public Register() {
    }

    public Register(@NotBlank(message = "name不能为空") String username, @NotBlank(message = "password不能为空") String password, @NotNull(message = "age不能为空，且不能小于18岁") @Min(18) Integer age, @NotBlank String phone, @NotNull(message = "address不能为空") String address, @NotBlank(message = "question不能为空") String question, @NotBlank(message = "answer不能为空") String answer) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.question = question;
        this.answer = answer;
    }

    public String getPhone() {
        return phone;
    }

    public Register setPhone(String phone) {
        this.phone = phone;
        return this;
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

    public String getQuestion() {
        return question;
    }

    public Register setQuestion(String question) {
        this.question = question;
        return this;
    }

    public String getAnswer() {
        return answer;
    }

    public Register setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
}
