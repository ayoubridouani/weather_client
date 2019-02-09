package org.tempuri;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class Main {

	//http://www.dneonline.com/calculator.asmx?WSDL
	
	public static void main(String[] args) {
		Calculator clc = new CalculatorLocator();
		
		try {
			CalculatorSoap cls = clc.getCalculatorSoap();
			
			System.out.println(cls.add(10, 20));
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
