<#import "templates/spring.ftl" as spring />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<title>Esamo patiekalo redagavimas</title>
		<style>
			.container{
				background-color:white;
				text-align: center;
				height:100%;
			}
			.container-fluid{
				height:100%;
				background: linear-gradient(white, #00BFFF);
			}
			html, body{
				height:100%;
			}
			form{
				margin-top:30px;
			}
			.button{ 
				margin-top:30px;
				display: block;
				text-align: center;
			}
			.duom{
				margin-top:50px;
			}
		</style>
	</head>
	<body>
	<div class="container-fluid">
		<div class="container">
			<@spring.bind "patiekalas"/>
			<#if noErrors??>
				<div class="duom">
					<table class="table table-striped">
				<tr>
					<td><b>Id</b></td>
					<td>${patiekalas.id}</td>
				</tr>
				tr>
					<td>Grupe</td>
					<td>${patiekalas.grupe}</td>
				</tr>
				<tr>
					<td><b>Pavadinimas</b></td>
					<td>${patiekalas.pavadinimas}</td>
				</tr>
				<
				<tr>
					<td>Kalorijos</td>
					<td>${patiekalas.kalorijos}</td>
				</tr>
				<tr>
					<td>Kaina</td>
					<td>${patiekalas.kaina}</td>
				</tr>
				<tr>
			</table>
					
				</div>
			<#else>
				<form name="film" action="/Patiekalai/updateDish/${patiekalas.id}" method="post">
					
					Grupe:<br>
					<@spring.formInput "patiekalas.grupe" /><br>
					<@spring.showErrors "<br>" /><p>
					Pavadinimas:<br>
					<@spring.formInput "patiekalas.pavadinimas" /><br>
					<@spring.showErrors "<br>" /><p>
					Kalorijos:<br>
					<@spring.formInput "patiekalas.kalorijos" /><br>
					<@spring.showErrors "<br>" /><p>
					Kaina:<br>
					<@spring.formInput "patiekalas.kaina" /><br>
					<@spring.showErrors "<br>" /><p>
					<input type="submit" value="Atnaujinti">
				</form>
			</#if>
			<div>
				<a type="button" href="/Patiekalai" class="button">Grizti</a>
			</div>
		</div>
		
	</div>
	</body>
</html>