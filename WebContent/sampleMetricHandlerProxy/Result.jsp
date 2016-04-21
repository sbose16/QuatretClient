<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleMetricHandlerProxyid" scope="session" class="com.Quartret.MetricHandlerProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleMetricHandlerProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleMetricHandlerProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleMetricHandlerProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.Quartret.MetricHandler getMetricHandler10mtemp = sampleMetricHandlerProxyid.getMetricHandler();
if(getMetricHandler10mtemp == null){
%>
<%=getMetricHandler10mtemp %>
<%
}else{
        if(getMetricHandler10mtemp!= null){
        String tempreturnp11 = getMetricHandler10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String name_1id=  request.getParameter("name16");
            java.lang.String name_1idTemp = null;
        if(!name_1id.equals("")){
         name_1idTemp  = name_1id;
        }
        String value_2id=  request.getParameter("value18");
        int value_2idTemp  = Integer.parseInt(value_2id);
        java.lang.String setMetrics13mtemp = sampleMetricHandlerProxyid.setMetrics(name_1idTemp,value_2idTemp);
if(setMetrics13mtemp == null){
%>
<%=setMetrics13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(setMetrics13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 20:
        gotMethod = true;
        String dateTime_3id=  request.getParameter("dateTime23");
            java.lang.String dateTime_3idTemp = null;
        if(!dateTime_3id.equals("")){
         dateTime_3idTemp  = dateTime_3id;
        }
        java.lang.String getMetric20mtemp = sampleMetricHandlerProxyid.getMetric(dateTime_3idTemp);
if(getMetric20mtemp == null){
%>
<%=getMetric20mtemp %>
<%
}else{
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getMetric20mtemp));
        %>
        <%= tempResultreturnp21 %>
        <%
}
break;
case 25:
        gotMethod = true;
        String startTime_4id=  request.getParameter("startTime28");
            java.lang.String startTime_4idTemp = null;
        if(!startTime_4id.equals("")){
         startTime_4idTemp  = startTime_4id;
        }
        String endTime_5id=  request.getParameter("endTime30");
            java.lang.String endTime_5idTemp = null;
        if(!endTime_5id.equals("")){
         endTime_5idTemp  = endTime_5id;
        }
        java.lang.String getAggregateMetric25mtemp = sampleMetricHandlerProxyid.getAggregateMetric(startTime_4idTemp,endTime_5idTemp);
if(getAggregateMetric25mtemp == null){
%>
<%=getAggregateMetric25mtemp %>
<%
}else{
        String tempResultreturnp26 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getAggregateMetric25mtemp));
        %>
        <%= tempResultreturnp26 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>