package com.java.me.util.rpc.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PrintService extends Remote {

	/**
	 * ʹ��rmi���ӿ��еķ��������׳�RemoteException
	 * �ٷ����ͣ�make sure you throws RemoteException in all methods that you expose.
	 * @return
	 * @throws RemoteException
	 */
	public String print() throws RemoteException;
}
