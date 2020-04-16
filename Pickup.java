
public class Pickup extends Ship{
	
	//----------------------------Data Members----------------------------

	private String directCustomer;
	private boolean ready;
	
	//----------------------------Constructors----------------------------
	
	public Pickup() {
		super();
	}
	
	public Pickup(String dirCust, boolean rdy) {
		super();
		this.directCustomer = dirCust;
		this.ready = rdy;
	}
	
	public Pickup(String cust, int ordDate, Shoe[] crt, double ttl, int expShipDate, boolean cnl, String shipComp, String add, String trackNum, double shipCost, String dirCust, boolean rdy) {
		super(cust, ordDate, crt, ttl, expShipDate, cnl, shipComp, add, trackNum, shipCost);
		this.directCustomer = dirCust;
		this.ready = rdy;
	}

	//----------------------------Getters----------------------------

	public String getDirectCustomer() {
		return directCustomer;
	}

	public boolean isReady() {
		return ready;
	}
	
	//-----------------------------Setters--------------------------

	public void setDirectCustomer(String directCustomer) {
		this.directCustomer = directCustomer;
	}

	public void setReady(boolean ready) {
		this.ready = ready;
	}
	
	//----------------------------Behaviors-------------------------
	
	public String toString() {
		
		System.out.println(super.toString() +
				"\nDirect Customer: " + directCustomer +
				"\nReady: " + ready);
		
	}
	
}
