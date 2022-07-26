package com.primitiveFunctionalInterface;

import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class PrimitiveFunctionalInterface {

	public static void main(String[] args) {
		ToIntFunction<String> f=s->s.length();
		System.out.println(f.applyAsInt("RamRaj"));
		
		IntToDoubleFunction ff=i->Math.sqrt(i);
		System.out.println(ff.applyAsDouble(25));
	}

}
