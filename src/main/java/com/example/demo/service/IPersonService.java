package com.example.demo.service;

import com.example.demo.common.ServerResponse;
import com.example.demo.vo.Register;
import org.springframework.data.domain.Page;

/**
 * Created by XHJ on 2018/3/7.
 */
public interface IPersonService {
    ServerResponse<String> SavePerson(Register Register);

    ServerResponse<Page> page(int page, int size);
}
