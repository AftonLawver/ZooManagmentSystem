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
public class Panda extends SuperAnimals{
    
    public Panda() {
        super.setEnclosure(3);
        super.setName("Panda");
        super.setFamily("Mammal");
        super.setFoodLeft(8);
        super.setNumOfAnimals(3);
        super.setFeedingAmount(1);
        super.setTypeOfFood("Bamboo Shoots");
        super.setImage("Images/panda-bear.png");
        
    }
    
}
