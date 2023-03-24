/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Controlers.CtrlEleve;
import Controlers.CtrlLecon;
import Controlers.CtrlMoniteur;
import Tools.ConnexionBDD;
import Tools.ModelJTable;

/**
 *
 * @author Rosca
 */
public class FrmAdministrateurVisualiserToutesLesLecons extends javax.swing.JFrame {

    /**
     * Creates new form FrmMoniteurVisualiserToutesLesLecons
     */
    CtrlLecon ctrlLecon;
    CtrlEleve ctrlEleve;
    CtrlMoniteur ctrlMoniteur;
    ConnexionBDD maCnx;
    ModelJTable mdl;
    public FrmAdministrateurVisualiserToutesLesLecons() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitreVisuToutesLecons = new javax.swing.JLabel();
        lblMoniteurVisuToutesLecons = new javax.swing.JLabel();
        cboMoniteur = new javax.swing.JComboBox<>();
        lblEleveVisuToutesLecons = new javax.swing.JLabel();
        txtEleveVisuToutesLecons = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVisuToutesLecons = new javax.swing.JTable();
        btnVisualiserVisuToutesLecons = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTitreVisuToutesLecons.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblTitreVisuToutesLecons.setText("Visualiser le planning de toutes les leçons ");

        lblMoniteurVisuToutesLecons.setText("Moniteur :");

        lblEleveVisuToutesLecons.setText("Nom Eleve :");

        tblVisuToutesLecons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblVisuToutesLecons);

        btnVisualiserVisuToutesLecons.setText("Visualiser");
        btnVisualiserVisuToutesLecons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualiserVisuToutesLeconsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitreVisuToutesLecons)
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMoniteurVisuToutesLecons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEleveVisuToutesLecons, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEleveVisuToutesLecons)
                            .addComponent(cboMoniteur, 0, 120, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(btnVisualiserVisuToutesLecons)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitreVisuToutesLecons)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMoniteurVisuToutesLecons)
                    .addComponent(cboMoniteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEleveVisuToutesLecons)
                    .addComponent(txtEleveVisuToutesLecons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnVisualiserVisuToutesLecons)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        maCnx = new ConnexionBDD();
        ctrlMoniteur = new CtrlMoniteur();
        for(String Moniteur : ctrlMoniteur.getAllNomMoniteur()){
            cboMoniteur.addItem(Moniteur);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnVisualiserVisuToutesLeconsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualiserVisuToutesLeconsActionPerformed
        // TODO add your handling code here:
        mdl = new ModelJTable();
        ctrlLecon = new CtrlLecon();
        ctrlEleve = new CtrlEleve();
        String nomEleve = txtEleveVisuToutesLecons.getText();
        String nomMoniteur = String.valueOf(cboMoniteur.getSelectedItem());
        int idMoniteur = ctrlMoniteur.getIdMoniteurByNom(nomMoniteur);
        int idEleve= ctrlEleve.getIdEleveByNom(nomEleve);
        mdl.loadDatasLeconsByMoniteurAndByEleve(ctrlLecon.getAllLeconByIdMoniteurAndByIdEleve(idEleve, idMoniteur));
        tblVisuToutesLecons.setModel(mdl);
    }//GEN-LAST:event_btnVisualiserVisuToutesLeconsActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAdministrateurVisualiserToutesLesLecons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrateurVisualiserToutesLesLecons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrateurVisualiserToutesLesLecons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrateurVisualiserToutesLesLecons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdministrateurVisualiserToutesLesLecons().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVisualiserVisuToutesLecons;
    private javax.swing.JComboBox<String> cboMoniteur;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEleveVisuToutesLecons;
    private javax.swing.JLabel lblMoniteurVisuToutesLecons;
    private javax.swing.JLabel lblTitreVisuToutesLecons;
    private javax.swing.JTable tblVisuToutesLecons;
    private javax.swing.JTextField txtEleveVisuToutesLecons;
    // End of variables declaration//GEN-END:variables
}
