package com.wm.dbmongodb.repository;

import com.wm.dbmongodb.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 王锰
 * @date 15:01 2019/7/13
 */
@Repository
public interface UserRepository extends MongoRepository<User, ObjectId> {
}
