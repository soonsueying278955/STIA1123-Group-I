package PhoneProfile;

public class Phone {
	//declare all type of variable and variable name
	String brand;
	int price;
	String color;
	double weight;
	char fingerprint;
	
	void printSpec(String b,String c,int p,double w,char f) {
		System.out.println("Brand:  " + b);
		System.out.println("Color:  " + c);
		System.out.println("Price:  " + "RM" +  p);
		System.out.println("Weight:  " + w + "gram");
		System.out.println("Finger print: " + f);
		}
	
	void calPrice(int p, int q) {
		int totalprice = p * q;
		System.out.println("Total price: " + "RM " + totalprice);
	}

}
