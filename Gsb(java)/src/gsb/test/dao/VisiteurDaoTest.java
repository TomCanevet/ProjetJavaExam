package gsb.test.dao;

import gsb.modele.Localite;
import gsb.modele.Visiteur;
import gsb.modele.dao.LocaliteDao;
import gsb.modele.dao.VisiteurDao;

public class VisiteurDaoTest {

	public static void main(String[] args) {
		
		Visiteur unVisiteur = null;
		Localite uneLocalite = null;
		
		unVisiteur = VisiteurDao.rechercher("a131");
		if (unVisiteur != null) {
				
			
			uneLocalite = unVisiteur.getUneLocalite();
			
			System.out.println(unVisiteur.getMATRICULE());
			System.out.println(unVisiteur.getNOM());
			System.out.println(unVisiteur.getPRENOM());
			System.out.println(unVisiteur.getLOGIN());
			System.out.println(unVisiteur.getMDP());
			System.out.println(unVisiteur.getADRESSE());
			System.out.println(unVisiteur.getUneLocalite().getCodePostal());
			System.out.println(unVisiteur.getTelephone());
			System.out.println(unVisiteur.getPrime());
			System.out.println(unVisiteur.getDATEENTREE());
			System.out.println(unVisiteur.getCODEUNIT());
			System.out.println(unVisiteur.getNOMUNIT());
		}	
		else {
			System.out.println("le visiteur est null");
		}
		
		
		Localite paris = LocaliteDao.rechercher("75001");
		System.out.println(paris.getCodePostal());
		Visiteur unVisiteur2 = new Visiteur("a02", "Jean", "Henry", "JHen", "fez5f", "3 rue des femmes", paris, "0651236545", 0, "2002-03-04", "SW", "SWISS");
		int nb = VisiteurDao.creer(unVisiteur2);
		System.out.println(nb);
	}
	
}
