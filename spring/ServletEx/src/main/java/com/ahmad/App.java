package com.ahmad;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException, IOException
    {
        System.out.println( "Main!" );

        // run tomcat
        Tomcat tomcat=new Tomcat();
        tomcat.setPort( 8080 );

        Context context=tomcat.addContext( "", null );
        tomcat.addServlet(context, "h1", new HelloServlet());
        context.addServletMappingDecoded( "/hello", "h1" );

        tomcat.start();
        tomcat.getServer().await();
    }
}
