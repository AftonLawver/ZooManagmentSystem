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
public class Penguin extends SuperAnimals{
    
   public Penguin() {
        super.setEnclosure(10);
        super.setName("Penguin");
        super.setFamily("Bird");
        super.setFoodLeft(7);
        super.setNumOfAnimals(9);
        super.setFeedingAmount(1);
        super.setTypeOfFood("Fish");
    }
}
