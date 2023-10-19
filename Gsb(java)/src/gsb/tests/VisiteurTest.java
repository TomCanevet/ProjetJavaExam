package gsb.tests;

import gsb.modele.Visiteur;
import gsb.service.VisiteurService;

public class VisiteurTest {
	public static void main(String[] args) {
		Visiteur unVisiteur = VisiteurService.rechercherVisiteur("a131");
		System.out.println(unVisiteur.getMATRICULE());
		System.out.println(unVisiteur.getNOM());
		System.out.println(unVisiteur.getPRENOM());
		System.out.println(unVisiteur.getLOGIN());
		System.out.println(unVisiteur.getMDP());
		System.out.println(unVisiteur.getADRESSE());
		System.out.println(unVisiteur.getUneLocalite().getCodePostal());
		System.out.println(unVisiteur.getTelephone());
		System.out.println(unVisiteur.getDATEENTREE());
		System.out.println(unVisiteur.getPrime());
		System.out.println(unVisiteur.getCODEUNIT());
		System.out.println(unVisiteur.getNOMUNIT());
		
	}
}
