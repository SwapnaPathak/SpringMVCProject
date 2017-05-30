<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>University List</title>
</head>
<body>
    List of University:
    <br />
    <br />
    <table border="1">
    <tr>
    <th>Alpha_Two_Code</th>
    <th>Country</th>
    <th>Domain</th>    
    <th>Name</th>
     <th>Web_Page</th>
  </tr>
        <c:forEach items="${univerSityObj}" var="University">
            <tr>
              
                <td>${University.alpha_two_code}</td>
                 <td>${University.country}</td>
                <td>${University.domain}</td>               
                <td>${University.name}</td>
                <td>${University.web_page}</td>
                
               
            </tr>
        </c:forEach>
    </table>
</body>
</html>