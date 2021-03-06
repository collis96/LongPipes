/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LongPipesViews;

import javax.swing.JOptionPane;
import LongPipesController.*;
import LongPipesModel.Pipe;
import java.text.DecimalFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;

/**
 *
 * @author user
 */
public class LongPipesViews extends javax.swing.JFrame {

    LongPipesController controller = new LongPipesController();
    private double totalCost;

    /**
     * Creates new form LongPipesForm
     */
    public LongPipesViews() {
        
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        clearAll();
        singleRowSelection();
        setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        orderID = new javax.swing.JTextField();
        insulationLayer = new javax.swing.JCheckBox();
        outerReinforcement = new javax.swing.JCheckBox();
        chemicalResistance = new javax.swing.JCheckBox();
        pipeGrade = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        orderQuantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pipeLength = new javax.swing.JTextField();
        pipeDiameter = new javax.swing.JTextField();
        pipeColour = new javax.swing.JComboBox<>();
        submitOrder = new javax.swing.JButton();
        quoteTotal = new javax.swing.JButton();
        deleteOrder = new javax.swing.JButton();
        clearAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The LongPipes Company");

        jLabel1.setText("Order ID");

        orderID.setToolTipText("Enter an ID for your order");
        orderID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderIDActionPerformed(evt);
            }
        });

        insulationLayer.setLabel("Insulation Layer");
        insulationLayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insulationLayerActionPerformed(evt);
            }
        });

        outerReinforcement.setLabel("Outer Reinforcement");

        chemicalResistance.setLabel("Chemical Resistance");

        pipeGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        pipeGrade.setSelectedItem(1);
        pipeGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pipeGradeActionPerformed(evt);
            }
        });

        jLabel2.setText("Grade");

        jLabel3.setText("Quantity");

        orderQuantity.setToolTipText("Enter the amount you want");
        orderQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                orderQuantityFocusLost(evt);
            }
        });
        orderQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderQuantityActionPerformed(evt);
            }
        });

        jLabel4.setText("Colour");

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Order ID", "Quantity", "Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderTable);

        jLabel5.setText("Length");

        jLabel6.setText("Diameter");

        pipeLength.setToolTipText("Enter the length in metres");
        pipeLength.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pipeLengthFocusLost(evt);
            }
        });

        pipeDiameter.setToolTipText("Enter the diameter in inches");
        pipeDiameter.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pipeDiameterFocusLost(evt);
            }
        });
        pipeDiameter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pipeDiameterActionPerformed(evt);
            }
        });

        pipeColour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));

        submitOrder.setText("Submit Order");
        submitOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitOrderActionPerformed(evt);
            }
        });

        quoteTotal.setText("Quote Total");
        quoteTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quoteTotalActionPerformed(evt);
            }
        });

        deleteOrder.setText("Delete Order");
        deleteOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrderActionPerformed(evt);
            }
        });

        clearAll.setText("Clear All");
        clearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(20, 20, 20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pipeLength)
                            .addComponent(pipeDiameter, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(orderID, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orderQuantity, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(outerReinforcement)
                                    .addComponent(chemicalResistance)
                                    .addComponent(insulationLayer))
                                .addGap(0, 97, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(pipeGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(pipeColour, 0, 1, Short.MAX_VALUE))))
                    .addComponent(submitOrder, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(clearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quoteTotal)
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(orderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pipeGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(pipeColour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(orderQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insulationLayer))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outerReinforcement)
                    .addComponent(jLabel6)
                    .addComponent(pipeDiameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pipeLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chemicalResistance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(submitOrder)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quoteTotal)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteOrder)
                            .addComponent(clearAll))
                        .addGap(12, 12, 12))))
        );

        pack();
    }// </editor-fold>

    private void submitOrderActionPerformed(java.awt.event.ActionEvent evt) {

        //If all fields have valid data fields, create the pipe and add it to
        //the order list

        //check inputs
        controller.checkQuantity(orderQuantity);
        controller.checkDiameter(pipeDiameter);
        controller.checkLength(pipeLength);

        //check order
        if(controller.checkIfFieldsValid(orderQuantity, pipeLength, pipeDiameter)){
            controller.createPipe(pipeDiameter,
                    pipeLength, orderQuantity, orderID, insulationLayer,
                    outerReinforcement, chemicalResistance, pipeGrade, pipeColour);
            if (controller.getIsValid()) {
                addRow();
                clearInputFields();
            }
        }

    }
    
    private void quoteTotalActionPerformed(java.awt.event.ActionEvent evt) {
        // takes the orders from the table and give the total cost.
        getTotalCost();
    }

    private void deleteOrderActionPerformed(java.awt.event.ActionEvent evt) {
        // checks to see if JTable is empty (prevents an error when trying to delete without any item in the table)
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        int rowCount = orderTable.getRowCount();
        if(rowCount > 0) {
            deleteRow();
        } else {
            JOptionPane.showMessageDialog(null, "Table is empty, no orders to remove!");
        }
    }

    private void clearAllActionPerformed(java.awt.event.ActionEvent evt) {
        clearAll();
    }

    public void clearAll(){
        //clears the table from all the orders
        //sets totalCost to $0.
        //clears InputFields just in case.
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        model.setRowCount(0);
        totalCost = 0.0;
        clearInputFields();
        controller.clearOrder();
    }

    public void deleteRow(){
        //deletes selected row from the table (subtracts selected order cost from total cost).

        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        int rowNum = orderTable.getSelectedRow();
        int[] rows = orderTable.getSelectedRows();
        double columnValue = (double) orderTable.getValueAt(rowNum, 2);
        totalCost = totalCost - columnValue;

        for ( int row : rows){
            model.removeRow(orderTable.convertRowIndexToModel(row));
        }
        orderTable.clearSelection();
        controller.deletePipe(rowNum);

    }

    public void addRow(){
        //adds the rows to the table view
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
        String id = orderID.getText();
        int quantity = Integer.parseInt(orderQuantity.getText());
        double cost = controller.getPrice(model.getRowCount());
        
        //cost for tableview
        DecimalFormat formatter = new DecimalFormat("#0.00");
        cost = Double.parseDouble(formatter.format(cost));
        
        totalCost = totalCost + cost;

        model.insertRow(model.getRowCount(), new Object[]{id, quantity, cost});

    }

    public void clearInputFields() {
        //clears all data fields (JTextBox,JComboBox and JCheckBox)
        orderID.setText(null);
        orderQuantity.setText(null);
        pipeDiameter.setText(null);
        pipeLength.setText(null);
        pipeGrade.setSelectedIndex(0);
        pipeColour.setSelectedIndex(0);
        insulationLayer.setSelected(false);
        outerReinforcement.setSelected(false);
        chemicalResistance.setSelected(false);
    }

    public void getTotalCost(){
        DecimalFormat decFmt = new DecimalFormat("#.##");  // reduces the number of dicimal places shown.
        double finalCost = Double.parseDouble(decFmt.format(totalCost)); // rounds the cost up to two dicimal places
        JOptionPane.showMessageDialog(null, "The total cost of your order is £" + finalCost);
    }

    public void singleRowSelection(){
        orderTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
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
            java.util.logging.Logger.getLogger(LongPipesViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LongPipesViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LongPipesViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LongPipesViews.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LongPipesViews().setVisible(true);
            }
        });
    }
    
    private void orderQuantityFocusLost(java.awt.event.FocusEvent evt) {
    }

    private void pipeDiameterFocusLost(java.awt.event.FocusEvent evt) {
    }

    private void pipeLengthFocusLost(java.awt.event.FocusEvent evt) {
    }
    
    private void orderQuantityActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    
    private void orderIDActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void insulationLayerActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void pipeGradeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void pipeDiameterActionPerformed(java.awt.event.ActionEvent evt) {
        // stuff
    }

    // Variables declaration - do not modify
    private javax.swing.JCheckBox chemicalResistance;
    private javax.swing.JButton clearAll;
    private javax.swing.JButton deleteOrder;
    private javax.swing.JCheckBox insulationLayer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField orderID;
    private javax.swing.JTextField orderQuantity;
    private javax.swing.JTable orderTable;
    private javax.swing.JCheckBox outerReinforcement;
    private javax.swing.JComboBox<String> pipeColour;
    private javax.swing.JTextField pipeDiameter;
    private javax.swing.JComboBox<String> pipeGrade;
    private javax.swing.JTextField pipeLength;
    private javax.swing.JButton quoteTotal;
    private javax.swing.JButton submitOrder;
    // End of variables declaration
}
