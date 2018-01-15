package com.java.me.util.rpc.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PrintService extends Remote {

	/**
	 * 使用rmi，接口中的方法必须抛出RemoteException
	 * 官方解释：make sure you throws RemoteException in all methods that you expose.
	 * @return
	 * @throws RemoteException
	 */
	public String print() throws RemoteException;
}
