package com.vstl.javaTypeConversion;

public class TypeConversions {
	
	//String to Int 
	
	public static void stringtointusingparseint( ) {
		
		String stringvalue = "120";
					
		int intvalue = Integer.parseInt(stringvalue);
		
		System.out.println("Concatenation before conversion of String to Int\t");
		System.out.println(stringvalue + 100);
		System.out.println("Concatenation after conversion of String to Int\t");
		System.out.println(intvalue + 100);
			
	}

	// Interger to String
	
	public void inttostringusingvalueof() {
		
		int intnumber = 500;
		
		String stringnumber = String.valueOf(intnumber);
		
		System.out.println("Concatenation before conversion of Int to String \t");
		System.out.println(intnumber+200);
		System.out.println("Concatenation after conversion of Int to String \t");
		System.out.println(stringnumber + 200);
	}
	
	// Long to String
	
	 public String longtoStringvalueconversion() {
		 
		 long longvalues = 234561l;
		 long longsecondvalue = 1234575l;
		 
		 String stringconvertvalue = String.valueOf(longvalues);
		 String stringconvertsecondvalue = String.valueOf(longsecondvalue);
		 
		 System.out.println(longvalues - longsecondvalue + "\t Substraction of Long values");
		 System.out.println(stringconvertvalue + stringconvertsecondvalue + "\tConcatenation of Converted Long to String value");
		return null;
	 }
	 
	 //String to Long
	 
	public void stringtolongparseconversion() {
		
		String stringdata = "123432";
		String stringdatavalue = "12764";
		
		System.out.println(stringdata+stringdatavalue + "\tConcatenation of String value");
		
		long longconverteddata = Long.parseLong(stringdatavalue);
		long longconvertedseconddata = Long.parseLong(stringdatavalue);
		
		System.out.println(longconverteddata + longconvertedseconddata + "\t Addition of long values after conversion from String");
	}
}








