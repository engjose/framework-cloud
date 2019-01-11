package com.github.ov.framework.cloud.model.dto.order;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author : JOSE 2019/1/11 4:58 PM
 */
@Getter
@Setter
@ApiModel("订单实体")
public class OrderEntity {

    @ApiModelProperty("订单ID")
    private String orderId;

    @ApiModelProperty("买家")
    private String buyerName;
}
