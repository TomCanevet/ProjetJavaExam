package gsb.modele;

public class Medicament {
	protected String MED_DEPOTLEGAL;
	protected String MED_NOMCOMMERCIAL;
	protected String MED_COMPOSITION;
	protected String MED_EFFETS;
	protected String MED_CONTREINDIC;
	protected double MED_PRIXECHANTILLON;
	protected String FAM_CODE;
	protected String FAM_LIBELLE;
	
	public Medicament(String MED_DEPOTLEGAL, String MED_NOMCOMMERCIAL, String MED_COMPOSITION,
			String MED_EFFETS, String MED_CONTREINDIC, double MED_PRIXECHANTILLON,
			String FAM_CODE, String FAM_LIBELLE) {
		this.MED_DEPOTLEGAL = MED_DEPOTLEGAL;
		this.MED_NOMCOMMERCIAL = MED_NOMCOMMERCIAL;
		this.MED_COMPOSITION = MED_COMPOSITION;
		this.MED_EFFETS = MED_EFFETS;
		this.MED_CONTREINDIC = MED_CONTREINDIC;
		this.MED_PRIXECHANTILLON = MED_PRIXECHANTILLON;
		this.FAM_CODE = FAM_CODE;
		this.FAM_LIBELLE = FAM_LIBELLE;
	}

	public String getMED_DEPOTLEGAL() {
		return MED_DEPOTLEGAL;
	}

	public void setMED_DEPOTLEGAL(String mED_DEPOTLEGAL) {
		MED_DEPOTLEGAL = mED_DEPOTLEGAL;
	}

	public String getMED_NOMCOMMERCIAL() {
		return MED_NOMCOMMERCIAL;
	}

	public void setMED_NOMCOMMERCIAL(String mED_NOMCOMMERCIAL) {
		MED_NOMCOMMERCIAL = mED_NOMCOMMERCIAL;
	}

	public String getMED_COMPOSITION() {
		return MED_COMPOSITION;
	}

	public void setMED_COMPOSITION(String mED_COMPOSITION) {
		MED_COMPOSITION = mED_COMPOSITION;
	}

	public String getMED_EFFETS() {
		return MED_EFFETS;
	}

	public void setMED_EFFETS(String mED_EFFETS) {
		MED_EFFETS = mED_EFFETS;
	}

	public String getMED_CONTREINDIC() {
		return MED_CONTREINDIC;
	}

	public void setMED_CONTREINDIC(String mED_CONTREINDIC) {
		MED_CONTREINDIC = mED_CONTREINDIC;
	}

	

	public double getMED_PRIXECHANTILLON() {
		return MED_PRIXECHANTILLON;
	}

	public void setMED_PRIXECHANTILLON(double mED_PRIXECHANTILLON) {
		MED_PRIXECHANTILLON = mED_PRIXECHANTILLON;
	}

	public String getFAM_CODE() {
		return FAM_CODE;
	}

	public void setFAM_CODE(String fAM_CODE) {
		FAM_CODE = fAM_CODE;
	}

	public String getFAM_LIBELLE() {
		return FAM_LIBELLE;
	}

	public void setFAM_LIBELLE(String fAM_LIBELLE) {
		FAM_LIBELLE = fAM_LIBELLE;
	}
}