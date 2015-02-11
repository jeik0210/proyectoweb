<%-- 
    Document   : alumno_login
    Created on : 20-nov-2014, 8:21:40
    Author     : jeik
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <meta charset="UTF-8" />
        <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
        <title>SMRE-UNICA</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="description" content="Login and Registration Form with HTML5 and CSS3" />
        <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
        <meta name="author" content="Codrops" />
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
		<link rel="stylesheet" type="text/css" href="css/animate-custom.css" />
    </head>
    <body>
           <%@ page import="java.io.*,java.util.*,java.net.*,java.sql.*" %>
        <%
Connection con= null;
PreparedStatement ps = null;
ResultSet rs = null;

String driverName = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/nuevo";
String user = "root";
String password = "";


try {
Class.forName(driverName);
con = DriverManager.getConnection(url, user, password);
%>
         <div class="container">
            <!-- Codrops top bar -->
          <div class="codrops-top">
                <a href="">
                    <strong> LOGIN - ALUMNO</strong>
            </a>            </div>
            <p>
              <!--/ Codrops top bar -->              </p>
            <p>&nbsp;</p>
            <p>&nbsp;</p>
            <p>&nbsp;</p>
            <p>&nbsp;</p>
            <p>&nbsp;</p>
            <p>&nbsp;</p>
            <p>&nbsp;</p>            
            <section>				
                <div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
                            <form  action="login_login.jsp" autocomplete="on"> <center>
                            <img src="images/candado.png" width="80" ></center>
                                <p> 
                                  <label for="username" class="uname" data-icon="u" >USUARIO </label>
                                    <input id="username" name="name" required type="text" placeholder="Usuario"/>
                                </p>
                                <p> 
                                    <label for="password" class="youpasswd" data-icon="p"> CONTRASEÑA </label>
                                    <input id="password" name="password" required type="password" placeholder="Contraseña" /> 
                                </p>
                                <p class="keeplogin"> 
									<input type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping" /> 
									<label for="loginkeeping">Keep me logged in</label>
				</p>
                                                                <tr>
 <% 
                        }
                catch(SQLException sqe)
        {
            out.println("alumno_login"+sqe);
            }
%></tr>                                                                
                                 <p class="login button"> 
                                  <input type="submit" value="Login" name="ok"/></a>
								</p>
                                <p class="change_link">&nbsp;</p>
                            </form>
                          </div>
                    </div>
                </div>
            </section>
         </div>

                    
    </body>
</html>
