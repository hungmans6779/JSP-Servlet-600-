package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sample133 extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Sample133() {
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
	
		
		Hashtable <String,String> ht=new Hashtable<String,String>();
		ht.put("1","1@eztravel.com.tw");
		ht.put("2","2@eztravel.com.tw");
		ht.put("3","3@eztravel.com.tw");
		ht.put("4","4@eztravel.com.tw");
		ht.put("5","5@eztravel.com.tw");
		
		ht.put("test","test@eztravel.com.tw");
		
		Enumeration en=ht.elements();
		out.println("�e");
		out.println("<br>");
		while(en.hasMoreElements()){
		  out.println((String)en.nextElement()+"<br>");	
		}
		
		
		out.println("<br>");
		out.println("��");
		out.println("<br>");
		ht.remove("test");
		en=ht.elements();
		while(en.hasMoreElements()){
		  out.println((String)en.nextElement()+"<br>");	
		}
		
	
		
		
		
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
