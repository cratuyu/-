package com.example.demo.config.swaggerconfig;

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
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/1/21 13:56
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket swaggerSpringMvcPlugin() {
        return new Docket(DocumentationType.SWAGGER_2)
                // apiInfo()用来创建该Api的基本信息（这些基本信息会展现在文档页面中）
                .apiInfo(apiInfo())
                // select()函数返回一个ApiSelectorBuilder实例用来控制哪些接口暴露给Swagger来展现
                .select()
                // Swagger会扫描该包下所有Controller定义的API，并产生文档内容（除了被@ApiIgnore指定的请求）
                .apis(RequestHandlerSelectors.basePackage("com.example.demo.restfulapi"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot2中使用Swagger2构建RESTful APIs")
                .description("第一次自己实现Swagger加spring boot")
                .termsOfServiceUrl("XXXXXXXXXXXX")
                .contact("陪你度过漫长岁月")
                .version("1.0")
                .build();
    }

}
