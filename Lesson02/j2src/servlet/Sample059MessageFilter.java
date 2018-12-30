package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Sample059MessageFilter implements Filter {

	ServletContext context = null;

	public void destroy() {
		// TODO Auto-generated method stub
		context = null;
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub

		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out=response.getWriter();
		
		long startTime = System.currentTimeMillis();

		chain.doFilter(request, response);
		long finishTime = System.currentTimeMillis();
		context.log("log 訊息 Sample059的執行時間 = " + (finishTime - startTime) + ".ms");
	}

	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
		context = config.getServletContext();
	}

}
