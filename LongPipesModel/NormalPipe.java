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
public class NormalPipe extends Pipe{
    
    private int quantity;
    
    public NormalPipe(double pLength, double pDiameter, int pGrade, boolean pChemicalResist,
            int pColours, int pQuantity){
        
        super(pLength, pDiameter, pGrade, pChemicalResist, pColours);
        super.setPrice(calculatePrice());
        quantity = pQuantity;
        
    }
    
    public int getQuantity(){
        return this.quantity;
    }

    public double calculatePrice(){
        
        double baseCost = this.calculateBaseCost();
        double additionalCost = this.getColourPrice();
        
        if(super.isChemicalResist()) return baseCost*(additionalCost+.14);
        
        if(additionalCost == 0.0) return baseCost;
        
        return baseCost * additionalCost;
    }
    
    public double getColourPrice(){
            switch(super.getColours()){
                case 0: return 1;
                case 1: return 1.12;
                case 2: return 1.16;
                default: return 0;
            }
            
    }
    
    public double getTotalPrice(){
        return this.getPrice()*this.getQuantity();
    }
    
}
