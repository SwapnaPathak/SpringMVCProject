 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Course List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Course Id</th><th>Course Name</th>
<th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="course" items="${course}">   
   <tr>  
   <td>${course.courseId}</td>  
   <td>${course.courseName}</td>  
   <td><a href="editCourse/${course.courseId}">Edit</a></td>  
   <td><a href="deleteCourse/${course.courseId}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="addCourse">Add New Course</a> 