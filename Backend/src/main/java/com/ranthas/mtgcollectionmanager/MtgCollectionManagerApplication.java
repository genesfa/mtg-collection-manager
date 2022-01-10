package com.ranthas.mtgcollectionmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class MtgCollectionManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MtgCollectionManagerApplication.class, args);
    }

}
