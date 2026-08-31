import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Fenetre extends JFrame {
	
	private Menagerie menagerie; 
	private JPanel panelPrincipal;
	
	public Fenetre() {
		
		menagerie = new Menagerie();
		
		
		//jeux de données initial pour test
		menagerie.ajouterAnimal( new Chat("Tigrou", 2, "Beige"));//précision Chat nécessaire 
		
		menagerie.ajouterAnimal( new Chien("Elaxis", 100, "Bulldog français"));
		
		setTitle("La Menagerie d'Evry");
		
		setSize(900,600);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		
		setLayout(new BorderLayout());
		
		creerMenu();//préparation pour création JMenu
		
		afficherPanel(new PanelConnexion(menagerie, this));//panel avant de rentrer 
		
		setVisible(true);
		
	}
	
	public void afficherPanel(JPanel nouveauPanel) {
		
		if (panelPrincipal != null) {
			remove(panelPrincipal);
		}
		
		panelPrincipal = nouveauPanel;
		
		add(panelPrincipal,BorderLayout.CENTER);
		
		revalidate();
		
		repaint();

	}
	
	private void creerMenu() {
		
		JMenuBar barreMenu = new JMenuBar();
		
		JMenu menuGestion = new JMenu("Gestion des animaux");
		
		JMenuItem consultation = new JMenuItem("Consultation");
		
		JMenuItem ajouter = new JMenuItem("Ajouter");
		
		JMenuItem suppression = new JMenuItem("Suppression");
		
		JMenuItem recherche = new JMenuItem("Rechercher");
		
		JMenuItem quitter = new JMenuItem("Quitter");
		
		
		consultation.addActionListener(new ActionConsultation());
		
		ajouter.addActionListener(new ActionAjouter());
		
		suppression.addActionListener(new ActionSuppression());
		
		recherche.addActionListener(new ActionRecherche());
		
		quitter.addActionListener(new ActionQuitter());
		
		
		menuGestion.add(consultation);
		
		menuGestion.add(ajouter);
		
		menuGestion.add(suppression);
		
		menuGestion.add(recherche);
		
		menuGestion.addSeparator();
		
		menuGestion.add(quitter);
		
		
		barreMenu.add(menuGestion); //ajout menugestion dans la barre de menu 
		
		setJMenuBar(barreMenu); //ajout de la barre à la fenetre avec tout ce qu'elle contenait précédemment 
		
	}
	
	
	
	class ActionConsultation implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			afficherPanel(new PanelConsultation(menagerie));
			
		}
	}
	
	class ActionAjouter implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			afficherPanel(new PanelAjout(menagerie));
			
		}
		
	}
	
	class ActionSuppression implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			afficherPanel(new PanelSuppression(menagerie));
			
		}
	}
	
	class ActionRecherche implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			afficherPanel(new PanelRecherche(menagerie));
			
		}
	}
	
	class ActionQuitter implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			System.exit(0);
			
		}
		
	}
	
}
