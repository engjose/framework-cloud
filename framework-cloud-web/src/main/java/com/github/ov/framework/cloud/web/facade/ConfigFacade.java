package com.github.ov.framework.cloud.web.facade;

import com.github.ov.framework.cloud.config.biz.YmlConfig;
import com.github.ov.framework.cloud.model.dto.order.QueryOrderResponse;
import com.github.ov.framework.cloud.service.order.IOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : JOSE 2018/12/18 9:55 PM
 */
@Api(tags = "【配置】服务")
@RefreshScope
@RestController
@RequestMapping(value = "/v1/config", produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
@SuppressWarnings("unchecked")
public class ConfigFacade {

    @Autowired
    private YmlConfig ymlConfig;

    @Autowired
    private IOrderService orderService;

    @ApiOperation("测试配置文件")
    @GetMapping(value = "/query")
    public String getSwagger() {
        log.info("你好");
        log.error("测试");
        return ymlConfig.getSwagger();
    }

    @ApiOperation("查询db配置")
    @GetMapping(value = "/order")
    public QueryOrderResponse getOrder(@RequestParam String orderId) {
        return orderService.selectOrderByOrderId(orderId);
    }

}
