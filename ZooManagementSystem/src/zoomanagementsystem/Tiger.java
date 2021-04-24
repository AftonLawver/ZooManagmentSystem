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
public class Tiger extends SuperAnimals{
    
    public Tiger() {
        super.setEnclosure(2);
        super.setName("Tiger");
        super.setFamily("Mammal");
        super.setFoodLeft(3);
        super.setNumOfAnimals(3);
        super.setFeedingAmount(1);
        super.setTypeOfFood("Antelope Meat");
        super.setImage("Images/tiger.png");
    }
    
}
