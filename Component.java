//  NAME:			:  Alexander Diaz, Zachary Gould, Noah Olmstead Harvey, Julianna De Simone, Matthew Trautmann
//  ASSIGNMENT:		:  Shoe Store [Group Project]
//  COURSE:			:  CMS.270.1.10090
//  DUE DATE:		:  23042020
//  HONOR CODE:		:  "On my honor, I have not given, nor received, nor witnessed any unauthorized assistance on this work."

public abstract class Component extends Item
{
	//  DATA MEMBERS  /////////////////////////////////////////////////////////////////
	
	private int reorderDate;
	private boolean used;
	
	//  CONSTRUCTORS  /////////////////////////////////////////////////////////////////
	
	public Component()
	{
		super();
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
	
	//  METHODS  //////////////////////////////////////////////////////////////////////
	
	public String toString()
	{
		return(String.format("%sAVAILABLE:  %s\n", super.toString(), (this.used) ? "NO":"YES"));
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
