package com.jack.dubbo.provider.service;

import com.jack.dubbo.core.model.UserDTO;
import com.jack.dubbo.core.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author qjj
 * @Date 2020-08-20 11:12
 * @Version 1.0
 * @Class UserServiceImpl.java
 */
@DubboService
public class UserServiceImpl implements UserService {

    public static List<UserDTO> users;

    static {
        users = UserDTO.getList();
    }


    @Override
    public List<UserDTO> listUserById(String id) {
        if (users == null || users.isEmpty()) {
            return users;
        }
        List<UserDTO> list = new ArrayList<>();
        users.forEach(userDTO -> {
            if (id.equals(userDTO.getId())) {
                list.add(userDTO);
            }
        });
        return list;
    }
}
