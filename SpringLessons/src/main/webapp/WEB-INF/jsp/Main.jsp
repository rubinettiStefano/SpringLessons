<%@ 
	page language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
%>
<!-- 
	qui sotto sto IMPORTANDO una LIBRERIA DI TAG
	di nome JSTL. JSTL è una libreria che serve per
	fare grafica SMART sulle pagine JSP.
	Contiene cose come if e foreach e altre cose di questo tipo
	JSTL la abbiamo SCARICATA da Maven prima
 -->
<%@taglib prefix="c" 
	uri="http://java.sun.com/jsp/jstl/core"%>    
<!-- 
	NON HO BISOGNO DI PRENDERE L'ATTRIBUTO! LO HO GIA'!!
	Ho una VARIABILE CHE SI CHIAMA LESSONS
 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1> Main Page - Elenco lezioni prenotate </h1>

	<!--  for(Lesson lesson:lessons) -->
	<c:forEach var="lesson" items="${lessons}">
		<a href="${lesson.ID }">
			${lesson.ID} - ${lesson.day} - 
			${lesson.hour}:${lesson.hour+1} ${lesson.student} <br />
		</a>
		
	</c:forEach>


</body>
</html>