package com.java.me.designPattern.singleton;

/**
 * ����ģʽ
 * @author Administrator
 *
 */
public class Singleton {

	/**
	 * ����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ��� ��
	 */
	private static Singleton instance = null;

	/**
	 * ˽�й��췽������ֹ��ʵ����
	 * @return singleton
	 */
	private Singleton() {
		
	}
	
	/**
	 * ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� 
	 * @return
	 */
	public Object readResolve() {
		return instance;
	}
	
	/**
	 * 1 �򵥻�ȡʵ��
	 * 
	 * <p>
	 * �ŵ㣺
	 * ����ʵ������ getInstance ���Է����ڲ������ģ���������ʹ�ø��ӹ��ܣ����磬���������ʵ����������ʹ���������벻��Ҫ�������ԡ�
	 * ֱ������Ҫ�����һ��ʵ����ִ��ʵ���������ַ�����Ϊ������ʵ������������ʵ������������Ӧ�ó�������ʱʵ��������Ҫ�� singleton��
	 * 
	 * ȱ�㣺
	 * ���߳��޷���֤��һʵ��
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
	 * 2.1 �̰߳�ȫ���򵥻�ȡʵ�������߳����ܵͣ�
	 * @return
	 */
	public static final synchronized Singleton getInstanceWithSynch() {
		if(null==instance) {
			instance = new Singleton();
		}
		return instance;
	}
	
	/**
	 * ���̸߳�����������
	 */
	private static final Object BLOCK = new Object();
	
	/**
	 * 2.2 �򵥻�ȡʵ��
	 * <p>
	 * ����������������̰߳�ȫ���⣬�����ܵ� ��2.2��ͬ��2.1
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
	 * 3 ˫������
	 * 
	 * <P>
	 * ���̰߳�ȫ���̲߳���Ҫÿ�μ�����ֻ���ж�ʵ��δ������ʱ����������ڶ��߳�������ܱ��ָ����ܡ�
	 * ���������п��ܽ�����̲߳������⣬ͬʱ������ÿ�� getInstanceWithInsideSynch �����ĵ����ж����ֶ�ռ������������������ʵ�����ӳٵ���һ�η��ʶ���ʱ������
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
	 * 4 ��̬�ڲ����ȡʵ��
	 * 
	 * <p>
	 * �Ӿ�̬�ڲ��ࣨSingletonHolder����ȡʵ����ʵ���ӳټ��أ��̰߳�ȫ
	 * </p>
	 * @return
	 */
	public static final Singleton getInstanceWithInnerClazz() {
		return SingletonHolder.INSTANCE;
	}
	
	/**
	 * �ڲ���
	 * @author Administrator
	 *
	 */
	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}
	
	/**
	 * 5 ö�٣����ڲ��ࣩ���Զ�֧�����л�����
	 * @author Administrator
	 *
	 */
	public static enum SingletonEnum {
		/**
		 * ʵ��
		 */
		INSTANCE;
		
	}
	
	/**
	 * 6 ��̬����
	 * 
	 * <p>
	 * ���ڵ�һ����������κγ�Աʱ����ʵ���������ӳټ��أ����ڲ��ࣩ
	 * </p>
	 * @author Administrator
	 *
	 */
	public static class SingletonNoLazy{
		private static SingletonNoLazy instance = new SingletonNoLazy();
		
		/**
		 * ˽�й��췽������ֹ��ʵ����
		 * @return singleton
		 */
		private SingletonNoLazy() {
			
		}
		
		public static SingletonNoLazy getInstance() {
			return instance;
		}
	}
}
