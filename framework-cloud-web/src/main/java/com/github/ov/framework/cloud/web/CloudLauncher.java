package com.github.ov.framework.cloud.web;

import com.github.ov.framework.cloud.config.db.MultiDataSourceConf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@Import({MultiDataSourceConf.class})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.github.ov"})
public class CloudLauncher {

    public static void main(String[] args) {
        SpringApplication.run(CloudLauncher.class, args);
    }

}

