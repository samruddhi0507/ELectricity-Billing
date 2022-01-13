package com.wipro.eb.main;


import com.wipro.eb.exception.InvaildReadingException;
import com.wipro.eb.exception.InvalidConnectionException;
import com.wipro.eb.service.ConnectionService;


public class EBMain {
	public static void main(String a[]) throws InvaildReadingException, InvalidConnectionException 
	{
	System.out.println(new ConnectionService().generateBill(130,100,"Commercial"));
	
	}
}
