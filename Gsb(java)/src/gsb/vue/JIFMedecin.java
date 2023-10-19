/*
 * Cr�� le 22 mars 2012
 *
 * TODO Pour changer le mod�le de ce fichier g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
package gsb.vue;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import gsb.modele.Medecin;



public class JIFMedecin extends JInternalFrame  {
	/**
	 * Commentaire pour <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	protected JPanel p;  
	protected JPanel pTexte;
	protected JPanel pBoutons;
	

	protected JLabel JLcode;
	protected JLabel JLnom;
	protected JLabel JLprenom;
	protected JLabel JLadresse;
	protected JLabel JLcp;
    protected JLabel JLville;
    protected JLabel JLtelephone;
    protected JLabel JLpotentiel;
    protected JLabel JLspecialite;
    
	protected JTextField JTcode;
	protected JTextField JTnom;
	protected JTextField JTprenom;
	protected JTextField JTadresse;
	protected JTextField JTcp;
    protected JTextField JTville;
    protected JTextField JTtelephone;
    protected JTextField JTpotentiel;
    protected JTextField JTspecialite;
	
    public JIFMedecin() {
    	 setSize(300,200);
    	 p = new JPanel();  // panneau principal de la fen�tre
         pBoutons = new JPanel();    // panneau supportant les boutons
         pTexte = new JPanel(new GridLayout(9,2));
    	
    	 JLcode = new JLabel("Code");
         JLnom = new JLabel("Nom");
         JLprenom = new JLabel("Pr�nom");
         JLadresse = new JLabel("Adresse rue");
         JLcp = new JLabel("Code postal");
         JLville = new JLabel("Ville");
         JLtelephone = new JLabel("T�l�phone");
         JLpotentiel = new JLabel("potentiel");
         JLspecialite = new JLabel("ASpecialite");
         
         JTcode = new JTextField(20);
         JTcode.setMaximumSize(JTcode.getPreferredSize());
         JTnom = new JTextField();
         JTprenom = new JTextField();
         JTadresse = new JTextField();    
         JTcp = new JTextField();
         JTville = new JTextField();
         JTtelephone = new JTextField();
         JTpotentiel = new JTextField();
         JTspecialite = new JTextField();
         
         pTexte.add(JLcode);
         pTexte.add(JTcode);
         pTexte.add(JLnom);
         pTexte.add(JTnom);
         pTexte.add(JLprenom);
         pTexte.add(JTprenom);
         pTexte.add(JLadresse);
         pTexte.add(JTadresse);
         pTexte.add(JLcp);
         pTexte.add(JTcp);
         pTexte.add(JLville);
         pTexte.add(JTville);
         pTexte.add(JLtelephone);
         pTexte.add(JTtelephone);
         pTexte.add(JLpotentiel);
         pTexte.add(JTpotentiel);
         pTexte.add(JLspecialite);
         pTexte.add(JTspecialite);
		
        // mise en forme de la fen�tre

         p.add(pTexte);
         p.add(pBoutons);
         Container contentPane = getContentPane();
         contentPane.add(p);

	}
    
    public void remplirText(Medecin unMedecin) 	
    {  // m�thode qui permet de remplir les zones de texte � partir des valeurs pass�es en param�tres
        JTcode.setText(unMedecin.getCodeMed());        
        JTnom.setText(unMedecin.getNom());
        JTprenom.setText(unMedecin.getPrenom());
        JTadresse.setText(unMedecin.getAdresse());    
        JTcp.setText(unMedecin.getLaLocalite().getCodePostal());
        JTville.setText(unMedecin.getLaLocalite().getVille());
        JTtelephone.setText(unMedecin.getTelephone());
        JTpotentiel.setText(unMedecin.getPotentiel());
        JTspecialite.setText(unMedecin.getSpecialite());
     }
     
      public void viderText() 	
    {  // m�thode qui permet de vider les zones de texte 
        JTcode.setText("");        
        JTnom.setText("");
        JTprenom.setText("");
        JTadresse.setText("");    
        JTcp.setText("");
        JTville.setText("");
        JTtelephone.setText("");
        JTpotentiel.setText("");
        JTspecialite.setText("");
     }


    
}
