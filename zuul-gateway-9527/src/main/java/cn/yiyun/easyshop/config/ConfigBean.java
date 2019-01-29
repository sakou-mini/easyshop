package cn.yiyun.easyshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * copyright(c) 2018-2026 yiyun.com
 *
 * @version: V1.0
 * @author: 叶天翼
 * @className: ConfigBean.java
 * @description: 这是swagger的配置类
 * @data: 2019/1/26
 **/
@Configuration
@EnableSwagger2
public class ConfigBean {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("分布式购物系统")
                .description("购物系统接口文档说明")
                .contact(new Contact("yty", "", "1171031357@itsoruce.cn"))
                .version("1.0")
                .build();
    }
}
