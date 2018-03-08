//package com.example.demo.pojo;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;
//
///**
// * Created by XHJ on 2018/3/7.
// */
//@Entity
////@NamedQuery(username = "Person.withNameAndAddressNamedQuery",
////        query = "select p from Person p where p.username=?1 and p.address=?2 ")
//public class Person {
//    @Id
//    @GeneratedValue//表示该字段自增
//    private Long id;
//    @NotBlank
//    private String username;
//    @NotNull
//    private Integer age;
//    @NotBlank
//    private String address;
//
//    public Person() {
//    }
//
//
//
//    public Person(String username,Integer age,String address) {
//        this.username = username;
//        this.age = age;
//        this.address = address;
//    }
//
//
//    public Long getId() {
//        return id;
//    }
//
//    public Person setId(Long id) {
//        this.id = id;
//        return this;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public Person setUsername(String username) {
//        this.username = username;
//        return this;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public Person setAge(Integer age) {
//        this.age = age;
//        return this;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public Person setAddress(String address) {
//        this.address = address;
//        return this;
//    }
//}
