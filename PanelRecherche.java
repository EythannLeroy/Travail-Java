import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelRecherche extends JPanel {

	private Menagerie menagerie;
	
	private JTextField champRecherche;
	
	private JLabel resultat;
	
	
	public PanelRecherche(Menagerie uneMenagerie) {
		
		this.menagerie = uneMenagerie;
		
		this.setLayout(new FlowLayout());
		
		add(new JLabel("Nom de l'animal :"));
		
		champRecherche = new JTextField(15);
		
		add(champRecherche);
		
		JButton boutonRecherche = new JButton("Rechercher");
		
		add(boutonRecherche);
		
		resultat = new JLabel();
		
		add(resultat);
		
		boutonRecherche.addActionListener(new ActionRechercher());
		
	}
	
	
	class ActionRechercher implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			String nom = champRecherche.getText();
			
			Animal animal = menagerie.rechercherAnimal(nom);
			
			if(animal != null) {
				
				resultat.setText(animal.toString());
				
			}
			else {
				
				resultat.setText("Animal introuvable");
				
			}
			
		}
	}
	
}
