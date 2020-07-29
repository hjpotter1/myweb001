package com.southwind.repository;

import com.southwind.entity.Book;

import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName BookRepositoy.java
 * @Description TODO
 * @createTime 2020年07月23日 00:05:00
 */
public interface BookRepositoy {
    public List<Book> findAll(int index,int limit);
    public int count();
}
