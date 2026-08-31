import javax.swing.*;
import java.awt.*;


public class PanelAccueil extends JPanel{
	
	public PanelAccueil() {
		
		setLayout(new BorderLayout());
		
		JLabel titre = new JLabel("Bienvenue dans la ménagerie d'Evry !", SwingConstants.CENTER); //swingconstants permet d'aligner mon texte dans le JLabel
		
		titre.setFont(new Font("Arial", Font.BOLD, 30));
		
		add(titre,BorderLayout.CENTER);
		
	}

}