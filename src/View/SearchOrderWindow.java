/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.CustomerController;
import Model.OrderList;
import javax.swing.JOptionPane;


public class SearchOrderWindow extends javax.swing.JFrame {

    public SearchOrderWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        customerIdLabel = new javax.swing.JLabel();
        sizeLabel = new javax.swing.JLabel();
        qtyLabel = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        customerIdText = new javax.swing.JTextField();
        qtyText = new javax.swing.JTextField();
        sizeText = new javax.swing.JTextField();
        amountText = new javax.swing.JTextField();
        statusText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search Order");
        setResizable(false);

        searchButton.setBackground(new java.awt.Color(0, 153, 102));
        searchButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.setFocusable(false);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Enter Order ID");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        idText.setEditable(false);
        idText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        idText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextActionPerformed(evt);
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

        customerIdLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        customerIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        customerIdLabel.setText("Customer ID  :");
        customerIdLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        sizeLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        sizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sizeLabel.setText("Size                  :");
        sizeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        qtyLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        qtyLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        qtyLabel.setText("QTY                  :");
        qtyLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        amountLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        amountLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        amountLabel.setText("Amount           :");
        amountLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        statusLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        statusLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        statusLabel.setText("Status              :");
        statusLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        customerIdText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        customerIdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerIdTextActionPerformed(evt);
            }
        });

        qtyText.setEditable(false);
        qtyText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        qtyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyTextActionPerformed(evt);
            }
        });

        sizeText.setEditable(false);
        sizeText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sizeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeTextActionPerformed(evt);
            }
        });

        amountText.setEditable(false);
        amountText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        amountText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTextActionPerformed(evt);
            }
        });

        statusText.setEditable(false);
        statusText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        statusText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(402, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customerIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton)
                        .addGap(16, 16, 16))))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(qtyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerIdLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(qtyText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                .addComponent(sizeText, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(statusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusText, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchButton)
                    .addComponent(customerIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sizeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qtyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qtyText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
         String idNum = customerIdText.getText();
        if(customerIdText.getText() == null || customerIdText.getText().equals("")){
					
	JOptionPane.showMessageDialog(null, "Enter the Order ID first !","Error",JOptionPane.ERROR_MESSAGE);
					
	}else if((CustomerController.orderIdAvailable(idNum)) & (idNum.charAt(0)=='O') & (idNum.charAt(1)=='R') & (idNum.charAt(2)=='D') & (idNum.charAt(3)=='#')
                & (idNum.length()==9)){
            
           int index=CustomerController.matchingIndex(idNum);
            if(index>=0){
                OrderList.Client c1=CustomerController.getObjectOfIndex(index);
            idText.setText(c1.getCustomerId());
            sizeText.setText(c1.getSize());
            qtyText.setText(""+c1.getqty());
            amountText.setText(""+c1.getAmount());
            statusText.setText(c1.getStatus());
            
            }
            
        }else{
        JOptionPane.showMessageDialog(null, "Invalid Order ID..!","Error",JOptionPane.ERROR_MESSAGE);
	customerIdText.setText("");
        }
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void idTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextActionPerformed
       
    }//GEN-LAST:event_idTextActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        setVisible(false);
        Main.f1.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void customerIdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerIdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerIdTextActionPerformed

    private void qtyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyTextActionPerformed

    private void sizeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sizeTextActionPerformed

    private void amountTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountTextActionPerformed

    private void statusTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusTextActionPerformed

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
            java.util.logging.Logger.getLogger(SearchOrderWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchOrderWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchOrderWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchOrderWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchOrderWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLabel;
    private javax.swing.JTextField amountText;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel customerIdLabel;
    private javax.swing.JTextField customerIdText;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel qtyLabel;
    private javax.swing.JTextField qtyText;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel sizeLabel;
    private javax.swing.JTextField sizeText;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTextField statusText;
    // End of variables declaration//GEN-END:variables
}
