package vista.autenticacion;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginGeneral extends javax.swing.JFrame {

	public LoginGeneral() {
		initComponents();
		Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/icon32x32.png"));
        this.setIconImage(icono);
		this.setLocationRelativeTo(null);
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_docNum = new RSMaterialComponent.RSTextFieldMaterial();
        txt_contraseña = new RSMaterialComponent.RSPasswordMaterial();
        btn_login = new RSMaterialComponent.RSButtonFormaIcon();
        btn_close = new RSMaterialComponent.RSButtonFormaIcon();
        bt_forgotPass = new rojeru_san.rsbutton.RSButtonForma();
        jb_loginAdministrador = new rojeru_san.rsbutton.RSButtonForma();
        JLBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 650));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(91, 57, 2));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 440));

        jPanel2.setBackground(new java.awt.Color(239, 235, 233));
        jPanel2.setAutoscrolls(true);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Icono_IS_200.jpg"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("<html><div style='text-align: center;'>Software para la gestión integral de la Papelera Artesanal Don Bosco. Derechos Reservados ©</div></html>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        txt_docNum.setBackground(new java.awt.Color(91, 57, 2));
        txt_docNum.setForeground(new java.awt.Color(255, 255, 255));
        txt_docNum.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_docNum.setColorMaterial(new java.awt.Color(225, 196, 134));
        txt_docNum.setDoubleBuffered(true);
        txt_docNum.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        txt_docNum.setPhColor(new java.awt.Color(255, 255, 255));
        txt_docNum.setPhIntensity(200);
        txt_docNum.setPlaceholder("Número Doc. Identidad");

        txt_contraseña.setBackground(new java.awt.Color(91, 57, 2));
        txt_contraseña.setForeground(new java.awt.Color(255, 255, 255));
        txt_contraseña.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_contraseña.setColorMaterial(new java.awt.Color(225, 196, 134));
        txt_contraseña.setDoubleBuffered(true);
        txt_contraseña.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        txt_contraseña.setPhColor(new java.awt.Color(255, 255, 255));
        txt_contraseña.setPhIntensity(200);
        txt_contraseña.setPlaceholder("Contraseña");

        btn_login.setBackground(new java.awt.Color(153, 105, 23));
        btn_login.setText("LOGIN");
        btn_login.setBackgroundHover(new java.awt.Color(195, 121, 3));
        btn_login.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        btn_login.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.ROUND);
        btn_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_login.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOOP);
        btn_login.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.LEFT);

        btn_close.setBackground(new java.awt.Color(153, 105, 23));
        btn_close.setText("CLOSE");
        btn_close.setBackgroundHover(new java.awt.Color(195, 121, 3));
        btn_close.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        btn_close.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.ROUND);
        btn_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_close.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        btn_close.setInheritsPopupMenu(true);
        btn_close.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.LEFT);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        bt_forgotPass.setBackground(new java.awt.Color(153, 105, 23));
        bt_forgotPass.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        bt_forgotPass.setText("Olvidé mi contraseña");
        bt_forgotPass.setColorHover(new java.awt.Color(195, 121, 3));
        bt_forgotPass.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 13)); // NOI18N
        bt_forgotPass.setForma(rojeru_san.rsbutton.RSButtonForma.FORMA.ROUND);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_docNum, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_contraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_forgotPass, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(txt_docNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(bt_forgotPass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        btn_login.setFocusPainted(false);
        btn_close.setFocusPainted(false);
        bt_forgotPass.setFocusPainted(false);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 800, 450));

        jb_loginAdministrador.setBackground(new java.awt.Color(153, 105, 23));
        jb_loginAdministrador.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jb_loginAdministrador.setText("Administrador del Sistema");
        jb_loginAdministrador.setColorHover(new java.awt.Color(195, 121, 3));
        jb_loginAdministrador.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 13)); // NOI18N
        jb_loginAdministrador.setForma(rojeru_san.rsbutton.RSButtonForma.FORMA.ROUND);
        getContentPane().add(jb_loginAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 600, 180, 29));
        jb_loginAdministrador.setFocusPainted(false);

        JLBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bk_1_blur.jpg"))); // NOI18N
        getContentPane().add(JLBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
		System.exit(0);
    }//GEN-LAST:event_btn_closeActionPerformed

	public void setLoginButtonListener(ActionListener listener) {
		btn_login.addActionListener(listener);
		txt_docNum.addActionListener(listener);
		txt_contraseña.addActionListener(listener);
	}

	public void setLoginAdminButtonListener(ActionListener listener) {
		jb_loginAdministrador.addActionListener(listener);
	}

	public String[] getDatosUsuario() {
		String[] datosUsuario = {txt_docNum.getText().trim(), new String(txt_contraseña.getPassword())};
		return datosUsuario;
	}
	
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

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
			java.util.logging.Logger.getLogger(LoginGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(LoginGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(LoginGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(LoginGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LoginGeneral().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLBackground;
    private rojeru_san.rsbutton.RSButtonForma bt_forgotPass;
    private RSMaterialComponent.RSButtonFormaIcon btn_close;
    private RSMaterialComponent.RSButtonFormaIcon btn_login;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojeru_san.rsbutton.RSButtonForma jb_loginAdministrador;
    private RSMaterialComponent.RSPasswordMaterial txt_contraseña;
    private RSMaterialComponent.RSTextFieldMaterial txt_docNum;
    // End of variables declaration//GEN-END:variables
}
