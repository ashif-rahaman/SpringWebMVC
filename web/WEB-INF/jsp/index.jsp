<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>

        <p style="color: red">${errorMessage}</p>

        <form name="loginForm" action="home" method="POST">
            <table border="1" cellpadding="0" cellspacing="0">
                <tbody>
                    <tr>
                        <td colspan="2">
                            <input type="text" name="username" value="" placeholder="Username" />
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="password" name="password" value="" placeholder="Password" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="reset" value="Reset"/>
                        </td>
                        <td>
                            <input type="submit" value="Submit"/>
                        </td>
                    </tr>
                </tbody>
            </table>
        </form>

    </body>
</html>
