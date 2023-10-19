package gsb.modele.dao;

import java.sql.ResultSet;

import gsb.modele.Localite;
import gsb.modele.Visiteur;

public class VisiteurDao {
	
	public static Visiteur rechercher(String codeVisiteur){
		Visiteur unVisiteur = null;
		Localite uneLocalite= null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from VISITEUR where MATRICULE='"+codeVisiteur+"'");
		try {
			if (reqSelection.next()) {
				uneLocalite = LocaliteDao.rechercher(reqSelection.getString(7));
				unVisiteur = new Visiteur(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getString(3), reqSelection.getString(4), reqSelection.getString(5), reqSelection.getString(6), uneLocalite,reqSelection.getString(8), reqSelection.getInt(9), reqSelection.getString(10), reqSelection.getString(11), reqSelection.getString(12));	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from VISITEUR where MATRICULE='"+codeVisiteur+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBdd();
		return unVisiteur;
	}
	
	public static int creer(Visiteur unVisiteur){
		String requeteInsertion;
		int result = 0;
		String MATRICULE =unVisiteur.getMATRICULE();
		String NOM = unVisiteur.getNOM();
		String PRENOM = unVisiteur.getPRENOM();
		String LOGIN =  unVisiteur.getLOGIN();
		String MDP =unVisiteur.getMDP();
		String Adresse = unVisiteur.getADRESSE();
		String unCp = unVisiteur.getUneLocalite().getCodePostal();
		String Telephone = unVisiteur.getTelephone();
		int Prime = unVisiteur.getPrime();
		String DATEENTREE = unVisiteur.getDATEENTREE();
		String CODEUNIT = unVisiteur.getCODEUNIT();
		String NOMUNIT = unVisiteur.getNOMUNIT();
		requeteInsertion = "insert into VISITEUR values('"+MATRICULE+"','"+NOM+"','"+PRENOM+"','"+LOGIN+"','"+MDP+"','"+Adresse+"','"+unCp+"','"+Telephone+"','"+Prime+"','"+DATEENTREE+"','"+CODEUNIT+"','"+NOMUNIT+"')";
		try{
			result = ConnexionMySql.execReqMaj(requeteInsertion);
		}
		catch (Exception e){
			System.out.println("echec insertion : "+requeteInsertion);
		}
		ConnexionMySql.fermerConnexionBdd();	
		return result;
}

	public static int supprimer(String unMatricule) {
		String requeteSuppression;
		int result = 0;
		requeteSuppression ="DELETE FROM VISITEUR WHERE MATRICULE='"+unMatricule+"'";
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
