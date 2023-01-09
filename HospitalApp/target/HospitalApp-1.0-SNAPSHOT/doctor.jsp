<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 10/18/2022
  Time: 5:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="/include.jsp"/>
</head>
<body>
<jsp:include page="navbar.jsp"/>

<jsp:include page="sidenav.jsp"/>

<div class="container">
    <form action="http://localhost/doctor.do" method="post">
        <div class="row">
            <h2 style="text-align:center; color: aliceblue;">Doctor Info</h2>

                <div class="hide-md-lg">
                    <p>Or sign in manually:</p>
                </div>
            <select name="gender" id="">
                <option value="Male">Male</option>
                <option value="Female">Female</option>
            </select>
                <input type="text" name="name" placeholder="Name" required>
                <input type="text" name="family" placeholder="Family" required>
                <input type="text" name="code" placeholder="medicalSystemCode" required>
                <input type="submit" value="Save Doctor Info">

        </div>
    </form>
</div>
</body>
</html>
