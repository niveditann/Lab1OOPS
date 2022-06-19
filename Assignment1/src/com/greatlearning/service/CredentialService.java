package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {

	public char[] generatePassword() {
		char[] password = new char[8];
		Random r = new Random();
		String capLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "&*^$#@!~<>";
		String num = "123456789";
		String values = capLetters + smallLetters + specialCharacters + num;
		for (int i = 0; i < 8; i++) {

			password[i] = values.charAt(r.nextInt(values.length()));
		}
		return password;

	}
	
	public String generateEmailAddress(Employee em,String dept) {
	   return em.getFirstName().toLowerCase()+em.getLastName().toLowerCase()+"@"+dept+".abc.com";
	}
	public void showCredentials(Employee em,String email,char[] generatePassword1 ) {
		
		System.out.println("Dear "+em.getFirstName()+" your generated credentials are as follows");
		System.out.println(email);
		System.out.print("Password ----> 1");
		System.out.println(generatePassword1);
	}


}

