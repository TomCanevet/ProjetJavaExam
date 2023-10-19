package gsb.service;


import gsb.modele.Stocker;
import gsb.modele.dao.StockerDao;


public class StockerService {

	public static Stocker rechercherStocke(String unCodeStocke){
		Stocker unStocke = null;
		try{
		if (unCodeStocke==null) {
            throw new Exception("Donnée obligatoire : code");
        }
		unStocke = StockerDao.rechercher(unCodeStocke);
		}
		catch(Exception e){
			System.out.println( e.getMessage());
		}
		return unStocke;
	}
	public static int creer(Stocker unStock){
		int nb = 0;
		try {
			nb=StockerDao.creer(unStock);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return nb;
	}
}
