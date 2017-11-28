package com.wxm.object.lastTest;

import java.text.SimpleDateFormat;

public class StaticTest { 
	public static int i=12;
	public static String staticMethod(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("静态的");
		return "staticMethod";
	}
}
