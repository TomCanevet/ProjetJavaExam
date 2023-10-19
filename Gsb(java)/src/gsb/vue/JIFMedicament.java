package gsb.vue;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import gsb.modele.Medicament;

public class JIFMedicament extends JInternalFrame  {
	

private static final long serialVersionUID = 1L;
	protected JPanel p;  
	protected JPanel pTexte;
	protected JPanel pBoutons;
	

	protected JLabel JLdepotlegal;
	protected JLabel JLnomcommercial;
	protected JLabel JLcomposition;
	protected JLabel JLeffet;
	protected JLabel JLcontreindication;
    protected JLabel JLprixechantillon;
    protected JLabel JLcode;
    protected JLabel JLlibelle;
    
	protected JTextField JTdepotlegal;
	protected JTextField JTnomcommercial;
	protected JTextField JTcomposition;
	protected JTextField JTeffet;
	protected JTextField JTcontreindication;
    protected JTextField JTprixechantillon;
    protected JTextField JTcode;
    protected JTextField JTlibelle;
	
    public JIFMedicament() {
    	p = new JPanel();  // panneau principal de la fenêtre
        pBoutons = new JPanel();    // panneau supportant les boutons
        pTexte = new JPanel(new GridLayout(9,2));
    	
         JLdepotlegal = new JLabel("Depot Légal");
         JLnomcommercial = new JLabel("Nom Commercial");
         JLcomposition = new JLabel("Compostion");
         JLeffet = new JLabel("Effet");
         JLcontreindication = new JLabel("Contreindication");
         JLprixechantillon = new JLabel("Prix Echantillon");
         JLcode = new JLabel("Code");
         JLlibelle = new JLabel("Libelle");
         
         
         JTdepotlegal = new JTextField(20);
         JTdepotlegal.setMaximumSize(JTdepotlegal.getPreferredSize());
         JTnomcommercial = new JTextField();
         JTcomposition = new JTextField();
         JTeffet = new JTextField();
         JTcontreindication = new JTextField();    
         JTprixechantillon = new JTextField();
         JTcode = new JTextField();
         JTlibelle = new JTextField();
         
         
         
         pTexte.add(JLdepotlegal);
         pTexte.add(JTdepotlegal);
         pTexte.add(JLnomcommercial);
         pTexte.add(JTnomcommercial);
         pTexte.add(JLcomposition);
         pTexte.add(JTcomposition);
         pTexte.add(JLeffet);
         pTexte.add(JTeffet);
         pTexte.add(JLcontreindication);
         pTexte.add(JTcontreindication);
         pTexte.add(JLprixechantillon);
         pTexte.add(JTprixechantillon);
         pTexte.add(JLcode);
         pTexte.add(JTcode);
         pTexte.add(JLlibelle);
         pTexte.add(JTlibelle);
         
		
        // mise en forme de la fenêtre

         p.add(pTexte);
         p.add(pBoutons);
         Container contentPane = getContentPane();
         contentPane.add(p);

	}
    
    public void remplirText(Medicament unMedicament) 	
    {  // méthode qui permet de remplir les zones de texte à partir des valeurs passées en paramètres
        JTdepotlegal.setText(unMedicament.getMED_DEPOTLEGAL());        
        JTnomcommercial.setText(unMedicament.getMED_NOMCOMMERCIAL());
        JTcomposition.setText(unMedicament.getMED_COMPOSITION());
        JTeffet.setText(unMedicament.getMED_EFFETS());
        JTcontreindication.setText(unMedicament.getMED_CONTREINDIC());    
        JTprixechantillon.setText(String.valueOf(unMedicament.getMED_PRIXECHANTILLON()));
        JTcode.setText(unMedicament.getFAM_CODE());
        JTlibelle.setText(unMedicament.getFAM_LIBELLE());
     }
     
      public void viderText() 	
    {  // méthode qui permet de vider les zones de texte 
    	  JTdepotlegal.setText("");        
    	  JTnomcommercial.setText("");
    	  JTcomposition.setText("");
    	  JTeffet.setText("");    
    	  JTcontreindication.setText("");
    	  JTprixechantillon.setText("");
    	  JTcode.setText("");
    	  JTlibelle.setText("");
        
     }
}