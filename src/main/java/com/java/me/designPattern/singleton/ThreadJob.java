package com.java.me.designPattern.singleton;

public class ThreadJob implements Runnable {

	@Override
	public void run() {
		//��ȡ����
		//CountSingleton instance = CountSingleton.getInstanceWithInnerClazz();
		//CountSingleton instance = CountSingleton.getInstanceWithInsideSynch();
		CountSingleton instance = CountSingleton.getInstance();
		
		for(int i=0;i<5;i++) {
			instance.addNum();
			StringBuffer sb = new StringBuffer();
			sb.append("��ǰ�߳�"+Thread.currentThread().getName());
			sb.append("������ֵ����"+instance.getNum());
			System.out.println(sb.toString());
		}
	}

}
