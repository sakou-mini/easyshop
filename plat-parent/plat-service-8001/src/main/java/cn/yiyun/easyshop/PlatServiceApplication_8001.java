package cn.yiyun.easyshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * copyright(c) 2018-2026 yiyun.com
 *
 * @version: V1.0
 * @author: 叶天翼
 * @className: PlatServiceApplication_8001.java
 * @description: 这是启动类
 * @data: 2019/1/26
 **/
@SpringBootApplication
@EnableEurekaClient
public class PlatServiceApplication_8001 {
    public static void main(String[] args) {
        SpringApplication.run(PlatServiceApplication_8001.class, args);
    }
}
