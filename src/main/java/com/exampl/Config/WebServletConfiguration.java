package com.exampl.Config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebServletConfiguration implements WebApplicationInitializer {
	
	private final String configLocation ="com.exampl.config"; 

	public void onStartup(ServletContext ctx) throws ServletException {
		AnnotationConfigWebApplicationContext webCtx = getContext(ctx);	
		setServletToServletContext(ctx,webCtx);
		ctx.addListener(new ContextLoaderListener(webCtx));
	}
	
	private AnnotationConfigWebApplicationContext getContext(ServletContext ctx){
		AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
		webCtx.setServletContext(ctx);
		webCtx.setConfigLocation(configLocation);
		return webCtx;
	}
	
	private void setServletToServletContext(ServletContext ctx,AnnotationConfigWebApplicationContext webCtx){
		ServletRegistration.Dynamic servlet = ctx.addServlet("dispatcher", new DispatcherServlet(webCtx));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}
}