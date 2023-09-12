package com.monitoria.LTP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MonitoriaApplication {

	public static void main(String[] args) {
		DataBase.init();
		SpringApplication.run(MonitoriaApplication.class, args);
	}

}