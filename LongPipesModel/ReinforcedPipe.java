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
public class ReinforcedPipe extends InsulatedPipe{
    
    private boolean reinforcement;

    public ReinforcedPipe(double pLength, double pDiameter, int pGrade, boolean pChemicalResist,
        int pColours, int pQuantity, boolean pInsulation, boolean pReinforcement){

        super(pLength, pDiameter, pGrade, pChemicalResist, pColours, pQuantity, pInsulation);
        reinforcement = pReinforcement;
        if(this instanceof ReinforcedPipe) super.setPrice(this.calculatePrice());
        
    }
        
    public double calculatePrice(){
        //this is the most specialized class, so no guards
        
        double baseCost = this.calculateBaseCost();
        double additionalCost = super.getColourPrice();
        
        if(super.isChemicalResist()){
            additionalCost += .44; //insul + chem + reinforce
        } else additionalCost += .30; //insul + reinforce only
 

        return baseCost * additionalCost;
    }
    
}
