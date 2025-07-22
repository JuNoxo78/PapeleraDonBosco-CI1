package vista.pedidos_ventas;

import controlador.pedidos_ventas.AddMIDetalleControlador;
import extra.AcordeonPanel;
import extra.SingleColumnLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddMIDetalle_PedidosVista extends javax.swing.JPanel {

	public AddMIDetalle_PedidosVista(String idPT, AcordeonPanel acordeon, AddPedido_SelectPTVista selectPTVista, AddPedidoVista agregarPedidoVista) {
		initComponents();
		AddMIDetalleControlador addMIDetalleControlador = new AddMIDetalleControlador(this, idPT, acordeon, selectPTVista, agregarPedidoVista);
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_miDetalleContenedor = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jb_addManualmente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jt_precioUnitario = new javax.swing.JTextField();
        jt_precioTotal = new javax.swing.JTextField();

        jp_miDetalleContenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jp_miDetalleContenedorLayout = new javax.swing.GroupLayout(jp_miDetalleContenedor);
        jp_miDetalleContenedor.setLayout(jp_miDetalleContenedorLayout);
        jp_miDetalleContenedorLayout.setHorizontalGroup(
            jp_miDetalleContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jp_miDetalleContenedorLayout.setVerticalGroup(
            jp_miDetalleContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jButton1.setText("Añadir mediante Plantillas");
        jButton1.setEnabled(false);

        jb_addManualmente.setText("Añadir Manualmente");

        jLabel1.setText("Precio Unitario de PT:");

        jLabel2.setText("Precio Total:");

        jt_precioUnitario.setEditable(false);

        jt_precioTotal.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_miDetalleContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_addManualmente, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jt_precioUnitario, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jt_precioTotal))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jb_addManualmente))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jt_precioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jt_precioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jp_miDetalleContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


	// Getter
	//// Objetos Lógicos

	//// Objetos Visuales
	public JPanel getJp_miDetalleContenedor() {
		return jp_miDetalleContenedor;
	}

	public JTextField getJt_precioUnitario() {
		return jt_precioUnitario;
	}

	public JTextField getJt_precioTotal() {
		return jt_precioTotal;
	}

	public JButton getJb_addManualmente() {
		return jb_addManualmente;
	}

	// Set Events
	public void setJb_addManualmenteEvent(ActionListener listener) {
		jb_addManualmente.addActionListener(listener);
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jb_addManualmente;
    private javax.swing.JPanel jp_miDetalleContenedor;
    private javax.swing.JTextField jt_precioTotal;
    private javax.swing.JTextField jt_precioUnitario;
    // End of variables declaration//GEN-END:variables
}
