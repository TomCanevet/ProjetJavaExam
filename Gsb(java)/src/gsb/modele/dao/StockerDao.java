package gsb.modele.dao;

import java.sql.ResultSet;
import gsb.modele.Medicament;
import gsb.modele.Stocker;
import gsb.modele.Visiteur;

public class StockerDao {
	public static Stocker rechercher(String codeMedicament){
		Stocker unStock = null;
		Medicament unMedicament= null;
		Visiteur unVisiteur = null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from STOCKER where MED_DEPOTLEGAL='"+codeMedicament+"'");
		try {
			if (reqSelection.next()) {
				unVisiteur = VisiteurDao.rechercher(reqSelection.getString(2));
				unMedicament = MedicamentDao.rechercher(reqSelection.getString(3));
				unStock = new Stocker( reqSelection.getInt(1),unMedicament,unVisiteur);	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from STOCKER where MED_DEPOTLEGAL='"+codeMedicament+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBdd();
		return unStock;
	}

	public static int creer(Stocker unStock){
		String requeteInsertion;
		int result = 0;
		int qteStock = unStock.getQteStock();
		Medicament unMedicament =  unStock.getUnMedicament();
		Visiteur unVisiteur =unStock.getUnVisiteur();
		requeteInsertion = "insert into STOCKER values("+qteStock+",'"+unMedicament.getMED_DEPOTLEGAL()+"','"+unVisiteur.getMATRICULE()+"')";
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

