package com.fireway.kaletgo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author: chenhuowei
 * @email: chenhuowei@outlook.com
 * @date: 2017-10-20
 * @description:
 * @modified By:
 */
@SpringBootApplication
@ImportResource({"classpath:/config/dubbo.xml"})
@MapperScan("com.fireway.kaletgo.dao")
public class BootApplication {
    public static void main(String[] args){

        SpringApplication.run(BootApplication.class, args);
        synchronized (BootApplication.class) {
            while (true) {
                try {
                    BootApplication.class.wait();
                } catch (Throwable e) {
                }
            }
        }
    }


}
