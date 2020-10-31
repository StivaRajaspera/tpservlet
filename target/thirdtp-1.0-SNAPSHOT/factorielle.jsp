<%-- 
    Document   : factorielle
    Created on : 23 oct. 2020, 19:40:20
    Author     : rajaspera
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>factorielle</title>
        <script>
            function verifyForm() {
                let x = document.getElementById("nbEntree").value;
                if (parseInt(x) <= 0) {
                  alert("On ne peut pas chercher le factorielle d'un nombre négatif pardi!");
                  return false;
                }
                if (parseInt(x) >= 16) {
                  alert("au dessus de 16! j'ai plus de pouvoir!");
                  return false;
                }
            }
        </script>
    </head>
    <body>
        <form name="factorielleform" method="POST" action="AfficherFactorielle" onsubmit="return verifyForm()">
            <label for="nbEntree">Entrer le nombre a factoriser : </label>
            <input type="number" name="nbentree" id="nbEntree" required/>
            <input type="submit" value="Factorielle" />
        </form>
    </body>
</html>

