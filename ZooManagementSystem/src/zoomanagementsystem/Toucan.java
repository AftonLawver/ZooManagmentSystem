/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoomanagementsystem;

/**
 *
 * @author fenri
 */
public class Toucan extends SuperAnimals{
    
    public Toucan() {
        super.setEnclosure(14);
        super.setName("Toucan");
        super.setFamily("Bird");
        super.setFoodLeft(12);
        super.setNumOfAnimals(5);
        super.setFeedingAmount(1);
        super.setTypeOfFood("Pellet feed");
        super.setImage("Images/toucan.png");
    }
    
}
