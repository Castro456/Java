package firstproject;
import javax.swing.JOptionPane;
public class gui {
	
	public static void main (String args[]) {
		String name = JOptionPane.showInputDialog("Enter your name!");
		JOptionPane.showMessageDialog(null, "Your "+name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Your Age"));
		JOptionPane.showMessageDialog(null, "Age "+age);
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Your Height"));
		JOptionPane.showMessageDialog(null, "Your Height "+height+" is good");
	}
}
