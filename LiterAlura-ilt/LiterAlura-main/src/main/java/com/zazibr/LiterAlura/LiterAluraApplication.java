package com.zazibr.LiterAlura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zazibr.LiterAlura.main.Main;
import com.zazibr.LiterAlura.repositories.AuthorRepository;
import com.zazibr.LiterAlura.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner {
	@Autowired
	AuthorRepository autorRepository;
	@Autowired
	BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(LiterAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main(autorRepository,bookRepository);
		main.principal();
	}
}