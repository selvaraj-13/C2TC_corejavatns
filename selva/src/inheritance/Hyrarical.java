package inheritance;

public class Hyrarical {
	 void vehicle() {
		 String colour="black",model="2021 model";
		 System.out.println(colour+model);	
	}
   class Bike extends Hyrarical{
	   void Bike() {
	   String colour="blue",model="2011 model",brand="rx100";
	   System.out.println(colour+model+brand);
	   }
   }
   class car extends Hyrarical{
	   void car() {
	   String colour="pink",model="2011 model",brand="BMW";
	   System.out.println(colour+model+brand);
	   }
   }
	public static void main(String[] args) {
		Hyrarical h = new Hyrarical();
	Bike bike =h.new Bike();
	bike.Bike();
	car c=h.new car();
	c.car();
		
	}


}




