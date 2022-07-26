package com.bifunctionalInterface;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		// concatenate two strings
		BiConsumer<String, String> c=(str1, str2)-> System.out.println(str1+str2);
		c.accept("Ram","Raju");

	}

}
