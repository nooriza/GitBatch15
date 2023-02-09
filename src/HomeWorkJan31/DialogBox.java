package HomeWorkJan31;
import javax.swing.JOptionPane;

public class DialogBox {
    public static void main(String[] args) {
        double salary =1000;
        String StringOutput;
        StringOutput= String.format("%.2f",salary);
        JOptionPane.showMessageDialog( null, StringOutput);
        System.exit( 0);
    }
}
