package dxc;

class Camera 
{
	private String brand;
	private double cost;

	public Camera() {
		this.brand = "Nikon";
	}
    
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}

class DigitalCamera extends Camera 
	{
	private int memory;

	public DigitalCamera(String brand, double cost) {
		this.memory = 16;
	}
    
    public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
    }
}

public class Inheritance_1 {

	public static void main(String[] args) 
	{
		DigitalCamera camera = new DigitalCamera("Canon",100);
		camera.setBrand("Canon");
		camera.setCost(100);
        System.out.println(camera.getBrand()+" "+camera.getCost()+" "+camera.getMemory());
	}

}

