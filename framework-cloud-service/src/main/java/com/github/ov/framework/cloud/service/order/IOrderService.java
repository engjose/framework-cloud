package com.github.ov.framework.cloud.service.order;
import com.github.ov.framework.cloud.model.dto.order.QueryOrderResponse;

/**
 * @author : JOSE 2019/1/11 4:54 PM
 */
public interface IOrderService {

    /**
     * select order by order id
     *
     * @param orderId param{1}:order id
     * @return  order info
     */
    QueryOrderResponse selectOrderByOrderId(String orderId);
}
