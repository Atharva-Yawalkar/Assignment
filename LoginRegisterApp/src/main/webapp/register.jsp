<!DOCTYPE html>
<html>
<head>
<title>Registration Form</title>
<link rel="stylesheet" type="text/css" href="rstyle.css">
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
<h2>Registration Form</h2>
<form name="myForm" action="RegisterServlet" method="post" onsubmit="return validateForm()">

    Username: <input type="text" name="username"><br>
    Email: <input type="text" name="email"><br>
    Password: <input type="password" name="pwd"><br>
    Mobile no: <input type="text" name="mobno">
    
    <input type="submit" value="Register">
</form>
</body>
</html>
