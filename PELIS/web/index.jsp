<%-- 
    Document   : index
    Created on : 10-oct-2012, 8:34:11
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <body>
          <h1>Ingrese un servicio</h1>
        <div>
            <form action="Usuario" method="post">
                <input type="hidden" name="accion" value="Loguin" />
                <h1>Usuario:</h1><input type="text" name="user" size="100"/></br>
                <h1>Contraseña:</h1><input type="text" name="password" size="100"/></br>
                <input type="submit" value="Entrar"/>  
            </form>
        </div>
    </body>
    </body>
</html>
