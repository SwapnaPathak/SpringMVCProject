<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Add New Course</h1>  
       <form:form method="post" action="save">    
        <table >    
         <tr>    
          <td>CourseId : </td>   
          <td><form:input path="courseId"  /></td>  
         </tr>    
         <tr>    
          <td>CourseName :</td>    
          <td><form:input path="courseName" /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>    
