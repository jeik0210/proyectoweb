package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"index1.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        <nav >\n");
      out.write("<ul>\n");
      out.write("    <li><a id=\"idLoginAlumno\" href=\"LoginRegistrationForm/alumno_login.jsp\" >Alumno<span>LOGIN</span></a></li>\n");
      out.write("    <li><a id=\"idLoginDocente\" href=\"LoginRegistrationForm/docente_login.html\" >Docente<span>LOGIN</span></a></li>\n");
      out.write("    <li><a id=\"idLoginDirector\" href=\"loginRegistrationForm/director_login.html\">Administrador<span>LOGIN</span></a></li>\n");
      out.write("    <li><a title=\"Opcion 4\" href=\"index2.jsp\">Nosotros</a></li>\n");
      out.write("    <li><a title=\"Opcion 5\" href=\"index2.jsp\">Sobre los Desarrolladores</a></li>\n");
      out.write("    \n");
      out.write("</ul>\n");
      out.write("</nav>\n");
      out.write("        <aside><br></br>\n");
      out.write("                            \n");
      out.write("\t\t\t\t\t<iframe name=\"body\" id=\"body\" src=\"slider-master/demos-jquery/fis.html\" scrolling=\"no\" height=\"600\" width=\"600\" frameborder=\"0\" ></iframe>\n");
      out.write("\t\t\t</aside>\n");
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
