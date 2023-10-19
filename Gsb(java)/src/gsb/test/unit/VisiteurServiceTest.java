package gsb.test.unit;



import org.junit.After;
import org.junit.Before;

import org.junit.jupiter.api.Test;

import gsb.modele.Localite;
import gsb.modele.Visiteur;
import gsb.modele.dao.LocaliteDao;
import gsb.service.VisiteurService;
import junit.framework.TestCase;

public class VisiteurServiceTest extends TestCase {

	@Before
	protected void setUp() throws Exception {
		super.setUp();
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	void testRechercherVisiteur() {
		assertNull("Resultat recherche : ", VisiteurService.rechercherVisiteur("test"));
	}

	@Test
	public final void testRechercherVisiteurReussi() {

		// cas d’un MATRICULE existant dans la table VISITEUR

		assertEquals("Nom du visiteur : ","Villechalane", VisiteurService.rechercherVisiteur("a131").getNOM());

		}
	@Test
	void testCreervisiteurEchoue() {
		Localite paris = LocaliteDao.rechercher("75011");
		Visiteur unVisiteur2 = new Visiteur("a131", "Villechalane", "Louis", "mDupont", "jux7g", "8 rue des Charmes", paris, "0658891247", 0, "2000-05-01","SW", "SWISS");
		assertEquals("Resultat creer:",0,VisiteurService.creer(unVisiteur2));
	}
	
	@Test
	void testCreervisiteurSucces() {
		Localite paris = LocaliteDao.rechercher("75011");
		//public Visiteur(String MATRICULE, String NOM, String PRENOM, String LOGIN, String MDP, String ADRESSE, Localite uneLocalite,String Telephone, int Prime, String DATEENTREE, String CODEUNIT, String NOMUNIT)
		Visiteur unVisiteur2 = new Visiteur("a01", "Fleur", "Tom", "tFleur", "ex25d", "16 rue des Charmes", paris, "0625315200", 0, "2000-05-03","SW", "SWISS");
		assertEquals("Resultat creer:",1,VisiteurService.creer(unVisiteur2));
	}

	@Test
	void testSupprimerVisiteurEchouer() {
		assertEquals("Nom visiteur:",0,VisiteurService.supprimer("a002"));
	}
	@Test
	void testSupprimerVisiteurReussite() {
		assertEquals("Nom visiteur:",1,VisiteurService.supprimer("a01"));
	}
}
