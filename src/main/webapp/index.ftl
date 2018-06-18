<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!DOCTYPE html>
<html>
<head>
<title>Meniu</title>
<style>
	ul li{
		display:inline-block;
		height:50px;
	}
	#pridet{
		padding:10px;
		font-size:18px;
		color:#8B008B;
	}
	#pridet a{
		display:block;
		width:130px;
	}
	h1{
		color:blue;
	}
	a:link, active{
		text-decoration:none;
		color:blue;
	}
	table{
		padding-top:20px;
	}
	.container a:hover{
		text-decoration:underline;
		color:#8B008B;
	}
	th, td{
		padding:0px 10px 0px 10px;
	}
	.container{
		background-color:white;
		height:100% fill;
		border-right:5px solid #00BFFF;
		border-left:5px solid #00BFFF;
	}
	#tablefluid{
		height:100% ;
		background: linear-gradient(white, #00BFFF);
	}
</style>
</head>
<body>

<div class=container-fluid id="tablefluid">
	<div class="container">
		<div id="pridet">
			<center><a class="button" id="pridet" href="/Patiekalai/addToMeniu">Prideti patiekala</a></center>
		</div>
	
		 <div class="table-responsive">
		  <table class="table">
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
					<td>${patiekinimas}</td>
					<td><a href="/Patiekalai/delete/${patiekalas.id}">Trinti</a></td>
					<td><a hralas.pavadef="/Patiekalai/update/${patiekalas.id}">Redaguoti</a></td>
				</tr>
			</#list>
		</table>
	   </div>
	</div>
</div>
</body>
</html>