package org.apache.jsp.alumno;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.net.*;
import java.sql.*;

public final class perfil1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Our Mission</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"../cssPerfil/reset.css\" type=\"text/css\" media=\"all\">\n");
      out.write("<link rel=\"stylesheet\" href=\"../cssPerfil/layout.css\" type=\"text/css\" media=\"all\">\n");
      out.write("<link rel=\"stylesheet\" href=\"../cssPerfil/style.css\" type=\"text/css\" media=\"all\">\n");
      out.write("<script type=\"text/javascript\" src=\"../js/jquery-1.6.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../js/cufon-yui.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../js/cufon-replace.js\"></script> \n");
      out.write("<script type=\"text/javascript\" src=\"../js/Vegur_700.font.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../js/Vegur_400.font.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../js/Vegur_300.font.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../js/atooltip.jquery.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../js/script.js\"></script>\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/html5.js\"></script>\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\t.box1 figure {behavior:url(js/PIE.htc)}\n");
      out.write("\t</style>\n");
      out.write("<![endif]-->\n");
      out.write("<!--[if lt IE 7]>\n");
      out.write("\t\t<div style='clear:both;text-align:center;position:relative'>\n");
      out.write("\t\t\t<a href=\"http://www.microsoft.com/windows/internet-explorer/default.aspx?ocid=ie6_countdown_bannercode\"><img src=\"http://www.theie6countdown.com/images/upgrade.jpg\" border=\"0\" alt=\"\" /></a>\n");
      out.write("\t\t</div>\n");
      out.write("<![endif]-->\n");
      out.write("<title>Welcome</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <p><font color=white>Bienevenido, ");
      out.print(session.getAttribute("name"));
      out.write("</font></p>\n");
      out.write("\n");
 
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
//leyendo tabla en disco y pasandola al resultset
try { tabla = instruccion.executeQuery("select * from dato_alum where cod_alum= '" +session.getAttribute("name")+"'");
// mandando resultset a 23456789auna tabla html
// ciclo de lectura del resultset
while(tabla.next()) {
out.println("<body id=page2>");
out.println("<div class=body1>");
out.println("<div class=main>");
out.println("<header>");
out.println("<div class=wrapper>");
//out.println("<h1><a href=../index.html id=logo></a></h1>");
out.println("<nav>");
out.println("<ul id=top_nav>");
out.println("<li><h4>cerrar</h4></li>");
out.println("<li class=end><a href=../index1.jsp><img src=../images/cerrar.png width=23 height=22></a></li>");
out.println("</ul>");
out.println("</nav>");					
out.println("<nav>");
				 out.println("<ul id=menu>");
					    out.println("<li id=menu_active><a href=perfil1.jsp>perfil   <img src=../images/perfil.png width=41 height=36></a></li>");
out.println("<li><a href=../alumno/cursos.jsp>ver notas    <img src=../images/recordacademico.png width=41 height=36></a></li>");
out.println("<li><a href=Matricula.html>matricula<img src=../images/recordaca.png width=41 height=36></a></li>");
out.println("<li></li>");
out.println("<li></li>");
out.println("</ul>");
out.println("</nav>");
out.println("</div>");
out.println("</header>");

out.println("<div class=ic></div>");
out.println("<article id=content>");
out.println("<div class=wrapper>");
out.println("<div class=box1>");
out.println("<p>&nbsp;</p>");
out.println("<table width=200 border=0>");
out.println("<tr>");
out.println("<td colspan=2><img src="+tabla.getString(18)+"width=128 height=128></td>");
out.println("</tr><tr>");
out.println("<td colspan=2>Datos Personales</td>");
out.println("</tr><tr>");
out.println("<td><table width=61% height=292 align=center class=zebra>");    
    out.println("<thead>");
        out.println("<tr>");
            out.println("<th width=40% >");
            out.println("Dato - Alumno</th>");
            out.println("<th width=60% >");
                out.println("Descripción</th>");
        out.println("</tr>");
    out.println("</thead>");
    out.println("<tbody>");
        out.println("<tr>");
            out.println("<td>");
                out.println("Código</td>");
            out.println("<td>"+tabla.getString(1)+"</td> </tr>");
                
            
       
        out.println("<tr>");
           out.println("<td>");
                out.println("DNI</td>");
            out.println("<TD>"+tabla.getString(2)+"</TD>");
        out.println("</tr>");
        out.println("<tr>");
            out.println("<td>");
                out.println("Nombres</td>");
          out.println("<td>"+tabla.getString(3)+"</td> </tr>");
           
        out.println("</tr>");
       
        out.println("<tr>");
            out.println("<td>");
                out.println("Apellidos</td>");
            out.println("<td>"+tabla.getString(4)+"</td> </tr>");
               out.println("</tr>");
                out.println("<tr>");
            out.println("<td>");
                out.println("Fecha de Nacimiento</td>");
          out.println("<td>"+tabla.getString(5)+"</td> </tr>");
               out.println("</tr>");
                out.println("<tr>");
                out.println("<td>sexo</td>");
                  out.println("<td>"+tabla.getString(14)+"</td> </tr>");
                out.println("</tr>");
                out.println("<tr>");
                  out.println("<td>ciclo</td>");
                  out.println("<td>"+tabla.getString(9)+"</td> </tr>");
                out.println("</tr>");
                 out.println("<tr>");
								      out.println("<td>Celular</td>");
								      out.println("<td>"+tabla.getString(13)+"</td> </tr>");
							        out.println("</tr>");
                
    out.println("</tbody>");
out.println("</table>");

 out.println("<td><table width=61% height=409 align=center class=zebra>");
	out.println("<thead>	<tr><th> Dato - Alumno</th>");
out.println("<th> Descripción</th> </tr></thead>");
	out.println("<tbody>");
			out.println("<tr>");
								      out.println("<td> Año</td>");
								      out.println("<td>"+tabla.getString(10)+"</td>");
							        out.println("</tr>");
								  
								    
					out.println("<tr>");
				out.println("<td> Modalidad</td>");
				out.println("<td>"+tabla.getString(11)+"</td>");
							        out.println("</tr>");
								    out.println("<tr>");
								      out.println("<td> Pais</td>");
								      out.println("<td>"+tabla.getString(15)+"</td>");
							        out.println("</tr>");
			out.println("<tr>");
		out.println("<td> Departamento</td>");
		out.println("<td>"+tabla.getString(6)+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td> Provincia</td>");
		out.println("<td>"+tabla.getString(7)+"</td>");
		out.println("</tr>");
                out.println("<tr>");
		out.println("<td> Distrito</td>");
		out.println("<td>"+tabla.getString(8)+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Direccion</td>");
		out.println("<td>"+tabla.getString(16)+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<td>Estado Civil</td>");
		out.println("<td>"+tabla.getString(17)+"</td>");
		out.println("</tr>");
                                           out.println("<tr>");
			out.println("<td>Correo</td>");
		out.println("<td>"+tabla.getString(12)+"</td>");
							        out.println("</tr>");
							      out.println("</tbody>");
					  out.println("</table></td>");
                                          out.print("</tr></table></div></div>");
					  out.print("<div class=wrapper>");
				out.print("<div class=wrapper></div>");
				  out.print("<p class=pad_left2>&nbsp;</p>");
			  out.print("</div>");
			out.print("</article>");
			out.print("<footer>");
			  out.print("<div class=wrapper></div>");
			  out.print("<div id=footer_text><b><b>Sistema de Matrícula, Registro y Estadística</b></b></div>");
			out.print("</footer>");
		out.print("</div>");
	out.print("</div>");
}; // fin while
out.println("</TABLE></CENTER></DIV></HTML>");
// cerrando resultset
tabla.close(); instruccion.close();canal.close();} //fin try no usar ; al final de dos o más catchs
catch(SQLException e) {};
};
out.println("<FORM ACTION=perfil1.jsp METHOD=post>");
out.println("<INPUT TYPE=SUBMIT NAME=OK VALUE=VER_DATOS><BR>");
out.println("</FORM>");
// construyendo forma dinamica

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
