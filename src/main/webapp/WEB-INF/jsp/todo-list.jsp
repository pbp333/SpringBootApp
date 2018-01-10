<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

    <div class="container">
        <h1>${name}, your To Do's</h1>


        <table class="table table-striped">
            <thead>
            <tr>
                <th>Description</th>
                <th>Date</th>
                <th>is Done?</th>
                <th></th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.desc}</td>
                    <td><fmt:formatDate value="${todo.targetDate}" pattern="dd/MM/yyyy"/></td>
                    <td>${todo.done}</td>
                    <td><a type="button" class="btn btn-success" href="/update-todo?id=${todo.id}">Update</a></td>
                    <td><a type="button" class="btn btn-warning" href="/delete-todo?id=${todo.id}">Delete</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>


        <a href="/add-todo">Add a to do</a>

    </div>

<%@ include file="common/footer.jsp" %>