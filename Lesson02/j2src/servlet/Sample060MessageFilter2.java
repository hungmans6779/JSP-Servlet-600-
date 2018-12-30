package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Sample060MessageFilter2 implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out=response.getWriter();
		
		out.println("Sample060MessageFilter2...<br>");
		chain.doFilter(request,response);	
	}
	
	

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
