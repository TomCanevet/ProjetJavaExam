package gsb.modele.dao;


/*
 * Cr�� le 23 sept. 2014
 *
 * TODO Pour changer le mod�le de ce fichier g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Isabelle
 * 23 sept. 2014
 * TODO Pour changer le mod�le de ce commentaire de type g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
public class ConnexionMySql { // DAO = Data Access Object
	
	static Connection cnx;
	
	public ConnexionMySql(){
		cnx = null;
	}
	
	/**
	 * methode qui permet la connexion � la base de donn�es
	 * le fait que la m�thode soit static permet d'�viter d'instancier dans une classe un objet ConnexioMySql
	 * pour utiliser cette m�thode �crire : ConnexionMySql.connecterBd()
	 */
	public static void connecterBdd(){
		//connexion � la base de donn�e � partir de jdbc
		String url = "jdbc:mysql://127.0.0.1:3306/gsbjava"; // url : chaine de connexion
		// try permet d'essayer de lancer la connexion
		try {Class.forName("com.mysql.cj.jdbc.Driver"); 
			cnx = DriverManager.getConnection(url,"root",""); 
		} 
		// si la connexion echoue un message d'erreur est affich�
        catch(Exception e) {  System.out.println("Echec lors de la connexion");  } 

	}
	
	/**
	 * @param laRequete requ�te SQL de type SELECT
	 * @return un curseur qui contient les lignes obtenues lors de l'ex�cution de la requ�te, null sinon
	 * pour utiliser cette m�thode �crire : ConnexionMySql.execReqSelection(uneRequete) o� uneRequ�te est de type String
	 */
	public static ResultSet execReqSelection(String laRequete){ 
		connecterBdd();
		ResultSet resultatReq = null;
		try {
				Statement requete = cnx.createStatement(); 
				resultatReq =requete.executeQuery(laRequete); 
		} 
		catch(Exception e) {  System.out.println("Erreur requete : "+laRequete);  }
		return resultatReq;	
	}
	
	/**
	 * @param laRequete requ�te SQL de type INSERT, UPDATE ou DELETE
	 * @return 1 si la MAJ s'est bien d�roul�e, 0 sinon
	 * pour utiliser cette m�thode �crire : ConnexionMySql.execReqMaj(uneRequete) o� uneRequ�te est de type String
	 */
	public static int execReqMaj(String laRequete){
		connecterBdd();
		int nbMaj =0;
		try {
		Statement s = cnx.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        nbMaj = s.executeUpdate(laRequete);
        s.close();}
		catch (Exception er) {
			er.printStackTrace(); 
			System.out.println("echec requ�te : "+laRequete); }
		return nbMaj;       
	}
	
	/**
	 * attention : tant que la connexion n'est pas ferm�e, 
	 * les MAJ ne sont pas effectives, on reste en mode d�connect�
	 * pour utiliser cette m�thode �crire : ConnexionMySql.fermerConnexionBd()
	 */
	public static void fermerConnexionBdd(){
		try{cnx.close();}
		catch(Exception e) {  System.out.println("Erreur sur fermeture connexion");  } 
	}

}
