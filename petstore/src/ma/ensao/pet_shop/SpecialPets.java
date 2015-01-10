package ma.ensao.pet_shop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import ma.ensao.bean.SelectionSpecial;
import ma.ensao.bean.produits;


/**
 * Servlet implementation class maServlet
 */
public class SpecialPets extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final String VUE1="/specials.jsp";  
    
    private static final String ATT_PRODUITS="produits";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SpecialPets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<produits> Produits=new ArrayList<produits>();
		SelectionSpecial maSelection=new SelectionSpecial();
		try {
		Produits=maSelection.selectionnerSpecial();
		} catch (Exception e) {
		}
		request.setAttribute(ATT_PRODUITS,Produits);
		request.setAttribute("test",request.getRequestURI());
			this.getServletContext().getRequestDispatcher(VUE1).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
