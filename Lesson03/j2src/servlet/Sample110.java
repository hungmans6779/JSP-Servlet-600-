package servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sample110 extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Sample110() {
		super();
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
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
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		response.setContentType("text/html;charset=UTF-8");

		File f = new File("C:/Program Files/Apache Tomcat/Apache Tomcat 6.0.32/webapps/Lesson03/WEB-INF/sample106_new1.txt");
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");

		if (f.exists()) { 
			out.println(f.getName()+" �ɮצs�b�I�I�I<br>");
			out.println("�ɮפj�p�� " + f.length() + " �줸��<br>");
			String prop1 = f.canRead() ? "�iŪ��" : "���iŪ��";
			String prop2 = f.canWrite() ? "�i�g�J" : "���i�g�J";
			out.println(prop1 + "<br>" + prop2 + "<br>");
			out.println("<h2> �̫�ק�ɶ�:" + new Date(f.lastModified()) + "<br>");
		} else {
			if (f.createNewFile()) {
				out.println(f.getPath() + " �w�إߡI<br>");
			} else {
				out.println(f.getPath() +"�ɮ׫إߥ��ѡI�I�I");
			}
			
			File f1=File.createTempFile("sample106_Temp1.txt",".txt");
			if(f1.exists()){
				out.println(f1.getPath() + " �w�إߡI<br>");
			}else{
				out.println(f1.getPath() +"�ɮ׫إߥ��ѡI�I�I");
			}
			
		}

		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
