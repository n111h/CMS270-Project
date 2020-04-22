//  NAME:			:  Alexander Diaz, Zachary Gould, Noah Olmstead Harvey, Julianna De Simone, Matthew Trautmann
//  ASSIGNMENT:		:  Shoe Store [Group Project]
//  COURSE:			:  CMS.270.1.10090
//  DUE DATE:		:  23042020
//  HONOR CODE:		:  "On my honor, I have not given, nor received, nor witnessed any unauthorized assistance on this work."

public abstract class Order
{
	//  DATA MEMBERS  /////////////////////////////////////////////////////////////////
	
	private String customer;
	private int orderDate;
	private Shoe[] cart;
	private double total;
	
	//  CONSTRUCTORS  /////////////////////////////////////////////////////////////////
	
	public Order()
	{
	}
	
	///////////////////////////////////////////////////////////
	
	public Order(String c, int d, Shoe[] k, double t)
	{
		this.customer = c;
		this.orderDate = d;
		this.cart = k;
		this.total = t;
	}
	
	//  SETTERS  //////////////////////////////////////////////////////////////////////
	
	public void setCustomer(String c)
	{
		this.customer = c;
	}
	
	///////////////////////////////////////////////////////////
	
	public void setOrderDate(int d)
	{
		this.orderDate = d;
	}
	
	///////////////////////////////////////////////////////////
	
	public void setCart(Shoe[] k)
	{
		this.cart = k;
	}
	
	///////////////////////////////////////////////////////////
	
	public void setTotal(double t)
	{
		this.total = t;
	}
	
	//  GETTERS  //////////////////////////////////////////////////////////////////////
	
	public String getCustomer()
	{
		return(this.customer);
	}
	
	///////////////////////////////////////////////////////////
	
	public int getOrderDate()
	{
		return(this.orderDate);
	}
	
	///////////////////////////////////////////////////////////
	
	public Shoe[] getCart()
	{
		return(this.cart);
	}
	
	///////////////////////////////////////////////////////////
	
	public double getTotal()
	{
		return(this.total);
	}
	
	//  METHODS  //////////////////////////////////////////////////////////////////////
	
	public String toString()
	{
		return(String.format("CUSTOMER:  %s\nCART:  %s\nTOTAL:  $%.2f\n", this.customer, this.cart, this.total));
	}
}
