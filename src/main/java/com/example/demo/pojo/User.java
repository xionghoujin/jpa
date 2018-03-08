package com.example.demo.pojo;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Date;

/**
 * Created by XHJ on 2018/3/8.
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @NotNull
    @Min(value = 18, message = "未成年禁止登陆")
    private Integer age;
    @NotBlank
    private String phone;
    @NotNull
    private Integer role;
    @NotBlank
    private String address;
    @NotBlank
    private String question;
    @NotBlank
    private String answer;
    @CreationTimestamp
    private Date createTime;
    @UpdateTimestamp
    private Date updateTime;

    public User() {
    }

    public User(@NotBlank String username, @NotBlank String password, @NotNull @Min(value = 18, message = "未成年禁止登陆") Integer age, @NotBlank String phone, @NotNull Integer role, @NotBlank String address, @NotBlank String question, @NotBlank String answer) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.phone = phone;
        this.role = role;
        this.address = address;
        this.question = question;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", role=" + role +
                ", address='" + address + '\'' +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Integer getRole() {
        return role;
    }

    public User setRole(Integer role) {
        this.role = role;
        return this;
    }

    public String getQuestion() {
        return question;
    }

    public User setQuestion(String question) {
        this.question = question;
        return this;
    }

    public String getAnswer() {
        return answer;
    }

    public User setAnswer(String answer) {
        this.answer = answer;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public User setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public User setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public User setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

}
