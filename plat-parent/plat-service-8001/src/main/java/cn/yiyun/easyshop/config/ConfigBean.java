package cn.yiyun.easyshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
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
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.yiyun.easyshop.web.controller"))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("平台服务api")
                .description("平台服务接口文档说明")
                .contact(new Contact("solargen", "", " lishugen@itsource.cn"))
                .version("1.0")
                .build();
    }
}
