package gsb.test.dao;

import gsb.modele.Medicament;
import gsb.modele.Stocker;
import gsb.modele.Visiteur;
import gsb.modele.dao.MedicamentDao;
import gsb.modele.dao.StockerDao;
import gsb.modele.dao.VisiteurDao;

public class StockerDaoTest {

	public static void main(String[] args) {
		
		Stocker unStock = null;
		Medicament unMedicament = null;
		Visiteur unVisiteur = null;
		
		Visiteur unVisiteur2 = VisiteurDao.rechercher("a17");
		Medicament unMedicament2 = MedicamentDao.rechercher("ADIMOL9");
		Stocker unStock2 = new Stocker(3, unMedicament2, unVisiteur2);
		int nb = StockerDao.creer(unStock2);
		System.out.println(nb);
		
		unStock = StockerDao.rechercher("3MYC7");
		if (unStock != null) {
			
			unMedicament = unStock.getUnMedicament();
			unVisiteur = unStock.getUnVisiteur();
			
			System.out.println(unStock.getQteStock());
			System.out.println(unMedicament.getMED_DEPOTLEGAL());
			System.out.println(unVisiteur.getMATRICULE());
		}
	}
}
