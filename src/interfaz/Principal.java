/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jesus
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNfilas1 = new javax.swing.JTextField();
        txtNcolumnas1 = new javax.swing.JTextField();
        cmbOperaciones = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdOperacion = new javax.swing.JButton();
        cmdAutomatic = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaResultado = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos iniciales "));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Numero de filas:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel5.setText("Numero de columnas: ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        jPanel3.add(txtNfilas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 30, -1));
        jPanel3.add(txtNcolumnas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 30, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 230, 100));

        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diagonal Segundaria", "Triangualar Superior", "Triangular Inferior\t", "Transpuesta a la ingresada", "Letra A", "Letra Z", "Letra V", "Letra T", "Letra E", "Letra F", "Letra P", "Letra I", "Letra N", "Letra Y", "Letra X" }));
        jPanel1.add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 160, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos iniciales "));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmdCrear.setForeground(new java.awt.Color(0, 102, 0));
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 80, -1));

        cmdLimpiar.setForeground(new java.awt.Color(102, 0, 0));
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 70, -1));

        cmdOperacion.setText("Operacion");
        cmdOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionActionPerformed(evt);
            }
        });
        jPanel2.add(cmdOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        cmdAutomatic.setText("Automatico");
        cmdAutomatic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAutomaticActionPerformed(evt);
            }
        });
        jPanel2.add(cmdAutomatic, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 90, -1));

        cmdManual.setText("Manual");
        cmdManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdManualActionPerformed(evt);
            }
        });
        jPanel2.add(cmdManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 60, 90, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 330, 140));

        tblTablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTablaResultado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 410, 180));

        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 400, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1038, 767));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        int sw;
        sw = 1;
        if (txtNfilas1.getText().isEmpty()) {
            Helper.mensaje(this, "Por favor digite el numero de Filas", 2);
            txtNfilas1.requestFocusInWindow();
            sw = 0;
        } else if (txtNcolumnas1.getText().isEmpty()) {
            Helper.mensaje(this, "Por favor digite el numero de Columnas", 2);
            txtNcolumnas1.requestFocusInWindow();
            sw = 0;
        } 
        if (sw == 1) {

            int nf, nc;
            DefaultTableModel tm, tm2;
            nf = Integer.parseInt(txtNfilas1.getText());
            nc = Integer.parseInt(txtNcolumnas1.getText());
            
            if(nf>15 && nc>15){
            Helper.mensaje(this, "Para una correctaa vizualizacion el numero de fila no debe ser mayor de 15", 2);
            txtNfilas1.requestFocusInWindow();    
            

            tm = (DefaultTableModel) tblTablaInicial.getModel();
            tm2 = (DefaultTableModel) tblTablaResultado.getModel();

            tm.setRowCount(nf);
            tm.setColumnCount(nc);

            tm2.setRowCount(nf);
            tm2.setColumnCount(nc);

            JButton botonesH[] = {cmdManual, cmdAutomatic, cmdLimpiar};
            JButton botonesD[] = {cmdCrear, cmdOperacion};

            Helper.habilitarBotones(botonesH);
            Helper.deshabilitarBotones(botonesD);
            } else {
                Helper.mensaje(this, "Para una correctaa vizualizacion el numero de columas no debe ser mayor de 15", 2);
            txtNcolumnas1.requestFocusInWindow();
            }
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        txtNfilas1.setText("");
        txtNcolumnas1.setText("");
        txtNfilas1.requestFocusInWindow();
        cmbOperaciones.setSelectedIndex(0);

        Helper.porDefectoTabla(tblTablaInicial);
        Helper.porDefectoTabla(tblTablaResultado);

        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdManual, cmdAutomatic, cmdOperacion};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionActionPerformed
        int op, nf, nc, aux, cont = 0;
        op = cmbOperaciones.getSelectedIndex();
        Helper.limpiadoTabla(tblTablaResultado);

        nf = tblTablaInicial.getRowCount();
        nc = tblTablaInicial.getColumnCount();

        switch (op) {
            case 0:
                Helper.diagonalSecundaria(tblTablaInicial, tblTablaResultado);
                break;
            case 1:
                Helper.triangularSuperior(tblTablaInicial, tblTablaResultado);
                break;
            case 2:
                Helper.triangularInferior(tblTablaInicial, tblTablaResultado);
                break;
            case 3:
                Helper.transpuesta(tblTablaInicial, tblTablaResultado);
                break;
            case 4:
                Helper.letraA(tblTablaInicial, tblTablaResultado);
                break;
            case 5:
                Helper.letraZ(tblTablaInicial, tblTablaResultado);
                break;
            case 6:
                Helper.letraV(tblTablaInicial, tblTablaResultado);
                break;
            case 7:
                Helper.letraT(tblTablaInicial, tblTablaResultado);
                break;
            case 8:
                Helper.letraE(tblTablaInicial, tblTablaResultado);
                break;
            case 9:
                Helper.letraF(tblTablaInicial, tblTablaResultado);
                break;
            case 10:
                Helper.letraP(tblTablaInicial, tblTablaResultado);
                break;
            case 11:
                Helper.letraI(tblTablaInicial, tblTablaResultado);
                break;
            case 12:
                Helper.letraN(tblTablaInicial, tblTablaResultado);
                break;
            case 13:
                Helper.letraY(tblTablaInicial, tblTablaResultado);
                break;
            case 14:
                Helper.letraX(tblTablaInicial, tblTablaResultado);
                break;
        }
    }//GEN-LAST:event_cmdOperacionActionPerformed

    private void cmdAutomaticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAutomaticActionPerformed
        int nf, nc, n;
        nf = tblTablaInicial.getRowCount();
        nc = tblTablaInicial.getColumnCount();
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 50 + 1);
                tblTablaInicial.setValueAt(n, i, j);
            }

        }
        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdManual, cmdAutomatic};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdAutomaticActionPerformed

    private void cmdManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdManualActionPerformed
        int nf, nc;
        int n;
        int sw, res;

        nc = tblTablaInicial.getColumnCount();
        nf = tblTablaInicial.getRowCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    sw = 1;
                    try {
                        n = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite el elmento en la posición [" + i + "]" + "[" + j + "]").trim());
                        tblTablaInicial.setValueAt(n, i, j);
                    } catch (NumberFormatException e) {
                        Helper.mensaje(this, "Digite un número válido", 3);
                        sw = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
                        if (res == 0) {
                            sw = 1;
                            i = nf;
                            j = nc;

                            Helper.porDefectoTabla(tblTablaInicial);
                            Helper.porDefectoTabla(tblTablaResultado);
                        } else {
                            sw = 0;
                        }
                    }
                } while (sw == 0);
            }
        }
        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdManual, cmdAutomatic};

        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdManualActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperaciones;
    private javax.swing.JButton cmdAutomatic;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdOperacion;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTable tblTablaResultado;
    private javax.swing.JTextField txtNcolumnas1;
    private javax.swing.JTextField txtNfilas1;
    // End of variables declaration//GEN-END:variables
}
