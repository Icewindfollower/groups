<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<!DOCTYPE html>
<html>
<head>
    <title>Группы</title>
</head>
<body>
<div style="width: 715px;">
    <div style="font-size: 25px; line-height: 28px; color: #333; font-family: Arial,Helvetica,sans-serif;">
        Group ID: ${groupName}
    </div>
    <div style="font-family: Arial,Helvetica,sans-serif; margin-top: 10px;">
        <a href="/test-mvn-app/group/${groupId}" style="font-size: 15px; color: #333; text-decoration: none; padding-right: 10px;">Лента</a>
        <a href="themes" style="font-size: 15px; color: #333; text-decoration: none; padding-right: 10px;">Темы</a>
        <a href="photos" style="font-size: 15px; color: #333; text-decoration: none; padding-right: 10px;">Фотогрфии</a>
        <a href="users" style="font-size: 15px; color: #333; text-decoration: none; padding-right: 10px;">Участники</a>
        <a href="links" style="font-size: 15px; color: #333; text-decoration: none;">Ссылки</a>
    </div>
</div>
<form action="" method="POST">
    <input type="text" name="themeText"><br>
    <input type="hidden" name="groupId" value="${groupId}">
    <input type="submit" value="add">
</form>
THEMES<br>
<c:forEach var="theme" items="${groupThemes}">
    Theme ${theme.id} ${theme.text}<br>
</c:forEach>


</body>
</html>