<h1>This is from JSP Page</h1>
<%!
	int a = 10;
	int b = 20;
%>
<%
	int sum = a + b;
%>
The value of a is : <%= a %><br>
The value of b is : <%= b %><br>
<br>
The sum of a and b is : <%= sum %><br>
<br>
