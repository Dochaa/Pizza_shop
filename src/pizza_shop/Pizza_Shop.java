package pizza_shop;

public class Pizza_Shop extends javax.swing.JFrame {

    private final int MAX_CUSTOMER = 50;
    Pizza customers[] = new Pizza[MAX_CUSTOMER];
    private int CusNum = 0;

    public Pizza_Shop() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MsgDialog = new javax.swing.JOptionPane();
        textMsgDialog = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        ListName = new javax.swing.JComboBox<>();
        ToppingField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListAreaToppings = new javax.swing.JTextArea();
        ListToppings = new javax.swing.JLabel();
        TotalTopings = new javax.swing.JLabel();
        TotalPrice = new javax.swing.JLabel();
        FieldTotalTopping = new javax.swing.JTextField();
        TotalPriceField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        textMsgDialog.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Name.setText("Name");

        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        ListName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ToppingField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToppingFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Topping");

        ListAreaToppings.setColumns(20);
        ListAreaToppings.setRows(5);
        jScrollPane1.setViewportView(ListAreaToppings);

        ListToppings.setText("List Toppings");

        TotalTopings.setText("Total Toppings");

        TotalPrice.setText("Total Price Pizza + Toppings");

        FieldTotalTopping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldTotalToppingActionPerformed(evt);
            }
        });

        jLabel2.setText("Bath");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Name)
                            .addComponent(jLabel1)
                            .addComponent(ListToppings))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TotalTopings)
                                    .addGap(18, 18, 18)
                                    .addComponent(FieldTotalTopping))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ToppingField)
                                    .addComponent(ListName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TotalPrice)
                        .addGap(18, 18, 18)
                        .addComponent(TotalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name)
                    .addComponent(btnRegister))
                .addGap(18, 18, 18)
                .addComponent(ListName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ToppingField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(ListToppings)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalTopings)
                    .addComponent(FieldTotalTopping, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalPrice)
                    .addComponent(TotalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        if (btnRegister.isEnabled() == false) {
            return;
        }

        if (isExistName()) {
            textMsgDialog.setText(NameField.getText() + " This name is already used.");
            MsgDialog.showMessageDialog(null, textMsgDialog);
            NameField.setText("");
            return;
        }

        customers[CusNum] = new Pizza();
        customers[CusNum].setName(NameField.getText());
        NameField.setText("");

        setListCusName();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private boolean isExistName() {
        for (int i = 0; i < CusNum; i++) {
            if (NameField.getText().equals(customers[i].getName())) {
                return true;
            }
        }
        return false;
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    if (btnAdd.isEnabled() == false) {
            return;
        }

        Pizza p = getSelectCustomerData();
        p.addTopping(ToppingField.getText());
        ToppingField.setText("");
        setCondimentData();
    }                                       

    private void textCondCaretUpdate(javax.swing.event.CaretEvent evt) {                                     
        if (ToppingField.getText().equals("")) {
            btnAdd.setEnabled(false);
        } else {
            btnAdd.setEnabled(true);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void FieldTotalToppingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldTotalToppingActionPerformed

    }//GEN-LAST:event_FieldTotalToppingActionPerformed

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        if (NameField.getText().equals("")) {
            btnRegister.setEnabled(false);
        } else {
            btnRegister.setEnabled(true);
        }
    }//GEN-LAST:event_NameFieldActionPerformed

    private void ToppingFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToppingFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToppingFieldActionPerformed

    
       private void setListCusName() {
        ListName.removeAllItems();
        for (int i = 0; i <= CusNum; i++) {
            ListName.addItem(customers[i].getName());
        }
        ListName.setSelectedIndex(CusNum);
        CusNum++;
    }

    private void resetTextField() {
        ToppingField.setText("");
        ListAreaToppings.setText("");
        FieldTotalTopping.setText("");
        TotalPriceField.setText("");
    }

    private Pizza getSelectCustomerData() {
        String nameSelected = ListName.getSelectedItem().toString();
        for (int i = 0; i < CusNum; i++) {
            if (nameSelected.equals(customers[i].getName())) {
                return customers[i];
            }
        }
        return new Pizza();
    }

    private void setCondimentData() {
        Pizza p = getSelectCustomerData();

        String[] toppings = p.printAllToppings();
        int n = p.getTotalToppings();

        ListAreaToppings.setText("");
        for (int i = 0; i < n; i++) {
            if (toppings[i] != null) {
                ListAreaToppings.append(toppings[i] + "\n");
            }
        }

        FieldTotalTopping.setText(Integer.toString(n));
        TotalPriceField.setText(Integer.toString(p.getPrice()));
    }

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
            java.util.logging.Logger.getLogger(Pizza_Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pizza_Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pizza_Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pizza_Shop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pizza_Shop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FieldTotalTopping;
    private javax.swing.JTextArea ListAreaToppings;
    private javax.swing.JComboBox<String> ListName;
    private javax.swing.JLabel ListToppings;
    private javax.swing.JOptionPane MsgDialog;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField NameField;
    private javax.swing.JTextField ToppingField;
    private javax.swing.JLabel TotalPrice;
    private javax.swing.JTextField TotalPriceField;
    private javax.swing.JLabel TotalTopings;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel textMsgDialog;
    // End of variables declaration//GEN-END:variables
}
