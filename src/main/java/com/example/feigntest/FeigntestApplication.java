package com.example.feigntest;

import com.example.feigntest.feign.PhotoFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@Slf4j
@EnableFeignClients
@SpringBootApplication
public class FeigntestApplication implements CommandLineRunner {

    @Autowired
    private PhotoFeign photoFeign;

    public static void main(String[] args) {
        SpringApplication.run(FeigntestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Resultado {}", photoFeign.findPhotoById(1L));
    }
}
