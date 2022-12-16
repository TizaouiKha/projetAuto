/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

/**
 *
 * @author Rosca
 */
public class FrmModiferVehicule extends javax.swing.JFrame {

    /**
     * Creates new form FrmAjoutVehicule
     */
    public FrmModiferVehicule() {
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

        lblTitreModifVehicule = new javax.swing.JLabel();
        lblImmatriculationModifVehicule = new javax.swing.JLabel();
        lblMarqueModifVehicule = new javax.swing.JLabel();
        lblModeleModifVehicule = new javax.swing.JLabel();
        lblAnneeModifVehicule = new javax.swing.JLabel();
        lblLibCategorieModifVehicule = new javax.swing.JLabel();
        txtImmatriculationModifVehicule = new javax.swing.JTextField();
        txtMarqueModifVehicule = new javax.swing.JTextField();
        txtModeleModifVehicule = new javax.swing.JTextField();
        cboLibCategorieModifVehicule = new javax.swing.JComboBox<>();
        btnModifierModifVehicule = new javax.swing.JButton();
        btnAnnulerModifVehicule = new javax.swing.JButton();
        sprAnneeModifVehicule = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblModifVehicule = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitreModifVehicule.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblTitreModifVehicule.setText("Modifier Véhicule");

        lblImmatriculationModifVehicule.setText("Immatriculation :");

        lblMarqueModifVehicule.setText("Marque :");

        lblModeleModifVehicule.setText("Modèle :");

        lblAnneeModifVehicule.setText("Année :");

        lblLibCategorieModifVehicule.setText("Libelle Catégorie :");

        cboLibCategorieModifVehicule.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Voiture", "Moto", "Camion" }));

        btnModifierModifVehicule.setText("Modifier");

        btnAnnulerModifVehicule.setText("Annuler");

        tblModifVehicule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"AA-229-AA", "BMW", "Série 1",  new Integer(2007), "Voiture"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Immatriculation", "Marque", "Modele", "Annee", "Libelle Categorie"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblModifVehicule);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLibCategorieModifVehicule)
                            .addComponent(btnModifierModifVehicule))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboLibCategorieModifVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAnnulerModifVehicule)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImmatriculationModifVehicule)
                            .addComponent(lblMarqueModifVehicule)
                            .addComponent(lblModeleModifVehicule)
                            .addComponent(lblAnneeModifVehicule))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtImmatriculationModifVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sprAnneeModifVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModeleModifVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMarqueModifVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTitreModifVehicule)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitreModifVehicule)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImmatriculationModifVehicule)
                    .addComponent(txtImmatriculationModifVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMarqueModifVehicule)
                            .addComponent(txtMarqueModifVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModeleModifVehicule)
                            .addComponent(txtModeleModifVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAnneeModifVehicule)
                            .addComponent(sprAnneeModifVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLibCategorieModifVehicule)
                            .addComponent(cboLibCategorieModifVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifierModifVehicule)
                    .addComponent(btnAnnulerModifVehicule))
                .addContainerGap(355, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrmModiferVehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmModiferVehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmModiferVehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmModiferVehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmModiferVehicule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnulerModifVehicule;
    private javax.swing.JButton btnModifierModifVehicule;
    private javax.swing.JComboBox<String> cboLibCategorieModifVehicule;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnneeModifVehicule;
    private javax.swing.JLabel lblImmatriculationModifVehicule;
    private javax.swing.JLabel lblLibCategorieModifVehicule;
    private javax.swing.JLabel lblMarqueModifVehicule;
    private javax.swing.JLabel lblModeleModifVehicule;
    private javax.swing.JLabel lblTitreModifVehicule;
    private javax.swing.JSpinner sprAnneeModifVehicule;
    private javax.swing.JTable tblModifVehicule;
    private javax.swing.JTextField txtImmatriculationModifVehicule;
    private javax.swing.JTextField txtMarqueModifVehicule;
    private javax.swing.JTextField txtModeleModifVehicule;
    // End of variables declaration//GEN-END:variables
}