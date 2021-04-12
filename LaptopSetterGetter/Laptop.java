package LaptopSetterGetter;

public class Laptop {
	
	String brand;
	String model;
	String color;
	double weight;
	int RAM;
	double price;
	
	
	//Create Setter Method
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setRAM(int RAM) {
		this.RAM = RAM;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	//Create Getter Method
	public String getBrand() {
		return this.brand;
	}
	public String getModel() {
		return this.model;
	}
	public String getColor() {
		return this.color;
	}
	public double getWeight() {
		return this.weight;
	}
	public int getRAM() {
		return this.RAM;
	}
	public double getPrice() {
		return this.price;
	}
}
