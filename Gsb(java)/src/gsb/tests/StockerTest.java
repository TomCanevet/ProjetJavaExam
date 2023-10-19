package gsb.tests;

import gsb.modele.Stocker;
import gsb.service.StockerService;

public class StockerTest {
	public static void main(String[] args) {
		Stocker unStock = StockerService.rechercherStocke("3MYC7");
		System.out.println(unStock.getQteStock());
		System.out.println(unStock.getUnMedicament().getMED_DEPOTLEGAL());
		System.out.println(unStock.getUnVisiteur().getMATRICULE());
		
	}
}
