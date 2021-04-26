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
public class Peacock extends SuperAnimals{

    
     public Peacock() {
        super.setEnclosure(8);
        super.setName("Peacock");
        super.setFamily("Bird");
        super.setFoodLeft(9);
        super.setNumOfAnimals(8);
        super.setFeedingAmount(1);
        super.setTypeOfFood("Grain");
        super.setImage("peacock.png");
    }
}

