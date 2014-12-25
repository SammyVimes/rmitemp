package com.eltech.study;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Семён on 26.12.2014.
 */
public interface Service extends Remote {

    public String doTheThing(final String param) throws RemoteException;

}
