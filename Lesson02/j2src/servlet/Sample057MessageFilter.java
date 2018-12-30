package servlet;

import java.io.IOException;


import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sample057MessageFilter implements Filter {


	public void destroy() {	
	}


	public void init(FilterConfig config){
	}
	
	
    public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain)
      throws ServletException,IOException{

      response.setCharacterEncoding("UTF-8");
      request.setCharacterEncoding("UTF-8");

      response.setContentType("text/html;charset=UTF-8");
      //PrintWriter out=((HttpServletResponse)response).getWriter();
      PrintWriter out=response.getWriter();
      Date today=new Date();
      out.println(today);
      out.println("<br>");
      chain.doFilter(request, response);
      
    }


    
}
