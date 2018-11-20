package com.ensa.rmi.client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientIT extends Remote{
	void retrieveMessage(String message) throws RemoteException;
}		
