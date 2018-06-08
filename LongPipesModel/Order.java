package LongPipesModel;

import java.util.*;
import LongPipesModel.*;
import javax.swing.JOptionPane;
/**
 *
 * @author up795987
 */

public class Order {
    private String orderId;
    private ArrayList<Pipe> pipes = new ArrayList<>();
    
    public Order(){
    }
    
    public Order(String ordId){
        this.orderId = ordId;
    }
  
    public boolean addPipe(String orderID, int quantity, double length, double diameter,
            int colour, int grade, boolean chemicalR, boolean insulationL, boolean outerR){
        
        //For type ReinforcedPipe
        if (outerR == true & insulationL == true & (chemicalR == true || chemicalR == false)
                & colour == 2 & (grade == 3 || grade == 4 || grade == 5)) {
            
            pipes.add(new ReinforcedPipe(length, diameter, grade,
            chemicalR, colour, quantity, insulationL, outerR));
            JOptionPane.showMessageDialog(null, "Pipe Added.");
            
        //For type InsulatedPipe  
        } else if (outerR == false & insulationL == true & (chemicalR == true || chemicalR == false)
                & colour == 2 & (grade == 2 || grade == 3 || grade == 4 || grade == 5)) {
            
            pipes.add(new InsulatedPipe(length, diameter, grade, chemicalR, colour, 
            quantity, insulationL));
            JOptionPane.showMessageDialog(null, "Pipe Added.");
        
        //For type NormalPipe colour 0
        } else if (outerR == false & insulationL == false & (chemicalR == true || chemicalR == false)
                & colour == 0 & (grade == 1 || grade == 2 || grade == 3)) {
            
            pipes.add(new NormalPipe(length, diameter, grade, chemicalR, colour, quantity));
            JOptionPane.showMessageDialog(null, "Pipe Added.");
            
        //For type NormalPipe colour 1
        } else if (outerR == false & insulationL == false & (chemicalR == true || chemicalR == false)
                & colour == 1 & (grade == 2 || grade == 3 || grade == 4)) {
            
            pipes.add(new NormalPipe(length, diameter, grade, chemicalR, colour, quantity));
            JOptionPane.showMessageDialog(null, "Pipe Added.");
        
        //For type NormalPipe colour 2
        } else if (outerR == false & insulationL == false & (chemicalR == true || chemicalR == false)
                & colour == 2 & (grade == 2 || grade == 3 || grade == 4 || grade == 5)) {
            
            pipes.add(new NormalPipe(length, diameter, grade, chemicalR, colour, quantity));
            JOptionPane.showMessageDialog(null, "Pipe Added.");
            
        }
        else {
            return false;
        }
        
        return true;
    }
    
    public double getPipePrice(int index){
        return pipes.get(index).getTotalPrice();
    }
    //deletes pipe from the order
    public void deletePipe(int index){
        pipes.remove(index);
    }
    
    //clears the pipes from arraylist
    public void clearOrder(){
        pipes.clear();
    }
}
