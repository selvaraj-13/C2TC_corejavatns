package javapackages;

import java.util.Scanner;

public class Demoif {

	public static void main(String[] args) {
		Scanner selva=new Scanner(System.in);
		System.out.println("enter age 🤣Click there 👇🏻");
		int age=selva.nextInt();
		if(age>18) {
			System.out.println("u elligible for vote");
		}
		else {
			System.out.println("not elligible for vote");
		}
	}

}
