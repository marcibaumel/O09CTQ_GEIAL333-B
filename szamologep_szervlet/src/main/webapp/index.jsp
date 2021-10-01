<html>
<head>
    <title>Calculator</title>
</head>
<body>
<%
    Double result = (Double) request.getAttribute("result");
    String resultText = (result == null) ?
            "" : "result " + result.toString();
%>
<form method="post" action="szamologep.do">
    <input type="text" name="a" /><br>
    <input type="text" name="b" /><br>
    <select name="operator">
        <option value="+" /> +
        <option value="-" /> -
        <option value="*" /> *
        <option value="/" /> /
    </select><br>

    <%= resultText %>
    <input type="submit" /><br>
</form>

</body>
</html>