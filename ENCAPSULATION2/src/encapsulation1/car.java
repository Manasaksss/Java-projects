package encapsulation1;

public class car {
	private String Name;
	private int Price;
	private String TopSpeed;
	public car(String name, int price, String topSpeed) {
		
		this.Name = name;
		this.Price = price;
		this.TopSpeed = topSpeed;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getTopSpeed() {
		return TopSpeed;
	}
	public void setTopSpeed(String topSpeed) {
		TopSpeed = topSpeed;
	}
	
	

}
