<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

	<head>
		<title>Student Registration Form</title>
	</head>

	<body>
		<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />
		
		<br><br>
	
		Last name: <form:input path="lastName" />
		
		<br><br>
		
		Country: 
		
		<form:select path="country">
			<form:options items="${student.countryOptions}"/>
			
		</form:select>
		<br><br>
		Favorite Language::
		Java<form:radiobutton path="favoriteLanguage" value="java"/>
		PHP<form:radiobutton path="favoriteLanguage" value="php"/>
		C#<form:radiobutton path="favoriteLanguage" value="c#"/>
		PYTHON<form:radiobutton path="favoriteLanguage" value="python"/>
		<br><br>
		 Operating System::
		 Linux<form:checkbox path="operatingSystem" value="linux"/>
		 Windows<form:checkbox path="operatingSystem" value="windows"/>
		 Mac<form:checkbox path="operatingSystem" value="mac"/>
		 
		
		
		<br><br>
		
	
		<input type="submit" value="Submit" />
		
	
	</form:form>
	</body>

</html>