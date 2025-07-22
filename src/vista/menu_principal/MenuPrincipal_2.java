package vista.menu_principal;

import RSMaterialComponent.RSButtonFormaIcon;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import modelo.autenticacion.Empleado;
import vista.autenticacion.Registro_EmpleadoVista;
import vista.clientes.Registro_ClienteVista;
import vista.informacion.InformacionVista;
import vista.inventario.materiales_intermedios.Registro_MIVista;
import vista.inventario.materias_primas.Registro_MPVista;
import vista.inventario.productos_terminados.Registro_PTVista;
import vista.pedidos_ventas.PedidosVista;
import vista.proveedores.Registro_ProveedorVista;

public class MenuPrincipal_2 extends javax.swing.JFrame {


	private Empleado empleadoLogeado;

	public MenuPrincipal_2() {
        System.setProperty("sun.java2d.opengl", "true");
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/icon32x32.png"));
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);

        HomeVista h = new HomeVista();
        h.setLocation(0, 0);
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
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btn_home = new RSMaterialComponent.RSButtonFormaIcon();
        btn_cliente = new RSMaterialComponent.RSButtonFormaIcon();
        btn_empleado = new RSMaterialComponent.RSButtonFormaIcon();
        btn_proveedor = new RSMaterialComponent.RSButtonFormaIcon();
        btn_pedido = new RSMaterialComponent.RSButtonFormaIcon();
        btn_producto = new RSMaterialComponent.RSButtonFormaIcon();
        btn_prima = new RSMaterialComponent.RSButtonFormaIcon();
        btn_materialIntermedio = new RSMaterialComponent.RSButtonFormaIcon();
        btn_compras = new RSMaterialComponent.RSButtonFormaIcon();
        btn_informacion = new RSMaterialComponent.RSButtonFormaIcon();
        btn_close = new RSMaterialComponent.RSButtonFormaIcon();
        ContentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menú Principal");
        setMinimumSize(new java.awt.Dimension(1153, 700));

        LateralPanel.setBackground(new java.awt.Color(28, 27, 32));

        jLabel1.setBackground(new java.awt.Color(249, 247, 253));
        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(249, 247, 253));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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

        jSeparator2.setForeground(new java.awt.Color(193, 193, 196));
        jSeparator2.setToolTipText("");
        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N

        jLabel3.setForeground(new java.awt.Color(118, 119, 123));
        jLabel3.setText("Control de Acceso");

        btn_home.setBackground(new java.awt.Color(28, 27, 32));
        btn_home.setText("  Home");
        btn_home.setBackgroundHover(new java.awt.Color(17, 14, 20));
        btn_home.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.RECT);
        btn_home.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HOME);
        btn_home.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.LEFT);
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        btn_cliente.setBackground(new java.awt.Color(28, 27, 32));
        btn_cliente.setText("  Clientes");
        btn_cliente.setBackgroundHover(new java.awt.Color(17, 14, 20));
        btn_cliente.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.RECT);
        btn_cliente.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.GROUP);
        btn_cliente.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.LEFT);
        btn_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clienteActionPerformed(evt);
            }
        });

        btn_empleado.setBackground(new java.awt.Color(28, 27, 32));
        btn_empleado.setText("  Empleados");
        btn_empleado.setBackgroundHover(new java.awt.Color(17, 14, 20));
        btn_empleado.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.RECT);
        btn_empleado.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.LEFT);
        btn_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empleadoActionPerformed(evt);
            }
        });

        btn_proveedor.setBackground(new java.awt.Color(28, 27, 32));
        btn_proveedor.setText("  Proveedores");
        btn_proveedor.setBackgroundHover(new java.awt.Color(17, 14, 20));
        btn_proveedor.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.RECT);
        btn_proveedor.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.LEFT);
        btn_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proveedorActionPerformed(evt);
            }
        });

        btn_pedido.setBackground(new java.awt.Color(28, 27, 32));
        btn_pedido.setText("  Pedidos");
        btn_pedido.setBackgroundHover(new java.awt.Color(17, 14, 20));
        btn_pedido.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.RECT);
        btn_pedido.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCAL_SHIPPING);
        btn_pedido.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.LEFT);

        btn_producto.setBackground(new java.awt.Color(28, 27, 32));
        btn_producto.setText("  P. Terminados");
        btn_producto.setBackgroundHover(new java.awt.Color(17, 14, 20));
        btn_producto.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.RECT);
        btn_producto.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.DASHBOARD);
        btn_producto.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.LEFT);
        btn_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productoActionPerformed(evt);
            }
        });

        btn_prima.setBackground(new java.awt.Color(28, 27, 32));
        btn_prima.setText("  M. Primas");
        btn_prima.setBackgroundHover(new java.awt.Color(17, 14, 20));
        btn_prima.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.RECT);
        btn_prima.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.FILTER_HDR);
        btn_prima.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.LEFT);
        btn_prima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primaActionPerformed(evt);
            }
        });

        btn_materialIntermedio.setBackground(new java.awt.Color(28, 27, 32));
        btn_materialIntermedio.setText("  M. Intermedios");
        btn_materialIntermedio.setBackgroundHover(new java.awt.Color(17, 14, 20));
        btn_materialIntermedio.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.RECT);
        btn_materialIntermedio.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HOT_TUB);
        btn_materialIntermedio.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.LEFT);
        btn_materialIntermedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_materialIntermedioActionPerformed(evt);
            }
        });

        btn_compras.setBackground(new java.awt.Color(28, 27, 32));
        btn_compras.setText("  Compras");
        btn_compras.setBackgroundHover(new java.awt.Color(17, 14, 20));
        btn_compras.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.RECT);
        btn_compras.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CREDIT_CARD);
        btn_compras.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.LEFT);

        btn_informacion.setBackground(new java.awt.Color(28, 27, 32));
        btn_informacion.setText("  Información");
        btn_informacion.setBackgroundHover(new java.awt.Color(17, 14, 20));
        btn_informacion.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.RECT);
        btn_informacion.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HELP_OUTLINE);
        btn_informacion.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.LEFT);
        btn_informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_informacionActionPerformed(evt);
            }
        });

        btn_close.setBackground(new java.awt.Color(28, 27, 32));
        btn_close.setText("  Cerrar");
        btn_close.setBackgroundHover(new java.awt.Color(17, 14, 20));
        btn_close.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.RECT);
        btn_close.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EXIT_TO_APP);
        btn_close.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.LEFT);

        javax.swing.GroupLayout LateralPanelLayout = new javax.swing.GroupLayout(LateralPanel);
        LateralPanel.setLayout(LateralPanelLayout);
        LateralPanelLayout.setHorizontalGroup(
            LateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LateralPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_prima, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(btn_cliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_home, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LateralPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addComponent(btn_empleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_proveedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_pedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_producto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_materialIntermedio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_compras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_informacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_close, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
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
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_prima, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_materialIntermedio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_compras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        btn_home.setFocusPainted(false);
        btn_cliente.setFocusPainted(false);
        btn_empleado.setFocusPainted(false);
        btn_proveedor.setFocusPainted(false);
        btn_pedido.setFocusPainted(false);
        btn_producto.setFocusPainted(false);
        btn_prima.setFocusPainted(false);
        btn_materialIntermedio.setFocusPainted(false);
        btn_compras.setFocusPainted(false);
        btn_informacion.setFocusPainted(false);
        btn_close.setFocusPainted(false);

        getContentPane().add(LateralPanel, java.awt.BorderLayout.WEST);
        LateralPanel.setPreferredSize(new Dimension(220, 0));

        ContentPanel.setBackground(new java.awt.Color(255, 255, 255));
        ContentPanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(ContentPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setEmpleadoLogeado(Empleado empleadoLogeado) {
        this.empleadoLogeado = empleadoLogeado;
    }

	public Empleado getEmpleadoLogeado() {
		return empleadoLogeado;
	}

	public void setRolNombre(String rol, String nombre) {
		jl_cargo.setText(rol);
		jl_nombre.setText(nombre);
	}

    public void setCloseButtonEvent(ActionListener listener) {
        btn_close.addActionListener(listener);
    }

    public void setPedidoButtonEvent(ActionListener listener) {
        btn_pedido.addActionListener(listener);
    }

    public JPanel getContentPanel() {
        return ContentPanel;
    }

    public RSButtonFormaIcon getBtn_cliente() {
        return btn_cliente;
    }

    public RSButtonFormaIcon getBtn_empleado() {
        return btn_empleado;
    }

    public RSButtonFormaIcon getBtn_home() {
        return btn_home;
    }

    public RSButtonFormaIcon getBtn_informacion() {
        return btn_informacion;
    }

    public RSButtonFormaIcon getBtn_materialIntermedio() {
        return btn_materialIntermedio;
    }

    public RSButtonFormaIcon getBtn_pedido() {
        return btn_pedido;
    }

    public RSButtonFormaIcon getBtn_prima() {
        return btn_prima;
    }

    public RSButtonFormaIcon getBtn_producto() {
        return btn_producto;
    }

    public RSButtonFormaIcon getBtn_proveedor() {
        return btn_proveedor;
    }

    public RSButtonFormaIcon getBtn_compras() {
        return btn_compras;
    }

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        btn_home.setSelected(true);
        btn_cliente.setSelected(false);
        btn_empleado.setSelected(false);
        btn_proveedor.setSelected(false);
        btn_pedido.setSelected(false);
        btn_producto.setSelected(false);
        btn_prima.setSelected(false);
        btn_materialIntermedio.setSelected(false);
        btn_compras.setSelected(false);
        btn_informacion.setSelected(false);

        HomeVista h = new HomeVista();
        h.setLocation(0, 0);

        ContentPanel.removeAll();
        ContentPanel.add(h, BorderLayout.CENTER);
        ContentPanel.revalidate();
        ContentPanel.repaint();
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clienteActionPerformed
        btn_home.setSelected(false);
        btn_cliente.setSelected(true);
        btn_empleado.setSelected(false);
        btn_proveedor.setSelected(false);
        btn_pedido.setSelected(false);
        btn_producto.setSelected(false);
        btn_prima.setSelected(false);
        btn_materialIntermedio.setSelected(false);
        btn_compras.setSelected(false);
        btn_informacion.setSelected(false);

        Registro_ClienteVista Cl = new Registro_ClienteVista();
        Cl.setLocation(0, 0);

        ContentPanel.removeAll();
        ContentPanel.add(Cl, BorderLayout.CENTER);
        ContentPanel.revalidate();
        ContentPanel.repaint();
    }//GEN-LAST:event_btn_clienteActionPerformed

    private void btn_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empleadoActionPerformed
        btn_home.setSelected(false);
        btn_cliente.setSelected(false);
        btn_empleado.setSelected(true);
        btn_proveedor.setSelected(false);
        btn_pedido.setSelected(false);
        btn_producto.setSelected(false);
        btn_prima.setSelected(false);
        btn_materialIntermedio.setSelected(false);
        btn_compras.setSelected(false);
        btn_informacion.setSelected(false);

        Registro_EmpleadoVista empleado = new Registro_EmpleadoVista();
        empleado.setLocation(0, 0);

        ContentPanel.removeAll();
        ContentPanel.add(empleado, BorderLayout.CENTER);
        ContentPanel.revalidate();
        ContentPanel.repaint();
    }//GEN-LAST:event_btn_empleadoActionPerformed

    private void btn_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proveedorActionPerformed
        btn_home.setSelected(false);
        btn_cliente.setSelected(false);
        btn_empleado.setSelected(false);
        btn_proveedor.setSelected(true);
        btn_pedido.setSelected(false);
        btn_producto.setSelected(false);
        btn_prima.setSelected(false);
        btn_materialIntermedio.setSelected(false);
        btn_compras.setSelected(false);
        btn_informacion.setSelected(false);

        Registro_ProveedorVista Pr = new Registro_ProveedorVista();
        Pr.setLocation(0, 0);

        ContentPanel.removeAll();
        ContentPanel.add(Pr, BorderLayout.CENTER);
        ContentPanel.revalidate();
        ContentPanel.repaint();
    }//GEN-LAST:event_btn_proveedorActionPerformed

    private void btn_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productoActionPerformed
        btn_home.setSelected(false);
        btn_cliente.setSelected(false);
        btn_empleado.setSelected(false);
        btn_proveedor.setSelected(false);
        btn_pedido.setSelected(false);
        btn_producto.setSelected(true);
        btn_prima.setSelected(false);
        btn_materialIntermedio.setSelected(false);
        btn_compras.setSelected(false);
        btn_informacion.setSelected(false);

        Registro_PTVista Pro = new Registro_PTVista();
        Pro.setLocation(0, 0);

        ContentPanel.removeAll();
        ContentPanel.add(Pro, BorderLayout.CENTER);
        ContentPanel.revalidate();
        ContentPanel.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_productoActionPerformed

    private void btn_primaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primaActionPerformed
        btn_home.setSelected(false);
        btn_cliente.setSelected(false);
        btn_empleado.setSelected(false);
        btn_proveedor.setSelected(false);
        btn_pedido.setSelected(false);
        btn_producto.setSelected(false);
        btn_prima.setSelected(true);
        btn_materialIntermedio.setSelected(false);
        btn_compras.setSelected(false);
        btn_informacion.setSelected(false);

        Registro_MPVista Pri = new Registro_MPVista();
        Pri.setLocation(0, 0);

        ContentPanel.removeAll();
        ContentPanel.add(Pri, BorderLayout.CENTER);
        ContentPanel.revalidate();
        ContentPanel.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_primaActionPerformed

    private void btn_materialIntermedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_materialIntermedioActionPerformed
        btn_home.setSelected(false);
        btn_cliente.setSelected(false);
        btn_empleado.setSelected(false);
        btn_proveedor.setSelected(false);
        btn_pedido.setSelected(false);
        btn_producto.setSelected(false);
        btn_prima.setSelected(false);
        btn_materialIntermedio.setSelected(true);
        btn_compras.setSelected(false);
        btn_informacion.setSelected(false);

        Registro_MIVista Int = new Registro_MIVista();
        Int.setLocation(0, 0);

        ContentPanel.removeAll();
        ContentPanel.add(Int, BorderLayout.CENTER);
        ContentPanel.revalidate();
        ContentPanel.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_materialIntermedioActionPerformed

    private void btn_informacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_informacionActionPerformed
        btn_home.setSelected(false);
        btn_cliente.setSelected(false);
        btn_empleado.setSelected(false);
        btn_proveedor.setSelected(false);
        btn_pedido.setSelected(false);
        btn_producto.setSelected(false);
        btn_prima.setSelected(false);
        btn_materialIntermedio.setSelected(false);
        btn_compras.setSelected(false);
        btn_informacion.setSelected(true);

        InformacionVista Info = new InformacionVista();
        Info.setLocation(0, 0);

        ContentPanel.removeAll();
        ContentPanel.add(Info, BorderLayout.CENTER);
        ContentPanel.revalidate();
        ContentPanel.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_informacionActionPerformed

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
    private RSMaterialComponent.RSButtonFormaIcon btn_cliente;
    private RSMaterialComponent.RSButtonFormaIcon btn_close;
    private RSMaterialComponent.RSButtonFormaIcon btn_compras;
    private RSMaterialComponent.RSButtonFormaIcon btn_empleado;
    private RSMaterialComponent.RSButtonFormaIcon btn_home;
    private RSMaterialComponent.RSButtonFormaIcon btn_informacion;
    private RSMaterialComponent.RSButtonFormaIcon btn_materialIntermedio;
    private RSMaterialComponent.RSButtonFormaIcon btn_pedido;
    private RSMaterialComponent.RSButtonFormaIcon btn_prima;
    private RSMaterialComponent.RSButtonFormaIcon btn_producto;
    private RSMaterialComponent.RSButtonFormaIcon btn_proveedor;
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
