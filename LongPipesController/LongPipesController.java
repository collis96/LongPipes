/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LongPipesController;

import LongPipesModel.*;
import LongPipesViews.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class LongPipesController {

    private double diameter;
    private int quantity;
    private double length;
    private String id;
    private int grade;
    private int colour;
    private boolean insulationL = false;
    private boolean outerR = false;
    private boolean chemicalR = false;
    private boolean isValid = true;

    Order pipeOrder = new Order();

    public void startApplication() {
        LongPipesViews view = new LongPipesViews();
    }

    public boolean checkIfFieldsValid(javax.swing.JTextField orderQuantity,
            javax.swing.JTextField pipeLength,
            javax.swing.JTextField pipeDiameter) {
        
        if (orderQuantity.getBackground() == Color.RED
                || pipeLength.getBackground() == Color.RED
                || pipeDiameter.getBackground() == Color.RED){
            return false;
        }
        return true;

    }

    public void checkLength(javax.swing.JTextField pipeLength) {

        try {
            double length = Double.parseDouble(pipeLength.getText());
            if (length <= 0) {
                JOptionPane.showMessageDialog(null, "Length: Pipe length must be greater than 0!");
                pipeLength.setBackground(Color.RED);
            } else if (length > 6) {
                JOptionPane.showMessageDialog(null, "Length: Pipe length cannot be more than 6 meters!");
                pipeLength.setBackground(Color.RED);
            } else {
                pipeLength.setBackground(Color.WHITE);
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Length: Please enter only numbers!");
            pipeLength.setBackground(Color.RED);
        }
    }

    public void checkDiameter(javax.swing.JTextField pipeDiameter) {
       
        try {
            double diameter = Double.parseDouble(pipeDiameter.getText());
            if (diameter <= 0) {
                JOptionPane.showMessageDialog(null, "Diameter: Pipe diameter must be greater than 0!");
                pipeDiameter.setBackground(Color.RED);
            } else {
                pipeDiameter.setBackground(Color.WHITE);
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Diameter: Please enter only numbers!");
            pipeDiameter.setBackground(Color.RED);
        }
    }
       
    public void checkQuantity(javax.swing.JTextField orderQuantity) {
        
        try {
            int quantity = Integer.parseInt(orderQuantity.getText());
            if (quantity <= 0) {
                JOptionPane.showMessageDialog(null, "Quantity: Order quantity must be greater than 0!");
                orderQuantity.setBackground(Color.RED);
            } else if(quantity > 99){
                JOptionPane.showMessageDialog(null, "Quantity: The Maximum Quantity is 99!");
                orderQuantity.setBackground(Color.RED);
            } else {
                orderQuantity.setBackground(Color.WHITE);
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Quantity: Please enter only numbers!");
            orderQuantity.setBackground(Color.RED);
        }

    }

    public void createPipe(javax.swing.JTextField pipeDiameter,
            javax.swing.JTextField pipeLength,
            javax.swing.JTextField orderQuantity,
            javax.swing.JTextField orderID,
            javax.swing.JCheckBox insulationLayer,
            javax.swing.JCheckBox outerReinforcement,
            javax.swing.JCheckBox chemicalResistance,
            javax.swing.JComboBox<String> pipeGrade,
            javax.swing.JComboBox<String> pipeColour) {

        try {
            diameter = Double.parseDouble(pipeDiameter.getText());
            length = Double.parseDouble(pipeLength.getText());
            quantity = Integer.parseInt(orderQuantity.getText());
            id = orderID.getText();
            grade = pipeGrade.getSelectedIndex() + 1;
            colour = pipeColour.getSelectedIndex();
        } catch (NumberFormatException nfe) {
        }
        
        if (insulationLayer.isSelected()) {
            insulationL = true;
        } else {
            insulationL = false;
        }

        if (outerReinforcement.isSelected()) {
            outerR = true;
        } else {
            outerR = false;
        }

        if (chemicalResistance.isSelected()) {
            chemicalR = true;
        } else {
            chemicalR = false;
        }
        boolean pipeCreated = pipeOrder.addPipe(id, quantity, length, diameter,
                colour, grade, chemicalR, insulationL, outerR);
        
        if (!pipeCreated) {
            determineInvalids(grade, insulationL, outerR, colour);
            isValid = false;
        } else {
            isValid = true;
        }
        
    }
    
    public boolean getIsValid(){
        return isValid;
    }
    
    public double getPrice(int index){
        return pipeOrder.getPipePrice(index);
    }
    
    public void clearOrder(){
        pipeOrder.clearOrder();
    }
    public void deletePipe(int index){
        pipeOrder.deletePipe(index);
    }
    
    public void determineInvalids(int pipeGrade, boolean insulationL, boolean outerR,
        int colour){

    String errorMsg = "Unfortunately LongPipes Cannot create this pipe ";

    switch(pipeGrade){

        case 1: 
            if(insulationL || outerR) errorMsg += "This grade cannot have an outer reinforcement or an insulated layer.\n";
            if(colour>0) errorMsg += "This grade cannot have colours.";
            break;

        case 2:
            if(outerR) errorMsg += "This grade cannot have an outer reinforcement.\n";
            if(colour<2 && insulationL) errorMsg += "This grade must have 2 colours for an insulation layer.\n";
            break;

        case 3:
            if(insulationL && colour<2) errorMsg += "This grade must have 2 colours for an insulated layer.\n";
            if(insulationL && outerR && colour<2) errorMsg += "This grade must have 2 colours for an insulated layer and an outer reinforcement.\n";
            break;
            
        case 4: 
            if(colour<1) errorMsg += "This grade must have 1 or 2 colours.\n";
            if(colour==1 && (outerR || insulationL)) errorMsg += "This grade must have 2 colours for any insulation or outer reinforcement.\n";
            if(outerR && ! insulationL) errorMsg += "A reinforced pipe must have an insulated layer.\n";
            break;
            
        case 5:
            if(colour<2) errorMsg += "This grade must have 2 colours.\n";
            break;
        
        default: 
            errorMsg = "Error, one or more empty fields. \n";
            break;
        
        }

    JOptionPane.showMessageDialog(null, errorMsg);

    }

}
