package com.jweinfurtner.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.jweinfurtner.core.controller.HomeController;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = { WebConfig.class, HomeController.class })
public class WebConfig extends WebMvcConfigurerAdapter {

	@Bean
	public ViewResolver getViewResolver() {

		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("WEB-INF/views/");
		resolver.setSuffix(".jsp");

		return resolver;
	}
}
