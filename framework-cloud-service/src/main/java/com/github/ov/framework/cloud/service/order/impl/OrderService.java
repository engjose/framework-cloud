package com.github.ov.framework.cloud.service.order.impl;

import com.github.ov.framework.cloud.config.db.DataSource;
import com.github.ov.framework.cloud.config.db.DataSourceName;
import com.github.ov.framework.cloud.dao.OrderMasterDao;
import com.github.ov.framework.cloud.model.dto.order.QueryOrderResponse;
import com.github.ov.framework.cloud.model.po.OrderMaster;
import com.github.ov.framework.cloud.service.order.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : JOSE 2019/1/11 4:55 PM
 */
@Service
@Slf4j
public class OrderService implements IOrderService {

    @Autowired
    private OrderMasterDao orderMasterDao;

    @Override
    @DataSource(DataSourceName.DATASOURCE_SLAVE1)
    public QueryOrderResponse selectOrderByOrderId(String orderId) {
        OrderMaster order = orderMasterDao.selectByPrimaryKey(orderId);
        QueryOrderResponse response = new QueryOrderResponse();
        BeanUtils.copyProperties(order, response);
        log.info("查询返回:{}", response);
        return response;
    }
}
