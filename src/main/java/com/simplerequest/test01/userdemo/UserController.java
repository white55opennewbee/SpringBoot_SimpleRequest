package com.simplerequest.test01.userdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "/useradd")
    public User addUser(User user){
        User user1 = userService.add(user);
        return user1;
    }

    @RequestMapping(value = "/userinsert")
    public void insertUser(User user){
        userService.update(user);
    }

    @RequestMapping(value = "/userdeletebyid")
    public void deleteUserById(int id){
        userService.delete(id);
    }

    @RequestMapping(value = "/userfindbyid/{id}")
    public User findUserById(int id){
        User user = userService.findById(id);
        return user;
    }
}
