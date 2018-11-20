package com.ensa.rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.ensa.rmi.serveur.ServerIT;

public class ClientMain{

	public static void main(String[] args)
			 throws MalformedURLException, RemoteException,NotBoundException{
		String chatServerURL="rmi://localhost/RMIChatServer";
		ServerIT chatServer=(ServerIT) Naming.lookup(chatServerURL);
		new Thread(new Client(args[0],chatServer)).start();
	}
}
