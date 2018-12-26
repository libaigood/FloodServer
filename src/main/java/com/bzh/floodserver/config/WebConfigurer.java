package com.bzh.floodserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author 毕泽浩
 * @Description: 拦截器
 * @time 2018/10/3 17:06
 */
@Configuration
public class WebConfigurer extends WebMvcConfigurationSupport {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html")
				.addResourceLocations("classpath:/META-INF/resources/");

		registry.addResourceHandler("/webjars/**")
				.addResourceLocations("classpath:/META-INF/resources/webjars/");

		registry.addResourceHandler("/index.html")
				.addResourceLocations("classpath:/static/index.html");
	}
}
