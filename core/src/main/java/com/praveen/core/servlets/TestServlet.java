package com.praveen.core.servlets;

import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;

import javax.servlet.Servlet;

@Component(service = Servlet.class)
public class TestServlet extends SlingSafeMethodsServlet {

}
