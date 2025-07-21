package vista.autenticacion;

import java.awt.event.ActionListener;

public class LoginAdminCode extends javax.swing.JPanel {

	public LoginAdminCode() {
		initComponents();
	}

	public void setVolverButton(ActionListener listener) {
		jb_volverButton.addActionListener(listener);
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        rSLabelTextIcon1 = new RSMaterialComponent.RSLabelTextIcon();
        jb_volverButton = new RSMaterialComponent.RSButtonFormaIcon();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        rSLabelTextIcon1.setForeground(new java.awt.Color(102, 102, 102));
        rSLabelTextIcon1.setText("  Acceso Administrador del Sistema");
        rSLabelTextIcon1.setColorIcon(new java.awt.Color(102, 102, 102));
        rSLabelTextIcon1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rSLabelTextIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERM_IDENTITY);

        jb_volverButton.setBackground(new java.awt.Color(239, 235, 233));
        jb_volverButton.setText("Volver  ");
        jb_volverButton.setBackgroundHover(new java.awt.Color(204, 102, 0));
        jb_volverButton.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 13)); // NOI18N
        jb_volverButton.setForegroundIcon(new java.awt.Color(51, 51, 51));
        jb_volverButton.setForegroundText(new java.awt.Color(51, 51, 51));
        jb_volverButton.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.ROUND);
        jb_volverButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jb_volverButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_volverButton.setIconTextGap(0);
        jb_volverButton.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CHEVRON_LEFT);
        jb_volverButton.setPositionIcon(rojeru_san.efectos.ValoresEnum.POSITIONICON.LEFT);

        jLabel1.setText("code");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jb_volverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(rSLabelTextIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(255, 255, 255))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_volverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSLabelTextIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jb_volverButton.setFocusPainted(false);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private RSMaterialComponent.RSButtonFormaIcon jb_volverButton;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon1;
    // End of variables declaration//GEN-END:variables
}
