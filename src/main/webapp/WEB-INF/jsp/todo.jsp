<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
    <div class="container">
        <form:form method="post" commandName="toDo">
            <form:hidden path="id"/>
            <fieldset class="form-group">
                <form:label path="desc">Description</form:label>

                <form:input path="desc" name="desc" type="text" class="form-control" required="required"/>
                <form:errors path="desc" cssClass="text-warning"/>

            </fieldset>
            <fieldset class="form-group">
                <form:label path="targetDate">Target Date</form:label>

                <form:input path="targetDate" name="targetDate" type="text" class="form-control" required="required"/>
                <form:errors path="targetDate" cssClass="text-warning"/>

            </fieldset>
            <button class="btn btn-success">Submit</button>
        </form:form>
    </div>

<%@ include file="common/footer.jsp" %>

