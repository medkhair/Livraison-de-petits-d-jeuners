<%@page import="ex5.FabriquePetitDej"%>
<%@page import="ex5.PetitDejeuner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="Commande">
<label for="">Chambre : </label> 
<input type="text"  name="chambre" id="" value="100"/><br />
${requestScope.erreurs.get("chambre")}
<br />
<label for="">Nombre de repas : </label> 
<input type="text"  name="nombreDeRepas" id="" value="1"/><br />

<label for="">Heure de livraison (entre 6h et 10h) : </label> 
<input type="time"  name="heure" id="" value="08:00" required /><br /> 
${requestScope.erreurs.get("heure")}
<br />
<label for="">Commentaire : </label> <br />
<textarea name="commentaire" id="" rows="10" cols="50">Vos remarques.</textarea><br /> 
${requestScope.erreurs.clear()}  
<input type="submit" name="Envoyer" value="Envoyer" /> </form>
</body>
</html>