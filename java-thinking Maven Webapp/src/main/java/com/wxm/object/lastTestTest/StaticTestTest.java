package com.wxm.object.lastTestTest;

import com.wxm.object.lastTest.StaticTest;

public class StaticTestTest {
	public static void main(String[] args) {
		int i = StaticTest.i;   //静态的字段可以通过  类.字段  拿到字段的值。
		String string = StaticTest.staticMethod();  //静态的方法可以通过  类.方法  进行调用
		System.out.println(i+":"+string);
	}

}
