package com.guopao.vip.task.factory.simple;

import com.guopao.vip.task.factory.Orange;;

public class Test {

	
	public static void main(String[] args){
		System.out.println(new Orange().getName());
		SimpleFactory simple = new SimpleFactory();
		System.out.println(simple.getFruits("我是苹果").getName());
		
		
	}
}
