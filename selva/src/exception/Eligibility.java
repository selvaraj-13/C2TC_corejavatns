package exception;

import java.util.Scanner;

public class Eligibility {
	void age (int a) {
		System.out.println(a);
	}
	static void Eligibil(int age) throws Trydemo {
		if (age<18) {
			throw new Trydemo("not eligible for vote");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		Eligibility eleg=new Eligibility();
		eleg.age(age);
		try {
			Eligibility.Eligibil(age);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(eleg.getmess());
		}
		// TODO Auto-generated method stub

	}
	
}
