<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<c:import url="template/header.jsp" />

<h1>Profile</h1>

${name}

<table width=300>
<tr>
<td>id:</td><td>${id}</td>
</tr>
<tr>
<td>First Name:</td><td>${firstName}</td>
</tr>
<tr>
<td>Last Name:</td><td>${lastName}</td>
</tr>
<tr>
<td>eMail:</td><td>${email}</td>
</tr>
<tr>
<td>Address:</td><td>${address}</td>
</tr>
<tr>
<td>Team:</td><td>${team}</td>
</tr>
</table>

<c:import url="template/footer.jsp" />