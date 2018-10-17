/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author ACTIF
 */

public class SpringClass {
   
     private static  ApplicationContext context;
    static{
        context = new ClassPathXmlApplicationContext("spring.xml");
    }
    public static ApplicationContext getContext(){
        return context;
    }
    
    
}
