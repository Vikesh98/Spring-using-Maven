package com.vikesh.MavenDemo;

import java.applet.AppletContext;
import java.io.ObjectInputStream.GetField;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        InvitingYou obj=(InvitingYou) context.getBean("invite");
        obj.welcome();
    }
}
