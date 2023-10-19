package gsb.tests;

import gsb.modele.Offrir;
import gsb.service.OffrirService;

public class OffrirTest {
	public static void main(String[] args) {
		Offrir uneOffre = OffrirService.rechercherOffre("");
		System.out.println(uneOffre.getQteOfferte());
		System.out.println(uneOffre.getUnMedicament().getMED_DEPOTLEGAL());
		System.out.println(uneOffre.getUneVisite().getReference());
		
	}
}
