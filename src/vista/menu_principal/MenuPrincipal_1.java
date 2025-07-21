
package vista.menu_principal;

import vista.informacion.InformacionVista;
import vista.inventario.materiales_intermedios.Registro_MIVista;
import vista.inventario.materias_primas.Registro_MPVista;
import vista.proveedores.Registro_ProveedorVista;
import vista.inventario.productos_terminados.Registro_PTVista;
import vista.pedidos_ventas.PedidosVista;
import vista.autenticacion.Registro_EmpleadoVista;
import vista.clientes.Registro_ClienteVista;
import java.awt.BorderLayout;

public class MenuPrincipal_1 extends javax.swing.JFrame {
    
    public MenuPrincipal_1() {
        initComponents();
        HomeVista h = new HomeVista();
        h.setSize(1269, 837);
        h.setLocation(0,0);
        this.setLocationRelativeTo(null);
        Compatir.add(h,BorderLayout.CENTER);
        Compatir.revalidate();
        Compatir.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        rSButtonMaterialIconDos7 = new RSMaterialComponent.RSButtonMaterialIconDos();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_home = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_cliente = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_proveedor = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_pedido = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_producto = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_prima = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_intermediario = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_documentacion = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_informacion = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_close = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_empleado = new RSMaterialComponent.RSButtonMaterialIconDos();
        Compatir = new javax.swing.JPanel();

        jPanel3.setBackground(new java.awt.Color(62, 39, 35));

        jSeparator2.setToolTipText("");
        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DON BOSCO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(69, 69, 69)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(486, 486, 486))
        );

        jSeparator3.setToolTipText("");
        jSeparator3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N

        rSButtonMaterialIconDos7.setText("CLIENTE");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(239, 235, 233));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 650));

        jPanel2.setBackground(new java.awt.Color(62, 39, 35));

        jSeparator1.setToolTipText("");
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DON BOSCO");

        jSeparator4.setToolTipText("");
        jSeparator4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre y Apellidos");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cargo");

        btn_home.setBackground(new java.awt.Color(62, 39, 35));
        btn_home.setText("HOME");
        btn_home.setBackgroundHover(new java.awt.Color(93, 64, 55));
        btn_home.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btn_home.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HOME);
        btn_home.setPreferredSize(new java.awt.Dimension(150, 35));
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        btn_cliente.setBackground(new java.awt.Color(62, 39, 35));
        btn_cliente.setText("CLIENTE");
        btn_cliente.setBackgroundHover(new java.awt.Color(93, 64, 55));
        btn_cliente.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btn_cliente.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.GROUP);
        btn_cliente.setPreferredSize(new java.awt.Dimension(150, 35));
        btn_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clienteActionPerformed(evt);
            }
        });

        btn_proveedor.setBackground(new java.awt.Color(62, 39, 35));
        btn_proveedor.setText("PROVEEDOR");
        btn_proveedor.setBackgroundHover(new java.awt.Color(93, 64, 55));
        btn_proveedor.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btn_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proveedorActionPerformed(evt);
            }
        });

        btn_pedido.setBackground(new java.awt.Color(62, 39, 35));
        btn_pedido.setText("PEDIDO");
        btn_pedido.setBackgroundHover(new java.awt.Color(93, 64, 55));
        btn_pedido.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btn_pedido.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCAL_SHIPPING);
        btn_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pedidoActionPerformed(evt);
            }
        });

        btn_producto.setBackground(new java.awt.Color(62, 39, 35));
        btn_producto.setText("PRODUCTO");
        btn_producto.setBackgroundHover(new java.awt.Color(93, 64, 55));
        btn_producto.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btn_producto.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DASHBOARD);
        btn_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productoActionPerformed(evt);
            }
        });

        btn_prima.setBackground(new java.awt.Color(62, 39, 35));
        btn_prima.setText("PRIMAS");
        btn_prima.setBackgroundHover(new java.awt.Color(93, 64, 55));
        btn_prima.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btn_prima.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.FILTER_HDR);
        btn_prima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primaActionPerformed(evt);
            }
        });

        btn_intermediario.setBackground(new java.awt.Color(62, 39, 35));
        btn_intermediario.setText("INTERMEDIARIOS");
        btn_intermediario.setBackgroundHover(new java.awt.Color(93, 64, 55));
        btn_intermediario.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btn_intermediario.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.GROUP_ADD);
        btn_intermediario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_intermediarioActionPerformed(evt);
            }
        });

        btn_documentacion.setBackground(new java.awt.Color(62, 39, 35));
        btn_documentacion.setText("DOCUMENTACION");
        btn_documentacion.setBackgroundHover(new java.awt.Color(93, 64, 55));
        btn_documentacion.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btn_documentacion.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LIST);
        btn_documentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_documentacionActionPerformed(evt);
            }
        });

        btn_informacion.setBackground(new java.awt.Color(62, 39, 35));
        btn_informacion.setText("INFORMACION");
        btn_informacion.setBackgroundHover(new java.awt.Color(93, 64, 55));
        btn_informacion.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btn_informacion.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HELP_OUTLINE);
        btn_informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_informacionActionPerformed(evt);
            }
        });

        btn_close.setBackground(new java.awt.Color(62, 39, 35));
        btn_close.setText("CERRAR");
        btn_close.setBackgroundHover(new java.awt.Color(93, 64, 55));
        btn_close.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btn_close.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        btn_empleado.setBackground(new java.awt.Color(62, 39, 35));
        btn_empleado.setText("EMPLEADO");
        btn_empleado.setBackgroundHover(new java.awt.Color(93, 64, 55));
        btn_empleado.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        btn_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_documentacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_intermediario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_producto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_pedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_proveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_empleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_home, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_prima, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator4)
                            .addComponent(jSeparator1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_informacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(40, 40, 40)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_prima, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_intermediario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_documentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btn_informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CompatirLayout = new javax.swing.GroupLayout(Compatir);
        Compatir.setLayout(CompatirLayout);
        CompatirLayout.setHorizontalGroup(
            CompatirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        CompatirLayout.setVerticalGroup(
            CompatirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Compatir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Compatir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        btn_home.setSelected(true);
        btn_cliente.setSelected(false);
        btn_empleado.setSelected(false);
        btn_proveedor.setSelected(false);
        btn_pedido.setSelected(false);
        btn_producto.setSelected(false);
        btn_prima.setSelected(false);
        btn_intermediario.setSelected(false);
        btn_documentacion.setSelected(false);
        btn_informacion.setSelected(false);
        
        HomeVista h = new HomeVista();
        h.setSize(1269, 837);
        h.setLocation(0,0);
        
        Compatir.removeAll();
        Compatir.add(h,BorderLayout.CENTER);
        Compatir.revalidate();
        Compatir.repaint();
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clienteActionPerformed
        btn_home.setSelected(false);
        btn_cliente.setSelected(true);
        btn_empleado.setSelected(false);
        btn_proveedor.setSelected(false);
        btn_pedido.setSelected(false);
        btn_producto.setSelected(false);
        btn_prima.setSelected(false);
        btn_intermediario.setSelected(false);
        btn_documentacion.setSelected(false);
        btn_informacion.setSelected(false);
        
        Registro_ClienteVista Cl = new Registro_ClienteVista();
        Cl.setSize(1269, 837);
        Cl.setLocation(0,0);
        
        Compatir.removeAll();
        Compatir.add(Cl,BorderLayout.CENTER);
        Compatir.revalidate();
        Compatir.repaint();
    }//GEN-LAST:event_btn_clienteActionPerformed

    private void btn_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proveedorActionPerformed
         btn_home.setSelected(false);
        btn_cliente.setSelected(false);
        btn_empleado.setSelected(false);
        btn_proveedor.setSelected(true);
        btn_pedido.setSelected(false);
        btn_producto.setSelected(false);
        btn_prima.setSelected(false);
        btn_intermediario.setSelected(false);
        btn_documentacion.setSelected(false);
        btn_informacion.setSelected(false);
        
        Registro_ProveedorVista Pr = new Registro_ProveedorVista();
        Pr.setSize(1269, 837);
        Pr.setLocation(0,0);
        
        Compatir.removeAll();
        Compatir.add(Pr,BorderLayout.CENTER);
        Compatir.revalidate();
        Compatir.repaint();
    }//GEN-LAST:event_btn_proveedorActionPerformed

    private void btn_intermediarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_intermediarioActionPerformed
        btn_home.setSelected(false);
        btn_cliente.setSelected(false);
        btn_empleado.setSelected(false);
        btn_proveedor.setSelected(false);
        btn_pedido.setSelected(false);
        btn_producto.setSelected(false);
        btn_prima.setSelected(false);
        btn_intermediario.setSelected(true);
        btn_documentacion.setSelected(false);
        btn_informacion.setSelected(false);
        
        Registro_MIVista Int = new Registro_MIVista();
        Int.setSize(1269, 837);
        Int.setLocation(0,0);
        
        Compatir.removeAll();
        Compatir.add(Int,BorderLayout.CENTER);
        Compatir.revalidate();
        Compatir.repaint();
    }//GEN-LAST:event_btn_intermediarioActionPerformed

    private void btn_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pedidoActionPerformed
        btn_home.setSelected(false);
        btn_cliente.setSelected(false);
        btn_empleado.setSelected(false);
        btn_proveedor.setSelected(false);
        btn_pedido.setSelected(true);
        btn_producto.setSelected(false);
        btn_prima.setSelected(false);
        btn_intermediario.setSelected(false);
        btn_documentacion.setSelected(false);
        btn_informacion.setSelected(false);
        
        PedidosVista P = new PedidosVista();
        P.setSize(1269, 837);
        P.setLocation(0,0);
        
        Compatir.removeAll();
        Compatir.add(P,BorderLayout.CENTER);
        Compatir.revalidate();
        Compatir.repaint();
    }//GEN-LAST:event_btn_pedidoActionPerformed

    private void btn_documentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_documentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_documentacionActionPerformed

    private void btn_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productoActionPerformed
        btn_home.setSelected(false);
        btn_cliente.setSelected(false);
        btn_empleado.setSelected(false);
        btn_proveedor.setSelected(false);
        btn_pedido.setSelected(false);
        btn_producto.setSelected(true);
        btn_prima.setSelected(false);
        btn_intermediario.setSelected(false);
        btn_documentacion.setSelected(false);
        btn_informacion.setSelected(false);
        
        Registro_PTVista Pro = new Registro_PTVista();
        Pro.setSize(1269, 837);
        Pro.setLocation(0,0);
        
        Compatir.removeAll();
        Compatir.add(Pro,BorderLayout.CENTER);
        Compatir.revalidate();
        Compatir.repaint();
    }//GEN-LAST:event_btn_productoActionPerformed

    private void btn_primaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primaActionPerformed
        btn_home.setSelected(false);
        btn_cliente.setSelected(false);
        btn_empleado.setSelected(false);
        btn_proveedor.setSelected(false);
        btn_pedido.setSelected(false);
        btn_producto.setSelected(false);
        btn_prima.setSelected(true);
        btn_intermediario.setSelected(false);
        btn_documentacion.setSelected(false);
        btn_informacion.setSelected(false);
        
        Registro_MPVista Pri = new Registro_MPVista();
        Pri.setSize(1269, 837);
        Pri.setLocation(0,0);
        
        Compatir.removeAll();
        Compatir.add(Pri,BorderLayout.CENTER);
        Compatir.revalidate();
        Compatir.repaint();
    }//GEN-LAST:event_btn_primaActionPerformed

    private void btn_informacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_informacionActionPerformed
        btn_home.setSelected(false);
        btn_cliente.setSelected(false);
        btn_empleado.setSelected(false);
        btn_proveedor.setSelected(false);
        btn_pedido.setSelected(false);
        btn_producto.setSelected(false);
        btn_prima.setSelected(false);
        btn_intermediario.setSelected(false);
        btn_documentacion.setSelected(false);
        btn_informacion.setSelected(true);
        
        InformacionVista Info = new InformacionVista();
        Info.setSize(1269, 837);
        Info.setLocation(0,0);
        
        Compatir.removeAll();
        Compatir.add(Info,BorderLayout.CENTER);
        Compatir.revalidate();
        Compatir.repaint();
    }//GEN-LAST:event_btn_informacionActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed

    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empleadoActionPerformed
        btn_home.setSelected(false);
        btn_cliente.setSelected(false);
        btn_empleado.setSelected(true);
        btn_proveedor.setSelected(false);
        btn_pedido.setSelected(false);
        btn_producto.setSelected(false);
        btn_prima.setSelected(false);
        btn_intermediario.setSelected(false);
        btn_documentacion.setSelected(false);
        btn_informacion.setSelected(true);
        
        Registro_EmpleadoVista empleado = new Registro_EmpleadoVista();
        empleado.setSize(1269, 837);
        empleado.setLocation(0,0);
        
        Compatir.removeAll();
        Compatir.add(empleado,BorderLayout.CENTER);
        Compatir.revalidate();
        Compatir.repaint();
    }//GEN-LAST:event_btn_empleadoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Compatir;
    private RSMaterialComponent.RSButtonMaterialIconDos btn_cliente;
    private RSMaterialComponent.RSButtonMaterialIconDos btn_close;
    private RSMaterialComponent.RSButtonMaterialIconDos btn_documentacion;
    private RSMaterialComponent.RSButtonMaterialIconDos btn_empleado;
    private RSMaterialComponent.RSButtonMaterialIconDos btn_home;
    private RSMaterialComponent.RSButtonMaterialIconDos btn_informacion;
    private RSMaterialComponent.RSButtonMaterialIconDos btn_intermediario;
    private RSMaterialComponent.RSButtonMaterialIconDos btn_pedido;
    private RSMaterialComponent.RSButtonMaterialIconDos btn_prima;
    private RSMaterialComponent.RSButtonMaterialIconDos btn_producto;
    private RSMaterialComponent.RSButtonMaterialIconDos btn_proveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private RSMaterialComponent.RSButtonMaterialIconDos rSButtonMaterialIconDos7;
    // End of variables declaration//GEN-END:variables
}
