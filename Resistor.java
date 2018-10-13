package controller;

public class Resistor extends Element 
{
	private float size, magnitude; 
	
	public Resistor(float size, float magnitude)
	{
		super(size, magnitude, "resistor", "ohms", false, true);
	}
}
