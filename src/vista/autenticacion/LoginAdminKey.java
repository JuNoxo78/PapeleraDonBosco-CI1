package vista.autenticacion;

import RSMaterialComponent.RSButtonFormaIcon;
import java.awt.event.ActionListener;
import rojeru_san.rsprogress.RSProgressCircleAnimated;

public class LoginAdminKey extends javax.swing.JPanel {

	public LoginAdminKey() {
		initComponents();
	}

	public RSButtonFormaIcon getJb_autenticarKey() {
		return jb_autenticarKey;
	}

	public RSProgressCircleAnimated getRsp_circleProgress() {
		return rsp_circleProgress;
	}

	public void setJLKeyText(String text) {
		jl_keyText.setText(text);
	}
	public void setVolverButton(ActionListener listener) {
		jb_volverButton.addActionListener(listener);
	}

	public void setAutenticarKeyButton(ActionListener listener) {
		jb_autenticarKey.addActionListener(listener);
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        rSLabelTextIcon1 = new RSMaterialComponent.RSLabelTextIcon();
        jb_volverButton = new RSMaterialComponent.RSButtonFormaIcon();
        rsp_circleProgress = new rojeru_san.rsprogress.RSProgressCircleAnimated();
        jb_autenticarKey = new RSMaterialComponent.RSButtonFormaIcon();
        jl_keyText = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 578, 16));

        rSLabelTextIcon1.setForeground(new java.awt.Color(102, 102, 102));
        rSLabelTextIcon1.setText("  Acceso Administrador del Sistema");
        rSLabelTextIcon1.setColorIcon(new java.awt.Color(102, 102, 102));
        rSLabelTextIcon1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rSLabelTextIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERM_IDENTITY);
        add(rSLabelTextIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 10, 276, 35));

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
        add(jb_volverButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, 79, 34));
        jb_volverButton.setFocusPainted(false);

        rsp_circleProgress.setDoubleBuffered(true);
        rsp_circleProgress.setStringPainted(false);
        rsp_circleProgress.setVelocidad(30);
        add(rsp_circleProgress, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 123, 47, 37));

        jb_autenticarKey.setBackground(new java.awt.Color(51, 153, 0));
        jb_autenticarKey.setText("Autenticar");
        jb_autenticarKey.setBackgroundHover(new java.awt.Color(51, 204, 0));
        jb_autenticarKey.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 13)); // NOI18N
        jb_autenticarKey.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.ROUND);
        jb_autenticarKey.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jb_autenticarKey.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_autenticarKey.setIconTextGap(0);
        jb_autenticarKey.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.VPN_KEY);
        add(jb_autenticarKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 122, 150, 40));
        jb_autenticarKey.setFocusPainted(false);

        jb_autenticarKey.setVisible(false);

        jl_keyText.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 13)); // NOI18N
        jl_keyText.setForeground(new java.awt.Color(51, 51, 51));
        jl_keyText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_keyText.setText("Buscando llave de seguridad...");
        jl_keyText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jl_keyText, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 85, 373, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private RSMaterialComponent.RSButtonFormaIcon jb_autenticarKey;
    private RSMaterialComponent.RSButtonFormaIcon jb_volverButton;
    private javax.swing.JLabel jl_keyText;
    private RSMaterialComponent.RSLabelTextIcon rSLabelTextIcon1;
    private rojeru_san.rsprogress.RSProgressCircleAnimated rsp_circleProgress;
    // End of variables declaration//GEN-END:variables
}
