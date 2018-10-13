package model;

import controller.Element;

public class Wire extends Element 
{
	private float size, magnitude;
	
	public Wire(float size, float magnitude, String type, String unit, boolean active, boolean linear) 
	{
		super(size, magnitude, "wire", null, false, false);
	}

}
