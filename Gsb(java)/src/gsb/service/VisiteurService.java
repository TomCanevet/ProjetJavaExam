package gsb.service;

import gsb.modele.Visiteur;
import gsb.modele.dao.VisiteurDao;

public class VisiteurService {

	public static Visiteur rechercherVisiteur(String unCodeVisiteur){
		Visiteur unVisiteur = null;
		try{
		if (unCodeVisiteur==null) {
            throw new Exception("Donnée obligatoire : code");
        }
		unVisiteur = VisiteurDao.rechercher(unCodeVisiteur);
		}
		catch(Exception e){
			System.out.println( e.getMessage());
		}
		return unVisiteur;
	}
	
	public static int creer(Visiteur unVisiteur){
		int nb = 0;
		try {
			nb=VisiteurDao.creer(unVisiteur);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return nb;
	}
	
	public static int supprimer(String unMatricule){
		int nb=0;
		try {
			nb=VisiteurDao.supprimer(unMatricule);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return nb;
	}
}