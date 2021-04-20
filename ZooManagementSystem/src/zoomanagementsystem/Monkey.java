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
public class Monkey extends SuperAnimals{
    
    /**
     * Monkey constructor class
     * @param enclosure
     * @param name
     * @param family
     * @param animals
     * @param food 
     */
    public Monkey(int enclosure, String name, String family, int animals, int food){
        //needs to extend the super class
        super(enclosure, name, family, animals, food);  
        
        //declare specific animal characteristics
        enclosure = 10;      //random number - fix later
        name = "Monkey";
        family = "Mammal";
        animals = 27;
        food = 580;         //pounds of food in inventory?
    }
    
}
