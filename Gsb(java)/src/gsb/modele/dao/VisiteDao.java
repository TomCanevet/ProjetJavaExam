package gsb.modele.dao;

import java.sql.ResultSet;
import gsb.modele.Medecin;
import gsb.modele.Visite;
import gsb.modele.Visiteur;

public class VisiteDao {

	public static Visite rechercher(String codeVisite){
		Visite uneVisite = null;
		Medecin unMedecin= null;
		Visiteur unVisiteur = null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from VISITE where reference='"+codeVisite+"'");
		try {
			if (reqSelection.next()) {
				unMedecin = MedecinDao.rechercher(reqSelection.getString(4));
				unVisiteur = VisiteurDao.rechercher(reqSelection.getString(5));
				uneVisite = new Visite(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getString(3), unVisiteur, unMedecin);	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from VISITE where reference='"+codeVisite+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBdd();
		return uneVisite;
	}

	public static int creer(Visite uneVisite){
		String requeteInsertion;
		int result = 0;
		String reference =uneVisite.getReference();
		String DATEVISITE = uneVisite.getDATEVISITE();
		String COMMENTAIRE = uneVisite.getCOMMENTAIRE();
		Medecin unMedecin =  uneVisite.getUnMedecin();
		Visiteur unVisiteur =uneVisite.getUnVisiteur();
		requeteInsertion = "insert into VISITE values('"+reference+"','"+DATEVISITE+"','"+COMMENTAIRE+"','"+unMedecin+"','"+unVisiteur+"')";
		try{
			result = ConnexionMySql.execReqMaj(requeteInsertion);
		}
		catch (Exception e){
			System.out.println("echec insertion : "+requeteInsertion);
		}
		ConnexionMySql.fermerConnexionBdd();	
		return result;
	}
	public static int supprimer(String uneReferance){
		String requeteSuppression;
		int result = 0;
		requeteSuppression ="DELETE FROM VISITE WHERE REFERENCE='"+uneReferance+"'";
		try {
			result = ConnexionMySql.execReqMaj(requeteSuppression);
		}
		catch (Exception e){
			System.out.println("echec insertion : "+requeteSuppression);
		}
		ConnexionMySql.fermerConnexionBdd();	
		return result;
	}
}
