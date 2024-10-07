import javax.swing.JOptionPane; 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String name = JOptionPane.showInputDialog("Enter Your Name");
      JOptionPane.showMessageDialog(null,"Hello "+name);
      
      int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age"));
      JOptionPane.showMessageDialog(null, "Your age is "+age);
	}

}
