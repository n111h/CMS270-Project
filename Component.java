//  NAME:			:  Alexander Diaz, Zachary Gould, Noah Olmstead Harvey, Julianna De Simone, Matthew Trautmann
//  ASSIGNMENT:		:  Shoe Store [Group Project]
//  COURSE:			:  CMS.270.1.10090
//  DUE DATE:		:  23042020
//  HONOR CODE:		:  "On my honor, I have not given, nor received, nor witnessed any unauthorized assistance on this work."

public abstract class Component
{
	//  DATA MEMBERS  /////////////////////////////////////////////////////////////////
	
	private int reorderDate;
	private boolean used;
	private double price;
	
	//  CONSTRUCTORS  /////////////////////////////////////////////////////////////////
	
	public Component()
	{
		this.price = 10.0;
	}
	
	///////////////////////////////////////////////////////////
	
	public Component(double p)
	{
		this.price = p;
	}
	
	//  SETTERS  //////////////////////////////////////////////////////////////////////
	
	public void setReorderDate(int d)
	{
		this.reorderDate = d;
	}
	
	///////////////////////////////////////////////////////////
	
	public void setUsed(boolean u)
	{
		this.used = u;
	}
	
	///////////////////////////////////////////////////////////
	
	public void setPrice(double p)
	{
		this.price = p;
	}
	
	//  GETTERS  //////////////////////////////////////////////////////////////////////
	
	public int getReorderDate()
	{
		return(this.reorderDate);
	}
	
	///////////////////////////////////////////////////////////
	
	public boolean getUsed()
	{
		return(this.used);
	}
	
	///////////////////////////////////////////////////////////
	
	public double getPrice()
	{
		return(this.price);
	}
	
	//  METHODS  //////////////////////////////////////////////////////////////////////
	
	public String toString()
	{
		return(String.format("AVAILABLE:  %s\nCOMPONENT COST:  $%.2f\n", (this.used) ? "NO":"YES", this.price));
	}
	
	///////////////////////////////////////////////////////////
	
	public void reorder()
	{
	}
	
	///////////////////////////////////////////////////////////
	
	public void use()
	{
		this.used = true;
	}
}
