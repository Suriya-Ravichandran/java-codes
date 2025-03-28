package com.jspiders.loadingapi;

public class Approach2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loading Driver done Successfully");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
