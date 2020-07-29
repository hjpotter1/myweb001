package com.southwind.entity;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName BookCase.java
 * @Description TODO
 * @createTime 2020年07月22日 23:54:00
 */
public class BookCase {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BookCase(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
