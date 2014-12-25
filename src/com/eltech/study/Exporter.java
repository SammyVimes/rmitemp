package com.eltech.study;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Семён on 26.12.2014.
 */
public class Exporter {

    public static void main(String[] args) {
        // set ip address of rmi server
        System.setProperty("java.rmi.server.hostname", "127.0.0.1");

        //rmiregistry.exe -J-Djava.rmi.server.codebase=file:///C:\Users\Семён\IdeaProjects\rmitemp\out\production\rmitemp\

        try {
            ServiceImpl obj = new ServiceImpl();
            Service stub = (Service) UnicastRemoteObject.exportObject(obj, 0);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Service", stub);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }

}

