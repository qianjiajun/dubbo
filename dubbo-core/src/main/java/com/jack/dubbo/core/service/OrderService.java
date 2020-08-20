package com.jack.dubbo.core.service;

import com.jack.dubbo.core.model.UserDTO;

import java.util.List;

/**
 * @author qjj
 */
public interface OrderService {

    /**
     * 获取数据
     * @param userId
     * @return
     */
    List<UserDTO> listOrder(String userId);

}
