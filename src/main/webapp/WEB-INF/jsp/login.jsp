<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
    <font color="red">${message}</font>
    <form method="post">
        <label for="name">Name: </label>
        <input type="text" name="name" id="name">
        <label for="password">Password: </label>
        <input type="password" name="password" id="password">
        <input type="submit">
    </form>
</div>
<%@ include file="common/footer.jsp" %>
