/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Controlers.CtrlEleve;
import Controlers.CtrlMoniteur;
import Controlers.CtrlUser;
import Entities.Eleve;
import Entities.Moniteur;
import Entities.User;
import Tools.ConnexionBDD;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.Result;

/**
 *
 * @author Rosca
 */
public class FrmModifInfoPerso extends javax.swing.JFrame {
    CtrlEleve ctrlEleve;
    ConnexionBDD maCnx;
    CtrlMoniteur ctrlMoniteur;
    CtrlUser ctrlUser;
    User user;
    /**
     * Creates new form FrmModifInfoPerso
     */
    public FrmModifInfoPerso() {
        initComponents();
    }
    
    public FrmModifInfoPerso(User unUser) {
        initComponents();
        user = unUser;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomModifInfoPerso = new javax.swing.JTextField();
        txtPrenomModifInfoPerso = new javax.swing.JTextField();
        txtAdresseModifInfoPerso = new javax.swing.JTextField();
        txtCodePostalModifInfoPerso = new javax.swing.JTextField();
        txtVilleModifInfoPerso = new javax.swing.JTextField();
        txtTelephoneModifInfoPerso = new javax.swing.JTextField();
        txtLoginModifInfoPerso = new javax.swing.JTextField();
        txtMdpModifInfoPerso = new javax.swing.JTextField();
        btnModifierModifInfoPerso = new javax.swing.JButton();
        btnAnnulerModifInfoPerso = new javax.swing.JButton();
        lblNomModifInfoPerso = new javax.swing.JLabel();
        lblTitreModifInfoPerso = new javax.swing.JLabel();
        lblPrenomModifInfoPerso = new javax.swing.JLabel();
        lblSexeModifInfoPerso = new javax.swing.JLabel();
        lblDateDeNaissanceModifInfoPerso = new javax.swing.JLabel();
        lblAdresseModifInfoPerso = new javax.swing.JLabel();
        lblCodePostalModifInfoPerso = new javax.swing.JLabel();
        lblVilleModifInfoPerso = new javax.swing.JLabel();
        lblTelephoneModifInfoPerso = new javax.swing.JLabel();
        lblLoginModifInfoPerso = new javax.swing.JLabel();
        lblMdpModifInfoPerso = new javax.swing.JLabel();
        cboSexeModifInfoPerso = new javax.swing.JComboBox<>();
        jdcDateNaissModifInfoPerso = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnModifierModifInfoPerso.setText("Modifer");
        btnModifierModifInfoPerso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierModifInfoPersoActionPerformed(evt);
            }
        });

        btnAnnulerModifInfoPerso.setText("Annuler");

        lblNomModifInfoPerso.setText("Nom :");

        lblTitreModifInfoPerso.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblTitreModifInfoPerso.setText("Modification des informations personnelles");

        lblPrenomModifInfoPerso.setText("Prenom :");

        lblSexeModifInfoPerso.setText("Sexe :");

        lblDateDeNaissanceModifInfoPerso.setText("Date de naissance :");

        lblAdresseModifInfoPerso.setText("Adresse :");

        lblCodePostalModifInfoPerso.setText("Code Postal :");

        lblVilleModifInfoPerso.setText("Ville :");

        lblTelephoneModifInfoPerso.setText("Téléphone :");

        lblLoginModifInfoPerso.setText("Login :");

        lblMdpModifInfoPerso.setText("Mdp :");

        cboSexeModifInfoPerso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homme", "Femme" }));

        jdcDateNaissModifInfoPerso.setDateFormatString("yyyy/MM/dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomModifInfoPerso)
                            .addComponent(lblPrenomModifInfoPerso)
                            .addComponent(lblSexeModifInfoPerso)
                            .addComponent(lblDateDeNaissanceModifInfoPerso)
                            .addComponent(lblAdresseModifInfoPerso)
                            .addComponent(lblCodePostalModifInfoPerso))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNomModifInfoPerso)
                                        .addComponent(txtPrenomModifInfoPerso)
                                        .addComponent(cboSexeModifInfoPerso, 0, 92, Short.MAX_VALUE)
                                        .addComponent(txtCodePostalModifInfoPerso))
                                    .addComponent(jdcDateNaissModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblLoginModifInfoPerso)
                                            .addComponent(lblTelephoneModifInfoPerso)
                                            .addComponent(lblMdpModifInfoPerso))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblVilleModifInfoPerso)
                                        .addGap(31, 31, 31)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTelephoneModifInfoPerso, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                        .addComponent(txtLoginModifInfoPerso)
                                        .addComponent(txtMdpModifInfoPerso))
                                    .addComponent(txtVilleModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnModifierModifInfoPerso)
                                .addGap(93, 93, 93)
                                .addComponent(btnAnnulerModifInfoPerso))
                            .addComponent(txtAdresseModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblTitreModifInfoPerso))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitreModifInfoPerso)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVilleModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomModifInfoPerso)
                    .addComponent(lblVilleModifInfoPerso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrenomModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelephoneModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrenomModifInfoPerso)
                    .addComponent(lblTelephoneModifInfoPerso))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSexeModifInfoPerso)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblLoginModifInfoPerso)
                                .addComponent(txtLoginModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cboSexeModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcDateNaissModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMdpModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDateDeNaissanceModifInfoPerso)
                        .addComponent(lblMdpModifInfoPerso)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdresseModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdresseModifInfoPerso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodePostalModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodePostalModifInfoPerso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifierModifInfoPerso)
                    .addComponent(btnAnnulerModifInfoPerso))
                .addGap(83, 83, 83))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    
    if(user.getStatutUser().equals("eleve")){
        ctrlEleve = new CtrlEleve();
        Eleve eleve = ctrlEleve.getEleveById(user.getCodeEleve());
        txtNomModifInfoPerso.setText(eleve.getNomEleve());
        txtPrenomModifInfoPerso.setText(eleve.getPrenomEleve());
        if(eleve.getSexe()==0){
            cboSexeModifInfoPerso.setSelectedItem(2);
        }
        else{
            cboSexeModifInfoPerso.setSelectedItem(1);
        }
        txtAdresseModifInfoPerso.setText(eleve.getAdresse());
        txtCodePostalModifInfoPerso.setText(eleve.getCodePostal());
        Date date= null;
            try {
                date = new SimpleDateFormat("yyyy-MM-dd").parse(eleve.getDateNaissance());
            } catch (ParseException ex) {
                Logger.getLogger(FrmModifInfoPerso.class.getName()).log(Level.SEVERE, null, ex);
            }
        jdcDateNaissModifInfoPerso.setDate(date);
        txtVilleModifInfoPerso.setText(eleve.getVille());
        txtTelephoneModifInfoPerso.setText(eleve.getTelephone());
        txtLoginModifInfoPerso.setText(user.getLogin());
        txtMdpModifInfoPerso.setText(user.getMdp());
    }
    else if(user.getStatutUser().equals("moniteur")){
        ctrlMoniteur = new CtrlMoniteur();
        Moniteur moniteur = ctrlMoniteur.getMoniteurById(user.getCodeMoniteur());
        txtNomModifInfoPerso.setText(moniteur.getNomMoniteur());
        txtPrenomModifInfoPerso.setText(moniteur.getPrenomMoniteur());
        if(moniteur.getSexe()==0){
            cboSexeModifInfoPerso.setSelectedItem(2);
        }
        else{
            cboSexeModifInfoPerso.setSelectedItem(1);
        }
        txtAdresseModifInfoPerso.setText(moniteur.getAdresse());
        txtCodePostalModifInfoPerso.setText(moniteur.getCodePostal());
        Date date= null;
            try {
                date = new SimpleDateFormat("yyyy-MM-dd").parse(moniteur.getDateNaissance());
            } catch (ParseException ex) {
                Logger.getLogger(FrmModifInfoPerso.class.getName()).log(Level.SEVERE, null, ex);
            }
        jdcDateNaissModifInfoPerso.setDate(date);
        txtVilleModifInfoPerso.setText(moniteur.getVille());
        txtTelephoneModifInfoPerso.setText(moniteur.getTelephone());
        txtLoginModifInfoPerso.setText(user.getLogin());
        txtMdpModifInfoPerso.setText(user.getMdp());
    }
    
    
    }//GEN-LAST:event_formWindowOpened

    private void btnModifierModifInfoPersoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierModifInfoPersoActionPerformed
        // TODO add your handling code here:
        int sexe=1;
        if(cboSexeModifInfoPerso.getSelectedItem().toString().equals("Homme")){
            sexe = 0;
        }
        if(user.getStatutUser().equals("eleve")){
            ctrlEleve = new CtrlEleve();
            Eleve eleve = ctrlEleve.getEleveById(user.getCodeEleve());
            ctrlEleve.updateEleve(txtNomModifInfoPerso.getText(), txtPrenomModifInfoPerso.getText(), sexe,jdcDateNaissModifInfoPerso.getDate() , txtAdresseModifInfoPerso.getText(), txtCodePostalModifInfoPerso.getText(), txtVilleModifInfoPerso.getText(), txtTelephoneModifInfoPerso.getText(), eleve.getIdEleve());
        }  
        else if(user.getStatutUser().equals("moniteur")){
            ctrlMoniteur = new CtrlMoniteur();
            Moniteur moniteur = ctrlMoniteur.getMoniteurById(user.getCodeMoniteur());
            ctrlMoniteur.updateMoniteur(txtNomModifInfoPerso.getText(), txtPrenomModifInfoPerso.getText(), sexe,jdcDateNaissModifInfoPerso.getDate() , txtAdresseModifInfoPerso.getText(), txtCodePostalModifInfoPerso.getText(), txtVilleModifInfoPerso.getText(), txtTelephoneModifInfoPerso.getText(), moniteur.getIdMoniteur());
        }
        ctrlUser = new CtrlUser();
        ctrlUser.updateLoginMdpUser(txtLoginModifInfoPerso.getText(), txtMdpModifInfoPerso.getText(), user.getIdUser());
        dispose();
    }//GEN-LAST:event_btnModifierModifInfoPersoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmModifInfoPerso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmModifInfoPerso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmModifInfoPerso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmModifInfoPerso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmModifInfoPerso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnulerModifInfoPerso;
    private javax.swing.JButton btnModifierModifInfoPerso;
    private javax.swing.JComboBox<String> cboSexeModifInfoPerso;
    private com.toedter.calendar.JDateChooser jdcDateNaissModifInfoPerso;
    private javax.swing.JLabel lblAdresseModifInfoPerso;
    private javax.swing.JLabel lblCodePostalModifInfoPerso;
    private javax.swing.JLabel lblDateDeNaissanceModifInfoPerso;
    private javax.swing.JLabel lblLoginModifInfoPerso;
    private javax.swing.JLabel lblMdpModifInfoPerso;
    private javax.swing.JLabel lblNomModifInfoPerso;
    private javax.swing.JLabel lblPrenomModifInfoPerso;
    private javax.swing.JLabel lblSexeModifInfoPerso;
    private javax.swing.JLabel lblTelephoneModifInfoPerso;
    private javax.swing.JLabel lblTitreModifInfoPerso;
    private javax.swing.JLabel lblVilleModifInfoPerso;
    private javax.swing.JTextField txtAdresseModifInfoPerso;
    private javax.swing.JTextField txtCodePostalModifInfoPerso;
    private javax.swing.JTextField txtLoginModifInfoPerso;
    private javax.swing.JTextField txtMdpModifInfoPerso;
    private javax.swing.JTextField txtNomModifInfoPerso;
    private javax.swing.JTextField txtPrenomModifInfoPerso;
    private javax.swing.JTextField txtTelephoneModifInfoPerso;
    private javax.swing.JTextField txtVilleModifInfoPerso;
    // End of variables declaration//GEN-END:variables
}
