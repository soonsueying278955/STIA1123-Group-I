package PhoneProfile;

public class Main {

	public static void main(String[] args) {
		Phone Vivo = new Phone();
		Phone Huawei = new Phone();
		Phone Samsung = new Phone();
		Phone iPhone = new Phone();
		
		
		System.out.println("VIVO SEPCIFICATION");
		Vivo.printSpec("V19","Red",399,55.6,'Y');
		
		System.out.println("\n"+"HUAWEI SEPCIFICATION");
		Huawei.printSpec("NOVA2i","Black",799,45.56,'Y');
		Huawei.calPrice(799,5);
		
		System.out.println("\n"+"SAMSUNG SEPCIFICATION");
		Samsung.printSpec("Galaxy s7","Grey",1500,60.5,'Y');
		
		System.out.println("\n"+"IPHONE SEPCIFICATION");
		iPhone.printSpec("Pro Max","Blue",2000,56.5,'Y');
		
		
	}

}
