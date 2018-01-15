package com.java.me.util.rpc.rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiClient {

	public static void main(String agrs[]) {
		Registry regiClient = null;
		try {
			regiClient = LocateRegistry.getRegistry("127.0.0.1", 8080);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			
			PrintService ps = (PrintService) regiClient.lookup("printService");
			ps.print();
		} catch (RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
