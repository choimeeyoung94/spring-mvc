<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
</head>
<body>
  <h1>회원목록</h1>
 <table border="1">
 	<tbody>
 		<c:forEach items="${users}"  var="user">
 			<tr>
 				<td>순번</td>
 				<td>${user.lastName}</td>
 				<td>${user.firstName}</td>
 				<td>${user.email}</td>
 				<td>${user.gender}</td>
 				<td>${user.ipAddress}</td>
 			</tr>
 		</c:forEach>
 	</tbody>
 	<tfoot>
 		<tr>
 			<td colspan="6">${pagingHTML}</td>
 		
 		</tr>
 	
 	
 	</tfoot>
 </table>
</body>
</html>