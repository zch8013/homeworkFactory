package com.guopao.vip.task.AbstractFactory;

import com.guopao.vip.task.factory.Apple;
import com.guopao.vip.task.factory.Banana;
import com.guopao.vip.task.factory.Fruits;
import com.guopao.vip.task.factory.Orange;

public class AbstractFactoryImpl extends AbstractFactory {

	@Override
	public Fruits getApple() {
		// TODO Auto-generated method stub
		return new Apple();
	}

	@Override
	public Fruits getBanana() {
		// TODO Auto-generated method stub
		return new Banana();
	}

	@Override
	public Fruits getgetOrange() {
		// TODO Auto-generated method stub
		return new Orange();
	}

}
