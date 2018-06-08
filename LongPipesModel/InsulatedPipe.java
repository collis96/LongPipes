/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LongPipesModel;

/**
 *
 * @author user
 */
public class InsulatedPipe extends NormalPipe {
    
    private boolean insulation;
    
    public InsulatedPipe(double pLength, double pDiameter, int pGrade, boolean pChemicalResist,
            int pColours, int pQuantity, boolean pInsulation){
        
        super(pLength, pDiameter, pGrade, pChemicalResist, pColours, pQuantity);
        insulation = pInsulation;
        
        if(this instanceof InsulatedPipe) super.setPrice(this.calculatePrice());
        
    }
    
    public double calculatePrice(){
        //returns chemical cost + insulated cost + base price, otherwise,
        //returns the base price only
        double baseCost = this.calculateBaseCost();
        
        if(this instanceof InsulatedPipe){
            
            double additionalCost = super.getColourPrice();
            
            if(super.isChemicalResist()){
                additionalCost += .27; //insul+chem
            } else additionalCost += .13; //insul only
            
            return baseCost * additionalCost;
            
            
        } else {
            System.out.println("Insulated Pipe: " + baseCost);
            return baseCost;
        }
    }
    
}
