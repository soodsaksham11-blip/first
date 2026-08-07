package com.demo.first;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
// this code will run automatically as soon as springboot application starts.
// This does not have parameters or arguments
// for arguments we use ApplicationRunner
public class AppStartupRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        System.out.println("Application has started using CommandLineRunner");
    }
}
