package com.java.me.util.rpc.dubbo;

import java.util.Random;

public class DubboServiceImpl implements DubboService {

	@Override
	public int getRandom() {
		Random random = new Random();
		int num = random.nextInt(9);
		return num;
	}

}
