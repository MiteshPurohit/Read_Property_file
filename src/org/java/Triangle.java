/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java;

import java.util.Locale;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 *
 * @author Hardik
 */
public class Triangle {
   
    private Point pointA;
    private Point pointB;
    private Point pointC;
    
    private ResourceBundleMessageSource rbm;

    public ResourceBundleMessageSource getRbm() {
        return rbm;
    }

    public void setRbm(ResourceBundleMessageSource rbm) {
        this.rbm = rbm;
    }
    
    

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
    
    
    
    public void display(){
        
        System.out.println("Point - A :"+getRbm().getMessage("point", new Object[]{getPointA().getX(),getPointA().getY()}, "Default point - A", Locale.ENGLISH));
        System.out.println("Point - B :"+getRbm().getMessage("point", new Object[]{getPointB().getX(),getPointB().getY()}, "Default point - B", Locale.ENGLISH));
        System.out.println("Point - C :"+getRbm().getMessage("point", new Object[]{getPointC().getX(),getPointC().getY()}, "Default point - C", Locale.ENGLISH));
    }
}
