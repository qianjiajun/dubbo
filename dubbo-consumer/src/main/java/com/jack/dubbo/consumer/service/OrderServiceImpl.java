package com.jack.dubbo.consumer.service;

import com.jack.dubbo.core.model.UserDTO;
import com.jack.dubbo.core.service.OrderService;
import com.jack.dubbo.core.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.List;

/**
 * @Author qjj
 * @Date 2020-08-20 13:09
 * @Version 1.0
 * @Class OrderServiceImpl.java
 */
@DubboService
public class OrderServiceImpl implements OrderService {

    @DubboReference
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserDTO> listOrder(String userId) {
        return this.userService.listUserById(userId);
    }
}
