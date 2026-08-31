import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PanelConsultation extends JPanel {
	
	private Menagerie menagerie;
	
	private JTable tableau;
	
	private DefaultTableModel modele;
	
	
	public PanelConsultation(Menagerie uneMenagerie) {
		this.menagerie = uneMenagerie;
		setLayout(new BorderLayout());
		
	
	String[] colonnes = {"Type", "Nom", "Age", "Race / Couleur"};
	
	modele = new DefaultTableModel(colonnes, 0);
	
	tableau = new JTable(modele);
	
	remplirTableau();
	
	add(new JScrollPane(tableau), BorderLayout.CENTER); // scrollpane sert de barre de défilement pour naviguer sur le tabelau
	
	}
	
	private void remplirTableau() {
		
		modele.setRowCount(0);
		
		for(Animal animal : menagerie.getAnimaux()) {
			
			modele.addRow(new Object[] {animal.getType(), animal.getNom(), animal.getAge(), animal.getInformation()}); //ajout d'une ligne avec toute les informations nécessaire		

		}
			
	}
		
}


