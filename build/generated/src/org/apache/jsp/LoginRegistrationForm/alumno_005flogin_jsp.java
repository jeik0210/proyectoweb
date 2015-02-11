package org.apache.jsp.LoginRegistrationForm;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.net.*;
import java.sql.*;

public final class alumno_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("          <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <meta charset=\"UTF-8\" />\n");
      out.write("        <!-- <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">  -->\n");
      out.write("        <title>SMRE-UNICA</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("        <meta name=\"description\" content=\"Login and Registration Form with HTML5 and CSS3\" />\n");
      out.write("        <meta name=\"keywords\" content=\"html5, css3, form, switch, animation, :target, pseudo-class\" />\n");
      out.write("        <meta name=\"author\" content=\"Codrops\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../favicon.ico\"> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/demo.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/animate-custom.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("           \n");
      out.write("        ");

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

      out.write("\n");
      out.write("         <div class=\"container\">\n");
      out.write("            <!-- Codrops top bar -->\n");
      out.write("          <div class=\"codrops-top\">\n");
      out.write("                <a href=\"\">\n");
      out.write("                    <strong> LOGIN - ALUMNO</strong>\n");
      out.write("            </a>            </div>\n");
      out.write("            <p>\n");
      out.write("              <!--/ Codrops top bar -->              </p>\n");
      out.write("            <p>&nbsp;</p>\n");
      out.write("            <p>&nbsp;</p>\n");
      out.write("            <p>&nbsp;</p>\n");
      out.write("            <p>&nbsp;</p>\n");
      out.write("            <p>&nbsp;</p>\n");
      out.write("            <p>&nbsp;</p>\n");
      out.write("            <p>&nbsp;</p>            \n");
      out.write("            <section>\t\t\t\t\n");
      out.write("                <div id=\"container_demo\" >\n");
      out.write("                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->\n");
      out.write("                    <a class=\"hiddenanchor\" id=\"toregister\"></a>\n");
      out.write("                    <a class=\"hiddenanchor\" id=\"tologin\"></a>\n");
      out.write("                    <div id=\"wrapper\">\n");
      out.write("                        <div id=\"login\" class=\"animate form\">\n");
      out.write("                            <form  action=\"login_login.jsp\" autocomplete=\"on\"> <center>\n");
      out.write("                            <img src=\"images/candado.png\" width=\"80\" ></center>\n");
      out.write("                                <p> \n");
      out.write("                                  <label for=\"username\" class=\"uname\" data-icon=\"u\" >USUARIO </label>\n");
      out.write("                                    <input id=\"username\" name=\"name\" required type=\"text\" placeholder=\"Usuario\"/>\n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"password\" class=\"youpasswd\" data-icon=\"p\"> CONTRASEÑA </label>\n");
      out.write("                                    <input id=\"password\" name=\"password\" required type=\"password\" placeholder=\"Contraseña\" /> \n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"keeplogin\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"loginkeeping\" id=\"loginkeeping\" value=\"loginkeeping\" /> \n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"loginkeeping\">Keep me logged in</label>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("                                                                <tr>\n");
      out.write(" ");
 
                        }
                catch(SQLException sqe)
        {
            out.println("alumno_login"+sqe);
            }

      out.write("</tr>                                                                \n");
      out.write("                                 <p class=\"login button\"> \n");
      out.write("                                  <input type=\"submit\" value=\"Login\" name=\"ok\"/></a>\n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("                                <p class=\"change_link\">&nbsp;</p>\n");
      out.write("                            </form>\n");
      out.write("                          </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("         </div>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
