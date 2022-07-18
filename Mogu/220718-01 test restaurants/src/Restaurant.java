public class Restaurant {
	private int companyNum;
	private String businessName;
	private String number;
	private String address;
	
	public Restaurant(String businessName, String number, String address) {
		super();
		this.businessName = businessName;
		this.number = number;
		this.address = address;
	}
	
	public Restaurant(int companyNum, String businessName, String number, String address) {
		super();
		this.companyNum = companyNum;
		this.businessName = businessName;
		this.number = number;
		this.address = address;
	}

	public int getCompanyNum() {
		return companyNum;
	}

	public void setCompanyNum(int companyNum) {
		this.companyNum = companyNum;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "restaurant [companyNum=" + companyNum + ", businessName=" + businessName + ", number=" + number
				+ ", address=" + address + "]";
	}
	
	

}
