package com.vstl.javaTypeConversion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatetoStringConversion {
	
	//Date to String conversion

	public void datetostringtypeconversion() {
		
		//DateFormat is a class, format() is a method of DateFormat, SimpleDateFormat is a Child class of DateFormat Class
		
		Date dateconversion = Calendar.getInstance().getTime();
		DateFormat dateformatconversion = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
		
		String stringdate = dateformatconversion.format(dateconversion);
		System.out.println(stringdate + "\tString Date");
				
	}
	
	// String to Date
	
	public void stringtodateconversion() throws Exception {
		
		String stringdate = "2022-01-28";
		System.out.println(stringdate);
		System.out.println("Today is" + stringdate.toString());
		
		//stringdate = new Date();
		
		SimpleDateFormat objsimpledate = new SimpleDateFormat(stringdate);
		Date datetoday = objsimpledate.parse(stringdate);
		
		System.out.println(stringdate+ "\t" +datetoday);
	}
}
