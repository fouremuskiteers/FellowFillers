package com.mybasket.launcher;

import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

/**
 * Created by ssaha on 3/19/17.
 */
@SpringBootApplication
public class MyBasketLauncher {

    public static void main(String[] args) throws  Exception
    {

        SpringApplication.run(MyBasketLauncher.class);

    }
}