package com.ensa.rmi.serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.ensa.rmi.client.ClientIT;

public interface ServerIT extends Remote{
	void registerChatClient(ClientIT chatClient) throws RemoteException;
	void broadcastMessage(String message) throws RemoteException;
}
