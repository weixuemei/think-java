package com.wxm.constructor.article.exercise;

public class Dog {
	
	/**
	 * bark方法的重载。重载是方法名一致，参数列表不一致。
	 * 即使返回值不一致，若方法名一致，参数列表一致。
	 * 该方法还是会编译时报错。
	 */
	
	public void bark(){
		System.out.println("狗叫了");
	}
	
//	public String bark(){
//		System.out.println("狗叫了");
//		return "";
//	}
	
	public void bark(String name){
		System.out.println(name + "，狗叫了");
	}

	public void bark(String name,int i){
		System.out.println(name + "，狗叫了"+i+"声");
	}
	
	public void bark(int i,String name){
		System.out.println(name + "，狗叫了"+i+"声");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
		dog.bark("张三");
		dog.bark("张庆涛", 2);
		dog.bark(3, "顺序变了");
	}

}
