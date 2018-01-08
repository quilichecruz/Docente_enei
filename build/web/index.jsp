<%-- 
    Document   : index
    Created on : 29/12/2017, 09:00:38 AM
    Author     : prac-enei5
--%>

<%@page session="true"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%  
    String hostname=(String)session.getAttribute("hostname");
    String ip=(String)session.getAttribute("ip");
    String dnipro=(String)session.getAttribute("dnipro");
    String reloj2=(String)session.getAttribute("reloj2");
    String reloj3=(String)session.getAttribute("reloj3");
    String idsesion = request.getParameter("idsesion");
%>
  

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <script type="text/javascript"  src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Dosis" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
<script type="text/javascript">
function Reloj(){ 
A = new Date()
B = new Date() 
dateText = ""
dateText2 = ""
mio = ""
hora = A.getHours() 
minuto = A.getMinutes() 
segundo = A.getSeconds() 

// Tomar el dia actual y convertirlo al espanol
dayValue = A.getDay()
if (dayValue == 0)
dateText += "Domingo"
else if (dayValue == 1)
dateText += "Lunes"
else if (dayValue == 2)
dateText += "Martes"
else if (dayValue == 3)
dateText += "Miercoles"
else if (dayValue == 4)
dateText += "Jueves"
else if (dayValue == 5)
dateText += "Viernes"
else if (dayValue == 6)
dateText += "Sabado"

dayValue = A.getDay()
if (dayValue == 0)
dateText2 += ""
else if (dayValue == 1)
dateText2 += ""
else if (dayValue == 2)
dateText2 += ""
else if (dayValue == 3)
dateText2 += ""
else if (dayValue == 4)
dateText2 += ""
else if (dayValue == 5)
dateText2 += ""
else if (dayValue == 6)
dateText2 += ""

// tomar el mes actual y convertirlo a meses en espanol


monthValue = A.getMonth()
dateText2 += ""
if (monthValue == 0)
dateText2 += "1"
if (monthValue == 1)
dateText2 += "2"
if (monthValue == 2)
dateText2 += "3"
if (monthValue == 3)
dateText2 += "4"
if (monthValue == 4)
dateText2 += "5"
if (monthValue == 5)
dateText2 += "6"
if (monthValue == 6)
dateText2 += "7"
if (monthValue == 7)
dateText2 += "8"
if (monthValue == 8)
dateText2 += "9"
if (monthValue == 9)
dateText2 += "10"
if (monthValue == 10)
dateText2 += "11"
if (monthValue == 11)
dateText2 += "12"

// Para visualizar el ano, si es antes del 2000
if (A.getYear() < 2000) 
dateText += " " + A.getDate()
else 
dateText += " " + A.getDate()

monthValue = A.getMonth()
dateText += " "
if (monthValue == 0)
dateText += "de Enero"
if (monthValue == 1)
dateText += "de Febrero"
if (monthValue == 2)
dateText += "de Marzo"
if (monthValue == 3)
dateText += "de Abril"
if (monthValue == 4)
dateText += "de Mayo"
if (monthValue == 5)
dateText += "de Junio"
if (monthValue == 6)
dateText += "de Julio"
if (monthValue == 7)
dateText += "de Agosto"
if (monthValue == 8)
dateText += "de Septiembre"
if (monthValue == 9)
dateText += "de Octubre"
if (monthValue == 10)
dateText += "de Noviembre"
if (monthValue == 11)
dateText += "de Diciembre"


if (A.getYear() < 2000) 
dateText += ", " + (1900 + A.getYear())
else 
dateText += ", " + (A.getYear())


if (A.getYear() < 2000) 
//dateText2 += "/" + B.getDate() + "/" + (1900 + B.getYear())
mio += B.getDate() + "/" + (1 + B.getMonth()) + "/" + (1900 + B.getYear())

else 
//dateText2 += "/" + B.getDate() + "/" + (B.getYear())
mio += B.getDate() + "/" + (1 + B.getMonth()) + "/" + (B.getYear())


// Para visualizar la forma como se mira el tiempo
if (segundo < 10) 
segundo = "0" + segundo; 

if (minuto < 10) 
minuto = "0" + minuto; 

if (hora < 10) 
hora = "0" + hora; 

if (hora < 12)
{
greeting="BUENOS DIAS!! "
timeText=hora + ":" + minuto + ":" + segundo + " AM "
}
else if(hora == 12)
{
greeting="BUENAS TARDES!! "
timeText=hora + ":" + minuto + ":" + segundo + " PM "
}
else if(hora < 18)
{
greeting="BUENAS TARDES!! "
timeText=hora + ":" + minuto + ":" + segundo + " PM "
}
else
{
greeting="BUENAS NOCHES!! "
timeText=hora + ":" + minuto
}

if (hora < 12)
{
greeting="BUENOS DIAS!! "
timeText3=hora + ":" + minuto
}
else if(hora == 12)
{
greeting="BUENAS TARDES!! "
timeText3=hora + ":" + minuto
}
else if(hora < 18)
{
greeting="BUENAS TARDES!! "
timeText3=hora + ":" + minuto
}
else
{
greeting="BUENAS NOCHES!! "
timeText3=hora + ":" + minuto
}



if (hora < 12)
{
greeting="BUENOS DIAS!! "
timeText2="AM"
}
else if(hora == 12)
{
greeting="BUENAS TARDES!! "
timeText2="PM"
}
else if(hora < 18)
{
greeting="BUENAS TARDES!! "
timeText2="PM"
}
else
{
greeting="BUENAS NOCHES!! "
timeText2="PM"
}



horaImprimible = timeText + "" + dateText
horaImprimible22 = timeText + "" + dateText
horaImprimible222 = timeText + "" + dateText

horaImprimible2 = mio
horaImprimible3 = timeText3


document.form_reloj2.reloj.value = horaImprimible
document.form_reloj.reloj3.value = horaImprimible3

document.form_reloj22.reloj22.value = horaImprimible22
document.form_reloj222.reloj222.value = horaImprimible222


document.form_reloj.reloj2.value = horaImprimible2

setTimeout("Reloj()",1000) 

}

function hora(){
var fecha = new Date()
var hora = fecha.getHours()
var minuto = fecha.getMinutes()
var segundo = fecha.getSeconds()
if(hora>=12 && hora<=23)
m="P.M"
else
m="A.M"
if (hora < 10) {hora = "0" + hora}
if (minuto < 10) {minuto = "0" + minuto}
if (segundo < 10) {segundo = "0" + segundo}
var nowhora = "[ " + hora + ":" + minuto + ":" + segundo + " - " + m + " ]"
document.getElementById('hora').firstChild.nodeValue = nowhora
tiempo = setTimeout('hora()',1000)
}

</script>
    </head>
    
    <body onload="Reloj();" style="font-family: 'Dosis', sans-serif;">
        <script type="text/javascript">
            function registrar(){
                if(confirm('¿Estás seguro?'))
                    return true;
                else
                    return false;}
        </script>  
<div class="container">
    <br>
<%
    try {
        Connection cnx=null;
        Statement sta=null;
        ResultSet rs=null;
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select nombre_pro,apellidos_pro from profesores where dni_pro="+dnipro);
    while (rs.next()){
%>
    <div style="text-align: right;padding: 0px 0px 0px 0px">
        <label style="color: #0069B4;"><img src="Iconos/user.png" width="14" height="14"> <%=rs.getString(2)%> <%=rs.getString(1)%> |</label>
        <label style=""><a href="cerrar_pro" style="text-decoration: none;color: #0069B4;"><img src="Iconos/cerrar.png" width="14" height="14"> Cerrar Sesión</a></label>
    </div>
<% 
    }
    sta.close();
    rs.close();
    cnx.close();
    } catch (Exception e) {
    }
%>

<div class="row">
    <div class="col-md-12">
        <form action="sesion_pro" method="post" class="form-register" name="form_reloj">
            <h2 class="form-titulo">Docente <label style="font-weight: 600">ENEI</label></h2>
            <div class="contenedor-inputs">
            <input type="password" name="dnipro" placeholder="DNI" required="required" class="input-100" style="padding-left: 5px;">
            <input type="text" name="reloj" class="input-100" style="text-align: center; display: none">
            <input type="text" name="reloj2" class="input-100" style="text-align: center; display: none">
            <input type="text" name="reloj3" class="input-100" style="text-align: center; display: none">
            <input type="submit" value="Ingresar" class="btn-enviar">
            </div>
        </form>
    </div>
</div>

<br>
<%
    try {
        Connection cnx=null;
            Statement sta=null;
            ResultSet rs=null;
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select T1.nombre_cur,T3.frec,T2.fecha,T2.id_sesion,T2.horasini,"
            + "T2.horasfin from cursos T1 inner join sesion T2 inner join registro T3 "
            + "on T3.id_registro=T2.id_registro and T1.cod_cur=T3.cod_cur "
            + "where T2.fecha like '"+reloj2+"' and T3.dni_pro="+dnipro+" and '"+reloj3+"' "
            + "between subtime(T2.horasini,'00:16') and addtime(T2.horasfin,'01:00:00') "
            + "order by T2.id_sesion desc limit 1");
    while (rs.next()){
%>
<div class="row" id="div2" style="display:block">
      <div class="col-md-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Marcación Docente</h3>
                </div>    
                <div class="panel-body">
                    <div class="table-responsive">
                        <table class="table table-striped">                
                            <tr>
                                <th>CURSO</th>
                                <th>FRECUENCIA</th>
                                <th>FECHA SESIÓN</th>
                                <th>HORA PROGRAMADA</th>
                            </tr>
                            <tr>  
                                <th class="table-primary"><%=rs.getString(1)%></th>
                                <th class="table-primary"><%=rs.getString(2)%></th>
                                <th class="table-primary"><%=rs.getString(3)%></th>
                                <th class="table-primary"><%=rs.getString(5)%> - <%=rs.getString(6)%></th>
                            </tr>                      
<% 
    }
    sta.close();
    rs.close();
    cnx.close();
    } catch (Exception e) {
    }
%>
                    </table>
                </div>
            </div>
        </div> 
    </div>
</div>
<br>



<div class="row">
    <div class="col-md-12" id="oculto" style="text-align: center">
        <form name="form_reloj2" method="post" action="ingreso">
<%
    try {
        Connection cnx=null;
            Statement sta=null;
            ResultSet rs=null;
    Class.forName("com.mysql.jdbc.Driver");
    cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdenei?user=root&password=root");
    sta=cnx.createStatement();
    rs=sta.executeQuery("select T1.nombre_cur,T3.frec,T2.fecha,T2.id_sesion,T2.horasini,T2.horasfin from cursos T1 inner join sesion T2 inner join registro T3 inner join ingreso I on T3.id_registro=T2.id_registro and T1.cod_cur=T3.cod_cur where T2.fecha like '"+reloj2+"' and T3.dni_pro="+dnipro+" and '"+reloj3+"' between subtime(T2.horasini,'00:16') and addtime(T2.horasfin,'01:00:00') and T2.id_sesion not in (select I.id_sesion from ingreso I) group by T2.id_sesion desc LIMIT 1");
    while (rs.next()){
%>
            <input type="text" name="idsesion" required="required" value="<%=rs.getString(4)%>" style="font-size: 20px;display: none">
            <button type="submit" class="btn btn-danger" onclick="return registrar();">MARCA INGRESO <i class="material-icons" style="font-size: 20px">done_all</i></button>
            <br><br>
<% 
    }
    sta.close();
    rs.close();
    cnx.close();
    } catch (Exception e) {
    }
%>
            <input type="text" id="abc11" name="reloj"  style="width: 10%;text-align: center; font-size: 50px;border: 0px;color: #ddd;display: none" required="required" readonly="">
        </form>
    </div>

    <div class="col-md-12" style="text-align: center;">
        <form name="form_reloj22" method="post" action="salida">
<%
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
            + "inner join ingreso T4 inner join salida S "
            + "on T3.id_registro=T2.id_registro "
            + "and T1.cod_cur=T3.cod_cur "
            + "and T2.id_sesion=T4.id_sesion "
            + "where T2.fecha like '"+reloj2+"' "
            + "and T3.dni_pro="+dnipro+" and '"+reloj3+"' "
            + "between subtime(T2.horasini,'00:16') and addtime(T2.horasfin,'01:00:00') and T4.id_ingreso not in (select S.id_ingreso from salida S) group by T4.id_ingreso desc LIMIT 1");
    while (rs.next()){
%>
            <input type="text" name="idingreso" required="required" value="<%=rs.getString(7)%>" style="font-size: 20px;display: none">
            <button type="submit" class="btn btn-danger" onclick="return registrar();">MARCA SALIDA <i class="material-icons" style="font-size: 20px">done_all</i></button>
            <br><br>
<% 
    }
    sta.close();
    rs.close();
    cnx.close();
    } catch (Exception e) {
    }
%>
            <input type="text"  name="reloj22" style="width: 10%;text-align: center; font-size: 50px;border: 0px;color: #ddd;display: none" required="required">
        </form>
    </div>
</div>
        <form name="form_reloj222">
            <input type="text"  id="abc1" name="reloj222" style="width: 100%;text-align: center; font-size: 50px;border: 0px;color: #ddd;">
        </form>
<br><br>


<%
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
            + "where T2.dni_pro="+dnipro+" and T4.fecha like '"+reloj2+"' order by T4.id_sesion desc limit 1");
    while (rs.next()){
%>

<h1 style="text-align: center">ÚLTIMA MARCACIÓN</h1>
<div class="row alert alert-warning">
    <div class="col-md-6">
        <div class=" " role="alert">
            <label style="color: red;font-size: 30px;">INGRESO</label> <label style="font-size: 30px"><%=rs.getString(2)%></label>
        </div>
    </div>
<% 
    }
    sta.close();
    rs.close();
    cnx.close();
    } catch (Exception e) {
    }
%>

<%
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
            + "where T2.dni_pro="+dnipro+" and T4.fecha like '"+reloj2+"' order by T4.id_sesion desc limit 1");
    while (rs.next()){
%>

    <div class="col-md-6">
        <div class="" role="alert">
            <label style="color: red;font-size: 30px">SALIDA</label> <label style="font-size: 30px"><%=rs.getString(2)%></label>
        </div>
    </div>
</div>
    <% 
    }
    sta.close();
    rs.close();
    cnx.close();
    } catch (Exception e) {
    }
%>

</div>

<div class="container">
<div class="row">
    <div class="col-md-12" style="text-align: center;">
        <p>
            <button class="btn btn-outline-primary" type="button" data-toggle="collapse" data-target="#collapseExample" aria-controls="collapseExample">
                MI HISTORIAL <i class="material-icons" style="font-size: 20px"  data-toggle="tooltip" data-placement="right" title="Eliminar">event_note
</i>
            </button>
        </p>
        <div class="collapse" id="collapseExample">
            <div class="card card-body">
<%
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
%>
        <div class="alert alert-info" role="alert">
            <%=rs.getString(1)%> <label style="color: red;margin-left: 5%">INGRESO</label> <%=rs.getString(2)%> <label style="color: #0069B4;margin-left: 5%">SALIDA</label> <%=rs.getString(3)%>
        </div>
    <% 
    }
    sta.close();
    rs.close();
    cnx.close();
    } catch (Exception e) {
    }
%>

      
  </div>
</div>
</div>
</div>
</div>



<script type="text/javascript">
function mostrar(){
document.getElementById('oculto').style.display = "none";}

</script>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
    
    </body>
</html>