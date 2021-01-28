<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.thinkitive.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hibernate DB Ops</title>
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
        <form action="ControllerServlet" method="post">
        <h2>DB Operations</h2>
        	Employee ID
            <input type="number" class="form-control" name="txtempid">
           Employee Name
            <input type="text" class="form-control" name="txtempname">
            Employee Salary
            <div style="">
            <input type="number" class="form-control" name="txtsalary">
            <input type="submit" class="btn btn-warning" value="Insert" name="act">
            <input type="submit" class="btn btn-primary" value="Update" name="act">
            <input type="submit" class="btn btn-danger" value="Delete" name="act">
            <input type="submit" class="btn btn-success" value="Show" name="act">
           </div>
        </form>
        </div>
        
        <div class="container">
        <h2>Employee List</h2> 
      <table border ="1" width="500" align="center"> 
         <tr bgcolor="00FF7F"> 
          <th><b>Employee ID</b></th> 
          <th><b>Employee Name</b></th> 
          <th><b>Salary</b></th> 
         </tr> 
      
        <%List<Employee> elist = (List<Employee>)request.getAttribute("emplist"); 
        try{
        for(Employee e:elist){%> 
       
            <tr> 
                <td><%=e.getEmpid()%></td> 
                <td><%=e.getEname()%></td> 
                <td><%=e.getSalary()%></td> 
            </tr> 
            <%}
            }catch(Exception e){
            	
            }%> 
        </table>  
	
	
       
    </div>
</body>
</html>