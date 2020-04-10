
public class Ship extends Wait{

	//----------------------------Data Members----------------------------
	
	private String shippingCompany;
	private String address;
	private String trackingNumber;
	private double shippingCost;
	
	//----------------------------Constructors----------------------------
	
	public Ship() {
		super();
	}
	
	public Ship(String shipComp, String add, String trackNum, double shipCost) {
		
		super();
		shippingCompany = shipComp;
		address = add;
		trackingNumber = trackNum;
		shippingCost = shipCost;
		
	}
	
	public Ship(String cust, int ordDate, Shoe[] crt, double ttl, int expShipDate, boolean cnl, String shipComp, String add, String trackNum, double shipCost) {
		
		super(cust, ordDate, crt, ttl, expShipDate, cnl);
		shippingCompany = shipComp;
		address = add;
		trackingNumber = trackNum;
		shippingCost = shipCost;
		
	}
	
	//----------------------------Getters----------------------------
	
	public String getShippingCompany() {
		return shippingCompany;
	}

	public String getAddress() {
		return address;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public double getShippingCost() {
		return shippingCost;
	}
	
	//-----------------------------Setters--------------------------

	public void setShippingCompany(String shippingCompany) {
		this.shippingCompany = shippingCompany;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}
	
	//----------------------------Behavior-------------------------
	
	public String trackOrder() {
		
		System.out.println("Tracking Number: " + trackingNumber +
				 "\nShippinh Company: " + shippingCompany +
				 "\nExpected Shipping Date: " + expectedShippingDate);
		
	}
	
	public String toString() {
		
		System.out.println(super.toString() + 
				 "\nTracking Number: " + trackingNumber +
				 "\nShippinh Company: " + shippingCompany +
				 "\nExpected Shipping Date: " + expectedShippingDate);
		
	}
	
}
