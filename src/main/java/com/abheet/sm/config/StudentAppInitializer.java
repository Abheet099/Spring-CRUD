package com.abheet.sm.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		Class[] config = { StudentConfig.class };
		
		return config;
	}

	@Override
	protected String[] getServletMappings() {
		String[] mapping = {"/"};
		
		return mapping;
	}
	
	

}
