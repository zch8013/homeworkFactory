package com.guopao.vip.task.factory.func;

import com.guopao.vip.task.factory.Fruits;
import com.guopao.vip.task.factory.Orange;

public class OrangeFactory implements Factory {

	@Override
	public Fruits getFruits() {
		// TODO Auto-generated method stub
		return new Orange();
	}

}
