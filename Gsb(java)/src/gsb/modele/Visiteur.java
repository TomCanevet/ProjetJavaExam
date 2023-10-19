package gsb.modele;

public class Visiteur {
	protected String MATRICULE;
	protected String NOM;
	protected String PRENOM;
	protected String LOGIN;
	protected String MDP;
	protected String ADRESSE;
	protected Localite uneLocalite;
	protected String Telephone;
	protected int Prime;
	protected String DATEENTREE;
	protected String CODEUNIT;
	protected String NOMUNIT;
	 
	

	public Visiteur(String MATRICULE, String NOM, String PRENOM, String LOGIN, String MDP, String ADRESSE, Localite uneLocalite,String Telephone, int Prime, String DATEENTREE, String CODEUNIT, String NOMUNIT){
		 this.MATRICULE = MATRICULE;
		 this.NOM = NOM;
		 this.PRENOM = PRENOM;
		 this.LOGIN = LOGIN;
		 this.MDP = MDP;
		 this.ADRESSE = ADRESSE;
		 this.uneLocalite = uneLocalite;
		 this.Telephone = Telephone;
		 this.Prime = Prime;
		 this.DATEENTREE = DATEENTREE;
		 this.CODEUNIT = CODEUNIT;
		 this.NOMUNIT = NOMUNIT; 
	}
	
	
	public String getMATRICULE() {
		return MATRICULE;
	}

	public void setMATRICULE(String mATRICULE) {
		MATRICULE = mATRICULE;
	}

	public String getNOM() {
		return NOM;
	}

	public void setNOM(String nOM) {
		NOM = nOM;
	}

	public String getPRENOM() {
		return PRENOM;
	}

	public void setPRENOM(String pRENOM) {
		PRENOM = pRENOM;
	}

	public String getLOGIN() {
		return LOGIN;
	}

	public void setLOGIN(String lOGIN) {
		LOGIN = lOGIN;
	}

	public String getMDP() {
		return MDP;
	}

	public void setMDP(String mDP) {
		MDP = mDP;
	}

	public String getADRESSE() {
		return ADRESSE;
	}

	public void setADRESSE(String aDRESSE) {
		ADRESSE = aDRESSE;
	}


	public Localite getUneLocalite() {
		return uneLocalite;
	}

	public void setUneLocalite(Localite uneLocalite) {
		this.uneLocalite = uneLocalite;
	}
	
	public String getTelephone() {
		return Telephone;
	}

	public void setTelephone(String telephone) {
		Telephone = telephone;
	}

	public int getPrime() {
		return Prime;
	}

	public void setPrime(int prime) {
		Prime = prime;
	}

	public String getDATEENTREE() {
		return DATEENTREE;
	}

	public void setDATEENTREE(String dATEENTREE) {
		DATEENTREE = dATEENTREE;
	}

	public String getCODEUNIT() {
		return CODEUNIT;
	}

	public void setCODEUNIT(String cODEUNIT) {
		CODEUNIT = cODEUNIT;
	}

	public String getNOMUNIT() {
		return NOMUNIT;
	}

	public void setNOMUNIT(String nOMUNIT) {
		NOMUNIT = nOMUNIT;
	} 
		

	 
}
