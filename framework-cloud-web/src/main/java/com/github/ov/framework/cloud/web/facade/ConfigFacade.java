package com.github.ov.framework.cloud.web.facade;

import com.github.ov.framework.cloud.config.biz.YmlConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : JOSE 2018/12/18 9:55 PM
 */
@Api(tags = "【配置】服务")
@RefreshScope
@RestController
@RequestMapping(value = "/v1/config", produces = MediaType.APPLICATION_JSON_VALUE)
@SuppressWarnings("unchecked")
public class ConfigFacade {

    @Autowired
    private YmlConfig ymlConfig;

    @ApiOperation("测试配置文件")
    @GetMapping(value = "/query")
    public String getSwagger() {
        return ymlConfig.getSwagger();
    }

}
