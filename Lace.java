//  NAME:			:  Alexander Diaz, Zachary Gould, Noah Olmstead Harvey, Julianna De Simone, Matthew Trautmann
//  ASSIGNMENT:		:  Shoe Store [Group Project]
//  COURSE:			:  CMS.270.1.10090
//  DUE DATE:		:  23042020
//  HONOR CODE:		:  "On my honor, I have not given, nor received, nor witnessed any unauthorized assistance on this work."

public class Lace extends Component
{
	//  DATA MEMBERS  /////////////////////////////////////////////////////////////////
	
	private String color;
	private double length;
	
	//  CONSTRUCTORS  /////////////////////////////////////////////////////////////////
	
	public Lace()
	{
		super();
	}
	
	///////////////////////////////////////////////////////////
	
	public Lace(String c, double l)
	{
		super();
		this.color = c;
		this.length = l;
		this.setUsed(false);
	}
	
	///////////////////////////////////////////////////////////
	
	public Lace(String c, double l, double cost)
	{
		super(cost);
		this.color = c;
		this.length = l;
		this.setUsed(false);
	}
	
	//  SETTERS  //////////////////////////////////////////////////////////////////////
	
	public void setColor(String c)
	{
		this.color = c;
	}
	
	///////////////////////////////////////////////////////////
	
	public void setLength(double l)
	{
		this.length = l;
	}
	
	//  GETTERS  //////////////////////////////////////////////////////////////////////
	
	public String getColor()
	{
		return(this.color);
	}
	
	///////////////////////////////////////////////////////////
	
	public double getLength()
	{
		return(this.length);
	}
	
	//  METHODS  //////////////////////////////////////////////////////////////////////
	
	public String toString()
	{
		return(String.format("%sLACE COLOR:  %s\nLACE LENGTH:  %.2f in\n", super.toString(), this.color, this.length));
	}
}
