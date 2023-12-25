<!DOCTYPE html>
<html>
<head>
<title>Login Form</title>
<link rel="stylesheet" type="text/css" href="lstyle.css">
<script type="text/javascript">
function validateForm() {
    var x = document.forms["myForm"]["username"].value;
    var y = document.forms["myForm"]["password"].value;
    if (x == "" || y == "") {
        alert("Username and Password must be filled out");
        return false;
    }
}
</script>
</head>
<body>
<h2>Login Form</h2>
<form name="myForm" action="LoginServlet" method="post" onsubmit="return validateForm()">
    Username: <input type="text" name="username"><br>
    Password: <input type="password" name="pwd"><br>
    <input type="submit" value="Login">
</form>
<br>
<form action="register.jsp">
    <input type="submit" value="Register">
</form>
<p style="color:green">${successMessage}</p>
<p style="color:red">${errorMessage}</p>
</body>
</html>
