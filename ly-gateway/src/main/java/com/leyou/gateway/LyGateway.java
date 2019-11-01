package com.leyou.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author sherwin
 * @create 2019-07-19 00:21:46
 */

@EnableZuulProxy
@SpringBootApplication
public class LyGateway {

	public static void main(String[] args){

		SpringApplication.run(LyGateway.class, args);
	}

}
