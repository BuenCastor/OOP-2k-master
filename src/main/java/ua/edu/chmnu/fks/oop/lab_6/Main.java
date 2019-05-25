/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab_6;


/**
 *
 * @author ARTEM
 */
public class Main {
    public static void main(String[] args){
       
        Cylinder cl = new Cylinder();
        Cone cone = new Cone();
        
        cl.Areasurface();
        cl.setArea(12);
        cl.descriptionOfFigure();
        
        
        cone.Areasurface();
        cone.setVolume(12);
        cone.descriptionOfFigure();
        
        
       
        
      
    }
}
