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
public class Cheetah extends SuperAnimals{
    
    public Cheetah() {
        super.setEnclosure(8);
        super.setName("Cheetah");
        super.setFamily("Mammal");
        super.setFoodLeft(1);
        super.setNumOfAnimals(2);
        super.setFeedingAmount(1);
        super.setTypeOfFood("Antelope");
        super.setImage("cheetah.png");
    }
    
}
