<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="WEB-INF/bootstrap.css" rel="stylesheet" type="text/css" />
</head>
<body>
<form:form modelAttribute="user" action="Acceuil">
<label>Nom</label><form:input path="nom"/><br>
<label>Prenom</label><form:input path="prenom"/><br>
<label>Mail</label><form:input path="mail"/><br>
<label>Password</label><form:input path="pass"/><br>
<label>Retype password</label><input type="text" ><br>
<label>Voiture</label>
<hr>
<br>
<label>Marque du vehicule</label>
 <select name="brand"  onselect="selectmodele()">
 <c:forEach items="${marqueslistes}" var="titre">
 <option value="${titre.nom}" >${titre.nom}</option>
 </c:forEach>
 </select>
 <br>
 <label>Modele du vehicule</label>
 <select name="model"  onselect="selectmodele()">
 <c:forEach items="${modelliste}" var="titre">
 <option value="${titre.nom}" >${titre.nom}</option>
 </c:forEach>
 </select>

<input type="submit" value="Validez">
</form:form>
<script type="text/javascript">


</script>
</body>
</html>