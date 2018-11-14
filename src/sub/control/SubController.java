package sub.control;

import sub.model.SubStuffDoer;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

import java.util.Random;

public class SubController
{
	// Declarations
	Random random = new Random();
	public int num32 = random.nextInt(256);
	// public String input = "noid";
	
	private SubStuffDoer doingStuff;
	
	public UIManager UI = new UIManager();
	
	public String input = "blech";
	
	public SubController()
	{
		doingStuff = new SubStuffDoer(input, num32);
	}
	
	// Bit that runs everything
	public void start()
	{
		input = JOptionPane.showInputDialog(null, "Random or Custom?");
		while(!(input.equalsIgnoreCase("custom") || (input.equalsIgnoreCase("random"))))
		{
			input = JOptionPane.showInputDialog(null, "nope, try again: Custom or Random?");
			doingStuff.crustomizer(input);
		}
		if(!doingStuff.crustomizer(input))
		{
			doingStuff.setRandomColors(num32);
		}
		
		if(doingStuff.crustomizer(input))
		{
			doingStuff.setColors();
			UIManager.put("OptionPane.background", new ColorUIResource(doingStuff.getRed(), doingStuff.getGreen(), doingStuff.getBlue()));
			JOptionPane.showMessageDialog(null, "nice");
		}
	}
	
}
