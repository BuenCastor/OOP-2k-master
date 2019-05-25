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
public class Figure {

    protected int areasurface = 12;

   
 
    public int Areasurface() {
        return areasurface;
    }

    public void setAreasurface(int areasurface) {
        this.areasurface = areasurface;
    }

   
    
    public void descriptionOfFigure() {
    System.out.println("---------------------------------");
    System.out.println("| Areasurface: " + areasurface);

    }

}
