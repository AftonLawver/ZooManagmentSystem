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
public class Rhino extends SuperAnimals{
    
     public Rhino() {
        super.setEnclosure(12);
        super.setName("Rhinoceros");
        super.setFamily("Mammal");
        super.setFoodLeft(35);
        super.setNumOfAnimals(3);
        super.setFeedingAmount(4);
        super.setTypeOfFood("Hay");
        super.setImage("rhinoceros.png");
    }
    
}
