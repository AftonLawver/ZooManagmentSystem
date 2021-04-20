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
public class Toucan extends SuperAnimals{
    
    /**
     * Toucan constructor class
     * @param enclosure
     * @param name
     * @param family
     * @param animals
     * @param food 
     */
    public Toucan(int enclosure, String name, String family, int animals, int food){
        //needs to extend the super class
        super(enclosure, name, family, animals, food);  
        
        //declare specific animal characteristics
        enclosure = 18;      //random number - fix later
        name = "Toucan";
        family = "Bird";
        animals = 7;
        food = 250;         //pounds of food in inventory?
    }
    
}
