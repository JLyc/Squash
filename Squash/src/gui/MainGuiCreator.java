package gui;

import static gui.XYPositionConstants.FRAME_HIGHT;
import static gui.XYPositionConstants.FRAME_WIDTH;

import java.awt.Dimension;

import javax.swing.JFrame;


public class MainGuiCreator extends JFrame
{
	private static final long serialVersionUID = 1L;

	private static MainGuiCreator creatorInstance = null;

	private MainGuiCreator()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Squash");
		this.setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HIGHT));
		this.getRootPane().setContentPane(new MaintPanel());
		this.addKeyListener(new InputKeyListener());
		this.pack();
		this.setVisible(true);
	}

	public static void createGUI()
	{
		if (creatorInstance == null)
		{
			creatorInstance = new MainGuiCreator();
		}
	}

	public static MainGuiCreator getGUIInstance()
	{
		createGUI();
		return creatorInstance;
	}
}
