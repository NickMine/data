package com.javbus.data.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Auther: wuliangyu
 * @Date: 2020/4/14 8:40
 * @Description:
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        ApiInfo api = new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful API")
                .description("rest api 文档构建利器")
                .termsOfServiceUrl("http://blog.csdn.net/itguangit")
                .contact("itguang")
                .version("1.0")
                .build();
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(api)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.swaggerTest.controller"))
                .paths(PathSelectors.any())
                .build();
    }
}
