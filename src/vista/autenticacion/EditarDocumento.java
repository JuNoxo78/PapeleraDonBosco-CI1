package vista.autenticacion;

import controlador.autenticacion.DocIdentidadControlador;
import vista.clientes.*;
import controlador.clientes.ClienteControlador;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import modelo.autenticacion.DocIdentidad;
import modelo.clientes.Cliente;

/**
 *
 * @author mauro
 */
public class EditarDocumento extends javax.swing.JPanel {

    private DocIdentidad documento;
    private DocIdentidadControlador controlador = new DocIdentidadControlador();
    private JFrame parentFrame;

    /**
     * Creates new form Cliente
     */
    public EditarDocumento(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
        // Hacer el campo CI_Codigo no editable
        CI_Codigo.setEditable(false);
        CI_Codigo.setEnabled(false);
    }

    /**
     * Este método carga los datos del cliente en el formulario
     *
     * @param documento
     */
    public void setDatosDocumento(DocIdentidad documento) {
        this.documento = documento;
        CI_Codigo.setText(documento.getIdDocIdentidad());
        jComboBox1.setSelectedItem(documento.getTipoDocumento());
        CI_NumeroDocumento.setText(documento.getNumeroDocumento());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CI_CodigoDoc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rSButtonMaterialIconDos1 = new RSMaterialComponent.RSButtonMaterialIconDos();
        Cl_Editar = new RSMaterialComponent.RSButtonMaterialIconDos();
        panelRound4 = new extra.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CI_NumeroDocumento = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        CI_Codigo = new javax.swing.JTextField();

        setBackground(new java.awt.Color(239, 235, 233));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(61, 77, 33));

        jLabel1.setBackground(new java.awt.Color(58, 42, 83));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 12, 26));
        jLabel1.setText("Editar Documento");

        rSButtonMaterialIconDos1.setBackground(new java.awt.Color(58, 42, 83));
        rSButtonMaterialIconDos1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.GROUP);
        rSButtonMaterialIconDos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconDos1ActionPerformed(evt);
            }
        });

        Cl_Editar.setBackground(new java.awt.Color(58, 42, 83));
        Cl_Editar.setText("Editar");
        Cl_Editar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        Cl_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cl_EditarActionPerformed(evt);
            }
        });

        panelRound4.setBackground(new java.awt.Color(255, 255, 255));
        panelRound4.setRoundBottomLeft(75);
        panelRound4.setRoundBottomRight(75);
        panelRound4.setRoundTopLeft(75);
        panelRound4.setRoundTopRight(75);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Documento a editar:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Tipo de Documento:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Numero de Documento:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Pasaporte", "RUC", "Carnet Extranjetía" }));
        jComboBox1.setToolTipText("");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CI_NumeroDocumento)
                    .addGroup(panelRound4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CI_Codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                    .addGroup(panelRound4Layout.createSequentialGroup()
                        .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CI_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CI_NumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rSButtonMaterialIconDos1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cl_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rSButtonMaterialIconDos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Cl_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMaterialIconDos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconDos1ActionPerformed

    }//GEN-LAST:event_rSButtonMaterialIconDos1ActionPerformed

    private void Cl_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cl_EditarActionPerformed
// Validar que los campos no estén vacíos
        String tipo = (String) jComboBox1.getSelectedItem();
        String numero = CI_NumeroDocumento.getText().trim();
        if (tipo == null || tipo.isEmpty() || numero.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar formato según el tipo de documento
        boolean isValid = false;
        String mensaje = "El número de documento no cumple con el formato válido. ";
        String ejemplo = "";
        switch (tipo) {
            case "DNI" -> {
                if (numero.matches("\\d{8}")) {
                    isValid = true;
                }
                mensaje += "Formato esperado: 8 dígitos.";
                ejemplo = "Ejemplo: 12345678";
            }
            case "Pasaporte" -> {
                if (numero.matches("\\d{9}")) {
                    isValid = true;
                }
                mensaje += "Formato esperado: 9 dígitos.";
                ejemplo = "Ejemplo: 123456789";
            }
            case "RUC" -> {
                if (numero.matches("\\d{12}")) {
                    isValid = true;
                }
                mensaje += "Formato esperado: 12 dígitos.";
                ejemplo = "Ejemplo: 123456789012";
            }
            case "Carnet Extranjetía" -> {
                if (numero.matches("\\d{12}")) {
                    isValid = true;
                }
                mensaje += "Formato esperado: 12 dígitos.";
                ejemplo = "Ejemplo: 123456789012";
            }
        }
        if (!isValid) {
            JOptionPane.showMessageDialog(this, mensaje + "\n" + ejemplo, "Error de Formato", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Actualizar el documento
        try {
            documento.setTipoDocumento(tipo);
            documento.setNumeroDocumento(numero);
            controlador.actualizarDocumento(documento);

            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(this, "✅ Documento editado correctamente.");

            // Cerrar el formulario
            if (parentFrame != null) {
                parentFrame.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al editar el documento: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Cl_EditarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        CI_NumeroDocumento.setText("");
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CI_Codigo;
    private javax.swing.JTextField CI_CodigoDoc;
    private javax.swing.JTextField CI_NumeroDocumento;
    private RSMaterialComponent.RSButtonMaterialIconDos Cl_Editar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private extra.PanelRound panelRound4;
    private RSMaterialComponent.RSButtonMaterialIconDos rSButtonMaterialIconDos1;
    // End of variables declaration//GEN-END:variables
}
