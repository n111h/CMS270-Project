//  NAME:			:  Alexander Diaz, Zachary Gould, Noah Olmstead Harvey, Julianna De Simone, Matthew Trautmann
//  ASSIGNMENT:		:  Shoe Store [Group Project]
//  COURSE:			:  CMS.270.1.10090
//  DUE DATE:		:  23042020
//  HONOR CODE:		:  "On my honor, I have not given, nor received, nor witnessed any unauthorized assistance on this work."

public class Wait extends Order
{
	//  DATA MEMBERS  /////////////////////////////////////////////////////////////////
	
	private int shipDate;
	private boolean cancelled;
	
	//  CONSTRUCTORS  /////////////////////////////////////////////////////////////////
	
	public Wait()
	{
		super();
		this.cancelled = false;
	}
	
	///////////////////////////////////////////////////////////
	
	public Wait(int d, boolean c)
	{
		super();
		this.shipDate = d;
		this.cancelled = c;
	}
	
	///////////////////////////////////////////////////////////
	
	public Wait(String customer, int orderDate, Shoe[] cart, double total, int d, boolean c)
	{
		super(customer, orderDate, cart, total);
		this.shipDate = d;
		this.cancelled = c;
	}
	
	//  SETTERS  //////////////////////////////////////////////////////////////////////
	
	public void setShipDate(int d)
	{
		this.shipDate = d;
	}
	
	///////////////////////////////////////////////////////////
	
	public void setCancelled(boolean c)
	{
		this.cancelled = c;
	}
	
	//  GETTERS  //////////////////////////////////////////////////////////////////////
	
	public int getShipDate()
	{
		return(this.shipDate);
	}
	
	///////////////////////////////////////////////////////////
	
	public boolean getCancelled()
	{
		return(this.cancelled);
	}
	
	//  METHODS  //////////////////////////////////////////////////////////////////////
	
	public String toString()
	{
		return(String.format("%sCANCELLED:  %s\n", super.toString(), (this.cancelled) ? "YES":"NO"));
	}
	
	///////////////////////////////////////////////////////////
	
	public void cancelOrder()
	{
		this.cancelled = true;
	}
}