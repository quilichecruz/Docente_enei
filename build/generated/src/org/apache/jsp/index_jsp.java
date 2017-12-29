package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
  
    String hostname=(String)session.getAttribute("hostname");
    String ip=(String)session.getAttribute("ip");
    String dnipro=(String)session.getAttribute("dnipro");
    String reloj2=(String)session.getAttribute("reloj2");
    String reloj3=(String)session.getAttribute("reloj3");
    String idsesion = request.getParameter("idsesion");
    

      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Dosis\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function Reloj(){ \n");
      out.write("A = new Date()\n");
      out.write("B = new Date() \n");
      out.write("dateText = \"\"\n");
      out.write("dateText2 = \"\"\n");
      out.write("mio = \"\"\n");
      out.write("hora = A.getHours() \n");
      out.write("minuto = A.getMinutes() \n");
      out.write("segundo = A.getSeconds() \n");
      out.write("\n");
      out.write("// Tomar el dia actual y convertirlo al espanol\n");
      out.write("dayValue = A.getDay()\n");
      out.write("if (dayValue == 0)\n");
      out.write("dateText += \"Domingo\"\n");
      out.write("else if (dayValue == 1)\n");
      out.write("dateText += \"Lunes\"\n");
      out.write("else if (dayValue == 2)\n");
      out.write("dateText += \"Martes\"\n");
      out.write("else if (dayValue == 3)\n");
      out.write("dateText += \"Miercoles\"\n");
      out.write("else if (dayValue == 4)\n");
      out.write("dateText += \"Jueves\"\n");
      out.write("else if (dayValue == 5)\n");
      out.write("dateText += \"Viernes\"\n");
      out.write("else if (dayValue == 6)\n");
      out.write("dateText += \"Sabado\"\n");
      out.write("\n");
      out.write("dayValue = A.getDay()\n");
      out.write("if (dayValue == 0)\n");
      out.write("dateText2 += \"\"\n");
      out.write("else if (dayValue == 1)\n");
      out.write("dateText2 += \"\"\n");
      out.write("else if (dayValue == 2)\n");
      out.write("dateText2 += \"\"\n");
      out.write("else if (dayValue == 3)\n");
      out.write("dateText2 += \"\"\n");
      out.write("else if (dayValue == 4)\n");
      out.write("dateText2 += \"\"\n");
      out.write("else if (dayValue == 5)\n");
      out.write("dateText2 += \"\"\n");
      out.write("else if (dayValue == 6)\n");
      out.write("dateText2 += \"\"\n");
      out.write("\n");
      out.write("// tomar el mes actual y convertirlo a meses en espanol\n");
      out.write("\n");
      out.write("\n");
      out.write("monthValue = A.getMonth()\n");
      out.write("dateText2 += \"\"\n");
      out.write("if (monthValue == 0)\n");
      out.write("dateText2 += \"1\"\n");
      out.write("if (monthValue == 1)\n");
      out.write("dateText2 += \"2\"\n");
      out.write("if (monthValue == 2)\n");
      out.write("dateText2 += \"3\"\n");
      out.write("if (monthValue == 3)\n");
      out.write("dateText2 += \"4\"\n");
      out.write("if (monthValue == 4)\n");
      out.write("dateText2 += \"5\"\n");
      out.write("if (monthValue == 5)\n");
      out.write("dateText2 += \"6\"\n");
      out.write("if (monthValue == 6)\n");
      out.write("dateText2 += \"7\"\n");
      out.write("if (monthValue == 7)\n");
      out.write("dateText2 += \"8\"\n");
      out.write("if (monthValue == 8)\n");
      out.write("dateText2 += \"9\"\n");
      out.write("if (monthValue == 9)\n");
      out.write("dateText2 += \"10\"\n");
      out.write("if (monthValue == 10)\n");
      out.write("dateText2 += \"11\"\n");
      out.write("if (monthValue == 11)\n");
      out.write("dateText2 += \"12\"\n");
      out.write("\n");
      out.write("// Para visualizar el ano, si es antes del 2000\n");
      out.write("if (A.getYear() < 2000) \n");
      out.write("dateText += \" \" + A.getDate()\n");
      out.write("else \n");
      out.write("dateText += \" \" + A.getDate()\n");
      out.write("\n");
      out.write("monthValue = A.getMonth()\n");
      out.write("dateText += \" \"\n");
      out.write("if (monthValue == 0)\n");
      out.write("dateText += \"de Enero\"\n");
      out.write("if (monthValue == 1)\n");
      out.write("dateText += \"de Febrero\"\n");
      out.write("if (monthValue == 2)\n");
      out.write("dateText += \"de Marzo\"\n");
      out.write("if (monthValue == 3)\n");
      out.write("dateText += \"de Abril\"\n");
      out.write("if (monthValue == 4)\n");
      out.write("dateText += \"de Mayo\"\n");
      out.write("if (monthValue == 5)\n");
      out.write("dateText += \"de Junio\"\n");
      out.write("if (monthValue == 6)\n");
      out.write("dateText += \"de Julio\"\n");
      out.write("if (monthValue == 7)\n");
      out.write("dateText += \"de Agosto\"\n");
      out.write("if (monthValue == 8)\n");
      out.write("dateText += \"de Septiembre\"\n");
      out.write("if (monthValue == 9)\n");
      out.write("dateText += \"de Octubre\"\n");
      out.write("if (monthValue == 10)\n");
      out.write("dateText += \"de Noviembre\"\n");
      out.write("if (monthValue == 11)\n");
      out.write("dateText += \"de Diciembre\"\n");
      out.write("\n");
      out.write("\n");
      out.write("if (A.getYear() < 2000) \n");
      out.write("dateText += \", \" + (1900 + A.getYear())\n");
      out.write("else \n");
      out.write("dateText += \", \" + (A.getYear())\n");
      out.write("\n");
      out.write("\n");
      out.write("if (A.getYear() < 2000) \n");
      out.write("//dateText2 += \"/\" + B.getDate() + \"/\" + (1900 + B.getYear())\n");
      out.write("mio += B.getDate() + \"/\" + (1 + B.getMonth()) + \"/\" + (1900 + B.getYear())\n");
      out.write("\n");
      out.write("else \n");
      out.write("//dateText2 += \"/\" + B.getDate() + \"/\" + (B.getYear())\n");
      out.write("mio += B.getDate() + \"/\" + (1 + B.getMonth()) + \"/\" + (B.getYear())\n");
      out.write("\n");
      out.write("\n");
      out.write("// Para visualizar la forma como se mira el tiempo\n");
      out.write("if (segundo < 10) \n");
      out.write("segundo = \"0\" + segundo; \n");
      out.write("\n");
      out.write("if (minuto < 10) \n");
      out.write("minuto = \"0\" + minuto; \n");
      out.write("\n");
      out.write("if (hora < 10) \n");
      out.write("hora = \"0\" + hora; \n");
      out.write("\n");
      out.write("if (hora < 12)\n");
      out.write("{\n");
      out.write("greeting=\"BUENOS DIAS!! \"\n");
      out.write("timeText=hora + \":\" + minuto + \":\" + segundo + \" AM \"\n");
      out.write("}\n");
      out.write("else if(hora == 12)\n");
      out.write("{\n");
      out.write("greeting=\"BUENAS TARDES!! \"\n");
      out.write("timeText=hora + \":\" + minuto + \":\" + segundo + \" PM \"\n");
      out.write("}\n");
      out.write("else if(hora < 18)\n");
      out.write("{\n");
      out.write("greeting=\"BUENAS TARDES!! \"\n");
      out.write("timeText=hora + \":\" + minuto + \":\" + segundo + \" PM \"\n");
      out.write("}\n");
      out.write("else\n");
      out.write("{\n");
      out.write("greeting=\"BUENAS NOCHES!! \"\n");
      out.write("timeText=hora + \":\" + minuto\n");
      out.write("}\n");
      out.write("\n");
      out.write("if (hora < 12)\n");
      out.write("{\n");
      out.write("greeting=\"BUENOS DIAS!! \"\n");
      out.write("timeText3=hora + \":\" + minuto\n");
      out.write("}\n");
      out.write("else if(hora == 12)\n");
      out.write("{\n");
      out.write("greeting=\"BUENAS TARDES!! \"\n");
      out.write("timeText3=hora + \":\" + minuto\n");
      out.write("}\n");
      out.write("else if(hora < 18)\n");
      out.write("{\n");
      out.write("greeting=\"BUENAS TARDES!! \"\n");
      out.write("timeText3=hora + \":\" + minuto\n");
      out.write("}\n");
      out.write("else\n");
      out.write("{\n");
      out.write("greeting=\"BUENAS NOCHES!! \"\n");
      out.write("timeText3=hora + \":\" + minuto\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("if (hora < 12)\n");
      out.write("{\n");
      out.write("greeting=\"BUENOS DIAS!! \"\n");
      out.write("timeText2=\"AM\"\n");
      out.write("}\n");
      out.write("else if(hora == 12)\n");
      out.write("{\n");
      out.write("greeting=\"BUENAS TARDES!! \"\n");
      out.write("timeText2=\"PM\"\n");
      out.write("}\n");
      out.write("else if(hora < 18)\n");
      out.write("{\n");
      out.write("greeting=\"BUENAS TARDES!! \"\n");
      out.write("timeText2=\"PM\"\n");
      out.write("}\n");
      out.write("else\n");
      out.write("{\n");
      out.write("greeting=\"BUENAS NOCHES!! \"\n");
      out.write("timeText2=\"PM\"\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("horaImprimible = timeText + \"\" + dateText\n");
      out.write("horaImprimible22 = timeText + \"\" + dateText\n");
      out.write("horaImprimible222 = timeText + \"\" + dateText\n");
      out.write("\n");
      out.write("horaImprimible2 = mio\n");
      out.write("horaImprimible3 = timeText3\n");
      out.write("\n");
      out.write("\n");
      out.write("document.form_reloj2.reloj.value = horaImprimible\n");
      out.write("document.form_reloj.reloj3.value = horaImprimible3\n");
      out.write("\n");
      out.write("document.form_reloj22.reloj22.value = horaImprimible22\n");
      out.write("document.form_reloj222.reloj222.value = horaImprimible222\n");
      out.write("\n");
      out.write("\n");
      out.write("document.form_reloj.reloj2.value = horaImprimible2\n");
      out.write("\n");
      out.write("setTimeout(\"Reloj()\",1000) \n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("function hora(){\n");
      out.write("var fecha = new Date()\n");
      out.write("var hora = fecha.getHours()\n");
      out.write("var minuto = fecha.getMinutes()\n");
      out.write("var segundo = fecha.getSeconds()\n");
      out.write("if(hora>=12 && hora<=23)\n");
      out.write("m=\"P.M\"\n");
      out.write("else\n");
      out.write("m=\"A.M\"\n");
      out.write("if (hora < 10) {hora = \"0\" + hora}\n");
      out.write("if (minuto < 10) {minuto = \"0\" + minuto}\n");
      out.write("if (segundo < 10) {segundo = \"0\" + segundo}\n");
      out.write("var nowhora = \"[ \" + hora + \":\" + minuto + \":\" + segundo + \" - \" + m + \" ]\"\n");
      out.write("document.getElementById('hora').firstChild.nodeValue = nowhora\n");
      out.write("tiempo = setTimeout('hora()',1000)\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write(" \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body onload=\"Reloj();\" style=\"font-family: 'Dosis', sans-serif;\">\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function registrar(){\n");
      out.write("    if(confirm('¿Estás seguro?'))\n");
      out.write("        return true;\n");
      out.write("    else\n");
      out.write("        return false;}\n");
      out.write("</script>  \n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <br>\n");

    try {
        Connection cnx=null;
        Statement sta=null;
        ResultSet rs=null;
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select nombre_pro,apellidos_pro from profesores where dni_pro="+dnipro);
    while (rs.next()){

      out.write("\n");
      out.write("    \n");
      out.write("    <div style=\"text-align: right;padding: 0px 0px 0px 0px\">\n");
      out.write("        <label style=\"color: #0069B4;\"><img src=\"Iconos/user.png\" width=\"14\" height=\"14\"> ");
      out.print(rs.getString(2));
      out.write(' ');
      out.print(rs.getString(1));
      out.write(" |</label>\n");
      out.write("        <label style=\"\"><a href=\"cerrar_pro\" style=\"text-decoration: none;color: #0069B4;\"><img src=\"Iconos/cerrar.png\" width=\"14\" height=\"14\"> Cerrar Sesión</a></label>\n");
      out.write("    </div>\n");
      out.write("        \n");
 
    }
    sta.close();
    rs.close();
    cnx.close();
    } catch (Exception e) {
    }

      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("<form action=\"sesion_pro\" method=\"post\" class=\"form-register\" name=\"form_reloj\">\n");
      out.write("    <h2 class=\"form-titulo\">Docente <label style=\"font-weight: 600\">ENEI</label></h2>\n");
      out.write("            <div class=\"contenedor-inputs\">\n");
      out.write("            <input type=\"password\" name=\"dnipro\" placeholder=\"DNI\" required=\"required\" class=\"input-100\" style=\"padding-left: 5px;\">\n");
      out.write("            <input type=\"text\" name=\"reloj\" class=\"input-100\" style=\"text-align: center; display: none\">\n");
      out.write("            <input type=\"text\" name=\"reloj2\" class=\"input-100\" style=\"text-align: center; display: none\">\n");
      out.write("            <input type=\"text\" name=\"reloj3\" class=\"input-100\" style=\"text-align: center; display: none\">\n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Ingresar\" class=\"btn-enviar\">\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("<!--http://blog.nnatali.com/2008/05/24/javascript-ocultarmostrar-campos-en-un-formulario/-->\n");
      out.write("<br>\n");

    try {
        Connection cnx=null;
            Statement sta=null;
            ResultSet rs=null;
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select T1.nombre_cur,T3.frec,T2.fecha,T2.id_sesion,T2.horasini,T2.horasfin from cursos T1 inner join sesion T2 inner join registro T3 on T3.id_registro=T2.id_registro and T1.cod_cur=T3.cod_cur where T2.fecha like '"+reloj2+"' and T3.dni_pro="+dnipro+" and '"+reloj3+"' between subtime(T2.horasini,'00:16') and addtime(T2.horasfin,'01:00:00')");
    while (rs.next()){

      out.write("\n");
      out.write("<div class=\"row\" id=\"div2\" style=\"display:block\">\n");
      out.write("      <div class=\"col-md-12\">\n");
      out.write("          <div class=\"panel panel-default\">\n");
      out.write("              <div class=\"panel-heading\">\n");
      out.write("                  <h3 class=\"panel-title\">Marcación Docente\n");
      out.write("                  </h3>\n");
      out.write("              </div>    \n");
      out.write("              <div class=\"panel-body\">\n");
      out.write("                  <div class=\"table-responsive\">\n");
      out.write("                    <table class=\"table table-striped\">                \n");
      out.write("                        <tr>\n");
      out.write("                            <th>CURSO</th>\n");
      out.write("                            <th>FRECUENCIA</th>\n");
      out.write("                            <th>FECHA SESIÓN</th>\n");
      out.write("                            <th>HORA PROGRAMADA</th>\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("     ");
      out.write("\n");
      out.write("<tr>  \n");
      out.write("                            <th class=\"bg-warning\">");
      out.print(rs.getString(1));
      out.write("</th>\n");
      out.write("                            <th class=\"info\">");
      out.print(rs.getString(2));
      out.write("</th>\n");
      out.write("                            <th class=\"info\">");
      out.print(rs.getString(3));
      out.write("</th>\n");
      out.write("                            <th class=\"info\">");
      out.print(rs.getString(5));
      out.write(" - ");
      out.print(rs.getString(6));
      out.write("</th>\n");
      out.write("                        </tr>                      \n");
 
    }
    sta.close();
    rs.close();
    cnx.close();
    } catch (Exception e) {
    }

      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-md-6\" id=\"oculto\" style=\"display: block\">\n");
      out.write("<form name=\"form_reloj2\" method=\"post\" action=\"ingreso\">\n");
      out.write("    ");

    try {
        Connection cnx=null;
            Statement sta=null;
            ResultSet rs=null;
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select T1.nombre_cur,T3.frec,T2.fecha,T2.id_sesion,T2.horasini,T2.horasfin from cursos T1 inner join sesion T2 inner join registro T3 on T3.id_registro=T2.id_registro and T1.cod_cur=T3.cod_cur where T2.fecha like '"+reloj2+"' and T3.dni_pro="+dnipro+" and '"+reloj3+"' between subtime(T2.horasini,'00:16') and addtime(T2.horasfin,'01:00:00')");
    while (rs.next()){

      out.write("\n");
      out.write("    <input type=\"text\" name=\"idsesion\" required=\"required\" value=\"");
      out.print(rs.getString(4));
      out.write("\" style=\"font-size: 20px;display: none\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("    <button type=\"submit\" class=\"btn btn-outline-danger\" onclick=\"return registrar();mostrar();\">MARCA INGRESO</button>\n");
      out.write("\n");
      out.write("    <br><br>\n");
      out.write("\n");
      out.write("    ");
 
    }
    sta.close();
    rs.close();
    cnx.close();
    } catch (Exception e) {
    }

      out.write("\n");
      out.write("<input type=\"text\" id=\"abc\" name=\"reloj\"  style=\";width: 10%;text-align: center; font-size: 50px;border: 0px;color: #ddd;display: none\" required=\"required\" readonly=\"\">\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("    <div class=\"col-md-6\">\n");
      out.write("        <form name=\"form_reloj22\" method=\"post\" action=\"salida\">\n");
      out.write("    ");

    try {
        Connection cnx=null;
            Statement sta=null;
            ResultSet rs=null;
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select T1.nombre_cur,T3.frec,T2.fecha,"
            + "T2.id_sesion,T2.horasini,T2.horasfin,T4.id_ingreso "
            + "from cursos T1 "
            + "inner join sesion T2 "
            + "inner join registro T3 "
            + "inner join ingreso T4 "
            + "on T3.id_registro=T2.id_registro "
            + "and T1.cod_cur=T3.cod_cur "
            + "and T2.id_sesion=T4.id_sesion "
            + "where T2.fecha like '"+reloj2+"' "
            + "and T3.dni_pro="+dnipro+" and '"+reloj3+"' "
            + "between subtime(T2.horasini,'00:16') and addtime(T2.horasfin,'01:00:00') limit 1");
    while (rs.next()){

      out.write("\n");
      out.write("    <input type=\"text\" name=\"idingreso\" required=\"required\" value=\"");
      out.print(rs.getString(7));
      out.write("\" style=\"font-size: 20px;display: none\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("    \n");
      out.write("    <button type=\"submit\" class=\"btn btn-primary\" onclick=\"document.getElementById('abc').style.color='#000'; \n");
      out.write("    document.form_reloj222.abc.value=horaImprimible222;return registrar();\">MARCA SALIDA</button>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <br><br>\n");
      out.write("\n");
      out.write("    ");
 
    }
    sta.close();
    rs.close();
    cnx.close();
    } catch (Exception e) {
    }

      out.write("\n");
      out.write("<input type=\"text\"  name=\"reloj22\" style=\"width: 10%;text-align: center; font-size: 50px;border: 0px;color: #ddd;display: none\" required=\"required\">\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<form name=\"form_reloj222\">\n");
      out.write("    <input type=\"text\"  id=\"abc\" name=\"reloj222\" style=\"width: 100%;text-align: center; font-size: 50px;border: 0px;color: #ddd;\">\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("  ");

    try {
        Connection cnx=null;
            Statement sta=null;
            ResultSet rs=null;
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select T5.nombre_cur,T1.horaingreso "
            + "from ingreso T1 inner join profesores T2 "
            + "inner join registro T3 "
            + "inner join sesion T4 "
            + "Inner join cursos T5 "
            + "on T1.id_sesion=T4.id_sesion "
            + "and T3.id_registro=T4.id_registro "
            + "and T2.dni_pro=T3.dni_pro "
            + "and T5.cod_cur=T3.cod_cur "
            + "where T2.dni_pro="+dnipro+" and T4.fecha like '"+reloj2+"' LIMIT 1");
    while (rs.next()){

      out.write("\n");
      out.write("<H1 style=\"text-align: center\">HOY</H1>\n");
      out.write("\n");
      out.write("<div class=\"alert alert-warning\" role=\"alert\">\n");
      out.write("    ");
      out.print(rs.getString(1));
      out.write(" <label style=\"color: red;margin-left: 5%\">INGRESO</label> ");
      out.print(rs.getString(2));
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
 
    }
    sta.close();
    rs.close();
    cnx.close();
    } catch (Exception e) {
    }

      out.write("\n");
      out.write("</div>\n");
      out.write("<div>\n");
      out.write("  ");

    try {
        Connection cnx=null;
            Statement sta=null;
            ResultSet rs=null;
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select T5.nombre_cur,T6.horasalida "
            + "from ingreso T1 inner join profesores T2 "
            + "inner join registro T3 "
            + "inner join sesion T4 "
            + "Inner join cursos T5 "
            + "inner join salida T6 "
            + "on T1.id_sesion=T4.id_sesion "
            + "and T3.id_registro=T4.id_registro "
            + "and T2.dni_pro=T3.dni_pro "
            + "and T5.cod_cur=T3.cod_cur "
            + "and T1.id_ingreso=T6.id_ingreso "
            + "where T2.dni_pro="+dnipro+" and T4.fecha like '"+reloj2+"' LIMIT 1");
    while (rs.next()){

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<div class=\"alert alert-warning\" role=\"alert\">\n");
      out.write("    ");
      out.print(rs.getString(1));
      out.write(" <label style=\"color: red;margin-left: 5%\">SALIDA</label> ");
      out.print(rs.getString(2));
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
 
    }
    sta.close();
    rs.close();
    cnx.close();
    } catch (Exception e) {
    }

      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<H1 style=\"text-align: center\">HISTORIAL</H1>\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("  ");

    try {
        Connection cnx=null;
            Statement sta=null;
            ResultSet rs=null;
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select T5.nombre_cur,T1.horaingreso,T6.horasalida "
            + "from ingreso T1 inner join profesores T2 "
            + "inner join registro T3 "
            + "inner join sesion T4 "
            + "Inner join cursos T5 "
            + "inner join salida T6 "
            + "on T1.id_sesion=T4.id_sesion "
            + "and T3.id_registro=T4.id_registro "
            + "and T2.dni_pro=T3.dni_pro "
            + "and T5.cod_cur=T3.cod_cur "
            + "and T1.id_ingreso=T6.id_ingreso "
            + "where T2.dni_pro="+dnipro+" group by T1.id_ingreso desc");
    while (rs.next()){

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<div class=\"alert alert-info\" role=\"alert\">\n");
      out.write("    ");
      out.print(rs.getString(1));
      out.write(" <label style=\"color: red;margin-left: 5%\">INGRESO</label> ");
      out.print(rs.getString(2));
      out.write(" <label style=\"color: #0069B4;margin-left: 5%\">SALIDA</label> ");
      out.print(rs.getString(3));
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
 
    }
    sta.close();
    rs.close();
    cnx.close();
    } catch (Exception e) {
    }

      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("  <br>  \n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function mostrar(){\n");
      out.write("document.getElementById('oculto').style.display = \"none\";}\n");
      out.write("</script>\n");
      out.write("    ");
      out.write("\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("    </body>\n");
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
