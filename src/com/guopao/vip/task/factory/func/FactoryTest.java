package com.guopao.vip.task.factory.func;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new AppleFactory();
		System.out.println(factory.getFruits().getName());
	}

}
