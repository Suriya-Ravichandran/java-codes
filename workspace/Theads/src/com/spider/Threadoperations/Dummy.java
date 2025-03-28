package com.spider.Threadoperations;

public class Dummy extends Thread{
	@SuppressWarnings("deprecation")
	public void run() {
		System.out.println("-----------------------------------");
		System.out.println("Id "+Thread.currentThread().getId());
		System.out.println("Name "+Thread.currentThread().getName());
		Thread.currentThread().setName("Mr.420");
		System.out.println("After changing Name "+Thread.currentThread().getName());
		System.out.println("Priority "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		System.out.println("After changing Priority "+Thread.currentThread().getPriority());
	}
	@SuppressWarnings("deprecation")
	public static void main(String[]args) {
		System.out.println("Main Id "+Thread.currentThread().getId());
		System.out.println("Main Name "+Thread.currentThread().getName());
		Thread.currentThread().setName("Hi main");
		System.out.println("After changing Main Name "+Thread.currentThread().getName());
		System.out.println("Priority "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		System.out.println("Main After changing Priority "+Thread.currentThread().getPriority());
		Dummy d = new Dummy();
		d.start();
	}
}
