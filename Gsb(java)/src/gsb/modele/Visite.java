package gsb.modele;

public class Visite {
	protected String reference;
	protected String DATEVISITE;
	protected String COMMENTAIRE;
	protected Visiteur unVisiteur;
	protected Medecin unMedecin;
	
	
	public Visite(String uneReference, String DATEVISITE, String COMMENTAIRE, Visiteur unVisiteur, Medecin unMedecin) {
		this.reference= uneReference;
		this.DATEVISITE= DATEVISITE;
		this.COMMENTAIRE= COMMENTAIRE;
		this.unVisiteur= unVisiteur;
		this.unMedecin= unMedecin;
		
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getDATEVISITE() {
		return DATEVISITE;
	}

	public void setDATEVISITE(String dATEVISITE) {
		DATEVISITE = dATEVISITE;
	}

	public String getCOMMENTAIRE() {
		return COMMENTAIRE;
	}

	public void setCOMMENTAIRE(String cOMMENTAIRE) {
		COMMENTAIRE = cOMMENTAIRE;
	}

	public Medecin getUnMedecin() {
		return unMedecin;
	}

	public void setUnMedecin(Medecin unMedecin) {
		this.unMedecin = unMedecin;
	}

	public Visiteur getUnVisiteur() {
		return unVisiteur;
	}

	public void setUnVisiteur(Visiteur unVisiteur) {
		this.unVisiteur = unVisiteur;
	}

	
}