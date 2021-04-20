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
    /**
     * Elephant constructor class
     * @param enclosure
     * @param name
     * @param family
     * @param animals
     * @param food 
    */ 
    public Elephant(int enclosure, String name, String family, int animals, int food){
        //needs to extend the super class
        super(enclosure, name, family, animals, food);  
        
        enclosure = 8;
        name = "Elephant";
        family = "Mammals";
        animals = 9;
        food = 5200;        //pounds of food elephants could collectively eat in a day
    }
}
