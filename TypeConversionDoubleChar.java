package com.vstl.javaTypeConversion;

public class TypeConversionDoubleChar {

	// String to Double
	public void stringtodouble() {
		
		String stringbloodpressure = "140";
		
		double doublebloodpressure = Double.parseDouble(stringbloodpressure);
		
		System.out.println(stringbloodpressure + "\tString Blood Pressure");
		
		if (doublebloodpressure <= 140)
		{
			if(doublebloodpressure <140)
			{
				System.out.println("Blood Pressure is Low" +doublebloodpressure);
			} else {
				 
				System.out.println("Blood Pressure is little high " + doublebloodpressure);
			}
		} else {
			 System.out.println("Blood Pressure is High");
		}
		
	}
	
	public void doubletostringconversion() {
		
		double doubleversion = 23.343d;
		
		String stringversion = String.valueOf(doubleversion);
		
		System.out.println(doubleversion);
		System.out.println("Version is " + stringversion + 100);
	}
	
	// String to Char
	public void stringtochar() {
		
		String stringmessage = "Software Testing";		
		System.out.println(stringmessage.length());
		
		for(int i = 0; i < stringmessage.length(); i++)
		{
			char charmessage = stringmessage.charAt(i);
			System.out.println("index character is  "+ charmessage );
			
		}
		 
		char charsingleletter = stringmessage.charAt(2);
		System.out.println(charsingleletter);
	}
	
	// Char to String
	
	public void chattostring() {
		
		char chartext = 's', charbook = 'b';
		
		
		String stringtext = Character.toString(chartext);
		String stringbook = String.valueOf(charbook);
	
		System.out.println("Character class " + stringtext);
		System.out.println("String class " +stringbook);
	}
}























