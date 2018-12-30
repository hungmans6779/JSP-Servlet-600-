package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sample152 extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Sample152() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
	
		

		String  [] week={"��","�@","�G","�T","�|","��","��"};
		
		Calendar today1=new GregorianCalendar();
		today1.add(Calendar.DATE, 1);
		int year=today1.get(Calendar.YEAR);
		int month=today1.get(Calendar.MONTH);
		int day=today1.get(Calendar.DATE);
		int dayWeek=today1.get(Calendar.DAY_OF_WEEK);
		out.println("�� �� = "+year+"�~ "+(month+1)+" ��"+day+" �� ("+week[dayWeek-1]+")"+"<br>");
		
		
		Calendar today2=new GregorianCalendar();
		today2.add(Calendar.DATE,-1);
		year=today2.get(Calendar.YEAR);
		month=today2.get(Calendar.MONTH);
		day=today2.get(Calendar.DATE);
		dayWeek=today2.get(Calendar.DAY_OF_WEEK);
		out.println("�Q �� = "+year+"�~ "+(month+1)+" ��"+day+" �� ("+week[dayWeek-1]+")"+"<br>");
		
		
		out.println("<p style='height:30px'></p>");
		Calendar today3=new GregorianCalendar();
		out.println("���g�O������� "+today3.get(Calendar.WEEK_OF_MONTH)+" �g<br>");
        out.println("���g�O���~�� "+today3.get(Calendar.WEEK_OF_YEAR)+" �g<br>");		
		
        
        out.println("<br>");
        out.println("����� = "+today3.get(Calendar.MONTH)+"<br>");
        out.println("�@��       = "+Calendar.JANUARY+"<br>");
        out.println("�G��      = "+Calendar.FEBRUARY+"<br>");
        out.println("�T��      = "+Calendar.MARCH+"<br>");
        out.println("�|��      = "+Calendar.APRIL+"<br>");
        out.println("����      = "+Calendar.MAY+"<br>");
        out.println("����      = "+Calendar.JUNE+"<br>");
        out.println("�C��      = "+Calendar.JULY+"<br>");
        out.println("�K��      = "+Calendar.AUGUST+"<br>");
        out.println("�E��      = "+Calendar.SEPTEMBER+"<br>");
        out.println("�Q��      = "+Calendar.OCTOBER+"<br>");
        out.println("�Q�@�� = "+Calendar.NOVEMBER+"<br>");
        out.println("�Q�G��= "+Calendar.DECEMBER+"<br>");
        
        
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
