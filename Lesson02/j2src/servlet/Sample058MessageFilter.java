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

public class Sample058MessageFilter implements Filter {

	ServletContext context = null;

	public void init(FilterConfig config) throws ServletException {
		// TODO Auto-generated method stub
		context = config.getServletContext();
	}

	public void destroy() {
		// TODO Auto-generated method stub
		context = null;
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");

		response.setContentType("text/html;charset=UTF-8");

		Integer count = (Integer) context.getAttribute("count");
		if (count == null) {
			count = new Integer(0);
		}

		int n = count.intValue() + 1;
		context.setAttribute("count", new Integer(n));
		PrintWriter out = response.getWriter();
		out.println("<b>You have visited " + n + " times</b><p>");

		chain.doFilter(request, response);

	}

}
