/*
 * Créé le 22 févr. 2015
 *
 * TODO Pour changer le modèle de ce fichier généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */
package gsb.modele.dao;

import gsb.modele.Localite;
import java.sql.ResultSet;


/**
 * @author Isabelle
 * 22 févr. 2015
 * TODO Pour changer le modèle de ce commentaire de type généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */
public class LocaliteDao {
	
	public static Localite rechercher(String unCodeLocalite){
		Localite uneLocalite=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from LOCALITE where CODEPOSTAL='"+unCodeLocalite+"'");
		try {
			if (reqSelection.next()) {
				uneLocalite = new Localite(reqSelection.getString(1), reqSelection.getString(2));	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from LOCALITE where CODEPOSTAL='"+unCodeLocalite+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBdd();
		return uneLocalite;
	}
	public static int creer(Localite uneLocalite){
		String requeteInsertion;
		int result = 0;
		String CodePostal =uneLocalite.getCodePostal();
		String Ville = uneLocalite.getVille();
		requeteInsertion = "insert into LOCALITE values('"+CodePostal+"','"+Ville+"')";
		try{
			result = ConnexionMySql.execReqMaj(requeteInsertion);
		}
		catch (Exception e){
			System.out.println("echec insertion : "+requeteInsertion);
		}
		ConnexionMySql.fermerConnexionBdd();	
		return result;
}
}
