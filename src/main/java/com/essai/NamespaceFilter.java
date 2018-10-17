package com.essai;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.google.appengine.api.NamespaceManager;

@WebFilter(
		urlPatterns = "/*"
)
public class NamespaceFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		if(NamespaceManager.get().equals("")) {
			//String nameSpace = NamespaceManager.getGoogleAppsNamespace();
			String nameSpace = request.getParameter("nameSpace");
			NamespaceManager.set(nameSpace);
		}
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
