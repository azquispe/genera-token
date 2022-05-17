package com.ganaseguro.oauth;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class ApiOauthApplication  {



    public static void main(String[] args) {

        String encoded = new BCryptPasswordEncoder().encode("9133040");
		System.out.println("=========================================");
		System.out.println(encoded);
		System.out.println("=========================================");


        SpringApplication.run(ApiOauthApplication.class, args);


    }
}
