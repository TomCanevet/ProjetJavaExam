package gsb.tests;

import gsb.modele.Medicament;
import gsb.service.MedicamentService;

public class MedicamentTest {
	public static void main(String[] args) {
		Medicament unMedicament = MedicamentService.rechercherMedicament("3MYC7");
		System.out.println(unMedicament.getMED_DEPOTLEGAL());
		System.out.println(unMedicament.getMED_NOMCOMMERCIAL());
		System.out.println(unMedicament.getMED_COMPOSITION());
		System.out.println(unMedicament.getMED_EFFETS());
		System.out.println(unMedicament.getMED_CONTREINDIC());
		System.out.println(unMedicament.getMED_PRIXECHANTILLON());
		System.out.println(unMedicament.getFAM_CODE());
		System.out.println(unMedicament.getFAM_LIBELLE());
	}
}
