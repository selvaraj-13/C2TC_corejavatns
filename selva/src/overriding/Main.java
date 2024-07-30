package overriding;

public class Main {


public static void main(String args[]) {
	Methodd m=new Methodd();
	m.a(0);
	Methodd b=new Demo();
	b.a(0);
	Demo d=new Demo();
	d.a(0);
}
}
