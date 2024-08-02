package javapackages;

import java.util.Scanner;

public class Demoswitch {

	public static void main(String[] args) {
		int a,b,c;
Scanner selvaa=new Scanner(System.in);
		
		System.out.println("calculator "
				+ "enter any option");
		System.out.println("1.add"
				+" 2.mul"
			+" 3.div"
				+" 4.sub");
		String viyathi=selvaa.nextLine();
		switch(viyathi) {
		case "1":
			Scanner add=new Scanner(System.in);
			System.out.println("enter a");
			a=add.nextInt();
			System.out.println("enter b");
			b=add.nextInt();
			c=a+b;
			System.out.println(c);
			break;
		case "2":
			Scanner mul=new Scanner(System.in);
		System.out.println("enter a");
		a=mul.nextInt();
		System.out.println("enter b");
		b=mul.nextInt();
		c=a*b;
		System.out.println(c);
			
			break;
		case "3":
			Scanner div=new Scanner(System.in);
			System.out.println("enter a");
			a=div.nextInt();
			System.out.println("enter b");
			b=div.nextInt();
			c=a/b;
			System.out.println(c);
			break;
		case "4":
			Scanner sub=new Scanner(System.in);
			System.out.println("enter a");
			a=sub.nextInt();
			System.out.println("enter b");
			b=sub.nextInt();
			c=a-b;
			System.out.println(c);
			break;
		}
	}

}
