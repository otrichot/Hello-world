<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<<<<<<< HEAD
    <head> 
        <title><spring:message code="titre.bonjour"/> : ${personne}</title> Test
=======
    <head>
        <title><spring:message code="titre.bonjour"/> : ${personne}</title>
>>>>>>> branch 'master' of https://github.com/otrichot/Hello-world.git
    </head>
    <body>
        <spring:message code="libelle.bonjour.lemonde" arguments="${personne}"/>
        juste pour le plaisir
    </body>
</html>