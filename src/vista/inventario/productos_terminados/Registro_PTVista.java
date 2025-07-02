/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista.inventario.productos_terminados;

import controlador.inventario.productos_terminados.PTControlador;
import dao.inventario.materias_primas.MPDAO;
import dao.inventario.productos_terminados.PTDAO;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.inventario.productos_terminados.ProductoTerminado;

/**
 *
 * @author brand
 */
public class Registro_PTVista extends javax.swing.JPanel {
    
    ProductoTerminado PT = new ProductoTerminado();
    PTDAO PTDao = new PTDAO();
    DefaultTableModel Controlado = new DefaultTableModel();
    
    public Registro_PTVista() {
        initComponents();
        ListarProductos();
        
        //Evita mostrar fechas pasadas y futuras solo la fecha de hoy
        Date hoy = new Date(); // fecha actual
        PT_Fecha.setMinSelectableDate(hoy);
        PT_Fecha.setMaxSelectableDate(hoy);
        PT_Fecha.setDate(hoy);
        //Desactiva para modificar la fecha registro
        PT_Fecha.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    
    public void ListarProductos() {
    List<ProductoTerminado> productos = PTDao.ListarProductoTerminado(); 
    Controlado = (DefaultTableModel) Tabla_Producto.getModel();
    Controlado.setRowCount(0); // Limpia la tabla antes de llenar

    Object[] fila = new Object[9];

    for (ProductoTerminado pt : productos) {
        fila[0] = pt.getIdProductoTerminado();
        fila[1] = pt.getNombre();
        fila[2] = pt.getDescripcion();
        fila[3] = pt.getPrecio();
        fila[4] = pt.getStockMinimo();
        fila[5] = pt.getTipoPT();
        fila[6] = pt.getDimensiones();
        fila[7] = pt.getFechaSubida();
        Controlado.addRow(fila);
    }

    Tabla_Producto.setModel(Controlado);
}
    
    public void LimpiarTable() {
        for (int i = 0; i < Controlado.getRowCount(); i++) {
            Controlado.removeRow(i);
            i = i - 1;
    }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelRound4 = new extra.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        PT_Codigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PT_Nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PT_Descripcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PT_Precio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Pro_Tipo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        PT_Stock = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        PT_Fecha = new com.toedter.calendar.JDateChooser();
        PT_Dimensiones = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        PT_TipoPT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        panelRound5 = new extra.PanelRound();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Producto = new javax.swing.JTable();
        Pro_Guardar = new RSMaterialComponent.RSButtonMaterialIconDos();
        Pro_Eliminar = new RSMaterialComponent.RSButtonMaterialIconDos();
        Pro_Editar = new RSMaterialComponent.RSButtonMaterialIconDos();
        Pro_Buscar = new RSMaterialComponent.RSButtonMaterialIconDos();
        rSButtonMaterialIconDos5 = new RSMaterialComponent.RSButtonMaterialIconDos();

        setBackground(new java.awt.Color(239, 235, 233));

        jLabel1.setBackground(new java.awt.Color(58, 42, 83));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(38, 7, 6));
        jLabel1.setText("Registro de Productos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(38, 7, 6));
        jLabel2.setText("Complete la informacion de los productos");

        panelRound4.setBackground(new java.awt.Color(255, 255, 255));
        panelRound4.setRoundBottomLeft(75);
        panelRound4.setRoundBottomRight(75);
        panelRound4.setRoundTopLeft(75);
        panelRound4.setRoundTopRight(75);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Codigo:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Descripcion:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Precio:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Tipo:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Stock:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Fecha Creacion:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Dimensiones:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Tipo ");

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PT_TipoPT, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PT_Dimensiones, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel9)
                        .addComponent(PT_Stock, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addComponent(Pro_Tipo, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addComponent(PT_Precio, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addComponent(PT_Descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addComponent(PT_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(PT_Codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                        .addComponent(PT_Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PT_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PT_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PT_Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PT_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pro_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PT_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PT_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PT_Dimensiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PT_TipoPT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRound5.setBackground(new java.awt.Color(255, 255, 255));
        panelRound5.setRoundBottomLeft(75);
        panelRound5.setRoundBottomRight(75);
        panelRound5.setRoundTopLeft(75);
        panelRound5.setRoundTopRight(75);

        Tabla_Producto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Descripcion", "Precio", "Stock", "Tipo", "Dimensiones", "FechaSubida"
            }
        ));
        jScrollPane1.setViewportView(Tabla_Producto);

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(panelRound5);
        panelRound5.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        Pro_Guardar.setBackground(new java.awt.Color(38, 7, 6));
        Pro_Guardar.setText("Guardar");
        Pro_Guardar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SAVE);
        Pro_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pro_GuardarActionPerformed(evt);
            }
        });

        Pro_Eliminar.setBackground(new java.awt.Color(38, 7, 6));
        Pro_Eliminar.setText("Eliminar");
        Pro_Eliminar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DELETE);
        Pro_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pro_EliminarActionPerformed(evt);
            }
        });

        Pro_Editar.setBackground(new java.awt.Color(38, 7, 6));
        Pro_Editar.setText("Editar");
        Pro_Editar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EDIT);
        Pro_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pro_EditarActionPerformed(evt);
            }
        });

        Pro_Buscar.setBackground(new java.awt.Color(38, 7, 6));
        Pro_Buscar.setText("Buscar");
        Pro_Buscar.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        Pro_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pro_BuscarActionPerformed(evt);
            }
        });

        rSButtonMaterialIconDos5.setBackground(new java.awt.Color(38, 7, 6));
        rSButtonMaterialIconDos5.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DASHBOARD);
        rSButtonMaterialIconDos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconDos5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Pro_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Pro_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Pro_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Pro_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(131, 131, 131))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rSButtonMaterialIconDos5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(82, 404, Short.MAX_VALUE)
                .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(rSButtonMaterialIconDos5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelRound4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pro_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pro_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pro_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pro_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Pro_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pro_GuardarActionPerformed
        // TODO add your handling code here:
        // Instanciamos el objeto
        ProductoTerminado PT = new ProductoTerminado();
         // Validar campos obligatorios
        if (PT_Codigo.getText().isBlank() || PT_Nombre.getText().isBlank() ||  PT_Stock.getText().isBlank() || PT_Descripcion.getText().isBlank() ||  PT_Dimensiones.getText().isBlank() || PT_TipoPT.getText().isBlank() ||  PT_Precio.getText().isBlank()) { JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos."); return;
        }
        // Setear campos
        PT.setIdProductoTerminado(PT_Codigo.getText());
        PT.setNombre(PT_Nombre.getText());
        PT.setDescripcion(PT_Descripcion.getText());
        PT.setDimensiones(PT_Dimensiones.getText());
        PT.setTipoPT(PT_TipoPT.getText());
        // Convertir stock a entero
        try {
            PT.setStockMinimo(Integer.parseInt(PT_Stock.getText().trim()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El stock debe ser un número entero válido.");
            return;
        }
        // Convertir precio a BigDecimal
        try {
            PT.setPrecio(new BigDecimal(PT_Precio.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El precio debe ser un número válido.");
            return;
        }
        // Obtener fecha desde JDateChooser
        Date fechaSeleccionada = PT_Fecha.getDate();
        if (fechaSeleccionada == null) {
            JOptionPane.showMessageDialog(null, "Selecciona una fecha de registro.");
            return;
        }
        
        LocalDateTime fechaRegistro = fechaSeleccionada.toInstant()
        .atZone(ZoneId.systemDefault())
        .toLocalDateTime();
        
        // Validar que la fecha no sea pasada
        if (fechaRegistro.toLocalDate().isBefore(LocalDate.now())) {
            JOptionPane.showMessageDialog(null, "No se permite una fecha de registro anterior a hoy.");
            return;
        }

        PT.setFechaSubida(fechaRegistro);

        // Registrar en la base de datos
        
        PTControlador controlador = new PTControlador();
        controlador.registrarProducto(PT);

        // Limpiar y actualizar tabla
        LimpiarProducto();
        LimpiarTable();
        ListarProductos();
    }//GEN-LAST:event_Pro_GuardarActionPerformed

    private void Pro_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pro_EliminarActionPerformed
// Verifica si hay un producto seleccionado
int fila = Tabla_Producto.getSelectedRow();
if (fila == -1) {
    JOptionPane.showMessageDialog(null, "⚠️ Debes seleccionar un Producto Terminado de la tabla para eliminar.");
    return;
}

// Confirmación con el usuario antes de eliminar
int confirmacion = JOptionPane.showConfirmDialog(null,
        "¿Estás seguro de que deseas eliminar este Producto Terminado?",
        "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
if (confirmacion != JOptionPane.YES_OPTION) {
    return;
}

try {
    // Obtiene el ID del producto seleccionado
    String idPT = Tabla_Producto.getValueAt(fila, 0).toString();

    // Llama al controlador (no al DAO directamente)
    PTControlador controlador = new PTControlador();
    boolean eliminado = controlador.eliminarProducto(idPT);

    if (eliminado) {
        JOptionPane.showMessageDialog(null, "✅ Producto Terminado eliminado correctamente.");
        LimpiarProducto();
        LimpiarTable();
        ListarProductos();
    } else {
        JOptionPane.showMessageDialog(null, "❌ No se pudo eliminar el Producto Terminado. Verifica si está relacionado con otros datos.");
    }

} catch (Exception e) {
    // Manejo de errores para usuarios finales
    String mensaje = e.getMessage().toLowerCase();
    if (mensaje.contains("foreign key")) {
        JOptionPane.showMessageDialog(null, "⚠️ Este producto está relacionado con otros datos. No se puede eliminar.");
    } else if (mensaje.contains("too long")) {
        JOptionPane.showMessageDialog(null, "⚠️ Uno de los campos excede el límite permitido.");
    } else {
        JOptionPane.showMessageDialog(null, "❌ Error inesperado al eliminar el Producto Terminado. Intenta nuevamente.");
    }
    e.printStackTrace(); // Para el programador
}

    }//GEN-LAST:event_Pro_EliminarActionPerformed

    private void Pro_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pro_EditarActionPerformed
        // TODO add your handling code here:
        int fila = Tabla_Producto.getSelectedRow();
if (fila == -1) {
    JOptionPane.showMessageDialog(null, "⚠️ Debes seleccionar un Producto Terminado de la tabla para modificar.");
    return;
}

// Confirmación antes de modificar
int confirmacion = JOptionPane.showConfirmDialog(null,
        "¿Estás seguro de que deseas modificar este Producto Terminado?",
        "Confirmar modificación", JOptionPane.YES_NO_OPTION);
if (confirmacion != JOptionPane.YES_OPTION) {
    return;
}

try {
    // Instanciamos y seteamos datos desde formulario
    ProductoTerminado PT = new ProductoTerminado();
    PT.setIdProductoTerminado(Tabla_Producto.getValueAt(fila, 0).toString()); // ID viene de la tabla
    PT.setNombre(PT_Nombre.getText().trim());
    PT.setDescripcion(PT_Descripcion.getText().trim());
    PT.setDimensiones(PT_Dimensiones.getText().trim());
    PT.setTipoPT(PT_TipoPT.getText().trim());
    PT.setStockMinimo(Integer.parseInt(PT_Stock.getText().trim()));
    PT.setPrecio(new BigDecimal(PT_Precio.getText().trim()));

    // Fecha actual como fecha de modificación (opcional)
    PT.setFechaSubida(LocalDateTime.now());

    // Validaciones
    if (PT.getNombre().isEmpty() || PT.getStockMinimo() <= 0) {
        JOptionPane.showMessageDialog(null, "⚠️ El Nombre y Stock deben estar completos y ser válidos.");
        return;
    }

    if (!PT.getNombre().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
        JOptionPane.showMessageDialog(null, "⚠️ El nombre debe contener solo letras.");
        return;
    }

    if (PT.getNombre().length() > 50) {
        JOptionPane.showMessageDialog(null, "⚠️ El nombre excede el límite de 50 caracteres.");
        return;
    }

    // Llamamos al controlador
    PTControlador controlador = new PTControlador();
    boolean modificado = controlador.ModificarProducto(PT);

    if (modificado) {
        JOptionPane.showMessageDialog(null, "✅ Producto Terminado modificado correctamente.");
        LimpiarProducto();
        LimpiarTable();
        ListarProductos();
    } else {
        JOptionPane.showMessageDialog(null, "❌ No se pudo modificar el Producto Terminado.");
    }

} catch (Exception e) {
    String msg = e.getMessage().toLowerCase();
    if (msg.contains("too long")) {
        JOptionPane.showMessageDialog(null, "⚠️ Uno de los campos excede el límite permitido.");
    } else {
        JOptionPane.showMessageDialog(null, "❌ Ocurrió un error al modificar el Producto Terminado. Verifica los datos ingresados.");
    }
    e.printStackTrace();
}

    }//GEN-LAST:event_Pro_EditarActionPerformed

    private void Pro_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pro_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pro_BuscarActionPerformed

    private void rSButtonMaterialIconDos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconDos5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMaterialIconDos5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PT_Codigo;
    private javax.swing.JTextField PT_Descripcion;
    private javax.swing.JTextField PT_Dimensiones;
    private com.toedter.calendar.JDateChooser PT_Fecha;
    private javax.swing.JTextField PT_Nombre;
    private javax.swing.JTextField PT_Precio;
    private javax.swing.JTextField PT_Stock;
    private javax.swing.JTextField PT_TipoPT;
    private RSMaterialComponent.RSButtonMaterialIconDos Pro_Buscar;
    private RSMaterialComponent.RSButtonMaterialIconDos Pro_Editar;
    private RSMaterialComponent.RSButtonMaterialIconDos Pro_Eliminar;
    private RSMaterialComponent.RSButtonMaterialIconDos Pro_Guardar;
    private javax.swing.JTextField Pro_Tipo;
    private javax.swing.JTable Tabla_Producto;
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
    private RSMaterialComponent.RSButtonMaterialIconDos rSButtonMaterialIconDos5;
    // End of variables declaration//GEN-END:variables
private void LimpiarProducto() {
    PT_Codigo.setText("");
    PT_Nombre.setText("");
    PT_Stock.setText("");
    PT_Descripcion.setText("");
    PT_Dimensiones.setText("");
    PT_TipoPT.setText("");
    PT_Precio.setText("");
    PT_Fecha.setDate(null); 
}
}
