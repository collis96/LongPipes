package LongPipesModel;
import java.lang.Math;
/**
 *
 * @author up795987
 */
public abstract class Pipe {
  
  private double length; //Pipe length in !METRES!
  private double diameter;
  private double radius;
  private int grade;
  private boolean chemicalResist;
  private int colours;
  private double price;
  
  //basic constructor
  public Pipe(){
  }
  
  public Pipe(double pLength, double pDiameter, int pGrade, boolean pChemResist, int pColours){
      
      length = pLength;
      diameter = pDiameter;
      radius = diameter /2;
      grade = pGrade;
      chemicalResist = pChemResist;
      colours = pColours;

  }
  
    public boolean isChemicalResist() {
        return chemicalResist;
    }

    public int getColours() {
        return colours;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double calculateBaseCost(){

        double[] gradePrices = {0.4,0.6,0.75,0.8,0.95}; 
        double totalVolume, innerVolume, outerVolume, lengthInches, baseCost;
        
        
        lengthInches = this.length * 39.37;
        
        totalVolume =  Math.PI * (radius * radius) * lengthInches; //Calculate whole volume


        innerVolume = Math.PI * ((radius * .9) * (radius * .9)) * lengthInches; //Calculate whole volume
     
        
        outerVolume = totalVolume - innerVolume;
        
        baseCost = outerVolume * gradePrices[this.grade - 1];
        
        return baseCost;
}
    public abstract double calculatePrice();

    public abstract double getTotalPrice();
  
}
