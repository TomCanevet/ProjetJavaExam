package gsb.test.dao;

import gsb.modele.Medicament;
import gsb.modele.Offrir;
import gsb.modele.Visite;
import gsb.modele.dao.MedicamentDao;
import gsb.modele.dao.OffrirDao;
import gsb.modele.dao.VisiteDao;



public class OffrirDaoTest {

public static void main(String[] args) {
		
		Offrir uneOffre = null;
		Visite uneVisite = null;
		Medicament unMedicament = null;
		
		Visite uneVisite2 = VisiteDao.rechercher("v001");
		Medicament unMedicament2 = MedicamentDao.rechercher("3MYC7");
		Offrir uneOffre2 = new Offrir(3, unMedicament2, uneVisite2);
		int nb = OffrirDao.creer(uneOffre2);
		System.out.println(nb);
		
		uneOffre = OffrirDao.rechercher("3MYC7");
		if (uneOffre != null) {
			
			unMedicament = uneOffre.getUnMedicament();
			uneVisite = uneOffre.getUneVisite();
			
			System.out.println(uneOffre.getQteOfferte());
			System.out.println(unMedicament.getMED_DEPOTLEGAL());
			System.out.println(uneVisite.getReference());
	}
}
}
