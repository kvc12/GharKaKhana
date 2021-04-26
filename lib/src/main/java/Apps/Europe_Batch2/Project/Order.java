package Apps.Europe_Batch2.Project;

import java.time.LocalDate;
import java.time.LocalTime;

public class Order {
	private int orderId;
	private LocalDate orderDate;
	private LocalTime orderTime;
	private String orderStatus;
	private double orderPrice;

	private Menu foodItems;

	public Order(int orderId, LocalDate orderDate, LocalTime orderTime, String orderStatus, double orderPrice,
			Menu foodItems) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderStatus = orderStatus;
		this.orderPrice = orderPrice;
		this.foodItems = foodItems;
	}

	public Order() {

	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public LocalTime getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(LocalTime orderTime) {
		this.orderTime = orderTime;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public double getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public Menu getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(Menu foodItems) {
		this.foodItems = foodItems;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", orderTime=" + orderTime + ", orderStatus="
				+ orderStatus + ", orderPrice=" + orderPrice + ", foodItems=" + foodItems + "]";
	}

}
