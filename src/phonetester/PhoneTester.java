/*
    Matt Ludwig
    2019-05-13
 */

package phonetester;

/**
 *
 * @author MaLud0519
 */
import javax.swing.*;
public class PhoneTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String carrier, type;
        double speed, storage;
        int num;
        CellPhone c1 = new CellPhone();
        type = JOptionPane.showInputDialog("Cell Phone Program: " + "\n\n" + "What type"
                + " of phone do you have?");
        carrier = JOptionPane.showInputDialog("Enter your service provider:");
        speed = Double.parseDouble(JOptionPane.showInputDialog("What is the phone's processing"
                + " speed, in GHz?"));
         
    }
    
}
