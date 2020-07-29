package com.southwind.repository;

import com.southwind.entity.Reader;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ReaderRepository.java
 * @Description TODO
 * @createTime 2020年07月21日 23:13:00
 */
public interface ReaderRepository {
    public Reader login(String username,String password);
}
