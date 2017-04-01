package com.winterbe.java8.training;

import java.util.HashMap;
import java.util.Optional;

public class OptionalChapter01 {
    
	public static void main(String[] args) {
		Optional<String> optional = Optional.of("jack");
		boolean present = optional.isPresent();
		String string = optional.get();
		String orElse = optional.orElse("tomcat");
		optional.ifPresent(value -> {
			System.out.println(value);
		});
		
		optional.filter(value -> value.length()>100);
		
		System.out.println("present===="+present);
		System.out.println("string====="+string);
		System.out.println("orElse====="+orElse);
	}
}
