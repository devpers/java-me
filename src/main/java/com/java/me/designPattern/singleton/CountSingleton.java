package com.java.me.designPattern.singleton;

/**
 * ����������
 * @author Administrator
 *
 */
public class CountSingleton {
	
	/**
	 * ����
	 */
	private int num = 0;
	
	/**
	 * ����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ��� ��
	 */
	private static CountSingleton instance = new CountSingleton();
	
	/**
	 * ���̸߳�����������
	 */
	private static final Object BLOCK = new Object();
	
	/**
	 * �ӳ�2000����
	 */
	private CountSingleton() {
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * ��̬�ڲ���
	 * @author Administrator
	 *
	 */
	private static class CountSingletonHolder {
		private static final CountSingleton instance = new CountSingleton();
	}
	
	/**
	 * ��ȡʵ��
	 * @return
	 */
	public static CountSingleton getInstanceWithInnerClazz() {
		return CountSingletonHolder.instance;
	}
	
	public static final CountSingleton getInstanceWithInsideSynch() {
		if(null==instance) {
			synchronized(BLOCK) {
				if(null==instance) {
					instance = new CountSingleton();
				}
			}
		}
		return instance;
	}
	
	public static final CountSingleton getInstance() {
		return instance;
	}
	
	/**
	 * �����ۼ�
	 */
	public void addNum() {
		num++;
	}
	
	/**
	 * ��ȡ����
	 * @return
	 */
	public int getNum() {
		return num;
	}
}
