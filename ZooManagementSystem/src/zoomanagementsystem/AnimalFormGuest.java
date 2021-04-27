/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoomanagementsystem;
import java.awt.Color;
import java.util.List;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;




/**
 *
 * @author SIU851463587
 */
public class AnimalFormGuest extends javax.swing.JFrame {
    
    SuperAnimals myAnimal;
    SuperAnimals myAnimalToCompare;
    public static Integer mappingValue;
    Map familyMap;
    ArrayList listOfSimilarAnimals;
    String animalName;
    
    
    
    /**
     * Creates new form AnimalForm
     */
    // Constructor takes in a parameter called mappingValue
    // This is what will be used in the switch statement to create an 
    // SuperAnimal object of whatever class matches the mappingValue.
    public AnimalFormGuest(int mappingValue) throws IOException {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("zoo.png")));
        createObjectAnimal(mappingValue);
        setAttributes();
        familyMap = createFamilyMap();
        listOfSimilarAnimals = iterateHashMap();
        displaySimilarAnimals();
    }

    
    public void setAttributes() {
        String animalName = myAnimal.getName();
        titleLabel.setText(animalName); 
        
        String animalFamily = myAnimal.getFamily();
        familyLabelForAnimal.setText(animalFamily);
        
        int animalEnclosure = myAnimal.getEnclosure();
        String animalEnclosureString = String.valueOf(animalEnclosure);
        enclosureNumberLabelForAnimal.setText(animalEnclosureString);
        
        int numberOfAnimals = myAnimal.getNumOfAnimals();
        String numberOfAnimalsString = String.valueOf(numberOfAnimals);
        numberOfAnimalsLabelForAnimal.setText(numberOfAnimalsString);
        
        String animalFood = myAnimal.getTypeOfFood();
        foodLabelForAnimal.setText(animalFood);
        
        int feedingAmount = myAnimal.getFeedingAmount();
        String feedingAmountString = String.valueOf(feedingAmount);
        feedingAmountLabelForAnimal.setText(feedingAmountString);
        
        int foodLeft = myAnimal.getFoodLeft();
        String foodInInventory = String.valueOf(foodLeft);
        foodInInventoryForAnimal.setText(foodInInventory);
        
        ImageIcon animalIcon = myAnimal.getImage();
        pictureArea.setIcon(animalIcon);
    }
    
    public SuperAnimals createObjectAnimal(int mappingValue) throws IOException {

        switch(mappingValue) {
            case 1: myAnimal = new Lion();
                break;
            case 2: myAnimal = new Tiger();
                break;
            case 3: myAnimal = new Panda();
                break;
            case 4: myAnimal = new Iguana();
                break;
            case 5: myAnimal = new Flamingo();
                break;
            case 6: myAnimal = new Shark();
                break;
            case 7: myAnimal = new BaldEagle();
                break;
            case 8: myAnimal = new Cheetah();
                break;
            case 9: myAnimal = new Giraffe();
                break;
            case 10: myAnimal = new Elephant();
                break;
            case 11: myAnimal = new Rhino();
                break;
            case 12: myAnimal = new Penguin();
                break;
            case 13: myAnimal = new Peacock();
                break;
            case 14: myAnimal = new Toucan();
                break;
            case 15: myAnimal = new Monkey();
                break;
            case 16: myAnimal = new Koala();   

        }     
        return myAnimal;
    }
    
    public Map createFamilyMap() {
        Map<String, String> familyMap = new HashMap<String, String>();
        familyMap.put("Lion","Mammal");
        familyMap.put("Bald Eagle", "Bird");
        familyMap.put("Cheetah", "Mammal");
        familyMap.put("Elephant", "Mammal");
        familyMap.put("Flamingo", "Bird");
        familyMap.put("Giraffe", "Mammal");
        familyMap.put("Iguana", "Reptile");
        familyMap.put("Koala", "Mammal");
        familyMap.put("Monkey", "Mammal");
        familyMap.put("Panda", "Mammal");
        familyMap.put("Peacock", "Bird");
        familyMap.put("Penguin", "Bird");
        familyMap.put("Rhinoceros", "Mammal");
        familyMap.put("Shark", "Fish");
        familyMap.put("Tiger", "Mammal");
        familyMap.put("Toucan", "Bird");
        return familyMap;
        
    }
    
    public void displaySimilarAnimals() {
        String name = myAnimal.getName();
        listOfSimilarAnimals.remove(name);
        List<String> animalListStrings;
        animalListStrings = new ArrayList<>();
        if(listOfSimilarAnimals.isEmpty()) {
            
            similarAnimalsLabel.setText("No similar animals at this zoo currently.");
        }
        
        for(int x = 0; x<listOfSimilarAnimals.size(); x++) {
             Object element = listOfSimilarAnimals.get(x);
             String elementFinal = element.toString();
             animalListStrings.add(elementFinal);
        }
        
        int listOfSimilarAnimalsSize = listOfSimilarAnimals.size();
        
        switch(listOfSimilarAnimalsSize) {
            case 1: animalLabel1.setText(animalListStrings.get(0));
                    break;
            case 2: animalLabel1.setText(animalListStrings.get(0));
                    animalLabel2.setText(animalListStrings.get(1));
                    break;
            case 3: animalLabel1.setText(animalListStrings.get(0));
                    animalLabel2.setText(animalListStrings.get(1));
                    animalLabel3.setText(animalListStrings.get(2));
                break;
            case 4: animalLabel1.setText(animalListStrings.get(0));
                    animalLabel2.setText(animalListStrings.get(1));
                    animalLabel3.setText(animalListStrings.get(2));
                    animalLabel4.setText(animalListStrings.get(3));
                break;
            case 5: 
                    
                break;
            case 6: animalLabel1.setText(animalListStrings.get(0));
                    animalLabel2.setText(animalListStrings.get(1));
                    animalLabel3.setText(animalListStrings.get(2));
                    animalLabel4.setText(animalListStrings.get(3));
                    animalLabel4.setText(animalListStrings.get(4));
                    animalLabel5.setText(animalListStrings.get(5));
                    
                break;
            case 7: animalLabel1.setText(animalListStrings.get(0));
                    animalLabel2.setText(animalListStrings.get(1));
                    animalLabel3.setText(animalListStrings.get(2));
                    animalLabel4.setText(animalListStrings.get(3));
                    animalLabel4.setText(animalListStrings.get(4));
                    animalLabel5.setText(animalListStrings.get(5));
                    animalLabel6.setText(animalListStrings.get(6));
                    
                break;
            case 8: animalLabel1.setText(animalListStrings.get(0));
                    animalLabel2.setText(animalListStrings.get(1));
                    animalLabel3.setText(animalListStrings.get(2));
                    animalLabel4.setText(animalListStrings.get(3));
                    animalLabel5.setText(animalListStrings.get(4));
                    animalLabel6.setText(animalListStrings.get(5));
                    animalLabel7.setText(animalListStrings.get(6));
                    animalLabel8.setText(animalListStrings.get(7));
                    
                break;
         

        }
          
        
    }
    
    
            
    
    
    
    public ArrayList iterateHashMap() {
        String family = myAnimal.getFamily();
        ArrayList myList = new ArrayList();
        
        for (Object key : familyMap.keySet()) 
        {
            if ( familyMap.get(key).equals(family))
            {
                myList.add(key);
                
            }
            
        }
        return myList;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        familyLabel = new javax.swing.JLabel();
        numberOfAnimalLabel = new javax.swing.JLabel();
        familyLabelForAnimal = new javax.swing.JLabel();
        enclosureNumberLabel = new javax.swing.JLabel();
        enclosureNumberLabelForAnimal = new javax.swing.JLabel();
        foodLabel = new javax.swing.JLabel();
        feedingAmountLabel = new javax.swing.JLabel();
        foodInInventoryLabel = new javax.swing.JLabel();
        numberOfAnimalsLabelForAnimal = new javax.swing.JLabel();
        feedingAmountLabelForAnimal = new javax.swing.JLabel();
        foodLabelForAnimal = new javax.swing.JLabel();
        foodInInventoryForAnimal = new javax.swing.JLabel();
        similarAnimalsLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pictureArea = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        backLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        animalLabel7 = new javax.swing.JLabel();
        animalLabel2 = new javax.swing.JLabel();
        animalLabel1 = new javax.swing.JLabel();
        animalLabel5 = new javax.swing.JLabel();
        animalLabel8 = new javax.swing.JLabel();
        animalLabel6 = new javax.swing.JLabel();
        animalLabel4 = new javax.swing.JLabel();
        animalLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        familyLabel.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        familyLabel.setText("Family: ");

        numberOfAnimalLabel.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        numberOfAnimalLabel.setText("Number of: ");

        familyLabelForAnimal.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N

        enclosureNumberLabel.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        enclosureNumberLabel.setText("Enclosure # ");

        enclosureNumberLabelForAnimal.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N

        foodLabel.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        foodLabel.setText("Food: ");

        feedingAmountLabel.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        feedingAmountLabel.setText("Feeding Amount: ");

        foodInInventoryLabel.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        foodInInventoryLabel.setText("Food in Inventory: ");

        numberOfAnimalsLabelForAnimal.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N

        feedingAmountLabelForAnimal.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N

        foodLabelForAnimal.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N

        foodInInventoryForAnimal.setFont(new java.awt.Font("Elephant", 0, 15)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(foodInInventoryLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(foodInInventoryForAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(feedingAmountLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(feedingAmountLabelForAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(enclosureNumberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enclosureNumberLabelForAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(familyLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(familyLabelForAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(foodLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(foodLabelForAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(numberOfAnimalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberOfAnimalsLabelForAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(familyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(familyLabelForAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enclosureNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enclosureNumberLabelForAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(numberOfAnimalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numberOfAnimalsLabelForAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(foodLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(foodLabelForAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(feedingAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(feedingAmountLabelForAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(foodInInventoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(foodInInventoryForAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        similarAnimalsLabel.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        similarAnimalsLabel.setForeground(new java.awt.Color(0, 153, 0));
        similarAnimalsLabel.setText("Similar Animals");

        titleLabel.setFont(new java.awt.Font("Elephant", 0, 38)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 51, 204));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        backLabel10.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        backLabel10.setText("<< Back");
        backLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLabel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backLabel10MouseDragged(evt);
            }
        });
        backLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backLabel10MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backLabel10)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pictureArea, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pictureArea, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(backLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        animalLabel7.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        animalLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        animalLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        animalLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                animalLabel7MouseDragged(evt);
            }
        });
        animalLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                animalLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                animalLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                animalLabel7MouseExited(evt);
            }
        });

        animalLabel2.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        animalLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        animalLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        animalLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                animalLabel2MouseDragged(evt);
            }
        });
        animalLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                animalLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                animalLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                animalLabel2MouseExited(evt);
            }
        });

        animalLabel1.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        animalLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        animalLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        animalLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                animalLabel1MouseDragged(evt);
            }
        });
        animalLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                animalLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                animalLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                animalLabel1MouseExited(evt);
            }
        });

        animalLabel5.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        animalLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        animalLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        animalLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                animalLabel5MouseDragged(evt);
            }
        });
        animalLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                animalLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                animalLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                animalLabel5MouseExited(evt);
            }
        });

        animalLabel8.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        animalLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        animalLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        animalLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                animalLabel8MouseDragged(evt);
            }
        });
        animalLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                animalLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                animalLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                animalLabel8MouseExited(evt);
            }
        });

        animalLabel6.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        animalLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        animalLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        animalLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                animalLabel6MouseDragged(evt);
            }
        });
        animalLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                animalLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                animalLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                animalLabel6MouseExited(evt);
            }
        });

        animalLabel4.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        animalLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        animalLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        animalLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                animalLabel4MouseDragged(evt);
            }
        });
        animalLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                animalLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                animalLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                animalLabel4MouseExited(evt);
            }
        });

        animalLabel3.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        animalLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        animalLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        animalLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                animalLabel3MouseDragged(evt);
            }
        });
        animalLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                animalLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                animalLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                animalLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(animalLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(animalLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(animalLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(animalLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(animalLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(animalLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(animalLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(animalLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(animalLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(animalLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(animalLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(animalLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(animalLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(animalLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(animalLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(animalLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(similarAnimalsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(similarAnimalsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabel10MouseEntered
        backLabel10.setForeground(Color.blue);
    }//GEN-LAST:event_backLabel10MouseEntered

    private void backLabel10MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabel10MouseDragged
        backLabel10.setForeground(Color.blue);
    }//GEN-LAST:event_backLabel10MouseDragged

    private void backLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabel10MouseExited
        backLabel10.setForeground(Color.black);
    }//GEN-LAST:event_backLabel10MouseExited

    private void backLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabel10MouseClicked
        dispose();
    }//GEN-LAST:event_backLabel10MouseClicked

    private void animalLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel1MouseEntered
        animalLabel1.setForeground(Color.blue);
    }//GEN-LAST:event_animalLabel1MouseEntered

    private void animalLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel1MouseDragged
        animalLabel1.setForeground(Color.blue);
    }//GEN-LAST:event_animalLabel1MouseDragged

    private void animalLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel1MouseExited
        animalLabel1.setForeground(Color.black);
    }//GEN-LAST:event_animalLabel1MouseExited

    private void animalLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel2MouseEntered
        animalLabel2.setForeground(Color.blue);
    }//GEN-LAST:event_animalLabel2MouseEntered

    private void animalLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel2MouseDragged
        animalLabel2.setForeground(Color.blue);
    }//GEN-LAST:event_animalLabel2MouseDragged

    private void animalLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel2MouseExited
        animalLabel2.setForeground(Color.black);
    }//GEN-LAST:event_animalLabel2MouseExited

    private void animalLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel3MouseEntered
        animalLabel3.setForeground(Color.blue);
    }//GEN-LAST:event_animalLabel3MouseEntered

    private void animalLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel3MouseDragged
        animalLabel3.setForeground(Color.blue);
    }//GEN-LAST:event_animalLabel3MouseDragged

    private void animalLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel3MouseExited
        animalLabel3.setForeground(Color.black);
    }//GEN-LAST:event_animalLabel3MouseExited

    private void animalLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel4MouseEntered
        animalLabel4.setForeground(Color.blue);
    }//GEN-LAST:event_animalLabel4MouseEntered

    private void animalLabel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel4MouseDragged
        animalLabel4.setForeground(Color.blue);
    }//GEN-LAST:event_animalLabel4MouseDragged

    private void animalLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel4MouseExited
        animalLabel4.setForeground(Color.black);
    }//GEN-LAST:event_animalLabel4MouseExited

    private void animalLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel5MouseEntered
        animalLabel5.setForeground(Color.blue);
    }//GEN-LAST:event_animalLabel5MouseEntered

    private void animalLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel5MouseDragged
        animalLabel5.setForeground(Color.blue);
    }//GEN-LAST:event_animalLabel5MouseDragged

    private void animalLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel5MouseExited
        animalLabel5.setForeground(Color.black);
    }//GEN-LAST:event_animalLabel5MouseExited

    private void animalLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel6MouseEntered
        animalLabel6.setForeground(Color.blue);
    }//GEN-LAST:event_animalLabel6MouseEntered

    private void animalLabel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel6MouseDragged
        animalLabel6.setForeground(Color.blue);
    }//GEN-LAST:event_animalLabel6MouseDragged

    private void animalLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel6MouseExited
        animalLabel6.setForeground(Color.black);
    }//GEN-LAST:event_animalLabel6MouseExited

    private void animalLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel7MouseEntered
        animalLabel7.setForeground(Color.blue);
    }//GEN-LAST:event_animalLabel7MouseEntered

    private void animalLabel7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel7MouseDragged
        animalLabel7.setForeground(Color.blue);
    }//GEN-LAST:event_animalLabel7MouseDragged

    private void animalLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel7MouseExited
        animalLabel7.setForeground(Color.black);
    }//GEN-LAST:event_animalLabel7MouseExited

    private void animalLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel8MouseEntered
        animalLabel8.setForeground(Color.blue);
    }//GEN-LAST:event_animalLabel8MouseEntered

    private void animalLabel8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel8MouseDragged
        animalLabel8.setForeground(Color.blue);
    }//GEN-LAST:event_animalLabel8MouseDragged

    private void animalLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel8MouseExited
        animalLabel8.setForeground(Color.black);
    }//GEN-LAST:event_animalLabel8MouseExited

    private void animalLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel1MouseClicked
        animalName = animalLabel1.getText().trim();
        dispose();
        openNewForm();
    }//GEN-LAST:event_animalLabel1MouseClicked

    private void animalLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel2MouseClicked
        animalName = animalLabel2.getText().trim();
        dispose();
        openNewForm();
    }//GEN-LAST:event_animalLabel2MouseClicked

    private void animalLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel3MouseClicked
        animalName = animalLabel3.getText().trim();
        dispose();
        openNewForm();
    }//GEN-LAST:event_animalLabel3MouseClicked

    private void animalLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel4MouseClicked
        animalName = animalLabel4.getText().trim();
        dispose();
        openNewForm();
    }//GEN-LAST:event_animalLabel4MouseClicked

    private void animalLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel5MouseClicked
        animalName = animalLabel5.getText().trim();
        dispose();
        openNewForm();
    }//GEN-LAST:event_animalLabel5MouseClicked

    private void animalLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel6MouseClicked
        animalName = animalLabel6.getText().trim();
        dispose();
        openNewForm();
    }//GEN-LAST:event_animalLabel6MouseClicked

    private void animalLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel7MouseClicked
        animalName = animalLabel7.getText().trim();
        dispose();
        openNewForm();
    }//GEN-LAST:event_animalLabel7MouseClicked

    private void animalLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_animalLabel8MouseClicked
        animalName = animalLabel8.getText().trim();
        dispose();
        openNewForm();
    }//GEN-LAST:event_animalLabel8MouseClicked

    
    public void openNewForm() {
        AnimalFormGuest afg;
        WelcomeFormGuest wfg;
        wfg = new WelcomeFormGuest();
        Map map = wfg.createMap();
        int mappingValue2 = (int) map.get(animalName);
        try {
            afg = new AnimalFormGuest(mappingValue2);
            afg.setLocationRelativeTo(null); // centers the frame in the screen
            afg.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(WelcomeFormGuest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnimalFormGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnimalFormGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnimalFormGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnimalFormGuest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AnimalFormGuest(mappingValue).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(AnimalFormGuest.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel animalLabel1;
    private javax.swing.JLabel animalLabel2;
    private javax.swing.JLabel animalLabel3;
    private javax.swing.JLabel animalLabel4;
    private javax.swing.JLabel animalLabel5;
    private javax.swing.JLabel animalLabel6;
    private javax.swing.JLabel animalLabel7;
    private javax.swing.JLabel animalLabel8;
    private javax.swing.JLabel backLabel10;
    private javax.swing.JLabel enclosureNumberLabel;
    private javax.swing.JLabel enclosureNumberLabelForAnimal;
    private javax.swing.JLabel familyLabel;
    private javax.swing.JLabel familyLabelForAnimal;
    private javax.swing.JLabel feedingAmountLabel;
    private javax.swing.JLabel feedingAmountLabelForAnimal;
    private javax.swing.JLabel foodInInventoryForAnimal;
    private javax.swing.JLabel foodInInventoryLabel;
    private javax.swing.JLabel foodLabel;
    private javax.swing.JLabel foodLabelForAnimal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel numberOfAnimalLabel;
    private javax.swing.JLabel numberOfAnimalsLabelForAnimal;
    private javax.swing.JLabel pictureArea;
    private javax.swing.JLabel similarAnimalsLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
