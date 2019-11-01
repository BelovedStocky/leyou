package com.leyou.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author sherwin
 * @create 2019-07-19 00:20:22
 */

@EnableEurekaServer
@SpringBootApplication
public class LyRegistry {

	public static void main (String[] args){

		SpringApplication.run(LyRegistry.class, args);
	}

}
