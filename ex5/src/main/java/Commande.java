

import java.io.IOException;

import ex5.FabriquePetitDej;
import ex5.PetitDejeuner;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Commande
 */
@WebServlet("/Commande")
public class Commande extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("formulaire.jsp");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Préparation de la fabrique
		FabriquePetitDej fabrique = new FabriquePetitDej();
		// Traitement de la requête et récupération du bean en résultant
		PetitDejeuner petitDej = fabrique.construitPetitDejeuner(request);
		if(!fabrique.succesCreation) {
			request.setAttribute("erreurs", fabrique.getErreurs());
			RequestDispatcher rd = request.getRequestDispatcher("formulaire.jsp");
			rd.forward(request, response);
			
		}else {
			request.setAttribute("erreurs", fabrique.getErreurs());
			request.setAttribute("attributPetitDej", petitDej );
			RequestDispatcher rd = request.getRequestDispatcher("recapitulatif.jsp");
			rd.forward(request, response);
		}
		// Ajout du bean à l'objet request pour Dispatcher vers recapitulatif.jsp
		
		
	}
}
