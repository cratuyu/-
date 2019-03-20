package com.example.demo.config.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/1/16 10:30
 */
@Configuration
public class MyWebConfigur implements WebMvcConfigurer {


    /**
     * 注册拦截器
     * @return
     */
//    @Bean
//    public LoginInterceptor loginInterceptor(){
//        return new LoginInterceptor();
//    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry){
//        registry.addInterceptor(loginInterceptor()).addPathPatterns("/**");
//    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/index").setViewName("/index");
        registry.addViewController("/login").setViewName("/login");
        registry.addViewController("/register").setViewName("/register");
        registry.addViewController("/upfile").setViewName("/upfile");
    }

    /**
     * 指定的文件上传的处理器 不注释会报错
     * 原因暂时未知 可将 文件上传属性 写入到 application配置文件
     */
//    @Bean(name = "multipartResolver")
//    public MultipartResolver multipartResolver(){
//        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
//        multipartResolver.setMaxUploadSize(1000000);
//        return multipartResolver;
//    }

}
