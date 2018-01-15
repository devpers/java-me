package com.java.me.designPattern.singleton;

public class ThreadJob implements Runnable {

	@Override
	public void run() {
		//获取单例
		//CountSingleton instance = CountSingleton.getInstanceWithInnerClazz();
		//CountSingleton instance = CountSingleton.getInstanceWithInsideSynch();
		CountSingleton instance = CountSingleton.getInstance();
		
		for(int i=0;i<5;i++) {
			instance.addNum();
			StringBuffer sb = new StringBuffer();
			sb.append("当前线程"+Thread.currentThread().getName());
			sb.append("，计数值等于"+instance.getNum());
			System.out.println(sb.toString());
		}
	}

}
