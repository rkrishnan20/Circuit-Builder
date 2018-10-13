package controller;

public class Element 
{
	private float size, magnitude;
	private String type, unit;
	private boolean active, linear;
	private int ports;
	
	public Element(float size, float magnitude, String type, String unit, boolean active, boolean linear)
	{
		this.size = size;
		this.magnitude = magnitude;
		this.type = type;
		this.unit = unit;
		this.active = active;
		this.linear = linear;
		this.ports = ports;
	}

	public float getSize() 
	{
		return size;
	}

	public void setSize(float size) 
	{
		this.size = size;
	}

	public String getType() 
	{
		return type;
	}

	public void setType(String type) 
	{
		this.type = type;
	}

	public String getUnit() 
	{
		return unit;
	}

	public void setUnit(String unit) 
	{
		this.unit = unit;
	}

	public boolean isActive() 
	{
		return active;
	}

	public void setActive(boolean active) 
	{
		this.active = active;
	}

	public boolean isLinear() 
	{
		return linear;
	}

	public void setLinear(boolean linear) 
	{
		this.linear = linear;
	}

	public int getPorts() 
	{
		return ports;
	}

	public void setPorts(int ports) 
	{
		this.ports = ports;
	}
}
