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
public class Iguana extends SuperAnimals{
    
    public Iguana() {
        super.setEnclosure(4);
        super.setName("Iguana");
        super.setFamily("Reptile");
        super.setFoodLeft(30);
        super.setNumOfAnimals(4);
        super.setFeedingAmount(1);
        super.setTypeOfFood("Leafy Greens");
    }
    
}
