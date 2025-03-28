package com.jspider.hashmap;

import java.util.HashMap;

public class Program1 {

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm= new HashMap();
		hm.put(1,"Delhi");
		hm.put(2,"Punjab");
		hm.put(3,"Himachal Pradhesh");
		hm.put(23,"TamilNadu");
		System.out.println("---------insertion of into HashMap---------");
		System.out.println(hm+" ");
		System.out.println();
		
		hm.put(null, "No State");
		System.out.println("--------- After insertion of Elements null into HashMap---------");
		System.out.println(hm+" ");
		System.out.println();
		
		hm.remove(3);
		hm.remove(3, "HP");
		System.out.println("---------After Update of Elements null into HashMap---------");
		System.out.println(hm+" ");
		System.out.println();

		hm.remove(null, "No state");
		System.out.println("---------After removal of Elements null into HashMap---------");
		System.out.println(hm+" ");
		System.out.println();
	}

}
