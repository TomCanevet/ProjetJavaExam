package gsb.test.dao;


import gsb.modele.Localite;
import gsb.modele.dao.LocaliteDao;




	public class LocaliteDaoTest {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
		Localite uneLocalite = null;
			
		uneLocalite = LocaliteDao.rechercher("13012");
	
		System.out.println(uneLocalite.getCodePostal());
		System.out.println(uneLocalite.getVille());
		
		Localite uneLocalite2 = new Localite("56000", "Vannes");
		int nb = LocaliteDao.creer(uneLocalite2);
		System.out.println(nb);
	}

}
