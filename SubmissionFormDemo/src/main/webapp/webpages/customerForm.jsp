<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
</head>
<body>
<form method="post" action="saveCustomer">
Customer ID: <input type="text" name="cid"><br>
Customer Name: <input type="text" name="cname"><br>
Customer Email: <input type="email" name="cemail"><br>
<input type="submit" value="Submit">
</form>
</body>
</html>