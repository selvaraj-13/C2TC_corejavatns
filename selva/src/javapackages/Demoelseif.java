package javapackages;

import java.util.Scanner;

public class Demoelseif {

	public static void main(String[] args) {
		Scanner selva=new Scanner(System.in);
		System.out.println("enter age 🤣Click there 👇🏻");
		int age=selva.nextInt();
		if(age>18) {
			System.out.println("u elligible for vote");
		}
		else if(age==17){
			System.out.println("after 1 year elligible for vote");
			
		}
		else if(age==16){
			System.out.println("after 2 year elligible for vote");
		}
		else if(age==15){
			System.out.println("after 3 year elligible for vote");
		}
	}

}
