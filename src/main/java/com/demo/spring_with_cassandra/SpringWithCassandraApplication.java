package com.demo.spring_with_cassandra;

import com.demo.spring_with_cassandra.entity.CyclistCategory;
import com.demo.spring_with_cassandra.repository.CyclistCategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class SpringWithCassandraApplication implements CommandLineRunner {

	private final CyclistCategoryRepository cyclistCategoryRepository;

	public SpringWithCassandraApplication(CyclistCategoryRepository cyclistCategoryRepository) {
		this.cyclistCategoryRepository = cyclistCategoryRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringWithCassandraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//demo data
		CyclistCategory c1 = new CyclistCategory("category1", 50, UUID.randomUUID(), "l1");
		CyclistCategory c2 = new CyclistCategory("category2", 60, UUID.randomUUID(), "l2");
		CyclistCategory c3 = new CyclistCategory("category3", 70, UUID.randomUUID(), "l3");

		//save all
		System.out.println("saving cyclists");
		cyclistCategoryRepository.saveAll(List.of(c1, c2, c3));

		//fetch all
		System.out.println("getting cyclists");
		cyclistCategoryRepository.findAll().forEach(System.out::println);
	}
}
