package gsb.test.dao;


import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;




public class MedicamentDaoTest {
	
	public static void main(String[] args) {
		
		Medicament unMedicament = null;
		
		
		unMedicament = MedicamentDao.rechercher("3MYC7");
				
		System.out.println(unMedicament.getMED_DEPOTLEGAL());
		System.out.println(unMedicament.getMED_NOMCOMMERCIAL());
		System.out.println(unMedicament.getMED_COMPOSITION());
		System.out.println(unMedicament.getMED_EFFETS());
		System.out.println(unMedicament.getMED_CONTREINDIC());
		System.out.println(unMedicament.getMED_PRIXECHANTILLON());
		System.out.println(unMedicament.getFAM_CODE());
		System.out.println(unMedicament.getFAM_LIBELLE());
		
		Medicament unMedicament2 = new Medicament("Q5H6D","Paracetamol"," prac�tamol", "Ce m�dicament est utilis� pour le traitement des douleurs lorsque des antalgiques simples ne sont pas assez efficaces.", "Ce m�dicament est contre-indiqu� en cas d allergie � l un des constituants, chez l enfant de moins de 15 Kg, en cas d insuffisance h�patique ou respiratoire, d asthme, de ph�nylc�tonurie et chez la femme qui allaite.",0,"PA","Antibiotique");
		int nb = MedicamentDao.creer(unMedicament2);
		System.out.println(nb);
	}
}
