package com.guopao.vip.task.factory.func;

import com.guopao.vip.task.factory.Apple;
import com.guopao.vip.task.factory.Fruits;

public class AppleFactory implements Factory {

	@Override
	public Fruits getFruits() {
		// TODO Auto-generated method stub
		return new Apple();
	}

}
