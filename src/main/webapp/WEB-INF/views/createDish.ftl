<#import "templates/spring.ftl" as spring />
<!DOCTYPE html>
<html>
	<head>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
		<meta charset="UTF-8">
		<title>Naujo filmo sukurimas</title>
	
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
					Ivesti duomenys:<p><br>
					Patiekalo grupe:	${patiekalas.grupe}<br>
					Pavadinimas:		${patiekalas.pavadinimas}<br>
					Kalorijos:			${patiekalas.kalorijos}<br>
					Kaina:				${patiekalas.kaina}<br>
				</div>
			<#else>
				<form name="patiekalas" action="/Patiekalai/addDish" method="post">
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
					<input type="submit" value="Prideti">
				</form>
			</#if>
			<div>
				<a type="button" href="/Patiekalai" class="button">Grizti</a>
			</div>
		</div>
	</div>
	</body>
</html>