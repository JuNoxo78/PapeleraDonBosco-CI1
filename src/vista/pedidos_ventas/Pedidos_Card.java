package vista.pedidos_ventas;

import extra.PanelRound;
import rojeru_san.rspanel.RSPanelImage;

public class Pedidos_Card extends javax.swing.JFrame {

	public Pedidos_Card() {
		initComponents();
		jl_estado.setLineWrap(false);
	}

	public RSPanelImage getJp_image() {
		return jp_image;
	}


	public PanelRound getCardPedido() {
		return cardPedido;
	}

	public PanelRound getCardContent() {
		return cardContent;
	}

	public void setTextJl_estado(String texto) {
		jl_estado.setText(texto);
	}

	public void setTextJl_cliente(String texto) {
		jl_cliente.setText(texto);
	}

	public void setTextJl_fechaEntrega(String texto) {
		jl_fechaEntrega.setText(texto);
	}

	public void setTextJl_title(String texto) {
		jl_title.setText(texto);
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cardPedido = new extra.PanelRound();
        jp_image = new rojeru_san.rspanel.RSPanelImage();
        cardContent = new extra.PanelRound();
        jl_title = new RSMaterialComponent.RSLabelTextIcon();
        jl_cliente = new javax.swing.JLabel();
        jl_fechaEntrega = new javax.swing.JLabel();
        jl_estado = new org.jdesktop.swingx.JXLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cardPedido.setBackground(new java.awt.Color(255, 245, 229));
        cardPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jp_image.setImagen(new javax.swing.ImageIcon(getClass().getResource("/assets/artPaper.png"))); // NOI18N

        javax.swing.GroupLayout jp_imageLayout = new javax.swing.GroupLayout(jp_image);
        jp_image.setLayout(jp_imageLayout);
        jp_imageLayout.setHorizontalGroup(
            jp_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 108, Short.MAX_VALUE)
        );
        jp_imageLayout.setVerticalGroup(
            jp_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        cardContent.setBackground(new java.awt.Color(255, 245, 229));

        jl_title.setForeground(new java.awt.Color(102, 102, 102));
        jl_title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jl_title.setText("    Pedido XYXYXY");
        jl_title.setColorIcon(new java.awt.Color(102, 102, 102));
        jl_title.setFont(new java.awt.Font("Nirmala UI", 1, 13)); // NOI18N
        jl_title.setIconTextGap(0);
        jl_title.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.VIEW_MODULE);

        jl_cliente.setForeground(new java.awt.Color(102, 102, 102));
        jl_cliente.setText("Cliente:");

        jl_fechaEntrega.setForeground(new java.awt.Color(102, 102, 102));
        jl_fechaEntrega.setText("F. Entrega:");
        jl_fechaEntrega.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jl_estado.setForeground(new java.awt.Color(102, 102, 102));
        jl_estado.setText("Estado:");

        javax.swing.GroupLayout cardContentLayout = new javax.swing.GroupLayout(cardContent);
        cardContent.setLayout(cardContentLayout);
        cardContentLayout.setHorizontalGroup(
            cardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jl_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_fechaEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(jl_estado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        cardContentLayout.setVerticalGroup(
            cardContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardContentLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jl_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_fechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout cardPedidoLayout = new javax.swing.GroupLayout(cardPedido);
        cardPedido.setLayout(cardPedidoLayout);
        cardPedidoLayout.setHorizontalGroup(
            cardPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPedidoLayout.createSequentialGroup()
                .addComponent(jp_image, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        cardPedidoLayout.setVerticalGroup(
            cardPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jp_image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cardPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 224, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cardPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 131, Short.MAX_VALUE))
        );

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
			java.util.logging.Logger.getLogger(Pedidos_Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Pedidos_Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Pedidos_Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Pedidos_Card.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
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
				new Pedidos_Card().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private extra.PanelRound cardContent;
    private extra.PanelRound cardPedido;
    private javax.swing.JLabel jl_cliente;
    private org.jdesktop.swingx.JXLabel jl_estado;
    private javax.swing.JLabel jl_fechaEntrega;
    private RSMaterialComponent.RSLabelTextIcon jl_title;
    private rojeru_san.rspanel.RSPanelImage jp_image;
    // End of variables declaration//GEN-END:variables
}
