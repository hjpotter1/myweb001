package com.southwind.service.impl;

import com.southwind.repository.AdminRepository;
import com.southwind.repository.ReaderRepository;
import com.southwind.repository.impl.AdminRepositoryImpl;
import com.southwind.repository.impl.ReaderRepositoryImpl;
import com.southwind.service.LoginService;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName LoginServiceImpl.java
 * @Description TODO
 * @createTime 2020年07月21日 22:45:00
 */
public class LoginServiceImpl implements LoginService {
    private ReaderRepository readerRepository = new ReaderRepositoryImpl();
    private AdminRepository adminRepository = new AdminRepositoryImpl();

    @Override
    public Object login(String username, String password, String type) {
        Object object = null;
        switch (type){
            case "reader":
                object = readerRepository.login(username, password);
                break;
            case  "admin":
                object = adminRepository.login(username, password);
                break;
        }
        return object;
    }
}
