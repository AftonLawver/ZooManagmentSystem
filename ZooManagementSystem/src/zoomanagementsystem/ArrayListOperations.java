/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoomanagementsystem;

import java.util.ArrayList;

/**
 *
 * @author lawve
 */
public class ArrayListOperations {
    ArrayList<String> animals;
    //--------------------------------------------------------------------------
    // Constructor
    //--------------------------------------------------------------------------
    public ArrayListOperations() {
       ArrayList<String> animals; 
    }
   
    // Create initial list of animals in the zoo
    public ArrayList createArrayList() {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Panda");
        animals.add("Iguana");
        animals.add("Flamingo");
        animals.add("Shark");
        animals.add("Bald Eagle");
        animals.add("Cheetah");
        animals.add("Giraffe");
        animals.add("Elephant");
        animals.add("Rhinoceros");
        animals.add("Penguin");
        animals.add("Peacock");
        animals.add("Toucan");
        animals.add("Monkey");
        animals.add("Koala");
        return animals;
    }
    
    // Convert the arraylist to a string that is separated (one on each line)
    public String stringArrayList() {
        StringBuilder sb = new StringBuilder();
        for (String s : animals) {
            sb.append(s);
            sb.append("\n");
        }
        String str = sb.toString();
        System.out.println(str);
        return str;
        
        
    }
    
    // Only supervisors can add an animal to the current list of animals.
    // For example, if the zoo buys a new animal, add it to the list. 
    public void addElementToArrayList(String animal) {
        
    }
}
