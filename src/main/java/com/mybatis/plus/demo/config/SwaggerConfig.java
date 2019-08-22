package com.mybatis.plus.demo.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.io.IOException;

/**
 * @author mirror6
 * @description
 * @date 2019/8/22 20:04
 */
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() throws IOException {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.basePackage("com.shiyan.demo")).paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("誓言--------").termsOfServiceUrl("http://data.***.com/").contact("***").version("0.0.1").build();

    }
}
