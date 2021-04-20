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
public class Penguin extends SuperAnimals{
    
    /**
     * Penguin constructor class
     * @param enclosure
     * @param name
     * @param family
     * @param animals
     * @param food 
     */
    public Penguin(int enclosure, String name, String family, int animals, int food){
        //needs to extend the super class
        super(enclosure, name, family, animals, food);  
        
        //declare specific animal characteristics
        enclosure = 14;      //random number - fix later
        name = "Penguin";
        family = "Bird";
        animals = 29;
        food = 1140;         //pounds of food in inventory?
    }
    
}
