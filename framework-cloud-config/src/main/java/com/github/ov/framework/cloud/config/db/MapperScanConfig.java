package com.github.ov.framework.cloud.config.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : JOSE 2019/1/11 5:07 PM
 */
@Configuration
@MapperScan(basePackages = "com.github.ov.framework.cloud.dao")
public class MapperScanConfig {
}
