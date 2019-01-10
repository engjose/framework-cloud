package com.github.ov.framework.cloud.config.biz;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author : JOSE 2019/1/10 12:18 AM
 */
@Component
@RefreshScope
@Getter
@Setter
public class YmlConfig {

    @Value("${swagger.enable}")
    private String swagger;
}
