<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Libros en la biblioteca</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Libros</h1>
	<br />
	<div class="container">
		<div>
			<table border="1" class="table table-striped table-bordered">
				<thead>
					<tr>
						<th>ISBN 13</th>
						<th>Título</th>
						<th>Autor</th>
						<th>Páginas</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="c" items="${requestScope.libros}">
						<tr>
							<td>${c.isbn}</td>
							<td>${c.titulo}</td>
							<td>${c.autor}</td>
							<td>${c.paginas}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<br /> <a href="volver">Volver</a>
	</div>
</body>
</html>