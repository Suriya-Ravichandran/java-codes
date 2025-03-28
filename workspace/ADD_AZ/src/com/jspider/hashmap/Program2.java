package com.jspider.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Program2 {

	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> hm = new HashMap<Integer,String>();
		// operation 1: Insertion
		hm.put(1,"Delhi");
		hm.put(2,"Punjab");
		hm.put(3,"Himachal Pradhesh");
		hm.put(23,"TamilNadu");
		System.out.println("---------Elements of an HashMap---------");
		System.out.println(hm+" ");
		System.out.println();
		
		// operation 2: Check the size of an HashMap
		System.out.println("Size"+hm.size());
		//operation 3: print key+value
		System.out.println("-------Key's of hashmap-------");
		System.out.println(hm.keySet()+" ");
		System.out.println("--------Value's of HashMap----------");
		System.out.println(hm.values()+" ");
		System.out.println();
		
		//operation 4:read/retrieve
		Set set=hm.entrySet();
		System.out.println("Approach 1: Iterator");
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		System.out.println("Apporach 2:for each loop");
		for(Map.Entry<Integer,String> entry:hm.entrySet())
		System.out.println(entry.getKey()+" "+entry.getValue());
	}

}
