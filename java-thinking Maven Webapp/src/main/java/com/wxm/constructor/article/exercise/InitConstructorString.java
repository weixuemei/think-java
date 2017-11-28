package com.wxm.constructor.article.exercise;

/*
 * 创建一个类，它包含一个在定义时就被初始化的String域，
 * 以及另一个通过构造器初始化的String域，这两种方式有何差异。
 */
public class InitConstructorString {
	static String s ;
	static String initString;
	
	
	public InitConstructorString() {
		initString = "initString";
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		String setString = "initString";
		System.out.println(InitConstructorString.s);
		System.out.println("在定义时进行初始化"+setString);
		new InitConstructorString();
		System.out.println("通过构造器初始化"+initString);
		System.out.println(setString.equals(initString));
	}

}
