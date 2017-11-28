package com.wxm.constructor.article.exercise;

//在java中，“初始化”和“创建”捆绑在一起。
//构造器是一种特殊类型的方法，因为他没有返回值。这与返回值为空明显不同。
//构造器并不会返回任何东西。
public class Rock {

	public Rock() {
		//如果一个类未声明构造函数，则系统默认的会给他一个无参的构造函数
		//在创建对象的时候，会首先执行构造函数。创建对象使用new
		// TODO Auto-generated constructor stub
		System.out.println("Rock的无参数的构造器");
	}
	
	public Rock(String string){
		//在创建对象的时候，会首先执行构造函数。创建对象使用new
		System.out.println("Rock的有参数的构造函数"+string);
	}
	
	public static void main(String[] args) {
		System.out.println("开始执行Rock函数");
		new Rock();
		new Rock("---YOU");
	}

}
