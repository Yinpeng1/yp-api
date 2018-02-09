package com.yp.apiservice.service;

import com.yp.apientity.Entity.User;

public interface HelloService {

    String sayHello();

    void add();

    User get(String name);
}
