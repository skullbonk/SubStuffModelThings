package sub.model;

import javax.swing.JOptionPane;
import java.util.Random;

public class SubStuffDoer
{
	
	
	private int red;
	private int green;
	private int blue;
	
	
	
	public SubStuffDoer(String input, int num32)
	{
		crustomizer(input);
		masterColorSetter();
	}
	
	
	public SubStuffDoer()
	{
	//	crustomizer();
		masterColorSetter();
		
	}
	
	
	
	public boolean crustomizer(String input)
	{
		boolean isCustom = false;
		boolean complete = false;
		
		while(!complete)
		{
			if(input.equalsIgnoreCase("custom"))
			{
				isCustom = true;
				complete = true;
			}
			
			if(input.equalsIgnoreCase("random"))
			{
				isCustom = false;
				complete = true;
			}	
		}
		return isCustom;	
	}
	
	
	public void masterColorSetter()
	{
		
	}
	
	
	
	public void setColors()
	{
		String[] colorChar = new String[3];
		colorChar[0] = "r";
		colorChar[1] = "g";
		colorChar[2] = "b";
		
		for(int character = 1; character <= 3; character ++)
		{
			String colorInput = JOptionPane.showInputDialog(null, colorChar[character] + "?");
			setRed(colorInput);
			setBlue(colorInput);
			setGreen(colorInput);
		}
		
	}
	
	/*
	 * This is kind of a setter but it's like a master setter so it's separate.
	 */
	public void setRandomColors(int num32)
	{
		setRed(Integer.toString(num32));
		setGreen(Integer.toString(num32));
		setBlue(Integer.toString(num32));
	}
	
	
	
	
	
	
	// setters
	public int setRed(String input)
	{
		red = Integer.parseInt(input);
		return red;
	}
	
	private int setGreen(String input)
	{
		green = Integer.parseInt(input);
		return green;
	}
	
	private int setBlue(String input)
	{
		blue = Integer.parseInt(input);
		return blue;
	}
	
	// getters
	public int getRed()
	{
		return red;
	}
	
	public int getGreen()
	{
		return green;
	}
	
	public int getBlue()
	{
		return blue;
	}
	
	
	
}
