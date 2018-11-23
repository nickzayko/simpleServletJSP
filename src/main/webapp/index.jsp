<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>StartPage</title>
</head>
<body>
<h2 align="center">Please, enter parameters of quadratic equation!</h2>
<hr>
<h3 align="center">Quadratic equation: a*x^2 + b * x + c = 0 </h3>

<form action="/solution" method="get">
    <input type="text" name="a" value="" label="a">
    <input type="text" name="b" value="" label="b">
    <input type="text" name="c" value="" label="c">
    <input type="submit" value="Submit">
    <input type="reset" value="Reset">
</form>
<hr>
</body>
</html>
