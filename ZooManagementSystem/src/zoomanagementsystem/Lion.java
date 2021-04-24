/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoomanagementsystem;

/**
 *
 * @author beanrenee
 */
public class Lion extends SuperAnimals {
    
    public Lion () {
    
        super.setEnclosure(1);
        super.setName("Lion");
        super.setFamily("Mammal");
        super.setFoodLeft(3);
        super.setNumOfAnimals(4);
        super.setFeedingAmount(1);
        super.setTypeOfFood("Lean Meat");
        super.setImage("Images/lion.png");
        
    }
    
}
