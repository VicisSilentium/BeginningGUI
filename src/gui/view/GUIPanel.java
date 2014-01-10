package gui.view;

import gui.controller.GUIController;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

/**
 * 
 * @author Kyler Jensen
 * @version 1.2 
 */
public class GUIPanel extends JPanel
{
	
	private GUIController baseController;
	private SpringLayout baseLayout;
	private JButton firstButton;
	private JButton secondButton;
	
	public GUIPanel(GUIController baseController)
	{
		
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("My first button!!!!");
		secondButton = new JButton("wow I made a second button!");
		
		
		setupPanel();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(secondButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, -224, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, -98, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, -55, SpringLayout.NORTH, secondButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -25, SpringLayout.NORTH, secondButton);
		baseLayout.putConstraint(SpringLayout.NORTH, secondButton, 156, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, secondButton, 111, SpringLayout.WEST, this);
	}
	
}
