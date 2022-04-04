/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.imuvehiculo;

import java.util.ArrayList;
import com.mycompany.imuvehiculo.Registro3;
/**
 *
 * @author jhons
 */
public class Registo1 extends javax.swing.JFrame {

    ArrayList<String>  data  = new ArrayList<>(); 
    String eldata;
    String f= "Ford",c = "Chevrolet",b = "BMW",m = "Mazda";
    int valor1,valor2, valor3;
    
    /**
     * Creates new form Registo1
     */
    public Registo1() {
        initComponents();
       
    }
    
    public void info(){
        
        jtnombre.getText();
        jtid.getText();
              
    }
    
    
    public void llenarcom(){
    
   
    
         eldata =  cboxd.getSelectedItem().toString();
         System.out.println("mira mi "+eldata);
         
         
         
     if(eldata == f){
         
         cboxd.removeAllItems();
         
         cboxd.addItem("...");
         cboxd.addItem("Raptor");
         cboxd.addItem("Mustang");
         cboxd.addItem("Fiesta");
         valor1 = 100000;
         
         if(cboxd.getSelectedItem().toString() == "Raptor"){
             
              cboxd.removeAllItems();
              
              cboxd.addItem("...");
              cboxd.addItem("2020");
              cboxd.addItem("2021");
              cboxd.addItem("2022"); 
               valor2 = 100000;

         }else{
            if(cboxd.getSelectedItem().toString() == "Mustang"){
             
              cboxd.removeAllItems();
               cboxd.addItem("...");
      cboxd.addItem("2020");
      cboxd.addItem("2021");
      cboxd.addItem("2022"); 
               valor2 = 150000; 
         }else{
              if(cboxd.getSelectedItem().toString() == "Fiesta"){
             
               cboxd.removeAllItems();
               cboxd.addItem("...");
               cboxd.addItem("2020");
      cboxd.addItem("2021");
      cboxd.addItem("2022");
               valor2 = 90000; 
              
              
              }}}

     }else{
        if(eldata == c){
            
         cboxd.removeAllItems(); 
         
         cboxd.addItem("...");
         cboxd.addItem("Tahoe");
         cboxd.addItem("Camaro");
         cboxd.addItem("Aveo");
         valor1 = 90000;
         
if(cboxd.getSelectedItem().toString() == "Tahoe"){
             
              cboxd.removeAllItems();
               cboxd.addItem("...");
      cboxd.addItem("2020");
      cboxd.addItem("2021");
      cboxd.addItem("2022");
               valor2 = 100000;

         }else{
            if(cboxd.getSelectedItem().toString() == "Camaro"){
             
              cboxd.removeAllItems();
               cboxd.addItem("...");
      cboxd.addItem("2020");
      cboxd.addItem("2021");
      cboxd.addItem("2022"); 
               valor2 = 150000; 
         }else{
              if(cboxd.getSelectedItem().toString() == "Aveo"){
             
               cboxd.removeAllItems();
               cboxd.addItem("...");
      cboxd.addItem("2020");
      cboxd.addItem("2021");
      cboxd.addItem("2022"); 
               valor2 = 90000; }}}
         
        }else{
            if(eldata == b){
                
                cboxd.removeAllItems(); 
         
                cboxd.addItem("...");
                cboxd.addItem("BMW iX3");
                cboxd.addItem("BMW M235i");
                cboxd.addItem("BMW M4");
                valor1 = 160000;
                
                if(cboxd.getSelectedItem().toString() == "BMW iX3"){
             
              cboxd.removeAllItems();
               cboxd.addItem("...");
      cboxd.addItem("2020");
      cboxd.addItem("2021");
      cboxd.addItem("2022"); 
               valor2 = 100000;

         }else{
            if(cboxd.getSelectedItem().toString() == "BMW M235i"){
             
              cboxd.removeAllItems();
              cboxd.addItem("...");
      cboxd.addItem("2020");
      cboxd.addItem("2021");
      cboxd.addItem("2022"); 
               valor2 = 150000; 
         }else{
              if(cboxd.getSelectedItem().toString() == "BMW M4"){
             
               cboxd.removeAllItems();
               cboxd.addItem("...");
      cboxd.addItem("2020");
      cboxd.addItem("2021");
      cboxd.addItem("2022"); 
               valor2 = 90000; }}}
                
            }else{
                if(eldata == m){
                    
                    cboxd.removeAllItems(); 
                   
                    cboxd.addItem("...");
                    cboxd.addItem("CX-9");
                    cboxd.addItem("MX-5");
                    cboxd.addItem("Mazda 3");
                    valor1 = 110000;
                    
                    if(cboxd.getSelectedItem().toString() == "CX-9"){
             
              cboxd.removeAllItems();
               cboxd.addItem("...");
               cboxd.addItem("2020");
               cboxd.addItem("2021");
               cboxd.addItem("2022"); 
               valor2 = 100000;

         }else{
            if(cboxd.getSelectedItem().toString() == "MX-5"){
             
              cboxd.removeAllItems();
               cboxd.addItem("...");
               cboxd.addItem("2020");
               cboxd.addItem("2021");
               cboxd.addItem("2022"); 
               valor2 = 150000; 
         }else{
              if(cboxd.getSelectedItem().toString() == "Mazda 3"){
             
               cboxd.removeAllItems();
               cboxd.addItem("...");
               cboxd.addItem("2020");
               cboxd.addItem("2021");
               cboxd.addItem("2022"); 
               
               valor2 = 90000; }}}
                    
                }
            }
        }
    }
    
    }
    

    public void valo(){
        
        if(cboxd.getSelectedItem().toString() == "2020"){
             
              
               valor3 = 40000;
               Registro3 t3= new Registro3();
               t3.setVisible(true);

         }else{
            if(cboxd.getSelectedItem().toString() == "2021"){
             
              
               valor2 = 50000; 
               Registro3 t3= new Registro3();
               t3.setVisible(true);
               
         }else{
              if(cboxd.getSelectedItem().toString() == "2022"){
             
               
               valor2 = 60000;
               
               Registro3 t3= new Registro3();
               t3.setVisible(true);
              
              
              }}}
        
    }
    
  



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtnombre = new javax.swing.JTextField();
        jtid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboxd = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Datos Usuario");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Rojas:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Datos Vehiculo");

        cboxd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Ford", "Chevrolet", "BMW", "Mazda" }));
        cboxd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtid, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cboxd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(140, 140, 140))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(cboxd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboxdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxdActionPerformed
        llenarcom();
    }//GEN-LAST:event_cboxdActionPerformed

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
            java.util.logging.Logger.getLogger(Registo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboxd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jtid;
    private javax.swing.JTextField jtnombre;
    // End of variables declaration//GEN-END:variables
}
