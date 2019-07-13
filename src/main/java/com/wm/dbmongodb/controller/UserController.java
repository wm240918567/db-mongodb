package com.wm.dbmongodb.controller;

import com.wm.dbmongodb.entity.User;
import com.wm.dbmongodb.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 王锰
 * @date 14:41 2019/7/13
 */
@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/insert")
    public String insert(@RequestBody User user) {
        String insert1 = userService.insert(user);
        return insert1.toString();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") ObjectId id) {
        userService.delete(id);
    }

}
