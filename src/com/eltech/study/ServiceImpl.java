package com.eltech.study;

import java.rmi.RemoteException;

/**
 * Created by Семён on 26.12.2014.
 */
public class ServiceImpl implements Service {

    @Override
    public String doTheThing(String param) throws RemoteException {
        return "Request: " + param;
    }

}
