package com.demo;

import org.springframework.boot.CommandLineRunner;

import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.*;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class JenkinsDemoApplication implements CommandLineRunner{
	public static final org.slf4j.Logger Logger=LoggerFactory.getLogger(JenkinsDemoApplication.class);

	public static void main(String[] args) {
		Logger.info("its a CI pipeline job");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}
@Override
public void run(String...args)throws Exception {
	Logger.info("second log");
}
}
