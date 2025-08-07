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
 	<h1>${notice.title}</h1>
 	
 	<h4>첨부 파일</h4>
 	<c:forEach items="${attaches}" var="attach">
 		<div>
 			<a class="download-links" href="${contextPath}/notice/download?aid=${attach.aid}">${attach.originalFilename}</a>
 		</div>
 	</c:forEach>
 	<pre>${notice.content}</pre>
 	<button type="button" onclick="onDelete()">삭제</button>
 	<script>
 		// 다운로드 요청 시 <a> 태그의 href를 이용한 페이지 이동 동작 막기
 		//const downloadLinks = document.getElementById('download-links');
 		//for (const downloadLink of downloadLinks) {
 		//  downloadLink.addEventListener("click", function(e) {
 		//    e.preventDefault(); // <a> 태그의 기본 이벤트 방지
 		//  });
 		//}
 		
 		// 삭제
 		function onDelete() {
 		  if (confirm("현재 공지사항을 삭제할까요?")) {
 		    location.href="${contextPath}/notice/remove?nid=${notice.nid}";
 		  }
 		}
 	
 	</script>
</body>
</html>