package com.consumerInterfaceExamples;

import java.util.function.Consumer;

public class ConsumerExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c=s->System.out.println(s.length());
		c.accept("SrinivasNarayan");
		c.accept("Rajaram");
	}

}
