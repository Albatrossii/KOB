package com.kob;

import com.kob.matchingsystem.service.impl.MatchingServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MatchingSystemApplication {
    public static void main(String[] args) {
        //启动匹配线程
        MatchingServiceImpl.MATCHING_POOL.start();
        SpringApplication.run(MatchingSystemApplication.class,args);
    }
}
