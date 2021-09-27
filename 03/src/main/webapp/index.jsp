<html>
<head>
    <title>Calculator</title>
</head>
<body>
<%
    // ha servettol jott, akkor van, ha elso keres, akkor nincs

    szamologepservlet.ResultDto result = (request.getAttribute("result") != null) ?
            (szamologepservlet.ResultDto) request.getAttribute("result") :
            new szamologepservlet.ResultDto();



    String resultText = (result == null) ?
            "" : "result " + result.getResult().toString();
%>

ver: 0.5
<form method="post" action="/szamologepszervlet/szamologep.do">
    <input type="text" name="a" value="<%= result.getA() %>"/><br>
    <input type="text" name="b" value="<%= result.getB() %>"/><br>
    <select name="operator">
        <option value="+" <%="+".equals(result.getOperator())? "selected" : ""%> > +
        <option value="-" <%="-".equals(result.getOperator())? "selected" : ""%> > -
        <option value="*" <%="*".equals(result.getOperator())? "selected" : ""%> > *
        <option value="/" <%="/".equals(result.getOperator())? "selected" : ""%> > /
    </select><br>

    <%= resultText %> <br>
    <input type="submit" /><br>
</form>




</body>
</html>