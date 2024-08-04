package selva;

import java.util.Scanner;

public class Banksystem {
    public static void main(String[] args) {
    	
        Account selvaAccount = new Account(100000);
        System.out.println("1. deposit  2. withdraw  3.check balance");
        
        int a,b,c;
        System.out.println("enter amount to deposit");
        Scanner sc=new Scanner(System.in);
       String  aa=sc.nextLine();
switch(aa) {
case "1":
	Scanner add=new Scanner(System.in);
	System.out.println("enter amount to deposit ");
	a=add.nextInt();
	Thread depositThread1 = new DepositThread(selvaAccount, a);
	 depositThread1.start();
	break;
case "2":
	Scanner mul=new Scanner(System.in);
System.out.println("enter amount to withdra");
b=mul.nextInt();
Thread withdrawThread1 = new WithdrawThread(selvaAccount, b);
withdrawThread1.start();
	break;
case "3":
	 System.out.println("Final balance: " + selvaAccount.getBalance());
	break;
	default:
		System.out.println("SORRY, can u check ,r u enter correct option or tryagain later ");
}

      
    
        //try {
       //     depositThread1.join();
       //     withdrawThread1.join();
          
     //   } catch (InterruptedException e) {
      //      e.printStackTrace();
     //   }

      
    }
}
