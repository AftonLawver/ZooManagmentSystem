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
public class Shark extends SuperAnimals{
    
    public Shark() {
        super.setEnclosure(6);
        super.setName("Shark");
        super.setFamily("Fish");
        super.setFoodLeft(9);
        super.setNumOfAnimals(6);
        super.setFeedingAmount(1);
        super.setTypeOfFood("Small Fish");
        super.setImage("Images/shark.png");
    }
    
}
