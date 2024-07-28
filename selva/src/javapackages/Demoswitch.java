package javapackages;

import java.util.Scanner;

public class Demoswitch {

	public static void main(String[] args) {
Scanner selvaa=new Scanner(System.in);
		
		System.out.println("enter your problrm 🤣Click there 👇🏻");
		String viyathi=selvaa.nextLine();
		switch(viyathi) {
		case "thalavali":
			System.out.println("you are suffer by head ache");
			break;
		case "paythiyam":
			System.out.println("you are suffer by pythiyam");
			break;
		case "loosu":
			System.out.println("you are suffer by loosu");
			break;
		case "heartattack":
			System.out.println("you are suffer by heartattack");
			break;
		}
	}

}
