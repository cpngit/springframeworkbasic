package com.cpn.spring.basicSpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicSpringProjectApplication {

	public static void main(String[] args) {

		// Application Context
		ApplicationContext applicationContext =
				SpringApplication.run(BasicSpringProjectApplication.class, args);
		BinarySearchImpl binarySearch =
				applicationContext.getBean(BinarySearchImpl.class);
		int result =
				binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
	}

}
