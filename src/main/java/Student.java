/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Riverbank
 */

public class Student {

	String studentname;
	Address studentaddr;
	int rollnum;

	Student(int roll, String name, Address addr) {
		this.studentname = name;
		this.studentaddr = addr;
		this.rollnum = roll;

	}

	public static void main(String[] args) {
		Address ad = new Address(55, "agra", "up", "kenya");
		Student obj = new Student(681, "pettryna", ad);
		System.out.println(obj.rollnum);
		System.out.println(obj.studentname);
		System.out.println(obj.studentaddr);
		System.out.println(obj.studentaddr.country);
		System.out.println(obj.studentaddr.city);
		System.out.println(obj.studentaddr.state);
		System.out.println(obj.studentaddr.streetnum);

	}

}

    

