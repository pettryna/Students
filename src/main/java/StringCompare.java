/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riverbank
 */
public class StringCompare {
    public static void main(String[] args) {
		String string1= new String("Geekforgeek");
		String string2= new String("practice");
		String string3= new String("Geeks");
		String string4= new String("Geeks");
		String string5= new String("geeks");
		//COMPAIRING FOR STRING1 !=STRING2
		System.out.println("compairing " +string1+ " and " +string2+ " : " +string1.equals(string2));
		//Comparing for string3= string4
		System.out.println("compairing " +string3+ " and " +string4+ " : " +string3.equals(string4));
		//Comparing for string4!= string5
		System.out.println("compairing " +string4+ " and " +string5+ ":" +string4.equals(string5));
		//Comparing string1 for !=string4
System.out.println("compiaring " +string1+ " and " +string4+ " : " +string1.equals(string4));
	}
	
	}
	



    

