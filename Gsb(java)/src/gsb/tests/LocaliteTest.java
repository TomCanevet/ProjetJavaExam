package gsb.tests;

import gsb.modele.Localite;
import gsb.service.LocaliteService;

public class LocaliteTest {

	public static void main(String[] args) {
		Localite uneLocalite = LocaliteService.rechercherLocalite("13012");
		System.out.println(uneLocalite.getCodePostal());
		System.out.println(uneLocalite.getVille());
	}
}
