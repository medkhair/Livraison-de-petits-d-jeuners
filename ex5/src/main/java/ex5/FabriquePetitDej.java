package ex5;

import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.http.HttpServletRequest;

public class FabriquePetitDej {
	private static final String CHAMP_CHAMBRE = "chambre";
	private static final String CHAMP_HEURE = "heure";
	private static final String CHAMP_NB_REPAS = "nombreDeRepas";
	private static final String CHAMP_COMMENTAIRES = "commentaires";
	private Map<String, String> erreurs = new HashMap<String, String>();
	public Map<String, String> getErreurs() {
		return erreurs;
	}
	public boolean succesCreation;
	
	public PetitDejeuner construitPetitDejeuner(HttpServletRequest request) {
		int chambre = Integer.parseInt(request.getParameter("chambre")), nombreDeRepas = Integer.parseInt(request.getParameter("nombreDeRepas"));
		String heure =  request.getParameter("heure");
		String commentaire = request.getParameter("commentaire");
		try {
	        validationChambre(chambre);
	    } catch (Exception e) {
	        erreurs.put("chambre", e.getMessage());
	    }

	    // Validation de l'heure
	    try {
	        validationHeure(heure);
	    } catch (Exception e) {
	        erreurs.put("heure", e.getMessage());
	    }
	    request.setAttribute("erreurs", erreurs);
	    succesCreation = erreurs.isEmpty();
	    return new PetitDejeuner(chambre, nombreDeRepas,heure != null ? heure : "00:00",commentaire);
	}
	private void validationChambre( int chambre ) throws Exception {
		if (( chambre < 100 ) || ( 200 < chambre )){
			throw new Exception( "Le numéro de chambre doit être contenu entre 100 et 200." );
		}
	}
	private void validationHeure(String heure) throws Exception {
		int h = Integer.parseInt(heure.split(":")[0]);
		if ((6 > h) || (h > 10)){
			throw new Exception( "L'horaire choisi ne convient pas." );
		}
	}
	 
}
