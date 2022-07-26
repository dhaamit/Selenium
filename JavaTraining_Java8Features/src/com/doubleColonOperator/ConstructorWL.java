package com.doubleColonOperator;

class Sample{
	Sample(){
		System.out.println("Sample Constructor..");
	}
}
interface Intr{
	public Sample m1();
}
public class ConstructorWL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intr i = Sample :: new;
		i.m1();
	}

}
