package com.component.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.component.test") //This can load all the beans mentioned in the package, it will initialize all the @components in the path mentioned
@PropertySource("classpath:swim.properties")
public class BeanConfigLoader {
	
	@Bean
	FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}