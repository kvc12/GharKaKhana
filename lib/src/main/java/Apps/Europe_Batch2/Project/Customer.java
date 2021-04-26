package Apps.Europe_Batch2.Project;

public class Customer {
	private int customerId;
	private String firstName;
	private String lastName;
	private long contactNo;
	private String userName;
	private String password;

	private Customer_Address customerAddress;

	public Customer(int customerId, String firstName, String lastName, long contactNo, String userName,
			String password) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNo = contactNo;
		this.userName = userName;
		this.password = password;
	}

	public Customer() {

	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer_Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Customer_Address customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", contactNo=" + contactNo + ", userName=" + userName + ", password=" + password
				+ ", customerAddress=" + customerAddress + "]";
	}

}
