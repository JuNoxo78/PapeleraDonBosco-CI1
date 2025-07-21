package vista.autenticacion;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LoginAdmin extends javax.swing.JDialog {

	public LoginAdmin(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
		this.setLocationRelativeTo(null);
	}

	public void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje);
	}

	public void setWindowFocusListener(WindowFocusListener listener) {
		this.addWindowFocusListener(listener);
	}

	public void setKeyLoginButton(ActionListener listener) {
		jb_accesoLlave.addActionListener(listener);
	}

	public void setCodeLoginButton(ActionListener listener) {
		jb_accesoCode.addActionListener(listener);
	}

	public JPanel getJp_contentLoginAdmin() {
		return jp_contentLoginAdmin;
	}

	public JPanel getJp_menuLoginAdmin() {
		return jp_menuLoginAdmin;
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jp_contentLoginAdmin = new javax.swing.JPanel();
        jp_menuLoginAdmin = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        rSLabelTextIcon1 = new RSMaterialComponent.RSLabelTextIcon();
        jb_accesoCode = new RSMaterialComponent.RSButtonFormaIcon();
        jb_accesoLlave = new RSMaterialComponent.RSButtonFormaIcon();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Acceso Administrador del Sistema");
        setBackground(new java.awt.Color(153, 255, 51));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(239, 235, 233));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Icono_IS_200.jpg"))); // NOI18N

        jp_contentLoginAdmin.setBackground(new java.awt.Color(255, 255, 255));
        jp_contentLoginAdmin.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 0, 0, new java.awt.Color(185, 11, 6)));
        jp_contentLoginAdmin.setPreferredSize(new java.awt.Dimension(578, 193));
        jp_contentLoginAdmin.setVerifyInputWhenFocusTarget(false);
        jp_contentLoginAdmin.setLayout(new java.awt.BorderLayout());

        jp_menuLoginAdmin.setBackground(new java.awt.Color(255, 255, 255));
        jp_menuLoginAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        rSLabelTextIcon1.setForeground(new java.awt.Color(102, 102, 102));
        rSLabelTextIcon1.setText("  Acceso Administrador del Sistema");
        rSLabelTextIcon1.setColorIcon(new java.awt.Color(102, 102, 102));
        rSLabelTextIcon1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rSLabelTextIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERM_IDENTITY);

        jb_accesoCode.setText("Mediante código de acceso único  ");
        jb_accesoCode.setEnabled(false);
        jb_accesoCode.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 13)); // NOI18N
        jb_accesoCode.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.ROUND);
        jb_accesoCode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jb_accesoCode.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_accesoCode.setIconTextGap(0);
        jb_accesoCode.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EMAIL);

        jb_accesoLlave.setText("Mediante llave de acceso externa ");
        jb_accesoLlave.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 13)); // NOI18N
        jb_accesoLlave.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.ROUND);
        jb_accesoLlave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jb_accesoLlave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_accesoLlave.setIconTextGap(0);
        jb_accesoLlave.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.USB);

        javax.swing.GroupLayout jp_menuLoginAdminLayout = new javax.swing.GroupLayout(jp_menuLoginAdmin);
        jp_menuLoginAdmin.setLayout(jp_menuLoginAdminLayout);
        jp_menuLoginAdminLayout.setHorizontalGroup(
            jp_menuLoginAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jp_menuLoginAdminLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(jp_menuLoginAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_accesoLlave, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                    .addComponent(jb_accesoCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_menuLoginAdminLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(rSLabelTextIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        jp_menuLoginAdminLayout.setVerticalGroup(
            jp_menuLoginAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_menuLoginAdminLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(rSLabelTextIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jb_accesoLlave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_accesoCode, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jb_accesoCode.setFocusPainted(false);
        jb_accesoLlave.setFocusPainted(false);

        jp_contentLoginAdmin.add(jp_menuLoginAdmin, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel7)
                .addGap(239, 239, 239))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jp_contentLoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addGap(20, 20, 20)
                .addComponent(jp_contentLoginAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
			java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(LoginAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the dialog */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				LoginAdmin dialog = new LoginAdmin(new javax.swing.JFrame(), true);
				dialog.addWindowListener(new java.awt.event.WindowAdapter() {
					@Override
					public void windowClosing(java.awt.event.WindowEvent e) {
						System.exit(0);
					}
				});
				dialog.setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private RSMaterialComponent.RSButtonFormaIcon jb_accesoCode;
    private RSMaterialComponent.RSButtonFormaIcon jb_accesoLlave;
    private javax.swing.JPanel jp_contentLoginAdmin;
    private javax.swing.JPanel jp_menuLoginAdmin;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon1;
    // End of variables declaration//GEN-END:variables
}
