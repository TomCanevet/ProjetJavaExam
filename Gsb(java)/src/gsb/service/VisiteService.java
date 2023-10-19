package gsb.service;

import gsb.modele.Visite;
import gsb.modele.dao.VisiteDao;

public class VisiteService {

	public static Visite rechercherVisite(String unCodeVisite){
		Visite uneVisite = null;
		try{
		if (unCodeVisite==null) {
            throw new Exception("Donnée obligatoire : code");
        }
		uneVisite = VisiteDao.rechercher(unCodeVisite);
		}
		catch(Exception e){
			System.out.println( e.getMessage());
		}
		return uneVisite;
	}
	public static int creer(Visite unVisite){
		int nb = 0;
		try {
			nb=VisiteDao.creer(unVisite);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return nb;
	}
	
	public static int supprimer(String uneReferance){
		int nb=0;
		try {
			nb=VisiteDao.supprimer(uneReferance);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return nb;
	}
}
