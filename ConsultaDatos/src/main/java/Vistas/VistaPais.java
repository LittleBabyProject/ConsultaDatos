/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author aacev
 */
public class VistaPais extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaPais.class.getName());
    private DefaultTableModel tabla;
    private Object[] objeto = new Object[6];
    
    
    public VistaPais() {
        initComponents();
        tabla = (DefaultTableModel) jTable1.getModel();
        tabla.setRowCount(0);
        setLocationRelativeTo(null);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        lblTitulo = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblContinente = new javax.swing.JLabel();
        lblPoblacion = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtContinente = new javax.swing.JTextField();
        txtPoblacion = new javax.swing.JTextField();
        lblIdioma = new javax.swing.JLabel();
        txtIdioma = new javax.swing.JTextField();
        lblCapital = new javax.swing.JLabel();
        txtCapital = new javax.swing.JTextField();
        bttnAgregar = new javax.swing.JButton();
        bttnConsultar = new javax.swing.JButton();
        bttnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 300));
        setPreferredSize(new java.awt.Dimension(790, 390));

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(430, 288));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Continente", "Poblacion", "Idioma", "Capital"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jLayeredPane2.setPreferredSize(new java.awt.Dimension(250, 288));

        lblTitulo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Registro poblacional internacional");

        lblCodigo.setText("Codigo");

        lblNombre.setText("Nombre");

        lblContinente.setText("Continente");

        lblPoblacion.setText("Poblacion");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        txtPoblacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPoblacionActionPerformed(evt);
            }
        });

        lblIdioma.setText("Idioma");

        txtIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdiomaActionPerformed(evt);
            }
        });

        lblCapital.setText("Capital");

        txtCapital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapitalActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(lblTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(lblCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(lblNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(lblContinente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(lblPoblacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtContinente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtPoblacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(lblIdioma, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtIdioma, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(lblCapital, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtCapital, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblContinente, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                        .addComponent(lblPoblacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCapital))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre)
                    .addComponent(txtContinente)
                    .addComponent(txtPoblacion)
                    .addComponent(txtIdioma)
                    .addComponent(txtCapital)
                    .addComponent(txtCodigo)))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(25, 25, 25)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContinente)
                    .addComponent(txtContinente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPoblacion)
                    .addComponent(txtPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdioma)
                    .addComponent(txtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCapital)
                    .addComponent(txtCapital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bttnAgregar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        bttnAgregar.setText("Agregar");
        bttnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAgregarActionPerformed(evt);
            }
        });

        bttnConsultar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        bttnConsultar.setText("Consulta");
        bttnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnConsultarActionPerformed(evt);
            }
        });

        bttnModificar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        bttnModificar.setText("Modificar");
        bttnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(bttnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnAgregar)
                    .addComponent(bttnConsultar)
                    .addComponent(bttnModificar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void bttnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnConsultarActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada != -1) {
            txtCodigo.setText(tabla.getValueAt(filaSeleccionada, 0).toString());
            txtNombre.setText(tabla.getValueAt(filaSeleccionada, 1).toString());
            txtContinente.setText(tabla.getValueAt(filaSeleccionada, 2).toString());
            txtPoblacion.setText(tabla.getValueAt(filaSeleccionada, 3).toString());
            txtIdioma.setText(tabla.getValueAt(filaSeleccionada, 4).toString());
            txtCapital.setText(tabla.getValueAt(filaSeleccionada, 5).toString());
        }else{
            System.out.println("No se ha seleccionado ninguna fila para modificar");    //falta un aviso de "falta seleccionar"
        }
    }//GEN-LAST:event_bttnConsultarActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void bttnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAgregarActionPerformed
        String stringPoblacion = txtPoblacion.getText();
        int poblacion = Integer.parseInt(stringPoblacion);                  //falta hacer el try y catch para evitar errores
        objeto[0] = txtCodigo.getText();
        objeto[1] = txtNombre.getText();
        objeto[2] = txtContinente.getText();
        objeto[3] = poblacion;
        objeto[4] = txtIdioma.getText();
        objeto[5] = txtCapital.getText();
        tabla.addRow(objeto);
        
        txtCodigo.setText("");
        txtNombre.setText("");                                      // se limpian los campos
        txtContinente.setText("");
        txtPoblacion.setText("");
        txtIdioma.setText("");
        txtCapital.setText("");
    }//GEN-LAST:event_bttnAgregarActionPerformed

    private void txtPoblacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPoblacionActionPerformed
        // TODO add your handling code here:
            
    }//GEN-LAST:event_txtPoblacionActionPerformed

    private void bttnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnModificarActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada != -1) {
            tabla.setValueAt(txtCodigo.getText(), filaSeleccionada, 0);
            tabla.setValueAt(txtNombre.getText(), filaSeleccionada, 1);
            tabla.setValueAt(txtContinente.getText(), filaSeleccionada, 2);
            tabla.setValueAt(Integer.parseInt(txtPoblacion.getText()), filaSeleccionada, 3);
            tabla.setValueAt(txtIdioma.getText(), filaSeleccionada, 4);
            tabla.setValueAt(txtCapital.getText(), filaSeleccionada, 5);
            txtCodigo.setText("");
            txtNombre.setText("");                                      // se limpian los campos
            txtContinente.setText("");
            txtPoblacion.setText("");
            txtIdioma.setText("");
            txtCapital.setText("");
        }else{
            System.out.println("No se ha seleccionado ninguna fila para modificar");    //falta un aviso de "falta seleccionar"
        }
    }//GEN-LAST:event_bttnModificarActionPerformed

    private void txtIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdiomaActionPerformed

    private void txtCapitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapitalActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VistaPais().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnAgregar;
    private javax.swing.JButton bttnConsultar;
    private javax.swing.JButton bttnModificar;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCapital;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblContinente;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPoblacion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCapital;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtContinente;
    private javax.swing.JTextField txtIdioma;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPoblacion;
    // End of variables declaration//GEN-END:variables
}
