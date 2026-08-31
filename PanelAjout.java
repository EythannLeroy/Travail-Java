import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelAjout extends JPanel {
	
	private Menagerie menagerie;
	
	private JTextField champNom;
	
	private JTextField champAge;
	
	private JTextField champInfo;
	
	private JComboBox<String> choixType;
	
	public PanelAjout(Menagerie uneMenagerie) {
		
		this.menagerie = uneMenagerie;
		
		this.setLayout(new GridLayout(5, 2, 10, 10));
		
		
		add(new JLabel("Type :"));
		
		choixType = new JComboBox<String>();
		
		choixType.addItem("Chien");
		choixType.addItem("Chat");
		
		add(choixType);
		
		add(new JLabel("Nom :"));
		
		champNom = new JTextField();
		
		add(champNom);
		
		add(new JLabel("Age :"));
		
		champAge = new JTextField();
		
		add(champAge);
		
		add(new JLabel("Race / Couleur :"));
		
		champInfo = new JTextField();
		
		add(champInfo);
		
		add(new JLabel());
		
		JButton boutonAjouter = new JButton("Ajouter");
		
		add(boutonAjouter);
		
		boutonAjouter.addActionListener(new ActionAjouter());
		
	}
	
	class ActionAjouter implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			String nom = champNom.getText();
			String information = champInfo.getText();
			int age = Integer.parseInt(champAge.getText()); //on par du principe que l='age est correctement rentré 
			
			if(choixType.getSelectedIndex() == 0) {
				
				Chien unChien = new Chien(nom, age, information);
				
				menagerie.ajouterAnimal(unChien);
				
			}
			else {
				
				Chat unChat = new Chat(nom, age, information);
				
				menagerie.ajouterAnimal(unChat);
				
			}
			
			JOptionPane.showMessageDialog(null, "Animal ajouté !");
			
		}
		
	}

}
