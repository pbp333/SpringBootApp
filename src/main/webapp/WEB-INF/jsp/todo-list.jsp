<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<hmtl>
    <head>
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <title>To Do's for ${name}</title>
    </head>
    <body>

    <div class="container">
        <h1>Your To Do's</h1>


        <table class="table table-striped">
            <thead>
            <td>Description</td>
            <td>Date</td>
            <td>is Done?</td>
            </thead>
            <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.desc}</td>
                    <td>${todo.targetDate}</td>
                    <td>${todo.done}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>


        <a href="/add-todo">Add a to do</a>

    </div>

    <script
            src="https://code.jquery.com/jquery-1.9.1.min.js"
            integrity="sha256-wS9gmOZBqsqWxgIVgA8Y9WcQOa7PgSIX+rPA0VL2rbQ="
            crossorigin="anonymous"></script>
    </body>
</hmtl>