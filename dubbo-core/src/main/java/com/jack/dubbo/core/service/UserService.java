package com.jack.dubbo.core.service;

import com.jack.dubbo.core.model.UserDTO;

import java.util.List;

/**
 * @author qjj
 */
public interface UserService {

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    List<UserDTO> listUserById(String id);

}
