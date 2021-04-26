package Apps.Europe_Batch2.Project;

public class Menu {
	private String foodName;
	private double foodPrice;

	public Menu(String foodName, double foodPrice) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}

	public Menu() {

	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public double getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}

	@Override
	public String toString() {
		return "Menu [foodName=" + foodName + ", foodPrice=" + foodPrice + "]";
	}

}
