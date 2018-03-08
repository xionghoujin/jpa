package com.example.demo.vo;

import javax.validation.constraints.NotBlank;

/**
 * Created by XHJ on 2018/3/8.
 */
public class Login {
    @NotBlank
    String username;
    @NotBlank
    String password;

    public Login() {
    }

    public Login(@NotBlank String username, @NotBlank String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public Login setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Login setPassword(String password) {
        this.password = password;
        return this;
    }
}
