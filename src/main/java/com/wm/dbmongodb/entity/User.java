package com.wm.dbmongodb.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author 王锰
 * @date 14:26 2019/7/13
 */
@Document(collection = "user")
@Data
public class User {

    private ObjectId id;

    private String name;

}
