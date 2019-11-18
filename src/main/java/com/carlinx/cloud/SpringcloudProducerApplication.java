package com.carlinx.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient  //表明该项目是eureka  client
public class SpringcloudProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProducerApplication.class, args);
    }

}
