package com.zjs.bwcx.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

@Configuration
public class MySelfRule {
	
	@Bean
	public IRule myRule() {
		//return new RoundRobinRule();//轮询负载策略
		//return new RandomRule();////Ribbon默认是轮询，我自定义为随机
		return new MySelfRule_ZJS();//我自定义为每个机器被访问5次
	}
}
