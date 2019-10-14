<%@ include file="./header.jsp"%>

<head>
<meta charset="UTF-8">
<title>User Registration Form</title>
<style>
label, h3 {
	font-weight: bold;
}
</style>


</head>
<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-4 col-sm-12 text-center">

		<h3>Existing Users, Login from here</h3>
		<hr />

		<form method="post">

			<div class="form-group row">
				<label for="email">Email address</label> <input type="text"
					class="form-control" name="email">
			</div>

			<div class="form-group row">

				<label for="password">Password</label> <input type="password"
					class="form-control" name="password" >

			</div>



			<div class="form-group row">
				<button type="submit" class="btn btn-primary">Login</button>
				&nbsp; &nbsp; &nbsp; <a href="./register"> New Users, Register
					here</a>

			</div>
		</form>


	</div>
	<div class="col-md-4"></div>
</div>

<%@ include file="./footer.jsp"%>