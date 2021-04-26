package Apps.Europe_Batch2.Project;

public class Customer_Address {
	private int addressId;
	private String city;
	private String state;
	private long pincode;
	
	
	
	public Customer_Address(int addressId, String city, String state, long pincode) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	public Customer_Address() {
		
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Customer_Address [addressId=" + addressId + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + "]";
	}
	

}
