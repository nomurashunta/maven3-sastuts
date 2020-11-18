<%@page pageEncoding="UTF-8"%>
<html>
<head>
<title>mypage</title>
</head>
<body>
<h1>MyPage</h1>
<p>test: ${f:h(test)}</p>
<a href="${f:u(test)}">aaaaaaaa</a>
<p>test: ${test}</p>
<p>test: ${f:h(ally)}</p>
<c:forEach var="obj" items="${ally}">
<p>${obj}</p>
</c:forEach>

<%
session.setAttribute("name","TOM");
%>

<c:if test="${name == 'TOM'}" var="flg" />

<c:if test="${flg}" >
トム
</c:if>

<c:if test="${!flg}" >
トムではない
</c:if>


</body>
</html>