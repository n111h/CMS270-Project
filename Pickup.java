//  NAME:			:  Alexander Diaz, Zachary Gould, Noah Olmstead Harvey, Julianna De Simone, Matthew Trautmann
//  ASSIGNMENT:		:  Shoe Store [Group Project]
//  COURSE:			:  CMS.270.1.10090
//  DUE DATE:		:  23042020
//  HONOR CODE:		:  "On my honor, I have not given, nor received, nor witnessed any unauthorized assistance on this work."

public class Pickup extends Ship
{
	//  DATA MEMBERS  /////////////////////////////////////////////////////////////////
	
	private String directCustomer;
	private boolean ready;
	
	//  CONSTRUCTORS  /////////////////////////////////////////////////////////////////
	
	public Pickup()
	{
		super();
	}
	
	///////////////////////////////////////////////////////////
	
	public Pickup(String c, boolean r)
	{
		super();
		this.directCustomer = c;
		this.ready = r;
	}
	
	///////////////////////////////////////////////////////////
	
	public Pickup(String customer, int orderDate, Shoe[] cart, double total, int shipDate, boolean cancel, 
			String shipCompany, String address, String tracking, double shipCost, String c, boolean r)
	{
		super(customer, orderDate, cart, total, shipDate, cancel, shipCompany, address, tracking, shipCost);
		this.directCustomer = c;
		this.ready = r;
	}
	
	//  SETTERS  //////////////////////////////////////////////////////////////////////
	
	public void setDirectCustomer(String c)
	{
		this.directCustomer = c;
	}
	
	///////////////////////////////////////////////////////////
	
	public void setReady(boolean r)
	{
		this.ready = r;
	}
	
	//  GETTERS  //////////////////////////////////////////////////////////////////////
	
	public String getSirectCustomer()
	{
		return(this.directCustomer);
	}
	
	///////////////////////////////////////////////////////////
	
	public boolean getReady()
	{
		return(this.ready);
	}
	
	//  METHODS  //////////////////////////////////////////////////////////////////////
	
	public String toString()
	{
		return(String.format("%sPICKUP CUSTOMER:  %s\nPICKUP IS READY:  %s\n", super.toString(), this.directCustomer, 
				(this.ready) ? "YES":"NO"));
	}
}