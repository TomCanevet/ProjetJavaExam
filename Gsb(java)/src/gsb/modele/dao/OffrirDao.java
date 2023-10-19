package gsb.modele.dao;

import java.sql.ResultSet;
import gsb.modele.Medicament;
import gsb.modele.Offrir;
import gsb.modele.Visite;

public class OffrirDao {

	public static Offrir rechercher(String codeMedicament){
		Offrir uneOffre=null;
		Medicament unMedicament=null;
		Visite uneVisite= null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from Offrir where MED_DEPOTLEGAL ='"+codeMedicament+"'");
		try {
			if (reqSelection.next()) {
				unMedicament = MedicamentDao.rechercher(reqSelection.getString(2));
				uneVisite = VisiteDao.rechercher(reqSelection.getString(3));
				uneOffre = new Offrir(reqSelection.getInt(1), unMedicament, uneVisite);	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from Offrir where MED_DEPOTLEGAL ='"+codeMedicament+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBdd();
		return uneOffre;
	}
	
	public static int creer(Offrir uneOffre){
		String requeteInsertion;
		int result = 0;
		int qteOfferte = uneOffre.getQteOfferte();
		Medicament unMedicament = uneOffre.getUnMedicament();
		Visite uneVisite =  uneOffre.getUneVisite();
		requeteInsertion = "insert into Offrir values('"+qteOfferte+"','"+unMedicament.getMED_DEPOTLEGAL()+"','"+uneVisite.getReference()+"')";
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
