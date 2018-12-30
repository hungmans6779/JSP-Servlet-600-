package servlet;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sample123 extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Sample123() {
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
	
		String path=null;
		ServletContext context=getServletConfig().getServletContext();	
		try{
		  path=context.getRealPath("/Sample122-1.txt");	
		  FileInputStream fis1=new FileInputStream(path);
		  
		  path=context.getRealPath("/Sample122-2.txt");
		  FileInputStream fis2=new FileInputStream(path);
		  
		  path=context.getRealPath("/Sample122-3.txt");
		  FileInputStream fis3=new FileInputStream(path);
		  Vector<FileInputStream> v=new Vector<FileInputStream>();
		  v.add(fis1);
		  v.add(fis2);
		  v.add(fis3);
		  Enumeration <FileInputStream> en=v.elements();
		  SequenceInputStream sis=new SequenceInputStream(en);
		  InputStreamReader isr=new InputStreamReader(sis,"big5");
		  BufferedReader br=new BufferedReader(isr);
		  String str=null;
		  while((str=br.readLine())!=null){
		     out.println(str+"<br>");  	  
		  }
		  
		}catch(Exception e){
		  e.printStackTrace(out);	
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
