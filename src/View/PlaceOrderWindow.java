package View;

import Controller.CustomerController;
import Model.OrderList;
import javax.swing.JOptionPane;

public class PlaceOrderWindow extends javax.swing.JFrame {

    public PlaceOrderWindow() {
        
        initComponents();
        iDLabelText.setText(CustomerController.getOrderId());
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        amountText = new javax.swing.JTextField();
        iDLabelText = new javax.swing.JTextField();
        idText = new javax.swing.JTextField();
        sizeText = new javax.swing.JTextField();
        qtyText = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        placeOrderButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Place Order");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Order ID");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Customer ID");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Size");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("QTY");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Amount");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        amountText.setEditable(false);
        amountText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        amountText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTextActionPerformed(evt);
            }
        });

        iDLabelText.setEditable(false);
        iDLabelText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        iDLabelText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iDLabelTextActionPerformed(evt);
            }
        });

        idText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        idText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextActionPerformed(evt);
            }
        });

        sizeText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sizeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeTextActionPerformed(evt);
            }
        });
        sizeText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sizeTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sizeTextKeyTyped(evt);
            }
        });

        qtyText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        qtyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyTextActionPerformed(evt);
            }
        });
        qtyText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qtyTextKeyReleased(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(255, 51, 51));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.setFocusable(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        placeOrderButton.setBackground(new java.awt.Color(0, 153, 102));
        placeOrderButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        placeOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        placeOrderButton.setText("Place");
        placeOrderButton.setFocusable(false);
        placeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("(XS/S/M/L/XL/XXL)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(qtyText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(sizeText, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iDLabelText, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(placeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iDLabelText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sizeText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(placeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iDLabelTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iDLabelTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iDLabelTextActionPerformed

    private void amountTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTextActionPerformed
     
       
    }//GEN-LAST:event_amountTextActionPerformed

    private void idTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextActionPerformed
        String customerID = idText.getText();
        if ((customerID.charAt(0) != '0') || (customerID.length() != 10)) {
            JOptionPane.showMessageDialog(null, "\n\t\tPlease enter a valid Phone number", "Error", JOptionPane.ERROR_MESSAGE);
            idText.setText("");
        }
    }//GEN-LAST:event_idTextActionPerformed

    private void sizeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeTextActionPerformed
        String size = sizeText.getText().toUpperCase();
        if (size.equals("M") | size.equals("XL") | size.equals("L") | size.equals("S") | size.equals("XS") | size.equals("XXL")) {
        } else {
            JOptionPane.showMessageDialog(null, "\n\t\tPlease enter a valid Size", "Error", JOptionPane.ERROR_MESSAGE);
            sizeText.setText("");
        }
    }//GEN-LAST:event_sizeTextActionPerformed

    private void qtyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyTextActionPerformed
        try {
            double qty = Double.parseDouble(qtyText.getText());
             String size= sizeText.getText().toUpperCase();
            double value=CustomerController.calculateOrderAmount(qty, size);
            amountText.setText(""+value);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "\n\t\tPlease enter a valid QTY", "Error", JOptionPane.ERROR_MESSAGE);
            qtyText.setText("");
        }
        
    }//GEN-LAST:event_qtyTextActionPerformed

    private void placeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrderButtonActionPerformed
         if(idText.getText().equals("") || idText.getText() == null){ 
		JOptionPane.showMessageDialog(null, "Cannot Place Order Enter Customer ID  ","Error",JOptionPane.ERROR_MESSAGE); 
	}else if (sizeText.getText().equals("") || sizeText.getText() == null){
		JOptionPane.showMessageDialog(null, "Cannot Place Order Enter Size ","Error",JOptionPane.ERROR_MESSAGE);
	}else if (qtyText.getText().equals("") || qtyText.getText() == null){
		JOptionPane.showMessageDialog(null, "Cannot Place Order Enter QTY ","Error",JOptionPane.ERROR_MESSAGE);
	}else{
		boolean isAdded;
             isAdded = CustomerController.addOrder(new OrderList.Client(iDLabelText.getText(),idText.getText(),sizeText.getText().toUpperCase(),Double.parseDouble(qtyText.getText()),Double.parseDouble(amountText.getText()),"PROCESSING"));
	        if(isAdded){
                JOptionPane.showMessageDialog(null, "Order placed ! ");
		setVisible(false);
		new PlaceOrderWindow().setVisible(true);
               }		    
	}
    }//GEN-LAST:event_placeOrderButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
       setVisible(false);				
       Main.f1.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void qtyTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyTextKeyReleased
         try {
            double qty = Double.parseDouble(qtyText.getText());
             String size= sizeText.getText().toUpperCase();
            double value=CustomerController.calculateOrderAmount(qty, size);
            amountText.setText(""+value);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "\n\t\tPlease enter a valid QTY", "Error", JOptionPane.ERROR_MESSAGE);
            qtyText.setText("");
        }
    }//GEN-LAST:event_qtyTextKeyReleased

    private void sizeTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sizeTextKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_sizeTextKeyReleased

    private void sizeTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sizeTextKeyTyped
       
    }//GEN-LAST:event_sizeTextKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountText;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField iDLabelText;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton placeOrderButton;
    private javax.swing.JTextField qtyText;
    private javax.swing.JTextField sizeText;
    // End of variables declaration//GEN-END:variables
}
