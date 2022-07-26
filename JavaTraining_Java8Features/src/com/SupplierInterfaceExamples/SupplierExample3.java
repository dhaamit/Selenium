package com.SupplierInterfaceExamples;

import java.util.function.Supplier;

public class SupplierExample3 {

	public static void main(String[] args) {
		// Generate 6 digit OTP
		
		/*
		 * double r=(int)(Math.random()*10); System.out.println(r);
		 */
		
		Supplier<String> s=()->{
			String otp="";
			for (int i=0; i<6; i++)
			{
				otp = otp + (int)(Math.random()*10);
			}
			return otp;
		};
		System.out.println(s.get());
		}
	}