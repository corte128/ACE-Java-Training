package com.siriuscom.training.OOP3;

import java.util.*;
public class CheckConfiguration 
{
	private List<Phone[]> phoneBatchesToBeVerified = new LinkedList<Phone[]>();
	
	public void manufacturePhones()
	{
		Phone[] curBatch = {
				new Phone("Nokia", "90309ufwe0923i09r"),
				new Phone("Samsung", "uiedsu9833ejirf98uwe4i"),
				new Phone("Nokia", "ojf0i0393ireijo"),
				new Phone("Sony", "oj239rwir2498rwfjw089"),
				new Phone("Sony", "0fjoij3w90r3")
		};
		//this.phoneBatchesToBeVerified.addFirst(curBatch);
	}
	
	public void checkPhoneConfigs()
	{
		//Phone[] curBatch = this.phoneBatchesToBeVerified.removeLast();
	}
}
