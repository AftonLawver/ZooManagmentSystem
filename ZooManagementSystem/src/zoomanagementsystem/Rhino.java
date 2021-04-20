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
public class Rhino extends SuperAnimals{
    
    /**
     * Rhino constructor class
     * @param enclosure
     * @param name
     * @param family
     * @param animals
     * @param food 
     */
    public Rhino(int enclosure, String name, String family, int animals, int food){
        //needs to extend the super class
        super(enclosure, name, family, animals, food);  
        
        //declare specific animal characteristics
        enclosure = 16;      //random number - fix later
        name = "Rhinoceros";
        family = "Mammal";
        animals = 6;
        food = 2400;         //pounds of food in inventory?
    }
    
}
