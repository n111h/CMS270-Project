//  NAME:			:  Alexander Diaz, Zachary Gould, Noah Olmstead Harvey, Julianna De Simone, Matthew Trautmann
//  ASSIGNMENT:		:  Shoe Store [Group Project]
//  COURSE:			:  CMS.270.1.10090
//  DUE DATE:		:  23042020
//  HONOR CODE:		:  "On my honor, I have not given, nor received, nor witnessed any unauthorized assistance on this work."

public class Shoe
{
	//  DATA MEMBERS  /////////////////////////////////////////////////////////////////
	
	private Lace laces;
	private Sole sole;
	private Body body;
	private boolean complete;
	private double shoeCost;
	
	//  CONSTRUCTORS  /////////////////////////////////////////////////////////////////
	
	public Shoe()
	{
		this.complete = false;
	}
	
	///////////////////////////////////////////////////////////
	
	public Shoe(Lace l, Sole s, Body b, boolean c, double p)
	{
		this.laces = l;
		this.sole = s;
		this.body = b;
		this.complete = c;
		this.shoeCost = p;
	}
	
	//  SETTERS  //////////////////////////////////////////////////////////////////////
	
	public void setLaces(Lace l)
	{
		this.laces = l;
	}
	
	///////////////////////////////////////////////////////////
	
	public void setSole(Sole s)
	{
		this.sole = s;
	}
	
	///////////////////////////////////////////////////////////
	
	public void setBody(Body b)
	{
		this.body = b;
	}
	
	///////////////////////////////////////////////////////////
	
	public void setComplete(boolean c)
	{
		this.complete = c;
	}
	
	///////////////////////////////////////////////////////////
	
	public void setShoeCost(double p)
	{
		this.shoeCost = p;
	}
	
	//  GETTERS  //////////////////////////////////////////////////////////////////////
	
	public Lace getLaces()
	{
		return(this.laces);
	}
	
	///////////////////////////////////////////////////////////
	
	public Sole getSole()
	{
		return(this.sole);
	}
	
	///////////////////////////////////////////////////////////
	
	public Body getBody()
	{
		return(this.body);
	}
	
	///////////////////////////////////////////////////////////
	
	public boolean getComplete()
	{
		return(this.complete);
	}
	
	///////////////////////////////////////////////////////////
	
	public double getShoeCost()
	{
		return(this.shoeCost);
	}
	
	//  METHODS  //////////////////////////////////////////////////////////////////////
	
	public String toString()
	{
		return(String.format("COMPLETE:  %s\nPRICE:  $%.2f\n\n%s%s%s\n", (this.complete) ? "YES":"NO", this.shoeCost,
				(this.laces != null) ? this.laces:"", (this.sole != null) ? this.sole: "", (this.body != null) ? this.body:""));
	}
	
	///////////////////////////////////////////////////////////
	
	public void construct()
	{
		if(this.laces.getUsed() == false && this.sole.getUsed() == false && this.body.getUsed() == false)
		{
			this.laces.setUsed(true);
			this.sole.setUsed(true);
			this.body.setUsed(true);
			
			this.complete = true;
			this.shoeCost = (1.5 * (this.laces.getPrice() + this.sole.getPrice() + this.body.getPrice()));
		}
	}
}
