<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html >
<head>
    <title>Confirmation page</title>
</head>
<body>
    <h2>The Student is confirmed:${student.firstName} ${student.lastName}</h2>
    <h2>The Country is confirmed:${student.country}</h2>
    <h2>The Programing Language is confirmed:${student.favouriteLanguage}</h2>
    <h2>The Operating Systems confirmed:
    <ul>
    <c:forEach var="temp" items="${student.operatingSystems}"
    <li> ${temp} </li>
    </c:forEach >
    </ul>
    </h2>
</body>
</html>