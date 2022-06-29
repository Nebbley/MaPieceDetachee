<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Resultat Formulaire</h1>
<p>
Client : 
${nom1}
</p>
<p>
Adresse du client : ${city}
</p>
<p>
${liv} 
</p>

<br>
<p>
Liste de courses : 

<c:forEach items="${list}" var="element">
${element}
</c:forEach>

</p>
</body>
</html>