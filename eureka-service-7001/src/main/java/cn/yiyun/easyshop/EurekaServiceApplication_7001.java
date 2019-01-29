package cn.yiyun.easyshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication_7001.class, args);
    }
}
