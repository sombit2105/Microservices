package com.som.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.som.model.*;
@Configuration
public class JavaConfiguration {
	
	@Bean
	public SMS sms(){
		return new SMS();
	}

}
