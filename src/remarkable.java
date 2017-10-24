import javax.swing.JOptionPane;

public class remarkable {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("What is your name?");
	if (name.equalsIgnoreCase("Ian")) {
	JOptionPane.showMessageDialog(null, "You're a great friend, Ian!");	
	}
	else if (name.equalsIgnoreCase("Sam")) {
		JOptionPane.showMessageDialog(null, "You're a great person, Sam! Well, maybe.");
	}
	else if (name.equalsIgnoreCase("Neal")) {
		JOptionPane.showMessageDialog(null, "You're a great person, Neal!");
	}
	else if (name.equalsIgnoreCase("Andrew")) {
		JOptionPane.showMessageDialog(null, "Hi, Andrew! You, uh... you have nice shoes?");
	}
	else if (name.equalsIgnoreCase("Peter")) {
		JOptionPane.showMessageDialog(null, "You're a 'great person', Peter!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Who the heck are you?");
	}
	
	
	
	
	
	
	
	
}
}
