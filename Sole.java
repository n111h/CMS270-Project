//  NAME:			:  Alexander Diaz, Zachary Gould, Noah Olmstead Harvey, Julianna De Simone, Matthew Trautmann
//  ASSIGNMENT:		:  Shoe Store [Group Project]
//  COURSE:			:  CMS.270.1.10090
//  DUE DATE:		:  23042020
//  HONOR CODE:		:  "On my honor, I have not given, nor received, nor witnessed any unauthorized assistance on this work."

public class Sole extends Component
{
	//  DATA MEMBERS  /////////////////////////////////////////////////////////////////
	
	private String color;
	private double size;
	private String pattern;
	
	//  CONSTRUCTORS  /////////////////////////////////////////////////////////////////
	
	public Sole()
	{
		super();
	}
	
	///////////////////////////////////////////////////////////
	
	public Sole(String c, double s, String p)
	{
		super();
		this.color = c;
		this.size = s;
		this.pattern = p;
		this.setUsed(false);
	}
	
	///////////////////////////////////////////////////////////
	
	public Sole(String c, double s, String p, double cost)
	{
		super(cost);
		this.color = c;
		this.size = s;
		this.pattern = p;
		this.setUsed(false);
	}
	
	//  SETTERS  //////////////////////////////////////////////////////////////////////
	
	public void setColor(String c)
	{
		this.color = c;
	}
	
	///////////////////////////////////////////////////////////
	
	public void setSize(double s)
	{
		this.size = s;
	}
	
	///////////////////////////////////////////////////////////
	
	public void setPattern(String p)
	{
		this.pattern = p;
	}
	
	//  GETTERS  //////////////////////////////////////////////////////////////////////
	
	public String getColor()
	{
		return(this.color);
	}
	
	///////////////////////////////////////////////////////////
	
	public double getSize()
	{
		return(this.size);
	}
	
	///////////////////////////////////////////////////////////
	
	public String getPattern()
	{
		return(this.pattern);
	}
	
	//  METHODS  //////////////////////////////////////////////////////////////////////
	
	public String toString()
	{
		return(String.format("%sSOLE COLOR:  %s\nSOLE SIZE:  %.1f\nSOLE PATTERN:  %s\n", super.toString(),
				this.color, this.size, this.pattern));
	}
}