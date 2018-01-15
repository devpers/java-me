package com.java.me.designPattern.singleton;

/**
 * 单例计数器
 * @author Administrator
 *
 */
public class CountSingleton {
	
	/**
	 * 计数
	 */
	private int num = 0;
	
	/**
	 * 持有私有静态实例，防止被引用（此处赋值为null，目的是实现延迟加载 ）
	 */
	private static CountSingleton instance = new CountSingleton();
	
	/**
	 * 多线程辅助锁（对象）
	 */
	private static final Object BLOCK = new Object();
	
	/**
	 * 延迟2000毫秒
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
	 * 静态内部类
	 * @author Administrator
	 *
	 */
	private static class CountSingletonHolder {
		private static final CountSingleton instance = new CountSingleton();
	}
	
	/**
	 * 获取实例
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
	 * 计数累加
	 */
	public void addNum() {
		num++;
	}
	
	/**
	 * 获取计数
	 * @return
	 */
	public int getNum() {
		return num;
	}
}
