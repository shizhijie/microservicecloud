package com.zjs.bwcx.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {//boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml
	@Bean
	public RestTemplate geRestTemplate() {
		return new RestTemplate();
	}
}
