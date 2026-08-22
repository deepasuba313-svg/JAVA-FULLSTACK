import javax.swing.JOptionPane;

public class Constant {
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Enter a number: ");
        int num = Integer.parseInt(str);
            System.out.println(num);
    }
}