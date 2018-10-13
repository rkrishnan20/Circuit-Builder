package controller;

public class Capacitor extends Element
{
	private float size, magnitude;
	
	public Capacitor(float size, float magnitude) 
	{
		super(size, magnitude, "capacitor", "farads", false, true);
	}
}
