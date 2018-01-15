package com.java.me.util.rpc.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PrintServiceImpl extends UnicastRemoteObject  implements PrintService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected PrintServiceImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String print() throws RemoteException{
		// TODO Auto-generated method stub
		System.out.println("RMI");
		return "RMI";
	}

}
