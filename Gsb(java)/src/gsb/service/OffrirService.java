package gsb.service;


import gsb.modele.Offrir;
import gsb.modele.dao.OffrirDao;




public class OffrirService {

	public static Offrir rechercherOffre(String unCodeOffre){
		Offrir uneOffre = null;
		try{
		if (unCodeOffre==null) {
            throw new Exception("Donnée obligatoire : code");
        }
		uneOffre = OffrirDao.rechercher(unCodeOffre);
		}
		catch(Exception e){
			System.out.println( e.getMessage());
		}
		return uneOffre;
	}
	public static int creer(Offrir uneOffre){
		int nb = 0;
		try {
			nb=OffrirDao.creer(uneOffre);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return nb;
	}
}
