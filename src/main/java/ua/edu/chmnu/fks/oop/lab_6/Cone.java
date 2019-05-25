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
public class Cone extends Figure {

    protected double volume = 30;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void descriptionOfFigure() {
        super.descriptionOfFigure();
        System.out.println("| The volume is: " + volume);
    }
}
