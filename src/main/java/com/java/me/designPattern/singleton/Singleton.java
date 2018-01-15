package com.java.me.designPattern.singleton;

/**
 * 单例模式
 * @author Administrator
 *
 */
public class Singleton {

	/**
	 * 持有私有静态实例，防止被引用（此处赋值为null，目的是实现延迟加载 ）
	 */
	private static Singleton instance = null;

	/**
	 * 私有构造方法，防止被实例化
	 * @return singleton
	 */
	private Singleton() {
		
	}
	
	/**
	 * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 
	 * @return
	 */
	public Object readResolve() {
		return instance;
	}
	
	/**
	 * 1 简单获取实例
	 * 
	 * <p>
	 * 优点：
	 * 由于实例是在 getInstance 属性方法内部创建的，因此类可以使用附加功能（例如，对子类进行实例化），即使它可能引入不想要的依赖性。
	 * 直到对象要求产生一个实例才执行实例化；这种方法称为“惰性实例化”。惰性实例化避免了在应用程序启动时实例化不必要的 singleton。
	 * 
	 * 缺点：
	 * 多线程无法保证单一实例
	 * </p>
	 * @return instance
	 */
	public static final Singleton getInstance() {
		if(null==instance) {
			instance = new Singleton();
		}
		return instance;
	}
	
	/**
	 * 2.1 线程安全，简单获取实例（多线程性能低）
	 * @return
	 */
	public static final synchronized Singleton getInstanceWithSynch() {
		if(null==instance) {
			instance = new Singleton();
		}
		return instance;
	}
	
	/**
	 * 多线程辅助锁（对象）
	 */
	private static final Object BLOCK = new Object();
	
	/**
	 * 2.2 简单获取实例
	 * <p>
	 * 借助辅助锁解决多线程安全问题，但性能低 ，2.2等同于2.1
	 * </p>
	 * @return instance
	 */
	public static final Singleton getInstanceWithBlock() {
		synchronized(BLOCK) {
			if(null==instance) {
				instance = new Singleton();
			}
		}
		return instance;
	}
	
	/**
	 * 3 双锁机制
	 * 
	 * <P>
	 * 多线程安全，线程不需要每次加锁，只在判断实例未被创建时加锁。因此在多线程情况下能保持高性能。
	 * 加锁后仍判空能解决了线程并发问题，同时避免在每个 getInstanceWithInsideSynch 方法的调用中都出现独占锁定。它还允许您将实例化延迟到第一次访问对象时发生。
	 * </P>
	 * @return instance
	 */
	public static final Singleton getInstanceWithInsideSynch() {
		if(null==instance) {
			synchronized(BLOCK) {
				if(null==instance) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	/**
	 * 4 静态内部类获取实例
	 * 
	 * <p>
	 * 从静态内部类（SingletonHolder）获取实例，实现延迟加载，线程安全
	 * </p>
	 * @return
	 */
	public static final Singleton getInstanceWithInnerClazz() {
		return SingletonHolder.INSTANCE;
	}
	
	/**
	 * 内部类
	 * @author Administrator
	 *
	 */
	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}
	
	/**
	 * 5 枚举（非内部类），自动支持序列化机制
	 * @author Administrator
	 *
	 */
	public static enum SingletonEnum {
		/**
		 * 实例
		 */
		INSTANCE;
		
	}
	
	/**
	 * 6 静态方法
	 * 
	 * <p>
	 * 将在第一次引用类的任何成员时创建实例，不能延迟加载（非内部类）
	 * </p>
	 * @author Administrator
	 *
	 */
	public static class SingletonNoLazy{
		private static SingletonNoLazy instance = new SingletonNoLazy();
		
		/**
		 * 私有构造方法，防止被实例化
		 * @return singleton
		 */
		private SingletonNoLazy() {
			
		}
		
		public static SingletonNoLazy getInstance() {
			return instance;
		}
	}
}
