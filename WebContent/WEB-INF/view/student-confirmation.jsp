<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Confirmation</title>
</head>

<body>

The student is confirmed: ${student.firstName} ${student.lastName}
<br><br>

The country is ${student.country}
<br>
Favorite Language ${student.favoriteLanguage}
<br><br>

Operating System
<ul>
	<c:forEach var="tmp" items="${student.operatingSystem}">
		<li>${tmp}</li>
	</c:forEach>
</ul>


</body>

</html>
