<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
<title>Register page here</title>
</head>
<body>
	<div class="container">
		<div class="card">
			<div class="card-header">
				<h1 style="text-align: center; color: blue">Register page</h1>

			</div>
			<div class="card-body">
				<form action="./Register" method="post" class="form-control">
					<div class="form-control">
						<input type="text" name="uname" placeholder="Enter UserName"
							class="form-control" />
					</div>
					<div class="form-control">
						<input type="password" name="pwd" placeholder="Enter Password"
							class="form-control" />
					</div>
					<div class="form-control">
						<select name="type">
							<option selected>Open this select menu</option>
							<option value="admin">Admin</option>
							<option value="user">User</option>
						</select>
					</div>
					<div>
						<input type="submit" value="Register" class="btn btn-primary" />
					</div>
				</form>
			</div>
		</div>

	</div>

</body>
</html>