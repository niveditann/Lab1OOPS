package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;




public class Driver {

	public static void main(String[] args) {
		char[] pass;
		String email;
		
		String firstName,lastName,department="null";
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name");
		firstName=sc.nextLine();
		System.out.println("Enter Last Name");
		lastName=sc.nextLine();
		Employee obj= new Employee(firstName,lastName);
		CredentialService cr= new CredentialService();
		System.out.println("Pls Enter the department from the following");
    	System.out.println("1. Technical");
    	System.out.println("2. Admin");
    	System.out.println("3. Human Resource");
    	System.out.println("4. Legal");
		ch=sc.nextInt();
		switch(ch){
			case(1):
				department="tech";
			    break;
			case(2):
				department="admin";
			    break;
			case(3):
				department="hr";
			    break;
			case(4):
				department="legal";
			    break;
			default:
    			System.out.println("Enter Correct Input");
				
		}
		if(ch==1 || ch==2 || ch==3 || ch==4) {
		email=cr.generateEmailAddress(obj,department);
		pass=cr.generatePassword();
		cr.showCredentials(obj, email, pass);
		}

	}

}
