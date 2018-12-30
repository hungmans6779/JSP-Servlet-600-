package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sample150 extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Sample150() {
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
	
		
		String  [] week={"日","一","二","三","四","五","六"};
		
	    Calendar today=new GregorianCalendar();
		out.println("today = "+today+"<br>");
	    
		int year=today.get(Calendar.YEAR);
		int month=today.get(Calendar.MONTH);
		int day=today.get(Calendar.DATE);
		int dayOfWeek=today.get(Calendar.DAY_OF_WEEK);
		out.println(year+"年 "+(month+1)+" 月"+day+" 日 ("+week[dayOfWeek-1]+")"+"<br>");
		

		int hour=today.get(Calendar.HOUR_OF_DAY);
		int minute=today.get(Calendar.MINUTE);
		int second=today.get(Calendar.SECOND);
	    String ampm=today.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
		out.println(hour+" 時 "+minute+" 分 "+second+"秒 "+ampm+"<br>");
		
		out.println("Calendar.AM = "+Calendar.AM+"<br>");
		out.println("Calendar.PM = "+Calendar.PM+"<br>");
		out.println("Calendar.AM_PM = "+Calendar.AM_PM+"<br>");
		out.println("Calendar get = "+today.get(Calendar.AM_PM));
		
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
