package servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Sample061IPFilter implements Filter {

	ServletContext context = null;
    String permission="";
	
	public void init(FilterConfig config) throws ServletException {
		permission=config.getInitParameter("permission");
		context = config.getServletContext();
	}

	
	
	public void destroy() {
		// TODO Auto-generated method stub
		context = null;
	}

	
	
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		String remoteAddr = request.getRemoteAddr();
		context.log("permission = "+permission+",remoteAddr = "+remoteAddr);
		if(permission.startsWith(remoteAddr)) {
			context.log("ok");
			chain.doFilter(request, response);
		} else {
			context.log("error");
			RequestDispatcher rd = request.getRequestDispatcher("/servlet/Sample061Forbidden");
			rd.forward(request, response);
		}

	}

}
