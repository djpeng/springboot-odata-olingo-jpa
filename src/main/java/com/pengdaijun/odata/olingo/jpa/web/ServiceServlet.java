package com.pengdaijun.odata.olingo.jpa.web;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import org.apache.cxf.jaxrs.servlet.CXFNonSpringJaxrsServlet;

@WebServlet(urlPatterns = { "/odata/*" }, loadOnStartup = 1, initParams = {
		@WebInitParam(name = "javax.ws.rs.Application", value = "org.apache.olingo.odata2.core.rest.app.ODataApplication"),
		@WebInitParam(name = "org.apache.olingo.odata2.service.factory", value = "org.apache.olingo.sample.annotation.processor.AnnotationSampleServiceFactory") })
public class ServiceServlet extends CXFNonSpringJaxrsServlet {

}
