/**
 * 
 */
package com.javamodc4.springjwt.ciencias;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author aitor
 *
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer{
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("*").allowedOrigins("*").allowedMethods("*");
	}
}
