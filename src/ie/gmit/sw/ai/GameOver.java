package ie.gmit.sw.ai;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GameOver {
	// method for ending game 
    public void endGame() {
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("You Died"));
        
        // Get the panel
        JOptionPane.showConfirmDialog(null, panel, "Game Over!", JOptionPane.DEFAULT_OPTION);
        
        // Exit the game 
        System.exit(0);
    } 
}
