package com.southwind.service;

import com.southwind.entity.Book;
import com.southwind.entity.Borrow;

import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName BookService.java
 * @Description TODO
 * @createTime 2020年07月22日 23:06:00
 */
public interface BookService {
    public List<Book> findAll(int page);
    public int getPages();
    public int getBorrowPages(Integer readerid);
    public  void addBorrow(Integer bookid,Integer readerid);
    public List<Borrow> findAllBorrowByReaderId(Integer id,Integer page);
    public List<Borrow> findAllBorrowByState(Integer state,Integer page);
    public int getBorrowPagesByState(Integer state);
    public void handleBorrow(Integer borrowId,Integer state,Integer adminId);
}
