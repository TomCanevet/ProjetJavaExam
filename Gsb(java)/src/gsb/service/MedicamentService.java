package gsb.service;


import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;

public class MedicamentService {
	
	public static Medicament rechercherMedicament(String unCodeMedicament){
		Medicament unMedicament = null;
		try{
		if (unCodeMedicament==null) {
            throw new Exception("Donnée obligatoire : code");
        }
		unMedicament = MedicamentDao.rechercher(unCodeMedicament);
		}
		catch(Exception e){
			System.out.println( e.getMessage());
		}
		return unMedicament;
	}
	public static int creer(Medicament unMedicament){
		int nb = 0;
		try {
			nb=MedicamentDao.creer(unMedicament);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return nb;
	}
}
