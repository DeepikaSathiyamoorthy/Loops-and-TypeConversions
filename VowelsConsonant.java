package com.vstl.javaLoops;

import java.util.Scanner;
public class VowelsConsonant {
	
	public static void identifyvowelsconsonant() {
	
		char charalphabets;
		System.out.println("Enter the Alphabet");
		Scanner inputvalue = new Scanner(System.in);
		charalphabets = inputvalue.next().charAt(0); // next() - finds and returns the next complete token from this scanner
		//charAt() method returns the character at the specified index in a string
		
		switch(charalphabets) {
		
		case 'a':
			System.out.println(charalphabets + "\tis a Vowel");
			break;
		case 'e':
			System.out.println(charalphabets + "\tis a Vowel");
			break;
		case 'i':
			System.out.println(charalphabets + "\tis a Vowel");
			break;
		case 'o':
			System.out.println(charalphabets + "\tis a Vowel");
			break;
		case 'u':
			System.out.println(charalphabets + "\tis a Vowel");
			break;
		case 'A':
			System.out.println(charalphabets + "\tis a Vowel");
			break;
		case 'E':
			System.out.println(charalphabets + "\tis a Vowel");
			break;
		case 'I':
			System.out.println(charalphabets + "\tis a Vowel");
			break;
		case 'O':
			System.out.println(charalphabets + "\tis a Vowel");
			break;
		case 'U':
			System.out.println(charalphabets + "\tis a Vowel");
			break;
		default:
			System.out.println(charalphabets + "\tis a Consonant");
		
		}
		
	}
	

}
