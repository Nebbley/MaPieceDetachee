<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="lolita" action="RepSpringForm">

<label>Nom</label> <form:input path="nom"  /> <form:errors path="nom" ></form:errors>
<br>
<label>Code Promo</label> <form:input path="codePromo"  /> <form:errors path="codePromo"  ></form:errors>
<br>
<label>Ville</label> <form:select path="ville">
<label>Nice</label><form:option value="Nice" />
<label>Paris</label><form:option value="Paris" />

</form:select>
<br>
<label>Plaque d'immatriculation</label> <form:input path="plaque"/><form:errors path="plaque"></form:errors>
<br>
<label>Adresse mail</label> <form:input path="mail"/><form:errors path="mail"></form:errors>
<br>
<label >Age</label><form:input path="age"/><form:errors path="age"> Please ask your parents to order anything </form:errors>

<br>
<label>Livraison a domicile</label><form:radiobutton path="liv" value="Livraison à domicile"/>
<label>Retrait en magazin</label><form:radiobutton path="liv" value="Retrait en magazin"/>
<form:errors path="liv"> Please choose a redeem method</form:errors>
<br>
<label>Bananes</label><form:checkbox path="list" value="Bananes"/>
<label>Carottes</label> <form:checkbox path="list" value="Carottes"/>
<label>Kiwis</label> <form:checkbox path="list" value="Kiwis"/>
<label>Lait</label> <form:checkbox path="list" value="Lait"/>
<label>Patates</label> <form:checkbox path="list" value="Patates"/>
<form:errors path="list"></form:errors>
<br>
<input type="submit" value="Validez">
</form:form>

</body>
</html>