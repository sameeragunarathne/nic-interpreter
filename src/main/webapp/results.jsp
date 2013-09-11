<%@page import="java.NicCalculator"%>
<%@page import="java.NicData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>NIC Calculator</title>
<h1>Calculations</h1>

<h3>Result of NIC Interpretation is</h3>
<%
	String input = request.getParameter("NIC_num");
	NicCalculator n = new NicCalculator(input);
        NicData n2 = n.interpretID();
        String[] ar = n2.getDOB();
              
               out.println("Birthday[ "); 
               out.println("Year : "+ar[0]);
               out.println("Month : "+ar[1]);
               out.println("Day : "+ar[2]);
               out.println("]        Sex : "+n2.getSex());
               out.println("    Voter : "+n2.getIsVoter());
	
	
%>
</head>
<body>

</body>
</html>