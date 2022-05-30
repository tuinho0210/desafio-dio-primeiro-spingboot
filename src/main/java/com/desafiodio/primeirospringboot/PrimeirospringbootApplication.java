package com.desafiodio.primeirospringboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class PrimeirospringbootApplication{

	public static void main(String[] args) {
		SpringApplication.run(PrimeirospringbootApplication.class, args);
}
}