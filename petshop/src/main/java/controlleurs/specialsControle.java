package controlleurs;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.produits;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import beans.produits;

import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class specialsControle
 */
public class specialsControle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public List <produits> getProduits()
	 {
		// TODO Auto-generated method stub
		List<produits> prods = new ArrayList<>();
	//	Connection conn=  SingletonConnection.getConnection();
		java.sql.Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/petshop_bd","root","root");
		
			PreparedStatement ps=(PreparedStatement) connection.prepareStatement("SELECT * FROM produits WHERE id_categorie=3");
//			ps.setString(1,"1");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				
				produits p =new produits();
				p.setId(rs.getInt("id_produit"));
				p.setNom(rs.getString("nom"));
				p.setPrix(rs.getDouble("prix"));
				prods.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prods;
	}
	public List <produits> prods= getProduits();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public specialsControle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ProduitModele mod = new ProduitModele();
		   mod.setProduits(prods);
		   request.setAttribute("modele",mod);
		   request.getRequestDispatcher("./specials.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
