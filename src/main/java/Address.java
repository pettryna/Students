/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riverbank
 */
public class Address {
    int streetnum;
	String country;
	String city;
	String state;

	public Address(int street, String c, String st, String coun) {
		this.state = st;
		this.city = c;
		this.streetnum = street;
		this.country = coun;
	}
}
    

