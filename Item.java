//  NAME:			:  Alexander Diaz, Zachary Gould, Noah Olmstead Harvey, Julianna De Simone, Matthew Trautmann
//  ASSIGNMENT:		:  Shoe Store [Group Project]
//  COURSE:			:  CMS.270.1.10090
//  DUE DATE:		:  23042020
//  HONOR CODE:		:  "On my honor, I have not given, nor received, nor witnessed any unauthorized assistance on this work."

public abstract class Item
{
	//  DATA MEMBERS  /////////////////////////////////////////////////////////////////
	
	private int id;
	private static int idNext = 0;
	
	//  CONSTRUCTORS  /////////////////////////////////////////////////////////////////
	
	public Item()
	{
		this.id = idNext;
		idNext += 1;
	}
	
	//  SETTERS  //////////////////////////////////////////////////////////////////////
	
	public void setId(int i)
	{
		this.id = i;
	}
	
	//  GETTERS  //////////////////////////////////////////////////////////////////////
	
	public int getId()
	{
		return(this.id);
	}
	
	//  METHODS  //////////////////////////////////////////////////////////////////////
	
	public String toString()
	{
		return(String.format("ID:  %d\n", this.id));
	}
}