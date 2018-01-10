<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<hmtl>
    <head>
        <title>My Web Application</title>
        <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

    </head>
    <body>

    <div class="container">


        <form:form method="post" commandName="toDo">
            <form:hidden path="id"/>
            <fieldset class="form-group">
                <form:label path="desc">Description</form:label>

                <form:input path="desc" name="desc" type="text" class="form-control" required="required"/>
                <form:errors path="desc" cssClass="text-warning"/>

            </fieldset>
            <button class="btn btn-success">Submit</button>
        </form:form>


    </div>


    <script
            src="https://code.jquery.com/jquery-1.9.1.min.js"
            integrity="sha256-wS9gmOZBqsqWxgIVgA8Y9WcQOa7PgSIX+rPA0VL2rbQ="
            crossorigin="anonymous"></script>
    </body>
    </body>
</hmtl>