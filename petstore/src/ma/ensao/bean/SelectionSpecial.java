package ma.ensao.bean;

import java.sql.*;
import java.util.*;


public class SelectionSpecial {
	
	private String url = "jdbc:mysql://localhost:3306/petshop_bd";
	private String user = "root";
	private String password = "root";
	private Statement statement=null;
	private Connection cnx=null;
	private ResultSet resultat=null;
	
	private List<produits> mesProduits=new ArrayList<produits>();

	public List<produits> getMesProduits() {
		return mesProduits;
	}

	public void setMesProduits(List<produits> mesProduits) {
		this.mesProduits = mesProduits;
	}

	
	public List<produits> selectionnerSpecial() throws SQLException, ClassNotFoundException{
		
	   //Chargeur de Driver :
		Class.forName( "com.mysql.jdbc.Driver" );		
		//Connexion à la BD:
		cnx= DriverManager.getConnection(url, user, password);
		
		//Statement :
	   statement=cnx.createStatement();
	   
	   //Requête:
	   resultat=statement.executeQuery("SELECT * FROM petshop_bd.produits WHERE special=1");
	   while(resultat.next()){
		   produits tmp=new produits();
		   tmp.setId(resultat.getInt(1));
		   tmp.setNom(resultat.getString("nom"));
		   tmp.setPrix(resultat.getDouble("prix"));
		   tmp.setDescription(resultat.getString("description"));
		   tmp.setCouleur(resultat.getString("couleur"));
		   tmp.setPhoto(resultat.getString("photo"));
		   tmp.setNbr_stock(resultat.getInt("nbr_stock"));
		   tmp.setPromo(resultat.getInt("promo"));
		   tmp.setSpecial(resultat.getBoolean("special"));
		   mesProduits.add(tmp);
	   }
	   //Libération des ressources:
	   if(resultat!=null)
		   resultat.close();
	   if(statement!=null)
		   statement.close();
	   if(cnx!=null)
		   cnx.close();
	   
	   return mesProduits;
	}
	public produits selectionnerProduit(int n) throws SQLException, ClassNotFoundException{
		
		   //Chargeur de Driver :
			Class.forName( "com.mysql.jdbc.Driver" );		
			//Connexion à la BD:
			cnx= DriverManager.getConnection(url, user, password);
			
			//Statement :
		   statement=cnx.createStatement();
		   produits tmp=new produits();

		   //Requête:
		   resultat=statement.executeQuery("SELECT * FROM petshop_bd.produits WHERE id_produit="+n);
		   while(resultat.next()){
			   tmp.setId(resultat.getInt(1));
			   tmp.setNom(resultat.getString("nom"));
			   tmp.setPrix(resultat.getDouble("prix"));
			   tmp.setDescription(resultat.getString("description"));
			   tmp.setCouleur(resultat.getString("couleur"));
			   tmp.setPhoto(resultat.getString("photo"));
			   tmp.setNbr_stock(resultat.getInt("nbr_stock"));
			   tmp.setPromo(resultat.getInt("promo"));
			   tmp.setSpecial(resultat.getBoolean("special"));
		   }
		   //Libération des ressources:
		   if(resultat!=null)
			   resultat.close();
		   if(statement!=null)
			   statement.close();
		   if(cnx!=null)
			   cnx.close();
		   
		   return tmp;
		}

}
