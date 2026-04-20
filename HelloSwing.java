/*4a.Basic hello program of Swing displaying the message Hello! VI C , 
 * Welcome to Swing Programming in Blue color plain font with font size of 32 using Jframe and Jlabel*/

package ff;

import javax.swing.*;   // For JFrame, JLabel, SwingConstants
import java.awt.*;      // For Font, Color

public class HelloSwing {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Hello Swing Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);

        // Create a JLabel with the message
        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", SwingConstants.CENTER);

        // Set font (plain, size 32) and color (blue)
        label.setFont(new Font("Arial", Font.PLAIN, 32));
        label.setForeground(Color.BLUE);

        // Add label to frame
        frame.add(label);

        // Make frame visible
        frame.setVisible(true);
    }
}
