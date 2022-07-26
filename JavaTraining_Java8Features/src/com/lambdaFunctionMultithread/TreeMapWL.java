package com.lambdaFunctionMultithread;
import java.util.TreeMap;

public class TreeMapWL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> map=new TreeMap<Integer,String>((e1,e2) ->(e1 > e2) ?  -1 : (e1 < e2 ) ? +1 : 0);
		
		map.put(20,"Srinivas");
		map.put(12, "Ram");
		map.put(5, "Mohan");
		map.put(3, "Raj");
		
		System.out.println(map);
	}

}
