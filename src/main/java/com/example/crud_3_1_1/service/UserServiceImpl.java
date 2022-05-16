package com.example.crud_3_1_1.service;

import com.example.crud_3_1_1.dao.UserDao;
import com.example.crud_3_1_1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl (UserDao userDao){
        this.userDao = userDao;
    }


    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }


    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }


    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }


    @Override
    public void removeUser(long id) {
        userDao.removeUser(id);
    }


    @Override
    public void editUser(User user, long id) {
        userDao.editUser(user, id);
    }
}
