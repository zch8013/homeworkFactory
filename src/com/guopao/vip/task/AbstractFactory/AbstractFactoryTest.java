package com.guopao.vip.task.AbstractFactory;



public class AbstractFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactoryImpl factory = new AbstractFactoryImpl();

	        //对于用户而言，更加简单了
	        //用户只有选择的权利了，保证了程序的健壮性
	        System.out.println(factory.getgetOrange());
	}

}
