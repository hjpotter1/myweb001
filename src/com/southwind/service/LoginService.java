package com.southwind.service;

import com.southwind.entity.Reader;

/**
 * @author hj
 * @version 1.0.0
 * @ClassName LoginService.java
 * @Description TODO
 * @createTime 2020年07月21日 22:30:00
 */
public interface LoginService {
    public Object login(String password, String username, String type);
}
