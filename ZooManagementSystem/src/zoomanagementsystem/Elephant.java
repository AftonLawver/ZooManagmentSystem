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
public class Elephant extends SuperAnimals{
    
     // Elephant constructor class


     public Elephant() {
        super.setEnclosure(2);
        super.setName("Elephant");
        super.setFamily("Mammal");
        super.setFoodLeft(25);
        super.setNumOfAnimals(6);
        super.setFeedingAmount(2);
        super.setTypeOfFood("Hay");
        super.setImage("elephant.png");
    }
}
      