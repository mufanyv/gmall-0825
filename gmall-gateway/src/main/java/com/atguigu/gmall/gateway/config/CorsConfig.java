package com.atguigu.gmall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

//跨域插件
@Configuration
public class CorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter(){

        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //允许哪些域名跨域
        corsConfiguration.addAllowedOrigin("http://manager.gmall.com");
        corsConfiguration.addAllowedOrigin("http://localhost:1000");
        corsConfiguration.addAllowedOrigin("http://api.gmall.com");
        //允许什么头信息跨域
        corsConfiguration.addAllowedHeader("*");
        //允许什么方法跨域（put get delete push）
        corsConfiguration.addAllowedMethod("*");
        //是否允许携带cookie  若允许则域名不能为*
        corsConfiguration.setAllowCredentials(true);


        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
        //configurationSource  配置源
        //registerCorsConfiguration() 注册源  两个参数 拦截什么路径， 做什么样的校验
        configurationSource.registerCorsConfiguration("/**",corsConfiguration);


        return new CorsWebFilter(configurationSource);
    }
}


