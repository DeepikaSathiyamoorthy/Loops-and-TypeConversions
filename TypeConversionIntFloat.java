package com.vstl.javaTypeConversion;

public class TypeConversionIntFloat {
	
	
	// String to Int
	public void stringtointconversion() {
		
		String stringweight = "70";
		
		int intweight = Integer.parseInt(stringweight);
		
		if(intweight == 70)
		{
		System.out.println("Weight is " + intweight);
		}
		else {
			
			System.out.println("Type conversion is not happened");
		}
	}
	
	// Int to String
	
	public String inttostringconversion() {
	
	int intrank = 1;
	
	String stringrank = String.valueOf(intrank);
	
	if (stringrank == "1")
	{
	System.out.println(stringrank);
	
	} else {
		
	System.out.println(stringrank+1);	
	}
	
	return "";
	}
	
	//String to Float
	public void stringtofloatconversion() {
		
		String stringtax = "723.40";
		 
		float floattax = Float.parseFloat(stringtax);
		
		System.out.println(stringtax);
		System.out.println(floattax);
		
		while (floattax == 732.40);
		{
			System.out.println("Pay tax \t" +floattax);
			
		} 
	}
	// Float to String
		
	public String floattostringconversion() {
		
		float floatfever = 101.300f;
		
		String stringfever = String.valueOf(floatfever);
		
		System.out.println(floatfever);
		
		if(stringfever == "101.3");
		{
			System.out.println("Patient Fever is " +stringfever);
		}
				
		return "";
		
	}

}
