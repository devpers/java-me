package com.java.me.designPattern.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"start");
		for(int i=0;i<5;i++) {
			Thread t = new Thread(new ThreadJob());
			try {
				System.out.println();
				t.start();
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName()+"end");
	}

	
}
