package gsb.test.unit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import gsb.modele.Medicament;
import gsb.service.MedicamentService;
import junit.framework.TestCase;

class MedicamentServiceTest extends TestCase {

	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();
	}

	@AfterEach
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	
	
	@Test

	public final void testRechercherMedicamentNull() {

	// cas d’un DEPOTLEGAL n’existant pas dans la table MEDICAMENT

	assertNull("Resultat recherche : ", MedicamentService.rechercherMedicament("test"));

	}

	@Test

	public final void testRechercherMedicamentReussi() {

	// cas d’un DEPOTLEGAL existant dans la table MEDICAMENT

	assertEquals("Nom commercial : ","TRIMYCINE", MedicamentService.rechercherMedicament("3MYC7").getMED_NOMCOMMERCIAL());

	}
	@Test
	void testCreerMedicamentEchoue() {
		Medicament unMedicament2 = new Medicament("5MYCR7", "Parmocodeine", "Codéine + Paracétamol", "Ce médicament est utilisé pour traiter les baisses d'activité physique ou psychique, souvent dans un contexte de dépression.", "Ce médicament ne doit pas être utilisé si vous êtes allergique au lithium. Avant de prendre ce traitement, signalez à  votre médecin traitant si vous souffrez d'insuffisance rénale, ou si vous avez un régime sans sel.", 0, "AF", "Antibiotique de la famille des cyclines");
		assertEquals("Resultat creer:",0,MedicamentService.creer(unMedicament2));
	}
	
	@Test
	void testCreerMedicamentSucces() {
		Medicament unMedicament2 = new Medicament("5MYCR7", "Parmocodeine", "Codéine + Paracétamol", "Ce médicament est utilisé pour traiter les baisses d'activité physique ou psychique, souvent dans un contexte de dépression.", "Ce médicament ne doit pas être utilisé si vous êtes allergique au lithium. Avant de prendre ce traitement, signalez à  votre médecin traitant si vous souffrez d'insuffisance rénale, ou si vous avez un régime sans sel.", 0, "AF", "Antibiotique de la famille des cyclines");
		assertEquals("Resultat creer:",1,MedicamentService.creer(unMedicament2));
	}

}
