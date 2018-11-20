package com.ensa.rmi.serveur;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import com.ensa.rmi.client.ClientIT;

public class Server extends UnicastRemoteObject implements ServerIT{
	private static final long serialVersionUID=1L;
	private ArrayList<ClientIT> chatClients;
	protected Server() throws RemoteException{
		chatClients=new ArrayList<ClientIT>();
	}
	public synchronized void registerChatClient(ClientIT chatClient)
		throws RemoteException{
		this.chatClients.add(chatClient);
	}
	public synchronized void broadcastMessage(String message)throws RemoteException{
		int i=0;
		while(i<chatClients.size()) {
			chatClients.get(i++).retrieveMessage(message);
		}
	}
}
