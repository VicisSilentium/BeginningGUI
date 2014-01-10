package gui.view;

import gui.controller.GUIController;

import javax.swing.JFrame;

/**
 * Framework for a GUI Frame class.
 * @author Kyler Jensen
 *@version 1.3 10/22/13
 *
 */
public class GUIFrame extends JFrame
{
	/**
	 * The controller object that will be shared across the application.
	 */
	private GUIController BaseController;
	/**
	 * The main panel for the application.
	 */
	private GUIPanel basePanel;
	
	public GUIFrame(GUIController baseController)
	{
		
		this.BaseController = baseController;
		basePanel = new GUIPanel(baseController);
		
		setupFrame();
	}
	/**
	 * Helper method to setup the default size and panel for the frame.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400,200);
		this.setVisible(true);
	}
	
}
