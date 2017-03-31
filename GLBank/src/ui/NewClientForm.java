/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import database.ConnectionProvider;
import glbank.Client;
import java.text.SimpleDateFormat;

/**
 *
 * @author Solanid
 */
public class NewClientForm extends javax.swing.JDialog {

    /**
     * Creates new form NewClientForm
     */
    public NewClientForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        dateDateOfBirth.setDateFormat(sdf);
        lblErrorMessage.setVisible(false);
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
        txtFirstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        jLabel10 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtPostcode = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblErrorMessage = new javax.swing.JLabel();
        dateDateOfBirth = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("First name:");

        jLabel2.setText("Last name:");

        jLabel3.setText("Street:");

        jLabel4.setText("Number:");

        jLabel5.setText("City:");

        jLabel6.setText("Postcode:");

        jLabel7.setText("Date of birth:");

        jLabel8.setText("Email:");

        jLabel9.setText("Login:");

        jLabel10.setText("Password:");

        txtNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumberKeyReleased(evt);
            }
        });

        txtPostcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPostcodeKeyReleased(evt);
            }
        });

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("New Client");

        lblErrorMessage.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorMessage.setText("Username is already used!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(232, 232, 232))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancel)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirm))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCity)
                                    .addComponent(txtStreet)
                                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLastName)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblErrorMessage))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))
                    .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)))
                    .addComponent(dateDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblErrorMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm)
                    .addComponent(btnCancel))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        String firstName = txtFirstName.getText().trim();
        String lastName = txtLastName.getText().trim();
        String email = txtEmail.getText().trim();
        String dob =  dateDateOfBirth.getText();
        //Date dobb = dateDateOfBirth.getSelectedDate().getTime();
    /*    System.out.println(dob);
        String[] date = new String[3]; 
        date[0] = dob.split("\\.")[0];
        date[1] = dob.split("\\.")[1];
        date[2] = dob.split("\\.")[2];
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = null;
        Date datee;
         try {
            startDate = df.parse(new String(date[0]+"-"+date[1]+"-"+date[2]));
            String newDateString = df.format(startDate);
            System.out.println(startDate);
            datee = df.format(startDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
    
       // Date datum = sdf.parse(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
   //     String datum = sdf.format(new String(date[0]+"-"+date[1]+"-"+date[2]));
    //    System.out.println(datum);
        
        String street = txtStreet.getText().trim();
        String numString=txtNumber.getText().trim();
        
        if(numString.equals(""))
            numString="0";
        boolean isNumeric = numString.chars().allMatch( Character::isDigit );
        int num;
        if(isNumeric) num=Integer.parseInt(numString); else num = 0;
        
        
        
        String city = txtCity.getText().trim();
        String postCode = txtPostcode.getText().trim();
        String login = txtLogin.getText().trim();
        String password = txtPassword.getText().trim();
        
        if (firstName.length()==0) {
            lblErrorMessage.setText("Please enter firstname!");
            lblErrorMessage.setVisible(true);
            return;
        }
        if (lastName.length()==0) {
            lblErrorMessage.setText("Please enter lastname!");
            lblErrorMessage.setVisible(true);   
            return;
        }
        if (email.length()==0) {
            lblErrorMessage.setText("Please enter email!");
            lblErrorMessage.setVisible(true);   
            return;            
        }
        if (dob.length()==0) {
            lblErrorMessage.setText("Please enter date!");
            lblErrorMessage.setVisible(true); 
            return;
        }
        if (street.length()==0) {
            lblErrorMessage.setText("Please enter Street!");
            lblErrorMessage.setVisible(true);      
            return;
        }
        if (num==0) {
            lblErrorMessage.setText("Please enter house number!");
            lblErrorMessage.setVisible(true);      
            return;
        }       
        if (city.length()==0) {
            lblErrorMessage.setText("Please enter house City!");
            lblErrorMessage.setVisible(true);      
            return;
        }     
        if (postCode.length()==0) {
            lblErrorMessage.setText("Please enter post code!");
            lblErrorMessage.setVisible(true);      
            return;
        }             
        if (login.length()==0) {
            lblErrorMessage.setText("Please enter Login!");
            lblErrorMessage.setVisible(true);     
            return;
        }
        if (login.length()<3) {
            lblErrorMessage.setText("Login must be > 3!");
            lblErrorMessage.setVisible(true);  
            return;
        }
        if (new ConnectionProvider().isUsernameAlreadyUsed(login)) {
            lblErrorMessage.setText("Login "+login+" already exists!");
            lblErrorMessage.setVisible(true); 
            return;            
        }
        if (!isPasswordValid(password)) {
            lblErrorMessage.setText("Bad password form!");
            lblErrorMessage.setVisible(true);
            return;             
        }
        if (password.length()==0) {
            lblErrorMessage.setText("Please enter password!");
            lblErrorMessage.setVisible(true);
        }
        else {
            Client newClient = new Client(firstName, lastName, email, street, num, city, postCode, login, dob);
            new ConnectionProvider().insertNewClient(newClient, password);
            this.dispose();
        }

    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumberKeyReleased
        // TODO add your handling code here:
        String numString=txtNumber.getText().trim();
        boolean isNumeric = numString.chars().allMatch( Character::isDigit );
        if (!isNumeric)
            txtNumber.setText("");
    }//GEN-LAST:event_txtNumberKeyReleased

    private void txtPostcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPostcodeKeyReleased
        // TODO add your handling code here:
        String postcode=txtPostcode.getText().trim();
        boolean isNumeric = postcode.chars().allMatch( Character::isDigit );
        if (!isNumeric)
            txtPostcode.setText("");
    }//GEN-LAST:event_txtPostcodeKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private datechooser.beans.DateChooserCombo dateDateOfBirth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblErrorMessage;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPostcode;
    private javax.swing.JTextField txtStreet;
    // End of variables declaration//GEN-END:variables

    private boolean isPasswordValid(String newPassword) {
        newPassword = newPassword.trim();
        if (newPassword.length()<6) {
            return false;
        }
        boolean lowLetter = false;
        boolean uppLetter = false;
        boolean digit = false;
        boolean nonAlphaNum = false;
        for (int i = 0; i < newPassword.length(); i++) {
            if (Character.isLowerCase(newPassword.charAt(i)))
                lowLetter = true;
            if (Character.isUpperCase(newPassword.charAt(i)))
                uppLetter = true;
            if (Character.isDigit(newPassword.charAt(i)))
                digit = true;
            if (!Character.isLetter(newPassword.charAt(i)) && !Character.isDigit(newPassword.charAt(i)))
                nonAlphaNum = true;
        }
        return lowLetter && uppLetter && digit && nonAlphaNum;
    }    

}
