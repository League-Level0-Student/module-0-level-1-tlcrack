import javax.swing.JOptionPane;

public class CeckpointIf {
public static void main(String[] args) {
	
	String yes = JOptionPane.showInputDialog("Do you have any friends?");
	if(yes.equals("yes")){
	JOptionPane.showMessageDialog(null, "happy");
	
	}
	else {
	JOptionPane.showMessageDialog(null, "sad");
	}	
	JOptionPane.showMessageDialog(null, "Wendsday");
	
	int age = 10;
			if(20>age) {
	JOptionPane.showMessageDialog(null, "It's so great being young");
			}
			else {
	JOptionPane.showMessageDialog(null, "Don't you wish you were young!");
			}
	
			String ani = JOptionPane.showInputDialog("What's your favorite animal?");
			if(ani.equals("dog")) {
			JOptionPane.showMessageDialog(null, "Dogs go woof");
			}
			
	
	
}

}