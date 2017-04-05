/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.panels;

import database.ConnectionProvider;
import glbank.Account;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ui.NewAccountCreatedDialog;

/**
 *
 * @author Solanid
 */
public class PanelAccount extends javax.swing.JPanel {
    private int idc;
    private int idemp;
    private List<Account> accList= null;
    Account account = null;
    /**
     * Creates new form PanelAccount
     */
    public PanelAccount(int idc,int idemp) {
        initComponents();
        this.idc=idc;
        this.idemp=idemp;
        btnAddMoney.setEnabled(false);
        btnSubstractMoney.setEnabled(false);
        initAccountList();
    }
    
    private void initAccountList() {
        showListOfAllAccounts();
        lblBalance.setText("");
        if (accList.isEmpty()) {
            return;
        }
        account = accList.get(0);
        lblBalance.setText(account.getBalance()+"");
        btnAddMoney.setEnabled(true);
        btnSubstractMoney.setEnabled(true);
    }
    
    private void showListOfAllAccounts() {
        comboListIdAcc.removeAllItems();
        accList = new ConnectionProvider().getListOfAccountsByIdc(idc);
        if (accList!=null && accList.size()>0) {
            accList.forEach((acc) -> {
                comboListIdAcc.addItem(acc.getIdacc()+" / 2701");
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboListIdAcc = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAddAmount = new javax.swing.JTextField();
        txtSubAmount = new javax.swing.JTextField();
        btnAddMoney = new javax.swing.JButton();
        btnSubstractMoney = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jSeparator1 = new javax.swing.JSeparator();
        btnNewAccount = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        comboListCards = new javax.swing.JComboBox<>();
        btnNewCard = new javax.swing.JButton();

        jLabel1.setText("Bank account:");

        comboListIdAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboListIdAccActionPerformed(evt);
            }
        });

        jLabel2.setText("Balance:");

        lblBalance.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblBalance.setText("0");

        jLabel3.setText("Cash transactions:");

        txtAddAmount.setText("0");
        txtAddAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddAmountKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddAmountKeyTyped(evt);
            }
        });

        txtSubAmount.setText("0");
        txtSubAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSubAmountKeyTyped(evt);
            }
        });

        btnAddMoney.setText("Add +");
        btnAddMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMoneyActionPerformed(evt);
            }
        });

        btnSubstractMoney.setText("Sub -");
        btnSubstractMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubstractMoneyActionPerformed(evt);
            }
        });

        btnNewAccount.setText("New Account");
        btnNewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewAccountActionPerformed(evt);
            }
        });

        jLabel4.setText("Cards:");

        btnNewCard.setText("New Card");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAddMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSubstractMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAddAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSubAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(comboListCards, javax.swing.GroupLayout.Alignment.LEADING, 0, 144, Short.MAX_VALUE)
                    .addComponent(comboListIdAcc, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBalance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNewAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(btnNewCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboListIdAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewAccount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboListCards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewCard))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBalance)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSubAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddMoney)
                            .addComponent(btnSubstractMoney))
                        .addGap(31, 31, 31))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboListIdAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboListIdAccActionPerformed
        // TODO add your handling code here:
        int index = comboListIdAcc.getSelectedIndex();
        if (index>=0) {
            account = accList.get(index);
            lblBalance.setText(account.getBalance()+"");
        }
    }//GEN-LAST:event_comboListIdAccActionPerformed

    private float parseStringToFloat(String string) {
        if (string.length()>0) {
            try {
                return Float.parseFloat(string);
            } catch(NumberFormatException ex) {
                
            }
        }
        return 0;
    }
    
    private void btnAddMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMoneyActionPerformed
        String amountString = txtAddAmount.getText().trim();
        float actBalance = account.getBalance();
        float amount = parseStringToFloat(amountString);
        amount = (float)Math.round(amount*100)/100;
        if (amount>=0.10) {
            new ConnectionProvider().insertCash(account.getIdacc(), amount, idemp);
            JOptionPane.showMessageDialog(this, "Deposit is OK.");
            initAccountList();
        }
    }//GEN-LAST:event_btnAddMoneyActionPerformed

    private void btnSubstractMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubstractMoneyActionPerformed
        String amountString = txtSubAmount.getText().trim();
        float actBalance = account.getBalance();
        float amount = parseStringToFloat(amountString);
        amount = (float)Math.round(amount*100)/100;
        if (amount>=0.10 && actBalance>amount) {
            amount*=-1;
            new ConnectionProvider().insertCash(account.getIdacc(), amount, idemp);
            JOptionPane.showMessageDialog(this, "Withdrawing is OK.");
            initAccountList();
        }
    }//GEN-LAST:event_btnSubstractMoneyActionPerformed

    private void btnNewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewAccountActionPerformed
        // TODO add your handling code here:
        long newAccNumber = generateRandomAccount();
        if (new ConnectionProvider().addNewAccount(idc, newAccNumber)) {
            initAccountList();
            NewAccountCreatedDialog newAccountCreatedDialog = new NewAccountCreatedDialog((JFrame) this.getRootPane().getParent(), true, newAccNumber);
            newAccountCreatedDialog.setLocationRelativeTo(null);
            newAccountCreatedDialog.setVisible(true);
        }  
    }//GEN-LAST:event_btnNewAccountActionPerformed

    private void txtAddAmountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddAmountKeyReleased
 /*        String amountString=txtAddAmount.getText().trim();
        amountString = amountString.replaceAll(" ", "");
      boolean isNumeric = postcode.chars().allMatch( Character::isDigit );
        if (!isNumeric)
            txtAddAmount.;
        float amount = Float.parseFloat(amountString);
        System.out.println(amount);*/
    }//GEN-LAST:event_txtAddAmountKeyReleased

    private void txtAddAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddAmountKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) || c=='.')) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtAddAmountKeyTyped

    private void txtSubAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSubAmountKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) || c=='.')) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtSubAmountKeyTyped

    private long generateRandomAccount() {
        ConnectionProvider conn = new ConnectionProvider();
        long proposalAccount = 0;
        do {
            proposalAccount = Math.abs(new Random().nextLong()%900000000)*11;
        } while (conn.isAccountAlreadyUsed(proposalAccount));
        return proposalAccount;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMoney;
    private javax.swing.JButton btnNewAccount;
    private javax.swing.JButton btnNewCard;
    private javax.swing.JButton btnSubstractMoney;
    private javax.swing.JComboBox<String> comboListCards;
    private javax.swing.JComboBox<String> comboListIdAcc;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JTextField txtAddAmount;
    private javax.swing.JTextField txtSubAmount;
    // End of variables declaration//GEN-END:variables
}
