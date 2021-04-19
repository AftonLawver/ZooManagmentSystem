/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoomanagementsystem;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

/**
 *
 * @author Afton Lawver
 */
public class ZooManagementSystem {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Check if Animals.json exists in the project directory
        // if it does, then do not create the file.
        // if it does not, then create json file and store it in the 
        // project directory as Animals.json
        createJSONFile();
        
        LoginForm lf = new LoginForm();
        lf.setLocationRelativeTo(null);
        lf.setVisible(true);
        
           
    }
    
    // Method that will create JSON file
    public static void createJSONFile() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name", "Zebra");
        jsonObject.put("Enclosure", 1);
        jsonObject.put("Food", "Grass");
        jsonObject.put("How Much", 1);
        jsonObject.put("Food Left", 16);
        jsonObject.put("Family", "Mammal");
        jsonObject.put("Nutrition", "Herbivore");
        
        try {
            FileWriter file = new FileWriter("Animals.json");
            file.write(jsonObject.toString());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("JSON file created: "+ jsonObject);
        
    }
    
    
    
}


