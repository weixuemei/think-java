package com.wxm.constructor.article.exercise;


public class Flower {
	int count = 0;
	String s = "Initial value";
	public Flower(int petals) {
		System.out.println("==============");
		System.out.println("构造函数1");
		count = petals;
		System.out.println("count = "+count);
	}
	
	public Flower(String ss) {
		System.out.println("==============");
		System.out.println("构造函数2");
		System.out.println("s = "+ss);
		s = ss;
	}
	
	public Flower(String s,int petals){
		this(petals);  //this指的是当前对象，如果已经调用了一个有参的构造函数，则使用this无法调用第二个有参的构造函数
//		this("ss");
		this.s = s;
		System.out.println("==============");
		System.out.println("构造函数3");
		System.out.println("这个构造函数中使用this调用了当前对象的第一个有参的构造函数，构造函数3，参数有：s="+s+",patals = "+petals);		
	}
	
	//在构造函数里面，如果通过this调用当前对象的构造函数，则这行代码必须写在该构造函数里面的第一行。
	public Flower() {
		this("hi",5);
		System.out.println("==============");
		System.out.println("构造函数4");
		System.out.println("无参数的构造函数，s ="+s+",count = "+count);
	}
	
	void printPetalCount(){
//		this(111);  不能调用构造函数
		System.out.println("调用的方法");
	}
	
	public static void main(String[] args) {
		Flower flower = new Flower();
		flower.printPetalCount();
	}

}
