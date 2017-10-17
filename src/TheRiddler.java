import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score =0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String r1 = JOptionPane.showInputDialog("Forward I am heavy, but backward I am not. What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(r1.equalsIgnoreCase("ton")) {
	JOptionPane.showMessageDialog(null,"correct!");
score+=1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null,"wrong! the answer was ton.");
}
		// 6. Add some more riddles
String r2 = JOptionPane.showInputDialog("when will saying please not help you?");
if(r2.equalsIgnoreCase("when you're coding")) {
JOptionPane.showMessageDialog(null,"correct!");
score+=1;
}
else {
JOptionPane.showMessageDialog(null,"wrong! the answer was when you're coding.");
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null,"score:" +score +" of 2");
	}
}

