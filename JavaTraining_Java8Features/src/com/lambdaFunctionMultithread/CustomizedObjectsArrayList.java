package com.lambdaFunctionMultithread;

import java.util.ArrayList;
import java.util.Collections;

class Empinfo {
	int rollnum;
	String name;
	
	public Empinfo(int rollnum, String name) {
		this.rollnum = rollnum;
		this.name = name;
	}
	
	public String toString(){
		return rollnum+":"+name;
	}
	
}
public class CustomizedObjectsArrayList {

	public static void main(String[] args) {
		
		 ArrayList<Empinfo> ar=new ArrayList<Empinfo>();
		 
		 ar.add(new Empinfo(100,"Ramraj"));
		 ar.add(new Empinfo(50,"Mohan"));
		 ar.add(new Empinfo(200,"John"));
		 ar.add(new Empinfo(20,"Akbar"));
		 
		System.out.println(ar);
		//Collections.sort(ar,(e1,e2)->(e1.rollnum <  e2.rollnum) ? +1 : (e1.rollnum >  e2.rollnum) ?  -1 : 0);
		Collections.sort(ar,(e1,e2)->(e1.rollnum <  e2.rollnum) ? - 1 : (e1.rollnum >  e2.rollnum) ?  +1 : 0);
		System.out.println(ar);
		
	}

}