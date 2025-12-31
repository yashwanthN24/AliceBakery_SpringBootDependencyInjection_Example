package com.example.demo;

import com.example.demo.AliceBakery.CakeBaker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	static private   CakeBaker c = null ;

	public DemoApplication(CakeBaker c){
		this.c = c;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		c.bakeCake();
	}

}
