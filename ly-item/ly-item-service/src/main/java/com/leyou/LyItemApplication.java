package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author sherwin
 * @create 2019-07-22 23:24:34
 */

@EnableEurekaServer
@SpringBootApplication
public class LyItemApplication {

	public static void main(String[] args){

		SpringApplication.run(LyItemApplication.class, args);
	}

}
