
package vista.menu_principal;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import vista.autenticacion.Registro_EmpleadoVista;
import vista.clientes.Registro_ClienteVista;
import vista.informacion.InformacionVista;
import vista.inventario.materiales_intermedios.Registro_MIVista;
import vista.inventario.materias_primas.Registro_MPVista;
import vista.inventario.productos_terminados.Registro_PTVista;
import vista.pedidos_ventas.Registro_PedidoVista;
import vista.proveedores.Registro_ProveedorVista;

public class MenuPrincipal_2 extends javax.swing.JFrame {

    public MenuPrincipal_2() {
		System.setProperty("sun.java2d.opengl", "true");
        initComponents();
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        HomeVista h = new HomeVista();
        h.setLocation(0,0);
        ContentPanel.add(h, BorderLayout.CENTER);
        ContentPanel.revalidate();
        ContentPanel.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LateralPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelRound1 = new extra.PanelRound();
        jl_cargo = new javax.swing.JLabel();
        jl_nombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_home = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_cliente = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_empleado = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_proveedor = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_pedido = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_producto = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_prima = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_intermediario = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_documentacion = new RSMaterialComponent.RSButtonMaterialIconDos();
        jSeparator2 = new javax.swing.JSeparator();
        btn_informacion = new RSMaterialComponent.RSButtonMaterialIconDos();
        btn_close = new RSMaterialComponent.RSButtonMaterialIconDos();
        jLabel3 = new javax.swing.JLabel();
        ContentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 700));

        LateralPanel.setBackground(new java.awt.Color(28, 27, 32));

        jLabel1.setBackground(new java.awt.Color(249, 247, 253));
        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(249, 247, 253));
        jLabel1.setText("Don Bosco");

        jSeparator1.setForeground(new java.awt.Color(193, 193, 196));
        jSeparator1.setToolTipText("");
        jSeparator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N

        panelRound1.setBackground(new java.awt.Color(19, 21, 23));
        panelRound1.setRoundBottomLeft(25);
        panelRound1.setRoundBottomRight(25);
        panelRound1.setRoundTopLeft(25);
        panelRound1.setRoundTopRight(25);

        jl_cargo.setBackground(new java.awt.Color(249, 247, 253));
        jl_cargo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jl_cargo.setForeground(new java.awt.Color(249, 247, 253));
        jl_cargo.setText("Cargo de Empleado");

        jl_nombre.setBackground(new java.awt.Color(249, 247, 253));
        jl_nombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jl_nombre.setForeground(new java.awt.Color(249, 247, 253));
        jl_nombre.setText("Nombre y Apellidos");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_nombre)
                    .addComponent(jl_cargo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jl_cargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_nombre)
                .addGap(12, 12, 12))
        );

        jLabel2.setForeground(new java.awt.Color(118, 119, 123));
        jLabel2.setText("Navegación");

        btn_home.setBackground(new java.awt.Color(28, 27, 32));
        btn_home.setText("Home");
        btn_home.setBackgroundHover(new java.awt.Color(17, 14, 20));
        btn_home.setDoubleBuffered(true);
        btn_home.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_home.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HOME);
        btn_home.setRippleColor(new java.awt.Color(242, 242, 242));
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        btn_cliente.setBackground(new java.awt.Color(28, 27, 32));
        btn_cliente.setText("Cliente");
        btn_cliente.setBackgroundHover(new java.awt.Color(17, 14, 20));
        btn_cliente.setDoubleBuffered(true);
        btn_cliente.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_cliente.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.GROUP);
        btn_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clienteActionPerformed(evt);
            }
        });

        btn_empleado.setBackground(new java.awt.Color(28, 27, 32));
        btn_empleado.setText("Empleado");
        btn_empleado.setBackgroundHover(new java.awt.Color(17, 14, 20));
        btn_empleado.setDoubleBuffered(true);
        btn_empleado.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empleadoActionPerformed(evt);
            }
        });

        btn_proveedor.setBackground(new java.awt.Color(28, 27, 32));
        btn_proveedor.setText("Proveedor");
        btn_proveedor.setBackgroundHover(new java.awt.Color(17, 14, 20));
        btn_proveedor.setDoubleBuffered(true);
        btn_proveedor.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proveedorActionPerformed(evt);
            }
        });

        btn_pedido.setBackground(new java.awt.Color(28, 27, 32));
        btn_pedido.setText("Pedido");
        btn_pedido.setBackgroundHover(new java.awt.Color(17, 14, 20));
        btn_pedido.setDoubleBuffered(true);
        btn_pedido.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_pedido.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCAL_SHIPPING);
        btn_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pedidoActionPerformed(evt);
            }
        });

        btn_producto.setBackground(new java.awt.Color(28, 27, 32));
        btn_producto.setText("Producto");
        btn_producto.setBackgroundHover(new java.awt.Color(17, 14, 20));
        btn_producto.setDoubleBuffered(true);
        btn_producto.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_producto.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DASHBOARD);
        btn_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productoActionPerformed(evt);
            }
        });

        btn_prima.setBackground(new java.awt.Color(28, 27, 32));
        btn_prima.setText("Primas");
        btn_prima.setBackgroundHover(new java.awt.Color(17, 14, 20));
        btn_prima.setDoubleBuffered(true);
        btn_prima.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_prima.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.FILTER_HDR);
        btn_prima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primaActionPerformed(evt);
            }
        });

        btn_intermediario.setBackground(new java.awt.Color(28, 27, 32));
        btn_intermediario.setText("Intermediarios");
        btn_intermediario.setBackgroundHover(new java.awt.Color(17, 14, 20));
        btn_intermediario.setDoubleBuffered(true);
        btn_intermediario.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_intermediario.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.GROUP_ADD);
        btn_intermediario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_intermediarioActionPerformed(evt);
            }
        });

        btn_documentacion.setBackground(new java.awt.Color(28, 27, 32));
        btn_documentacion.setText("Documentacion");
        btn_documentacion.setBackgroundHover(new java.awt.Color(17, 14, 20));
        btn_documentacion.setDoubleBuffered(true);
        btn_documentacion.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_documentacion.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LIST);

        jSeparator2.setForeground(new java.awt.Color(193, 193, 196));
        jSeparator2.setToolTipText("");
        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N

        btn_informacion.setBackground(new java.awt.Color(28, 27, 32));
        btn_informacion.setText("Informacion");
        btn_informacion.setBackgroundHover(new java.awt.Color(17, 14, 20));
        btn_informacion.setDoubleBuffered(true);
        btn_informacion.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_informacion.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HELP_OUTLINE);
        btn_informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_informacionActionPerformed(evt);
            }
        });

        btn_close.setBackground(new java.awt.Color(28, 27, 32));
        btn_close.setText("Cerrar");
        btn_close.setBackgroundHover(new java.awt.Color(17, 14, 20));
        btn_close.setDoubleBuffered(true);
        btn_close.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btn_close.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EXIT_TO_APP);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(118, 119, 123));
        jLabel3.setText("Control de Acceso");

        javax.swing.GroupLayout LateralPanelLayout = new javax.swing.GroupLayout(LateralPanel);
        LateralPanel.setLayout(LateralPanelLayout);
        LateralPanelLayout.setHorizontalGroup(
            LateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LateralPanelLayout.createSequentialGroup()
                .addGroup(LateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LateralPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1))
                    .addGroup(LateralPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)))
                .addContainerGap(1006, Short.MAX_VALUE))
            .addGroup(LateralPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LateralPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(LateralPanelLayout.createSequentialGroup()
                        .addGroup(LateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(btn_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btn_cliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btn_home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btn_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btn_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btn_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btn_prima, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btn_intermediario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btn_documentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addComponent(btn_informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        LateralPanelLayout.setVerticalGroup(
            LateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LateralPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
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
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        getContentPane().add(LateralPanel, java.awt.BorderLayout.WEST);
        LateralPanel.setPreferredSize(new Dimension(201, 0));

        ContentPanel.setBackground(new java.awt.Color(255, 255, 255));
        ContentPanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(ContentPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

	public void setRolNombre(String rol, String nombre) {
		jl_cargo.setText(rol);
		jl_nombre.setText(nombre);
	}

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_closeActionPerformed

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
        Info.setLocation(0,0);

        ContentPanel.removeAll();
        ContentPanel.add(Info,BorderLayout.CENTER);
        ContentPanel.revalidate();
        ContentPanel.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_informacionActionPerformed

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
        Int.setLocation(0,0);

        ContentPanel.removeAll();
        ContentPanel.add(Int,BorderLayout.CENTER);
        ContentPanel.revalidate();
        ContentPanel.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_intermediarioActionPerformed

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
        Pri.setLocation(0,0);

        ContentPanel.removeAll();
        ContentPanel.add(Pri,BorderLayout.CENTER);
        ContentPanel.revalidate();
        ContentPanel.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_primaActionPerformed

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
        Pro.setLocation(0,0);

        ContentPanel.removeAll();
        ContentPanel.add(Pro,BorderLayout.CENTER);
        ContentPanel.revalidate();
        ContentPanel.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_productoActionPerformed

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

        Registro_PedidoVista P = new Registro_PedidoVista();
        P.setLocation(0,0);

        ContentPanel.removeAll();
        ContentPanel.add(P,BorderLayout.CENTER);
        ContentPanel.revalidate();
        ContentPanel.repaint();
    }//GEN-LAST:event_btn_pedidoActionPerformed

    private void btn_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proveedorActionPerformed
        // TODO add your handling code here:
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
        Pr.setLocation(0,0);

        ContentPanel.removeAll();
        ContentPanel.add(Pr,BorderLayout.CENTER);
        ContentPanel.revalidate();
        ContentPanel.repaint();
    }//GEN-LAST:event_btn_proveedorActionPerformed

    private void btn_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empleadoActionPerformed
        // TODO add your handling code here:
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
        empleado.setLocation(0,0);

        ContentPanel.removeAll();
        ContentPanel.add(empleado,BorderLayout.CENTER);
        ContentPanel.revalidate();
        ContentPanel.repaint();
    }//GEN-LAST:event_btn_empleadoActionPerformed

    private void btn_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clienteActionPerformed
        // TODO add your handling code here:
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
        Cl.setLocation(0,0);

        ContentPanel.removeAll();
        ContentPanel.add(Cl,BorderLayout.CENTER);
        ContentPanel.revalidate();
        ContentPanel.repaint();
    }//GEN-LAST:event_btn_clienteActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        // TODO add your handling code here:
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
        h.setLocation(0,0);

        ContentPanel.removeAll();
        ContentPanel.add(h,BorderLayout.CENTER);
        ContentPanel.revalidate();
        ContentPanel.repaint();
    }//GEN-LAST:event_btn_homeActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContentPanel;
    private javax.swing.JPanel LateralPanel;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jl_cargo;
    private javax.swing.JLabel jl_nombre;
    private extra.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
