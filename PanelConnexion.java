import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelConnexion extends JPanel {
	
	private Menagerie menagerie;
	private Fenetre fenetre;
	
	private JTextField utilisateur;
	private JPasswordField motDePasse;
	
	public PanelConnexion (Menagerie uneMenagerie, Fenetre uneFenetre) {
		
		this.menagerie = uneMenagerie;
		this.fenetre = uneFenetre;
		
		this.setLayout(new GridLayout(4, 2, 10, 10)); //organisation en forme de grille -> 4lignes , 2 colonnes, 10 pixels d'espaces horizontal et verticale
		
		add(new JLabel("Utilisateur :")); 
		
		utilisateur = new JTextField();
		
		add(utilisateur);
		
		add(new JLabel("Mot de Passe :"));
		
		motDePasse = new JPasswordField();
		
		add(motDePasse);
		
		JButton boutonConnexion = new JButton("Connexion");
		
		add(new JLabel());
		
		add(boutonConnexion);
		
		boutonConnexion.addActionListener (new ActionConnexion());
		
	}
	
	class ActionConnexion implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			String texteUtilisateur = utilisateur.getText();
			String MDP = new String(motDePasse.getPassword()); //le new string dans le string MDP permet de transformer le motdepasse en string sinon, il peut pas etre mis dans un strign car c'est un char
			
			if (texteUtilisateur.equals("admin") && MDP.equals("1234")) {
				fenetre.afficherPanel(new PanelConsultation(menagerie));
			}
			else {
				JOptionPane.showMessageDialog(null,"identifiants incorrectes");
			}
			
		}
		
	}
	
}
