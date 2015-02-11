<html>
    <head>
      
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Our Mission</title>
<meta charset="utf-8">
<link rel="stylesheet" href="../cssPerfil/reset.css" type="text/css" media="all">
<link rel="stylesheet" href="../cssPerfil/layout.css" type="text/css" media="all">
<link rel="stylesheet" href="../cssPerfil/style.css" type="text/css" media="all">
<script type="text/javascript" src="../js/jquery-1.6.js"></script>
<script type="text/javascript" src="../js/cufon-yui.js"></script>
<script type="text/javascript" src="../js/cufon-replace.js"></script> 
<script type="text/javascript" src="../js/Vegur_700.font.js"></script>
<script type="text/javascript" src="../js/Vegur_400.font.js"></script>
<script type="text/javascript" src="../js/Vegur_300.font.js"></script>
<script type="text/javascript" src="../js/atooltip.jquery.js"></script>
<script type="text/javascript" src="../js/script.js"></script>
<!--[if lt IE 9]>
	<script type="text/javascript" src="js/html5.js"></script>
	<style type="text/css">
		.box1 figure {behavior:url(js/PIE.htc)}
	</style>
<![endif]-->
<!--[if lt IE 7]>
		<div style='clear:both;text-align:center;position:relative'>
			<a href="http://www.microsoft.com/windows/internet-explorer/default.aspx?ocid=ie6_countdown_bannercode"><img src="http://www.theie6countdown.com/images/upgrade.jpg" border="0" alt="" /></a>
		</div>
<![endif]-->
    </head>
    <body id="page2">
         <%@ page import="java.io.*,java.util.*,java.net.*,java.sql.*" %>
         <p><font color=white>Bienevenido, <%=session.getAttribute("name")%></font></p>
	<div class="body1">
		<div class="main">
<!-- header -->
			<header>
				<div class="wrapper">
					<h1><a href="../index.html" id="logo"></a></h1>
					<nav>
					  <ul id="top_nav">
                                              <li><h4>cerrar</h4></li>
					    <li class="end"><a href="../index1.jsp"><img src="../images/cerrar.png" width="23" height="22"></a></li>
					  </ul>
				  </nav>
					<nav>
					  <ul id="menu">
					    <li><a href="Perfil.html">perfil   <img src="../images/perfil.png" width="41" height="36"></a></li>
							<li id="menu_active"><a href="Record_Academico.html">ver notas <img src="../images/recordacademico.png" width="41" height="36"></a></li>
							<li><a href="Matricula.html">matricula<img src="../images/recordaca.png" width="41" height="36"></a></li>
							<li></li>
							<li></li>
					  </ul>
					</nav>
				</div>
			</header><div class="ic"></div>
<!-- / header -->
<!-- content -->
			<article id="content">
			  <div class="wrapper">
					<div class="box1">
 
<% 
// declarando y creando objetos globales
Connection canal = null;
ResultSet tabla= null;
Statement instruccion=null;
String strcon = "jdbc:mysql://localhost:3306/univ?user=root&password=";
if(request.getParameter("OK") != null)
{
// abriendo canal o enlace en su propio try-catch
try {
Class.forName("com.mysql.jdbc.Driver").newInstance();
canal=DriverManager.getConnection(strcon);
instruccion = canal.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
ResultSet.CONCUR_UPDATABLE);
} catch(java.lang.ClassNotFoundException e){} catch(SQLException e) {};
String num_ciclo = request.getParameter("num_ciclo");
try { tabla = instruccion.executeQuery("select * from cursos where num_ciclo='"+num_ciclo+"' and cod_alum="+session.getAttribute("name"));
// mandando resultset a 23456789auna tabla html
out.println("<TABLE Border=10 CellPadding=5><TR>");
out.println("<th bgcolor=Green>cod_curso</th><th bgcolor=Green>cod_alumn</th><th bgcolor=Green>nom_curso</th><th bgcolor=Green>cred_curso</th><th bgcolor=green>ESTADO</th></TR>");
// ciclo de lectura del resultset
while(tabla.next()) {
out.println("<TR>");
out.println("<TD>"+tabla.getString(1)+"</TD>");
out.println("<TD>"+tabla.getString(2)+"</TD>");
out.println("<TD>"+tabla.getString(3)+"</TD>");
out.println("<TD>"+tabla.getString(4)+"</TD>");
out.println("<TD><INPUT TYPE=SUBMIT name=ir value=ir>");
out.println("</TR>"); }; // fin while
out.println("</TABLE></CENTER></DIV></HTML>");
// cerrando resultset
tabla.close(); instruccion.close();canal.close();} //fin try no usar ; al final de dos o más catchs
catch(SQLException e) {};
};

// construyendo forma dinamica
out.println("<FORM ACTION=cursos.jsp METHOD=post>");
out.println("Ingrese el ciclo que desea:<INPUT TYPE=TEXT NAME=num_ciclo><BR>");
out.println("<INPUT TYPE=SUBMIT NAME=OK VALUE=CONSULTA><BR>");
out.println("</FORM>");

%>
                                            
                                            
                                            
                  </div>	
				</div>
			  <div class="wrapper">
				<div class="wrapper"></div>
				  <p class="pad_left2">&nbsp;</p>
			  </div>
			</article>
			<footer>
			  <div class="wrapper"></div>
			  <div id="footer_text"><b><b>Sistema de Matrícula, Registro y Estadística</b></b></div>
			</footer>
<!-- / footer -->
		</div>
	</div>
<script type="text/javascript">Cufon.now();</script>
</html>

