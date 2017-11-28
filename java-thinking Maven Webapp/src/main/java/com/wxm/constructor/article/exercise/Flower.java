package com.wxm.constructor.article.exercise;


public class Flower {
	int count = 0;
	String s = "Initial value";
	public Flower(int petals) {
		count = petals;
		System.out.println("count = "+count);
	}
	
	public Flower(String ss) {
		System.out.println("s = "+ss);
		s = ss;
	}
	
	public Flower() {
	}

}
