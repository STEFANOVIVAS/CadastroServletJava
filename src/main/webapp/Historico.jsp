<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Historico de operações</title>
</head>
<body>
<h1 align="center">Operações realizadas foram:</h1>
<c:forEach items="${Historico_operacao}" var="cadastro">
    <h3 align="center"><c:out value="${cadastro}"/></h3>
</c:forEach>
</body>
</html>
