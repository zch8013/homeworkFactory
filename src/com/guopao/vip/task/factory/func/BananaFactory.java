package com.guopao.vip.task.factory.func;

import com.guopao.vip.task.factory.Banana;
import com.guopao.vip.task.factory.Fruits;

public class BananaFactory implements Factory {

	@Override
	public Fruits getFruits() {
		// TODO Auto-generated method stub
		return new Banana();
	}

}
