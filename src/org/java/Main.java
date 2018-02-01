/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java;

import java.util.Locale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Hardik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Triangle t = (Triangle) context.getBean("tri");
//        t.display();
        
        System.out.println("Message from main method .:"+context.getMessage("msg", null, "default msg", Locale.ENGLISH));
    }

}
