package com.jack.dubbo.core.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author qjj
 * @Date 2020-08-20 11:00
 * @Version 1.0
 * @Class User.java
 */
public class UserDTO implements Serializable {

    private String id;
    private Integer sex;
    private String name;

    public UserDTO() {
    }

    public UserDTO(String id, Integer sex, String name) {
        this.id = id;
        this.sex = sex;
        this.name = name;
    }

    public static List<UserDTO> getList() {
        List<UserDTO> list = new ArrayList<>();
        list.add(new UserDTO("1", 1, "钱嘉俊"));
        list.add(new UserDTO("2", 0, "喵"));
        return list;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                '}';
    }
}
