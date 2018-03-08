package com.example.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * Created by XHJ on 2018/3/8.
 */
@Entity
public class People {
    @Id
    @GeneratedValue
    private Integer id;
    private String username;
    private String password;
    @Min(value = 18, message = "未成年禁止登陆")
    private Integer age;
    private String address;

    public People() {
    }

    public People(String username, String password, @Min(value = 18, message = "未成年禁止登陆") Integer age, String address) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public People setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public People setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public People setPassword(String password) {
        this.password = password;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public People setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public People setAddress(String address) {
        this.address = address;
        return this;
    }

}
