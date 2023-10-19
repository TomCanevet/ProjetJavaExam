package gsb.test.dao;

import gsb.modele.Medecin;
import gsb.modele.Visite;
import gsb.modele.Visiteur;
import gsb.modele.dao.MedecinDao;
import gsb.modele.dao.VisiteDao;
import gsb.modele.dao.VisiteurDao;

public class VisiteDaoTest {

public static void main(String[] args) {
		
		Visite uneVisite = null;
		Visiteur unVisiteur = null;
		Medecin unMedecin = null;
		
		uneVisite = VisiteDao.rechercher("v0001");
		unMedecin = uneVisite.getUnMedecin();
		unVisiteur = uneVisite.getUnVisiteur();
		
		
		System.out.println(uneVisite.getReference());
		System.out.println(uneVisite.getDATEVISITE());
		System.out.println(uneVisite.getCOMMENTAIRE());
		System.out.println(unMedecin.getCodeMed());
		System.out.println(unVisiteur.getMATRICULE());
		
		Visiteur unVisiteur2 = VisiteurDao.rechercher("a131");
		Medecin unMedecin2 = MedecinDao.rechercher("m001");
		Visite uneVisite2 = new Visite("v100", "2010-05-12", "", unVisiteur2, unMedecin2);
		int nb = VisiteDao.creer(uneVisite2);
		System.out.println(nb);
	}
}
