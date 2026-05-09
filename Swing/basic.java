import javax.swing.*;
package Swing;
public class basic {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Basic Swing Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        JLabel label = new JLabel("Hello, Swing!", SwingConstants.CENTER);
        frame.add(label);
        frame.setVisible(true); 
        
    }
}
