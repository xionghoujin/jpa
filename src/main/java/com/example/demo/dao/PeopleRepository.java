package com.example.demo.dao;

import com.example.demo.pojo.People;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by XHJ on 2018/3/8.
 */
public interface PeopleRepository extends JpaRepository<People,Integer> {
//    People findByName(String name);
}
