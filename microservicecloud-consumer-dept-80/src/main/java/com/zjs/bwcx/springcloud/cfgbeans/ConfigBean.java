package com.zjs.bwcx.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {//boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml
	@Bean
	@LoadBalanced
	public RestTemplate geRestTemplate() {
		return new RestTemplate();
	}
	
	/*@Bean
	public IRule myRule() {
		//return new RoundRobinRule();原来默认的轮询算法
		return new RandomRule();//换成官方的随机算法

	}*/
}
