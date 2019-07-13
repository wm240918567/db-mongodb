package com.wm.dbmongodb.service;

import com.wm.dbmongodb.entity.User;
import com.wm.dbmongodb.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

/**
 * @author 王锰
 * @date 16:41 2019/7/13
 */
@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public String insert(@RequestBody User user) {
        User insert = userRepository.insert(user);
        log.info("结果：{}", insert);
        return insert.toString();
    }

    public void delete(@PathVariable("id") ObjectId id) {
        Optional<User> byId = userRepository.findById(id);
        userRepository.delete(byId.get());
    }

}
