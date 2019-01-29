package cn.yiyun.easyshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * copyright(c) 2018-2026 yiyun.com
 *
 * @version: V1.0
 * @author: 叶天翼
 * @className: ConfigServiceApplication.java
 * @description: 这是启动类
 * @data: 2019/1/29
 **/

@SpringBootApplication
@EnableEurekaClient //加入注册中心
@EnableConfigServer //启用配置服务端
public class ConfigServiceApplication_1299 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServiceApplication_1299.class, args);
    }

}
