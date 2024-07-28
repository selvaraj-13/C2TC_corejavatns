package constructor;

public class Democons {
	int a=10;
	Democons(){
		System.out.println("default");
	}
	Democons(int a){
		System.out.println("A: "+a);
	}
	Democons(int a,int b){
		System.out.println("A: "+a+ " B " +b);
	}

	Democons(String a,int b){
		System.out.println("A: "+a+ " B " +b);
	}

	Democons(int a,String b){
		System.out.println("A: "+a+ " B " +b);
	}
	

}
