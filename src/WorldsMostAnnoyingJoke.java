import javax.swing.JOptionPane;


public class WorldsMostAnnoyingJoke {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			
		String Answer=JOptionPane.showInputDialog("Knock Knock!");
		
		String Response=JOptionPane.showInputDialog("Banana");
		
		}
		
		String AnswerTwo=JOptionPane.showInputDialog("Knock Knock!");
		
		String ResponseTwo=JOptionPane.showInputDialog("Orange");
		
		JOptionPane.showMessageDialog(null, "Orange you glad I didn't say banana?!!");
	}

}
