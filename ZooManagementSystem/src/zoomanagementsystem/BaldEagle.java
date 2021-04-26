/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoomanagementsystem;

import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author beanrenee
 */
public class BaldEagle extends SuperAnimals{
    
    
    
    public BaldEagle() {
        super.setEnclosure(7);
        super.setName("Bald Eagle");
        super.setFamily("Bird");
        super.setFoodLeft(0);
        super.setNumOfAnimals(1);
        super.setFeedingAmount(1);
        super.setTypeOfFood("Small Fish");
        super.setImage("eagle.png");
    }
    
}
