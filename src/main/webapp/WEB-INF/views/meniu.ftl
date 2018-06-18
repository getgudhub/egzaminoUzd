<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Filmai</title>
</head>
<body>


<table>
	<tr>
		<th>Id</th>
		<th>Patiekalo grupe</th>
		<th>Patiekalo pavadinimas</th>
		<th>Kaloriju skaicius</th>
		<th>Kaina</th>
	</tr>
	<#list patiekalai as patiekalas>
		<tr>
			<td><a href="/Patiekalai/patiekalas/${patiekalas.id}">${patiekalas.id}</a></td>
			<td>${patiekalas.grupe}</td>
			<td>${patiekalas.pavadinimas}</td>
			<td>${patiekalas.kalorijos}</td>
			<td>${patiekalas.kaina}</td>
			<td><a href="/Patiekalai/delete/${patiekalas.id}">Trinti</a></td>
			<td><a href="/Patiekalai/update/${patiekalas.id}">Redaguoti</a></td>
		</tr>
	</#list>
</table>
<a href="/Patiekalai/addDish">Prideti patiekala</a>
</body>
</html>