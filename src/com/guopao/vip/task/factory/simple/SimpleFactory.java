package com.guopao.vip.task.factory.simple;

import com.guopao.vip.task.factory.Apple;
import com.guopao.vip.task.factory.Banana;
import com.guopao.vip.task.factory.Fruits;
import com.guopao.vip.task.factory.Orange;

public class SimpleFactory {

	
	public Fruits getFruits(String name){
		if(name.equals("我是桔子"))
		{
			return new Orange();
		}else if(name.equals("我是香蕉"))
		{
			return new Apple();
		}else if(name.equals("我是苹果"))
		{
			return new Banana();
		}else
		{
			System.out.println("找不到类型");
			return null;
		}
		
	}
	
}
