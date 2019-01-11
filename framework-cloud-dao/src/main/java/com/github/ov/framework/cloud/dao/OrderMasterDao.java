package com.github.ov.framework.cloud.dao;

import com.github.ov.framework.cloud.model.po.OrderMaster;

public interface OrderMasterDao {
    int deleteByPrimaryKey(String orderId);

    int insert(OrderMaster record);

    int insertSelective(OrderMaster record);

    OrderMaster selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(OrderMaster record);

    int updateByPrimaryKey(OrderMaster record);
}