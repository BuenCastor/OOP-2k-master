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
public class Cylinder extends Figure {

    protected int basearea = 5;

    public int Area() {
        return basearea;
    }

    public void setArea(int basearea) {
        this.basearea = basearea;
    }

    public void descriptionOfFigure() {
        super.descriptionOfFigure();
        System.out.println("| Base area: " + basearea);
    }

}
