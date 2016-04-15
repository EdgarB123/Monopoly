<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
        <link rel="stylesheet" href="style/style.css" type="text/css">
        <title>Selecciona els jugadors</title>
    </head>
    <body>
        <%@ page errorPage="/error/errorPage.jsp"%>
	<form action="Start" method="post">
	Quants jugadors jugaran?:
            <select onchange="this.form.submit()" name="num_players">
                <option disabled selected>Jugadors</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
            </select>
            
		
	</form>
        
        <c:if test="${num_players>=2}">
        <form action="Start" method="post"> 
            <c:forEach begin="0" end="${num_players-1}" var="player">
                Nom:
                <input type="text" name="nom${player}"></br>
                Color:
                <input type="color" name="color${player}"></br></br>
            </c:forEach>
            <input type="submit" value="Play" name="play">    
        </form>
        </c:if>
</html>
