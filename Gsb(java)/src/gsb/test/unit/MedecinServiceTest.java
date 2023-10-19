package gsb.test.unit;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import gsb.service.MedecinService;
import junit.framework.TestCase;

public class MedecinServiceTest extends TestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public final void testRechercherMedecin() {
		fail("Not yet implemented");
	}

	@Test

	public final void testRechercherMedecinNull() {

	// cas d’un codemed n’existant pas dans la table MEDECIN

	assertNull("Resultat recherche : ", MedecinService.rechercherMedecin("test"));

	}

	@Test

	public final void testRechercherMedecinReussi() {

	// cas d’un codemed existant dans la table MEDECIN

	assertEquals("Nom médecin : ","SMITH", MedecinService.rechercherMedecin("m001").getNom());

	}
}
