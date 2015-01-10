package ma.ensao.pet_shop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ma.ensao.bean.Selection;
import ma.ensao.bean.produits;

/**
 * Servlet implementation class ProduitServlet
 */
public class ProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final String VUE1="/Prices.jsp";  
    private static final String VUE2="/Details.jsp";
    private static final String ATT_PRODUIT="produit";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		produits monProduit=new produits();
		Selection maSelection=new Selection();
		try {
		monProduit=maSelection.selectionnerProduit(Integer.parseInt(request.getParameter("paramId")));
		} catch (Exception e) {
		}
		request.setAttribute(ATT_PRODUIT,monProduit);
		this.getServletContext().getRequestDispatcher(VUE2).forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
