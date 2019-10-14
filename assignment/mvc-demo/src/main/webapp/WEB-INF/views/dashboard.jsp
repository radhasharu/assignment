<%@ include file="./header.jsp" %>



<head>
<meta charset="UTF-8">
<title>User Registration Form</title>
<style>
label,h4,p {
	font-weight: bold;
}
</style>


</head>

<h4 class="text-center">Hello, ${user.name}!</h4>

<hr/>

<div class="row">
<div class="col-md-2"></div>
<div class="col-md-4">

<form method="post" action="./dashboard">
            <div class="form-group row">
				<p>Personal Details</p>
			</div>
		   <div class="form-group row">
				<label for="name">Name</label>
				 <input type="text" class="form-control" name="name" value="${user.name}" readonly>
			</div>
			<div class="form-group row">
				
				<label><input type="radio"  name="gender" value="Male" ${user.gender=="Male"?"checked":"disabled"} >Male</label> &nbsp;
				<label><input type="radio"  name="gender" value="Female" ${user.gender=="Female"?"checked":"disabled"}>Female</label>
			</div>
			<div class="form-group row">
				<label for="email">Email address</label> 
				<input type="text"	class="form-control" name="email" value="${user.email}" readonly>
			</div>
			<div class="form-group row">
				<label for="phone">Mobile number</label>
				 <input type="text" class="form-control" name="phone" value="${user.phone}">
			</div>
			<div class="form-group row">
				<label for="city">City</label>
				 <input type="text" class="form-control" name="city" value="${user.city}" >
			</div>
			<div class="form-group row">
				<label for="state">State/Region</label> 
				<input type="text" class="form-control" name="state" value="${user.state}">
			</div>
			<div class="form-group row">
				<label for="country">Country</label> 
				<input type="text" class="form-control" name="country" value="${user.country}">
			</div>

			<div class="form-group row">
			<button type="submit" class="btn btn-primary">Save Changes</button>
			
			</div>
		</form>


	</div>
	
<div class="col-md-1"></div>
<div class="col-md-4">
         <form method="post" action="/update-password">
         	<div class="form-group row">
				<p>Security Settings</p>
			</div>
            <div class="form-group row">
				<label for="password">New Password</label>
				 <input type="password" class="form-control" name="password">
			</div>
			<div class="form-group row">
				<label for="cpassword">Re-type New Password</label> 
				<input type="password" class="form-control" name="cpassword">
			</div>

			<div class="form-group row">
			<button type="submit" class="btn btn-primary">Save Changes</button>
			
			</div>
		</form>


</div>



</div>

<%@ include file="./footer.jsp" %>