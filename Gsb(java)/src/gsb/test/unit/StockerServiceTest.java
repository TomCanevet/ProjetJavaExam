package gsb.test.unit;



import org.junit.After;
import org.junit.Before;

import org.junit.jupiter.api.Test;

import gsb.modele.Medicament;
import gsb.modele.Stocker;
import gsb.modele.Visiteur;
import gsb.modele.dao.MedicamentDao;
import gsb.modele.dao.VisiteurDao;
import gsb.service.StockerService;
import junit.framework.TestCase;

public class StockerServiceTest extends TestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	void testRechercherStocke() {
		assertNull("Resultat recherche : ", StockerService.rechercherStocke("test"));
	}
	
	@Test

	public final void testRechercherStockReussi() {

	// cas d’un DEPOTLEGAL existant dans la table MEDICAMENT

	assertEquals("Quantite du medicament en stock : ","3", StockerService.rechercherStocke("3MYC7").getQteStock());

	}

	@Test
	void testCreerStockerEchec() {
		Medicament unMedicament2 = MedicamentDao.rechercher("ADIMOL5") ;
		Visiteur unVisiteur2= VisiteurDao.rechercher("a2");
		Stocker unStock2 = new Stocker(5,unMedicament2, unVisiteur2);
		assertEquals("Resultat creer:",0,StockerService.creer(unStock2));
	}

	@Test
	void testCreerStockerSucces() {
		Medicament unMedicament2 = MedicamentDao.rechercher("ADIMOL5") ;
		Visiteur unVisiteur2= VisiteurDao.rechercher("a2");
		Stocker unStock2 = new Stocker(5,unMedicament2, unVisiteur2);
		assertEquals("Resultat creer:",1,StockerService.creer(unStock2));
	}
}
