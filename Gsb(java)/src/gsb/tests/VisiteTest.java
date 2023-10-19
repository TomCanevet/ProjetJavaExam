package gsb.tests;

import gsb.modele.Visite;
import gsb.service.VisiteService;

public class VisiteTest {
	public static void main(String[] args) {
		Visite uneVisite = VisiteService.rechercherVisite("v0001");
		System.out.println(uneVisite.getReference());
		System.out.println(uneVisite.getDATEVISITE());
		System.out.println(uneVisite.getCOMMENTAIRE());
		System.out.println(uneVisite.getUnVisiteur().getMATRICULE());
		System.out.println(uneVisite.getUnMedecin().getCodeMed());
		
		
	}
}
