package com.jack.dubbo.consumer.controller;

import com.jack.dubbo.core.model.UserDTO;
import com.jack.dubbo.core.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author qjj
 * @Date 2020-08-20 13:32
 * @Version 1.0
 * @Class OrderController.java
 */
@RestController
@RequestMapping(value = "order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public List<UserDTO> listOrder(@PathVariable("id") String id) {
        List<UserDTO> list = orderService.listOrder(id);
        for (UserDTO userDTO : list) {
            System.out.println(String.format("姓名: %s 性别: %s",
                    userDTO.getSex() == 1 ? "男" : (userDTO.getSex() == 0 ? "女" : "未知"),
                    userDTO.getName()));
        }
        return list;
    }

}
