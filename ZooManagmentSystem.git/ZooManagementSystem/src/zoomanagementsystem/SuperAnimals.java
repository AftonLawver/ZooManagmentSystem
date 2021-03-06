/**
 * Super Animals class is the super class for 
 * animal attributes
 */
package zoomanagementsystem;

/**
 * @author Faith Enrietto
 * 04-16-21
 * version 1
 */
public class SuperAnimals {
    private int enclosure;      //number of animal's enclosure
    private String name;        //basic name of animal
    private String family;      //what class the animal belongs to, i.e. mammal
    private int numOfAnimals;   //the number of animals the zoo has
    private int food;        //inventory of animal's food
  
  /**
   * Constructor for SuperAnimal class
   * @param enclos number of the animal enclosure
   * @param name animal name
   * @param family animal's class, i.e. reptile
   * @param animals the number of that animal the zoo has
   * @param food the amount of food the animal has
   */
  public SuperAnimals(int enclos, String name, String family, int animals, int food){
      this.enclosure = enclos;
      this.name = name;
      this.family = family;
      this.numOfAnimals = animals;
      this.food = food;
  }

  /**
   * Accessor method for enclosure number
   * @return number of enclosure
   */
    public int getEnclosure() {
        return enclosure;
    }

    /**
     * Accessor method for animal name
     * @return String animal's name
     */
    public String getName() {
        return name;
    }

    /**
     * Accessor for animal's class
     * @return String family value
     */
    public String getFamily() {
        return family;
    }

    /**
     * Accessore for the number of a certain animal
     * @return number of animals
     */
    public int getNumOfAnimals() {
        return numOfAnimals;
    }

    /**
     * Acessor for the int amount of food an animal has in stock
     * @return number of food
     */
    public int getFood() {
        return food;
    }

    /**
     * Mutator for animal enclosure number
     * @param enclosure the number of the enclosure
     */
    public void setEnclosure(int enclosure) {
        this.enclosure = enclosure;
    }

    /**
     * Mutator for the animal's name
     * @param name becomes the animal name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Mutator for animal's family, i.e. class (bird, amphibian)
     * @param family String value of the animal family
     */
    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * Mutator for the number of animals in the zoo
     * @param numOfAnimals the integer amount of animals
     */
    public void setNumOfAnimals(int numOfAnimals) {
        this.numOfAnimals = numOfAnimals;
    }

    /**
     * Mutator for the amount food
     * @param food integer value for food
     */
    public void setFood(int food) {
        this.food = food;
    }
    
  
  
}
