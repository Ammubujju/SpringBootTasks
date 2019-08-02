/*
package com.stackroute.config;

import org.apache.catalina.servlets.WebdavServlet;
import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration
{
    // Creating object for using bean annotation
    @Bean
    ServletRegistrationBean h2servletRegistration()
    {
        ServletRegistrationBean registrationBean=new ServletRegistrationBean(new WebServlet());
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }

}
*/
