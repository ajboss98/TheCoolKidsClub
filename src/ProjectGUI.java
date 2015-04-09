import java.util.List;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class ProjectGUI {

	private List<String> usernames;
	private List<String> messages;
	private String message;
	private BackEnd daConvos;
	public ProjectGUI()
	{
		JFrame frame = new JFrame("deConvos");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Box usernameBox = Box.createVerticalBox();
		Box searchBox = Box.createVerticalBox();
		frame.add(searchBox);
		frame.add(usernameBox);
		daConvos = new BackEnd();
		//usernameBox
		
		
		//searchBox
		JButton NewMSGB = new JButton("Create Message");
		JTextField searchField = new JTextField();
		JButton searchButton = new JButton("Search");
		searchBox.add(NewMSGB);
	}
	public static void main(String[] args)
	{
		{	
			SwingUtilities.invokeLater(new Runnable() 
			{
				public void run() { new ProjectGUI(); }
			});
		}
	}
}
