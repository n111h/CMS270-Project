//  NAME:			:  Alexander Diaz, Zachary Gould, Noah Olmstead Harvey, Julianna De Simone, Matthew Trautmann
//  ASSIGNMENT:		:  Shoe Store [Group Project]
//  COURSE:			:  CMS.270.1.10090
//  DUE DATE:		:  23042020
//  HONOR CODE:		:  "On my honor, I have not given, nor received, nor witnessed any unauthorized assistance on this work."

public class Body extends Component
{
	//  DATA MEMBERS  /////////////////////////////////////////////////////////////////
	
	private String color;
	private double size;
	private String pattern;
	private String material;
	
	//  CONSTRUCTORS  /////////////////////////////////////////////////////////////////
	
	public Body()
	{
		super();
	}
	
	///////////////////////////////////////////////////////////
	
	public Body(String c, double s, String p, String m)
	{
		super();
		this.color = c;
		this.size = s;
		this.pattern = p;
		this.material = m;
		this.setUsed(false);
	}
	
	///////////////////////////////////////////////////////////
	
	public Body(String c, double s, String p, String m, double cost)
	{
		super(cost);
		this.color = c;
		this.size = s;
		this.pattern = p;
		this.material = m;
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
	
	///////////////////////////////////////////////////////////
	
	public void setMaterial(String m)
	{
		this.material = m;
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
	
	///////////////////////////////////////////////////////////
	
	public String getMaterial()
	{
		return(this.material);
	}
	
	//  METHODS  //////////////////////////////////////////////////////////////////////
	
	public String toString()
	{
		return(String.format("%sBODY COLOR:  %s\nBODY SIZE:  %.1f\nBODY PATTERN:  %s\nBODY MATERIAL:  %s\n",
				super.toString(), this.color, this.size, this.pattern, this.material));
	}
}