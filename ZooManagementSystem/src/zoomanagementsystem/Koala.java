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
public class Koala extends SuperAnimals{
    
    public Koala() {
        super.setEnclosure(16);
        super.setName("Koala");
        super.setFamily("Mammal");
        super.setFoodLeft(12);
        super.setNumOfAnimals(3);
        super.setFeedingAmount(1);
        super.setTypeOfFood("Eucalyptus Leaves");
        super.setImage("koala_1.png");
    }
    
}
