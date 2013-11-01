package com.jweinfurtner.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.jweinfurtner.core.controller.HomeController;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = { WebConfig.class, HomeController.class })
public class WebConfig extends WebMvcConfigurerAdapter {

}
