/*
 * Cr�� le 22 f�vr. 2015
 *
 * TODO Pour changer le mod�le de ce fichier g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
package gsb.modele.dao;

import gsb.modele.Localite;
import java.sql.ResultSet;


/**
 * @author Isabelle
 * 22 f�vr. 2015
 * TODO Pour changer le mod�le de ce commentaire de type g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
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
			System.out.println("erreur reqSelection.next() pour la requ�te - select * from LOCALITE where CODEPOSTAL='"+unCodeLocalite+"'");
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
