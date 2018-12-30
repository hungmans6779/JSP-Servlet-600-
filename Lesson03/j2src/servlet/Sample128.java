package servlet;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sample128 extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public Sample128() {
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
		
		
		try{
		  String targetFile="new.txt";
		  
	      String path=getServletContext().getRealPath("/WEB-INF/Samle128.zip");	
	      FileOutputStream fos=new FileOutputStream(path);
	      ZipOutputStream zout=new ZipOutputStream(fos);
	      
	      ByteArrayOutputStream byteout=new ByteArrayOutputStream();
	      OutputStreamWriter write=new OutputStreamWriter(byteout);
	      write.write("進行 ZIP 壓縮 \n");
	      write.write("這是第一行 \n");
	      write.write("結 束。");
	      write.close();
	      
	      
	      byte [] data=byteout.toByteArray();
	      byteout.close();
	      ZipEntry entry=new ZipEntry(targetFile);
	      zout.putNextEntry(entry);
	      zout.write(data,0,data.length);
	      zout.closeEntry();
	      zout.close();
	      out.println("已壓縮檔案 "+targetFile+"至 ZIP檔案 "+path);
	      
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
