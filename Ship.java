//  NAME:			:  Alexander Diaz, Zachary Gould, Noah Olmstead Harvey, Julianna De Simone, Matthew Trautmann
//  ASSIGNMENT:		:  Shoe Store [Group Project]
//  COURSE:			:  CMS.270.1.10090
//  DUE DATE:		:  23042020
//  HONOR CODE:		:  "On my honor, I have not given, nor received, nor witnessed any unauthorized assistance on this work."

public class Ship extends Wait
{
	//  DATA MEMBERS  /////////////////////////////////////////////////////////////////
	
	private String shippingCompany;
	private String address;
	private String trackingNumber;
	private double shippingCost;
	
	//  CONSTRUCTORS  /////////////////////////////////////////////////////////////////
	
	public Ship()
	{
		super();
	}
	
	///////////////////////////////////////////////////////////
	
	public Ship(String c, String a, String t, double s)
	{
		super();
		this.shippingCompany = c;
		this.address = a;
		this.trackingNumber = t;
		this.shippingCost = s;
	}
	
	///////////////////////////////////////////////////////////
	
	public Ship(String customer, int orderDate, Shoe[] cart, double total, int shipDate, boolean cancel, 
			String c, String a, String t, double s)
	{
		super(customer, orderDate, cart, total, shipDate, cancel);
		this.shippingCompany = c;
		this.address = a;
		this.trackingNumber = t;
		this.shippingCost = s;
	}
	
	//  SETTERS  //////////////////////////////////////////////////////////////////////
	
	public void setShippingCompany(String c)
	{
		this.shippingCompany = c;
	}
	
	///////////////////////////////////////////////////////////
	
	public void setAddress(String a)
	{
		this.address = a;
	}
	
	///////////////////////////////////////////////////////////
	
	public void setTrackingNumber(String t)
	{
		this.trackingNumber = t;
	}
	
	///////////////////////////////////////////////////////////
	
	public void setShippingCost(double s)
	{
		this.shippingCost = s;
	}
	
	//  GETTERS  //////////////////////////////////////////////////////////////////////
	
	public String getShippingCompanay()
	{
		return(this.shippingCompany);
	}
	
	///////////////////////////////////////////////////////////
	
	public String getAddress()
	{
		return(this.address);
	}
	
	///////////////////////////////////////////////////////////
	
	public String getTrackingNumber()
	{
		return(this.trackingNumber);
	}
	
	///////////////////////////////////////////////////////////
	
	public double getShippingCost()
	{
		return(this.shippingCost);
	}
	
	//  METHODS  //////////////////////////////////////////////////////////////////////
	
	public String toString()
	{
		return(String.format("%sSHIPPING COMPANY:  %s\nSHIPPING ADDRESS:  %s\nTRACKING NUMBER:  %s\nSHIPPING COST: $%.2f\n",
				super.toString(), this.shippingCompany, this.address, this.trackingNumber, this.shippingCost));
	}
	
	///////////////////////////////////////////////////////////
	
	public String trackOrder()
	{
		return("It's on the way!");
	}
	
	///////////////////////////////////////////////////////////
	
	public void addShippingCost()
	{
		this.setTotal((this.getTotal() + this.shippingCost));
	}
}