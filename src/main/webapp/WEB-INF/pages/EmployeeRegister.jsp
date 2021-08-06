<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
 <head>
  <title>Document</title>
 </head>
 <body>
 <a href="?lang=en">English</a>
 <a href="?lang=hi">Hindi</a>
 <a href="?lang=te">Telugu</a>
 <a href="?lang=kn">Kannada</a>
 <a href="?lang=mr">Marathi</a>
 <hr/>
  <h1> <spring:message code="title"/> </h1>
  <h3> <spring:message code="subtitle"/> </h3>
  <form action="#" method="POST">
  <pre>
   <spring:message code="enterid"/>   : <input type="text" name="eid"/>
   <spring:message code="entername"/> : <input type="text" name="ename"/>
   <spring:message code="entersal"/> : <input type="text" name="esal"/>
   <spring:message code="enterdept"/> :<select name="edept">
   					<option>DEV</option>
   					<option>QA</option>
   					<option>BA</option>
   				</select>
   <input type="submit" value="Add Employee"/>
   </pre>
  </form>   		
 </body>
</html>
