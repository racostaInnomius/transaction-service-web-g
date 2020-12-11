package com.backbase.obp.transactionservice.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.backbase.obp.transactionservice.token.AuthTokenSecurityConfig;

@EnableWebMvc
@Configuration
@ComponentScan({"com.backbase.obp.transactionservice.config",
				"com.backbase.obp.transactionservice.controller",
				"com.backbase.obp.transactionservice.entity"})
@Import({ AuthTokenSecurityConfig.class })
public class WebConfig implements WebMvcConfigurer{

    @Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new MappingJackson2HttpMessageConverter());
    }
    
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
