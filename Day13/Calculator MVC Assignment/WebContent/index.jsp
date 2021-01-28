<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculator</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	<style>
		h2{
		text-align: center;
		margin-top:50px;
		}
		table{
		margin-top:30px;
		}
		input{
		margin-bottom:30px;
		margin-right: 30px;
		}
		
	</style>
</head>

<body>
    <div class="container">
    <h2>Calculator</h2>
        <form action="ControllerServlet" method="post">
        	Value 1
            <input type="number" class="form-control" name="txta">
           Value 2
            <input type="number" class="form-control" name="txtb">
            <input type="submit" class="btn btn-primary" value="Addition" name="act">
            <input type="submit" class="btn btn-primary" value="Subtraction" name="act">
            <input type="submit" class="btn btn-primary" value="Multiplication" name="act">
            <input type="submit" class="btn btn-primary" value="Division" name="act">
            <%!Integer s = 0;%>
	<%
		try {
			s = (int)request.getAttribute("result");
		} catch (Exception e) {
			s = 0;
		}
	%>
            <input type="number" class="form-control" value="<%=s%>">
        </form>
    </div>
</body>
</html>