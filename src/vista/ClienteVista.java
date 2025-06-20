package vista;

import controlador.ClienteControlador;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import modelo.Cliente;   
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author brand
 */
public class ClienteVista extends javax.swing.JPanel {

    /**
     * Creates new form Cliente
     */
    
    public ClienteVista() {
        initComponents();
        mostrarClientesEnTabla();
        //Evita mostrar fechas pasadas y futuras solo la fecha de hoy
        Date hoy = new Date(); // fecha actual
           CI_FechaRegistro.setMinSelectableDate(hoy);
           CI_FechaRegistro.setMaxSelectableDate(hoy);
           CI_FechaRegistro.setDate(hoy);
        //Desactiva para modificar la fecha registro
        CI_FechaRegistro.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSButtonMaterialIconDos1 = new RSMaterialComponent.RSButtonMaterialIconDos();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelRound4 = new extra.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        Cl_Codigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Cl_DocumentoIdentidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CL_Nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Cl_Apellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Cl_Direccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Cl_Telefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Cl_Correo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Cl_CrearDocIdentidad = new RSMaterialComponent.RSButtonMaterialIconDos();
        ComboEstado = new javax.swing.JComboBox<>();
        CI_FechaRegistro = new com.toedter.calendar.JDateChooser();
        panelRound5 = new extra.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Clientes = new javax.swing.JTable();
        Cl_Guardar = new RSMaterialComponent.RSButtonMaterialIconDos();
        Cl_Eliminar = new RSMaterialComponent.RSButtonMaterialIconDos();
        Cl_Editar = new RSMaterialComponent.RSButtonMaterialIconDos();
        Cl_Buscar = new RSMaterialComponent.RSButtonMaterialIconDos();

        setBackground(new java.awt.Color(239, 235, 233));

        rSButtonMaterialIconDos1.setBackground(new java.awt.Color(58, 42, 83));
        rSButtonMaterialIconDos1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.GROUP);

        jLabel1.setBackground(new java.awt.Color(58, 42, 83));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(58, 42, 83));
        jLabel1.setText("Registro de Clientes");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(58, 42, 83));
        jLabel2.setText("Complete la informacion de los clientes");

        panelRound4.setBackground(new java.awt.Color(255, 255, 255));
        panelRound4.setRoundBottomLeft(75);
        panelRound4.setRoundBottomRight(75);
        panelRound4.setRoundTopLeft(75);
        panelRound4.setRoundTopRight(75);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Codigo:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Documento Identidad:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Apellido:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Direccion:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Telefono:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Correo:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Estado");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Fecha Registro:");

        Cl_CrearDocIdentidad.setBackground(new java.awt.Color(58, 42, 83));
        Cl_CrearDocIdentidad.setText("Crear");
        Cl_CrearDocIdentidad.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        Cl_CrearDocIdentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cl_CrearDocIdentidadActionPerformed(evt);
            }
        });

        ComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(ComboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cl_Correo)
                    .addComponent(Cl_Telefono)
                    .addComponent(Cl_Direccion)
                    .addComponent(Cl_Apellido)
                    .addComponent(CL_Nombre)
                    .addComponent(Cl_Codigo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound4Layout.createSequentialGroup()
                        .addComponent(Cl_DocumentoIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cl_CrearDocIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CI_FechaRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cl_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cl_DocumentoIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cl_CrearDocIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CL_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cl_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cl_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cl_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cl_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CI_FechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelRound5.setBackground(new java.awt.Color(255, 255, 255));
        panelRound5.setRoundBottomLeft(75);
        panelRound5.setRoundBottomRight(75);
        panelRound5.setRoundTopLeft(75);
        panelRound5.setRoundTopRight(75);

        Tabla_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Doc Identidad", "Nombres", "Apellidos", "Direccion", "Telefono", "Correo", "Estado", "FechaRegistro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla_Clientes);

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(panelRound5);
        panelRound5.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        Cl_Guardar.setBackground(new java.awt.Color(58, 42, 83));
        Cl_Guardar.setText("Guardar");
        Cl_Guardar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        Cl_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cl_GuardarActionPerformed(evt);
            }
        });

        Cl_Eliminar.setBackground(new java.awt.Color(58, 42, 83));
        Cl_Eliminar.setText("Eliminar");
        Cl_Eliminar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        Cl_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cl_EliminarActionPerformed(evt);
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

        Cl_Buscar.setBackground(new java.awt.Color(58, 42, 83));
        Cl_Buscar.setText("Buscar");
        Cl_Buscar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        Cl_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cl_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cl_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Cl_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rSButtonMaterialIconDos1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cl_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cl_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addComponent(rSButtonMaterialIconDos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cl_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cl_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cl_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cl_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Cl_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cl_GuardarActionPerformed
    // Instanciamos con cliente
    Cliente cliente = new Cliente();

    // Setear con los datos de los Jtextfield
    cliente.setIdCliente(Cl_Codigo.getText());
    cliente.setIdDocIdentidad(Cl_DocumentoIdentidad.getText());
    cliente.setNombre(CL_Nombre.getText());
    cliente.setApellido(Cl_Apellido.getText());
    cliente.setDireccion(Cl_Direccion.getText());
    cliente.setTelefono(Cl_Telefono.getText());
    cliente.setCorreo(Cl_Correo.getText());

    // Convertir selección de ComboBox a booleano
    String estadoSeleccionado = ComboEstado.getSelectedItem().toString();
    boolean estadoBoolean = estadoSeleccionado.trim().equalsIgnoreCase("Activo");
    cliente.setEstado(estadoBoolean);

    // Para agregar los datos del jcalendar
    Date fechaSeleccionada = CI_FechaRegistro.getDate();
    if (fechaSeleccionada == null) {
        JOptionPane.showMessageDialog(null, "Selecciona una fecha de registro.");
        return;
    }
    LocalDateTime fechaRegistro = fechaSeleccionada.toInstant()
            .atZone(ZoneId.systemDefault())
            .toLocalDateTime();
    if (fechaRegistro.isBefore(LocalDateTime.now())) {
        JOptionPane.showMessageDialog(null, "No se permite una fecha de registro anterior a hoy.");
        return;
    }
    cliente.setFechaRegistro(fechaRegistro);

    // Registrar cliente
    ClienteControlador controlador = new ClienteControlador();
    controlador.registrarCliente(cliente);

    // Actualizar la tabla después de guardar
    mostrarClientesEnTabla();
    }//GEN-LAST:event_Cl_GuardarActionPerformed

    private void Cl_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cl_EliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cl_EliminarActionPerformed

    private void Cl_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cl_EditarActionPerformed
        // TODO add your handling code here:
        int fila = Tabla_Clientes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "⚠️ Debes seleccionar un cliente de la tabla.");
            return;
        }
        try {
            Cliente cliente = new Cliente();
            cliente.setIdCliente(Tabla_Clientes.getValueAt(fila, 0).toString());
            cliente.setIdDocIdentidad(Cl_DocumentoIdentidad.getText());
            cliente.setNombre(CL_Nombre.getText());
            cliente.setApellido(Cl_Apellido.getText());
            cliente.setDireccion(Cl_Direccion.getText());
            cliente.setTelefono(Cl_Telefono.getText());
            cliente.setCorreo(Cl_Correo.getText());
            
            // Estado (desde el combo box)
            String estadoTexto = ComboEstado.getSelectedItem().toString();
            cliente.setEstado(estadoTexto.equals("Activo"));

            // ⚠️ No se modifica la fecha de registro, así que la obtenemos de la tabla
            LocalDateTime fechaRegistro = ((Date) Tabla_Clientes.getValueAt(fila, 8))
                                        .toInstant()
                                        .atZone(ZoneId.systemDefault())
                                        .toLocalDateTime();
            cliente.setFechaRegistro(fechaRegistro);

            // Validación simple
            if (cliente.getNombre().isEmpty() || cliente.getApellido().isEmpty()) {
                JOptionPane.showMessageDialog(null, "⚠️ Nombre y Apellido son obligatorios.");
                return;
            }

            // Modificamos usando el controlador
            ClienteControlador controlador = new ClienteControlador();
            boolean actualizado = controlador.modificarCliente(cliente);

            if (actualizado) {
                JOptionPane.showMessageDialog(null, "✅ Cliente actualizado correctamente.");
                mostrarClientesEnTabla();
            } else {
                JOptionPane.showMessageDialog(null, "❌ No se pudo actualizar el cliente.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "❌ Error al modificar: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_Cl_EditarActionPerformed

    private void Cl_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cl_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cl_BuscarActionPerformed

    private void Cl_CrearDocIdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cl_CrearDocIdentidadActionPerformed
        // TODO add your handling code here:
        AgregarDocumentoIdentidadVista panel = new AgregarDocumentoIdentidadVista();

        javax.swing.JFrame frame = new javax.swing.JFrame("Registrar Documento de Identidad");
        frame.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null); // Centrar
        frame.setVisible(true);
    }//GEN-LAST:event_Cl_CrearDocIdentidadActionPerformed
    
    private void mostrarClientesEnTabla() {
    //Instanciamos lel controlador y la lista
        ClienteControlador controlador = new ClienteControlador();
        List<Cliente> lista = controlador.obtenerClientes();

    // Obtenemos el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) Tabla_Clientes.getModel();
        modelo.setRowCount(0); // Limpiar filas anteriores

    // Agregamos cada cliente al modelo
        for (Cliente c : lista) {
            modelo.addRow(new Object[]{
                c.getIdCliente(),
                c.getIdDocIdentidad(),
                c.getNombre(),
                c.getApellido(),
                c.getDireccion(),
                c.getTelefono(),
                c.getCorreo(),
                c.getEstado(),
                c.getFechaRegistro()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser CI_FechaRegistro;
    private javax.swing.JTextField CL_Nombre;
    private javax.swing.JTextField Cl_Apellido;
    private RSMaterialComponent.RSButtonMaterialIconDos Cl_Buscar;
    private javax.swing.JTextField Cl_Codigo;
    private javax.swing.JTextField Cl_Correo;
    private RSMaterialComponent.RSButtonMaterialIconDos Cl_CrearDocIdentidad;
    private javax.swing.JTextField Cl_Direccion;
    private javax.swing.JTextField Cl_DocumentoIdentidad;
    private RSMaterialComponent.RSButtonMaterialIconDos Cl_Editar;
    private RSMaterialComponent.RSButtonMaterialIconDos Cl_Eliminar;
    private RSMaterialComponent.RSButtonMaterialIconDos Cl_Guardar;
    private javax.swing.JTextField Cl_Telefono;
    private javax.swing.JComboBox<String> ComboEstado;
    private javax.swing.JTable Tabla_Clientes;
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
    private javax.swing.JScrollPane jScrollPane1;
    private extra.PanelRound panelRound4;
    private extra.PanelRound panelRound5;
    private RSMaterialComponent.RSButtonMaterialIconDos rSButtonMaterialIconDos1;
    // End of variables declaration//GEN-END:variables

    public void setCodigo(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
