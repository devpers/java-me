package com.java.me.util.rpc.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiService {

	public static void main(String agrs[]) {
		Registry regi = null;
		try {
			regi = LocateRegistry.createRegistry(8080);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			PrintService ps = new PrintServiceImpl();
			regi.rebind("printService", ps);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
