/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;
import Clases.IdiomaPais;
import Clases.Pais;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author aacev
 */
public class VistaPais extends javax.swing.JFrame {
    
    private List<Pais> listaPaisesRecibida;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaPais.class.getName());

    private DefaultTableModel tabla;
    private Object[] objeto = new Object[6];    //se crea la tabla con un tamaño maximo de 6

    /**
     * Creates new form Vistas
     */

    public VistaPais() {
        initComponents();
        tabla = (DefaultTableModel) jTable1.getModel();
        tabla.setRowCount(0);
        setLocationRelativeTo(null);
    }
    
    
    public VistaPais(List<Pais> paises) {
        initComponents();
        tabla = (DefaultTableModel) jTable1.getModel();
        tabla.setRowCount(0);
        setLocationRelativeTo(null);
        
        
        this.listaPaisesRecibida = paises;
        
        
        System.out.println("VistaPais recibió la lista Total: " + this.listaPaisesRecibida.size() + " paises.");
        
    }

    private void actualizarTabla() {
        tabla.setRowCount(0); 

        for (Pais pais : this.listaPaisesRecibida) {
            String idiomaPrincipal;
            if (pais.getIdiomas().isEmpty()) {
                idiomaPrincipal = "";
            } else {
                idiomaPrincipal = pais.getIdiomas().get(0).getIdioma();
            }
            Object[] fila = {
                pais.getCodPais(),
                pais.getNombre(),
                pais.getContinente(),
                pais.getPoblacion(),
                idiomaPrincipal,
                pais.getCapital()
            };
            tabla.addRow(fila);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        lblTitulo = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblContinente = new javax.swing.JLabel();
        lblPoblacion = new javax.swing.JLabel();
        lblIdioma = new javax.swing.JLabel();
        lblCapital = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtContinente = new javax.swing.JTextField();
        txtPoblacion = new javax.swing.JTextField();
        txtIdioma = new javax.swing.JTextField();
        txtCapital = new javax.swing.JTextField();
        bttnAgregar = new javax.swing.JButton();
        bttnConsultar = new javax.swing.JButton();
        bttnModificar = new javax.swing.JButton();
        bttnAtras = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 400));
        setPreferredSize(new java.awt.Dimension(800, 400));

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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );

        jLayeredPane2.setPreferredSize(new java.awt.Dimension(250, 288));

        lblTitulo.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Registro poblacional internacional");

        lblCodigo.setText("Codigo");

        lblNombre.setText("Nombre");

        lblContinente.setText("Continente");

        lblPoblacion.setText("Poblacion");

        lblIdioma.setText("Idioma");

        lblCapital.setText("Capital");

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

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtContinente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContinenteKeyTyped(evt);
            }
        });

        txtPoblacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPoblacionActionPerformed(evt);
            }
        });
        txtPoblacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPoblacionKeyTyped(evt);
            }
        });

        txtIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdiomaActionPerformed(evt);
            }
        });
        txtIdioma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdiomaKeyTyped(evt);
            }
        });

        txtCapital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapitalActionPerformed(evt);
            }
        });
        txtCapital.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapitalKeyTyped(evt);
            }
        });

        jLayeredPane2.setLayer(lblTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(lblCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(lblNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(lblContinente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(lblPoblacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(lblIdioma, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(lblCapital, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtContinente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtPoblacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtIdioma, javax.swing.JLayeredPane.DEFAULT_LAYER);
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
                .addContainerGap(11, Short.MAX_VALUE))
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

        bttnAtras.setText("Atras");
        bttnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bttnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bttnAtras)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttnModificar)
                    .addComponent(bttnAgregar)
                    .addComponent(bttnConsultar)
                    .addComponent(bttnAtras)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void bttnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnConsultarActionPerformed
        int fila = jTable1.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un pais de la tabla", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Pais paisSeleccionado = this.listaPaisesRecibida.get(fila);
        txtCodigo.setText(paisSeleccionado.getCodPais());
        txtNombre.setText(paisSeleccionado.getNombre());
        txtContinente.setText(paisSeleccionado.getContinente());
        txtPoblacion.setText(String.valueOf(paisSeleccionado.getPoblacion()));
        txtCapital.setText(paisSeleccionado.getCapital());
        String idioma;
        if (paisSeleccionado.getIdiomas().isEmpty()) {
            idioma = "";
        } else {
                idioma = paisSeleccionado.getIdiomas().get(0).getIdioma();
        }
        txtIdioma.setText(idioma);
    }//GEN-LAST:event_bttnConsultarActionPerformed

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        if(txtCodigo.getText().length() > 2 || !Character.isLetter(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void bttnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAgregarActionPerformed
        if (txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty() || txtContinente.getText().isEmpty() || txtPoblacion.getText().isEmpty() || txtCapital.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "complete todos los campos requeridos", "Campos incompletos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            String codigo = txtCodigo.getText();
            String nombre = txtNombre.getText();
            String continente = txtContinente.getText();
            int poblacion = Integer.parseInt(txtPoblacion.getText());
            String capital = txtCapital.getText();
            String idiomaStr = txtIdioma.getText();
            Pais nuevoPais = new Pais(nombre, continente, "", 0f, 0, poblacion, 0f, 0f, "", "", capital, codigo); //aqui es donde se crean la clase sin los otros datos
            if (!idiomaStr.isEmpty()) {
                nuevoPais.getIdiomas().add(new IdiomaPais(idiomaStr, true, 100.0f));
            }
            this.listaPaisesRecibida.add(nuevoPais);
            actualizarTabla();
            txtCodigo.setText("");
            txtNombre.setText("");
            txtContinente.setText("");
            txtPoblacion.setText("");
            txtIdioma.setText("");
            txtCapital.setText("");
            JOptionPane.showMessageDialog(this, "Pais '" + nombre + "' agregado con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La población debe ser un número valido", "Error de Formato", JOptionPane.ERROR_MESSAGE);
        }
   
    }//GEN-LAST:event_bttnAgregarActionPerformed

    private void txtPoblacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPoblacionActionPerformed
        // TODO add your handling code here:
            
    }//GEN-LAST:event_txtPoblacionActionPerformed

    private void bttnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnModificarActionPerformed
        int fila = jTable1.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un pais de la tabla para modificar", "Aviso", JOptionPane.WARNING_MESSAGE);
        }else if (txtCodigo.getText().isEmpty() || txtNombre.getText().isEmpty() || txtContinente.getText().isEmpty() || txtPoblacion.getText().isEmpty() || txtCapital.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "complete todos los campos requeridos antes de modificar", "Campos incompletos", JOptionPane.WARNING_MESSAGE);
        }else{

        try {
            Pais paisAModificar = this.listaPaisesRecibida.get(fila);
            paisAModificar.setCodPais(txtCodigo.getText());
            paisAModificar.setNombre(txtNombre.getText());
            paisAModificar.setContinente(txtContinente.getText());
            paisAModificar.setPoblacion(Integer.parseInt(txtPoblacion.getText()));
            paisAModificar.setCapital(txtCapital.getText());

            if (paisAModificar.getIdiomas().isEmpty()) {
                if (!txtIdioma.getText().isEmpty()) {
                    paisAModificar.getIdiomas().add(new IdiomaPais(txtIdioma.getText(), true, 100f));
                }
            } else {
                paisAModificar.getIdiomas().get(0).setIdioma(txtIdioma.getText());
            }
            actualizarTabla();
            txtCodigo.setText("");
            txtNombre.setText("");
            txtContinente.setText("");
            txtPoblacion.setText("");
            txtIdioma.setText("");
            txtCapital.setText("");
            JOptionPane.showMessageDialog(this, "Pais modificado con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "La poblacion debe ser un numero valido", "Error de Formato", JOptionPane.ERROR_MESSAGE);   //faltan mensajes de error para validar los otros campos
        }
        }
    }//GEN-LAST:event_bttnModificarActionPerformed

    private void txtIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdiomaActionPerformed

    private void txtCapitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapitalActionPerformed

    private void bttnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_bttnAtrasActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
       if(txtNombre.getText().length() > 10 || !Character.isLetter(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtContinenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContinenteKeyTyped
        if(txtContinente.getText().length() > 10 || !Character.isLetter(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtContinenteKeyTyped

    private void txtPoblacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPoblacionKeyTyped
       if(txtPoblacion.getText().length() > 10 || !Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtPoblacionKeyTyped

    private void txtIdiomaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdiomaKeyTyped
        if(txtIdioma.getText().length() > 10 || !Character.isLetter(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtIdiomaKeyTyped

    private void txtCapitalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapitalKeyTyped
        if(txtCapital.getText().length() > 10 || !Character.isLetter(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtCapitalKeyTyped

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
    private javax.swing.JButton bttnAtras;
    private javax.swing.JButton bttnConsultar;
    private javax.swing.JButton bttnModificar;
    private javax.swing.JLabel jLabel1;
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
