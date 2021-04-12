package LaptopSetterGetter;

public class Main {

	public static void main(String[] args) {
		
		Laptop Acer = new Laptop();
		Laptop Asus = new Laptop();
		Laptop Apple = new Laptop();
		Laptop Huawei = new Laptop();
		
		
		System.out.println("------------------LAPTOP------------------");
		
		Acer.setBrand("Acer");
		Acer.setModel("NITRO 5");
		Acer.setColor("Black");
		Acer.setWeight(5.67);
		Acer.setRAM(8);
		Acer.setPrice(3799);
		
		System.out.println("\n" + "------------------------------------------");
		System.out.println("ACER SEPCIFICATION");
		System.out.println("------------------------------------------");
		System.out.println("Brand : " + Acer.getBrand());
		System.out.println("Model : " + Acer.getModel());
		System.out.println("Color : " + Acer.getColor());
		System.out.println("Weight: " + Acer.getWeight() + " pounds");
		System.out.println("RAM   : " + Acer.getRAM() + "GB");
		System.out.printf("Price : " + "RM" + "%.2f", Acer.getPrice());
		
		
	
		
		Asus.setBrand("Asus");
		Asus.setModel("TUF Gaming A17");
		Asus.setColor("Black");
		Asus.setWeight(5.7);
		Asus.setRAM(16);
		Asus.setPrice(3199);
		
		System.out.println("\n" + "------------------------------------------");
		System.out.println("ASUS SEPCIFICATION");
		System.out.println("------------------------------------------");
		System.out.println("Brand : " + Asus.getBrand());
		System.out.println("Model : " + Asus.getModel());
		System.out.println("Color : " + Asus.getColor());
		System.out.println("Weight: " + Asus.getWeight() + " pounds");
		System.out.println("RAM   : " + Asus.getRAM() + "GB");
		System.out.printf("Price : " + "RM" + "%.2f", Asus.getPrice());
	
		
		
		Apple.setBrand("Apple");
		Apple.setModel("MacBook Air");
		Apple.setColor("Gold");
		Apple.setWeight(2.8);
		Apple.setRAM(8);
		Apple.setPrice(4500);
		
		System.out.println("\n" + "------------------------------------------");
		System.out.println("APPLE SEPCIFICATION");
		System.out.println("------------------------------------------");
		System.out.println("Brand ：" + Apple.getBrand());
		System.out.println("Model : " + Apple.getModel());
		System.out.println("Color : " + Apple.getColor());
		System.out.println("Weight: " + Apple.getWeight() + " pounds");
		System.out.println("RAM   : " + Apple.getRAM() + "GB");
		System.out.printf("Price : " + "RM" + "%.2f", Apple.getPrice());
		
		
		
		Huawei.setBrand("Huawei");
		Huawei.setModel("MateBook X Pro");
		Huawei.setColor("Space Gray");
		Huawei.setWeight(2.9);
		Huawei.setRAM(16);
		Huawei.setPrice(3499);
		
		System.out.println("\n" + "------------------------------------------");
		System.out.println("HUAWEI SEPCIFICATION");
		System.out.println("------------------------------------------");
		System.out.println("Brand  ：" + Huawei.getBrand());
		System.out.println("Model  ：" + Huawei.getModel());
		System.out.println("Color  ：" + Huawei.getColor());
		System.out.println("Weight ：" + Huawei.getWeight() + " pounds");
		System.out.println("RAM    ：" + Huawei.getRAM() + "GB");
		System.out.printf("Price  : " + "RM" + "%.2f", Huawei.getPrice());
	}
}
