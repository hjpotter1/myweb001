package com.southwind.repository;

import com.southwind.entity.Borrow;

import java.util.List;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName BorrowRepository.java
 * @Description TODO
 * @createTime 2020年07月25日 01:06:00
 */
public interface BorrowRepository {
    public void insert(Integer bookid, Integer readerid, String borrowtime, String returntime, Integer adminid, Integer state);
    public List<Borrow> findAllByReaderId(Integer id,int index,int limit);
    public int count(Integer readerid);
    public List<Borrow> findAllByState(Integer state,Integer index,Integer limit);
    public int countByState(Integer state);
    public void handle(Integer borrowId,Integer state,Integer adminId);
}
