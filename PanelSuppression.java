import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelSuppression extends JPanel {
	
	private Menagerie menagerie;
	
	private JTextField champNom;
	
	
	public PanelSuppression(Menagerie uneMenagerie) {
		this.menagerie = uneMenagerie;
		
		this.setLayout(new FlowLayout());
		
		add(new JLabel("Nom de l'animal :"));
		
		champNom = new JTextField(15);
		
		add(champNom);
		
		JButton boutonSupprimer =  new JButton("Supprimer");
		
		add(boutonSupprimer);
		
		boutonSupprimer.addActionListener(new ActionSupprimer());
		
	}
	
	class ActionSupprimer implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			String nom = champNom.getText();
			
			Animal animal = menagerie.rechercherAnimal(nom);
			
			if(animal != null ) {
				
				menagerie.supprimerAnimal(animal);
				
				JOptionPane.showMessageDialog(null, "Animal supprimé");
				
				champNom.setText("");
				
			}
			else {
				
				JOptionPane.showMessageDialog(null, "Animal introuvable");
				
			}
			
		}
		
	}

}
