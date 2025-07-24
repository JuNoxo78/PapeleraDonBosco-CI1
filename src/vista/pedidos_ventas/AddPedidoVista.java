package vista.pedidos_ventas;

import RSMaterialComponent.RSButtonFormaIcon;
import com.toedter.calendar.JDateChooser;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentListener;
import modelo.autenticacion.DocIdentidad;
import modelo.clientes.Cliente;
import modelo.pedidos_ventas.ComprobantePago;
import modelo.pedidos_ventas.DetallePedido;
import modelo.pedidos_ventas.ListaPedidoMI;
import modelo.pedidos_ventas.Pedido;
import modelo.pedidos_ventas.Venta;

public class AddPedidoVista extends javax.swing.JDialog {
	private Cliente clienteCreado = new Cliente();
	private DocIdentidad docIdentidadCreado = new DocIdentidad();
	private Pedido pedidoCreado = new Pedido();
	private Venta ventaCreada = new Venta();
	private ComprobantePago comprobantePago = new ComprobantePago();
	private ArrayList<DetallePedido> listDetallePedido = new ArrayList<>();
	private ArrayList<ListaPedidoMI> listaPedidoMI = new ArrayList<>();
	private List<String> idsPTSeleccionados;
	private List<String> idsMISeleccionados;

	public AddPedidoVista(java.awt.Frame parent, boolean modal) {
		super(parent, modal);
		initComponents();
		this.setLocationRelativeTo(null);
		Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/assets/icon32x32.png"));
		this.setIconImage(icono);
	}

	public ArrayList<DetallePedido> getListDetallePedido() {
		return listDetallePedido;
	}

	public void setListDetallePedido(ArrayList<DetallePedido> listDetallePedido) {
		this.listDetallePedido = listDetallePedido;
	}

	public ArrayList<ListaPedidoMI> getListaPedidoMI() {
		return listaPedidoMI;
	}

	public void setListaPedidoMI(ArrayList<ListaPedidoMI> listaPedidoMI) {
		this.listaPedidoMI = listaPedidoMI;
	}

	public void setIdsPTSeleccionados(List<String> idsPTSeleccionados) {
		this.idsPTSeleccionados = idsPTSeleccionados;
	}

	public void setIdsMISeleccionados(List<String> idsMISeleccionados) {
		this.idsMISeleccionados = idsMISeleccionados;
	}

	public List<String> getIdsMISeleccionados() {
		return idsMISeleccionados;
	}

	public List<String> getIdsPTSeleccionados() {
		return idsPTSeleccionados;
	}

	public JPanel getJp_contenido() {
		return jp_contenido;
	}

	public JComboBox<String> getJcb_metodoPago() {
		return jcb_metodoPago;
	}

	public void setRsb_verDocumento(ActionListener listener) {
		rsb_verDocumento.addActionListener(listener);
	}

	public ComprobantePago getComprobantePago() {
		return comprobantePago;
	}

	public JTextField getJt_rutaArchivo() {
		return jt_rutaArchivo;
	}

	public JButton getJb_addComprobante() {
		return jb_addComprobante;
	}

	public JDateChooser getJdatec_fechaEmision() {
		return jdatec_fechaEmision;
	}

	public JTextField getJt_idCompPago() {
		return jt_idCompPago;
	}

	public JTextField getJt_numComprobante() {
		return jt_numComprobante;
	}

	public JTextField getJt_montoTotal() {
		return jt_montoTotal;
	}

	public JComboBox<String> getJcb_tipoComprobante() {
		return jcb_tipoComprobante;
	}

	public RSButtonFormaIcon getRsb_verDocumento() {
		return rsb_verDocumento;
	}

	public JComboBox<String> getJcb_estadoPago() {
		return jcb_estadoPago;
	}

	public void setJcb_estadoPagoEvent(ActionListener listener) {
		jcb_estadoPago.addActionListener(listener);
	}

	public Venta getVentaCreada() {
		return ventaCreada;
	}

	public void setVentaCreada(Venta ventaCreada) {
		this.ventaCreada = ventaCreada;
	}

	public JTextField getJt_idVenta() {
		return jt_idVenta;
	}

	public JTextArea getJta_observaciones() {
		return jta_observaciones;
	}

	public Pedido getPedidoCreado() {
		return pedidoCreado;
	}

	public void setPedidoCreado(Pedido pedidoCreado) {
		this.pedidoCreado = pedidoCreado;
	}

	public void setJb_cancelar(ActionListener listener) {
		jb_cancelar.addActionListener(listener);
	}

	public void setJb_addPedidoEvent(ActionListener listener) {
		jb_addPedido.addActionListener(listener);
	}

	public JTextField getJt_idPedido() {
		return jt_idPedido;
	}

	public DocIdentidad getDocIdentidadCreado() {
		return docIdentidadCreado;
	}

	public void setDocIdentidadCreado(DocIdentidad docIdentidadCreado) {
		this.docIdentidadCreado = docIdentidadCreado;
	}

	public JTextField getJt_idCliente() {
		return jt_idCliente;
	}

	public Cliente getClienteCreado() {
		return clienteCreado;
	}

	public void setRsb_addClienteEvent(ActionListener listener) {
		rsb_addCliente.addActionListener(listener);
	}

	public JComboBox<String> getJcb_estadoPedido() {
		return jcb_estadoPedido;
	}

	public void setJcb_estadoPedidoEvent(ActionListener listener) {
		jcb_estadoPedido.addActionListener(listener);
	}

	public RSButtonFormaIcon getJb_warningAdvicePedido() {
		return jb_warningAdvicePedido;
	}

	public RSButtonFormaIcon getJb_warningAdviceVenta() {
		return jb_warningAdviceVenta;
	}

	public void setJdatec_fechaEntregaFocusLost(FocusListener listener) {
		((JTextField) jdatec_fechaEntrega.getDateEditor().getUiComponent()).addFocusListener(listener);
	}

	public void setJdatec_fechaEmisionFocusLost(FocusListener listener) {
		((JTextField) jdatec_fechaEmision.getDateEditor().getUiComponent()).addFocusListener(listener);
	}

	public void setEventoCambioFechaEntrega(DocumentListener listener) {
		JTextField campoFecha = (JTextField) jdatec_fechaEntrega.getDateEditor().getUiComponent();
		campoFecha.getDocument().addDocumentListener(listener);
	}

	public void setEventoCambioFechaEmision(DocumentListener listener) {
		JTextField campoFecha = (JTextField) jdatec_fechaEmision.getDateEditor().getUiComponent();
		campoFecha.getDocument().addDocumentListener(listener);
	}

	public JDateChooser getJdatec_fechaEntrega() {
		return jdatec_fechaEntrega;
	}

	public void setJb_addFileComprobanteEvent(ActionListener listener) {
		jb_addComprobante.addActionListener(listener);
	}

	public void setJb_pedidoAddPT(ActionListener listener) {
		jb_pedidoAddPT.addActionListener(listener);
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jp_pedido = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jt_idPedido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jdatec_fechaEntrega = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_observaciones = new javax.swing.JTextArea();
        jcb_estadoPedido = new javax.swing.JComboBox<>();
        jt_idCliente = new javax.swing.JTextField();
        rsb_addCliente = new RSMaterialComponent.RSButtonFormaIcon();
        jb_warningAdvicePedido = new RSMaterialComponent.RSButtonFormaIcon();
        jPanel2 = new javax.swing.JPanel();
        jt_idVenta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jcb_metodoPago = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jcb_estadoPago = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jb_addComprobante = new javax.swing.JButton();
        jt_rutaArchivo = new javax.swing.JTextField();
        rsb_verDocumento = new RSMaterialComponent.RSButtonFormaIcon();
        jLabel14 = new javax.swing.JLabel();
        jt_idCompPago = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jcb_tipoComprobante = new javax.swing.JComboBox<>();
        jt_numComprobante = new javax.swing.JTextField();
        jt_montoTotal = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jdatec_fechaEmision = new com.toedter.calendar.JDateChooser();
        jb_warningAdviceVenta = new RSMaterialComponent.RSButtonFormaIcon();
        jPanel4 = new javax.swing.JPanel();
        jb_pedidoAddPT = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jp_contenido = new javax.swing.JPanel();
        jb_addPedido = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Pedido");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Pedido");

        jp_pedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedido"));

        jLabel2.setText("Id Pedido:");

        jt_idPedido.setEditable(false);

        jLabel5.setText("Fecha Entrega:");
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel6.setText("Estado:");

        jLabel3.setText("Id Cliente:");

        jLabel4.setText("Observaciones:");

        jta_observaciones.setColumns(20);
        jta_observaciones.setLineWrap(true);
        jta_observaciones.setRows(5);
        jScrollPane1.setViewportView(jta_observaciones);

        jcb_estadoPedido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Iniciar Producción", "En Producción", "Listo para Entrega" }));

        jt_idCliente.setEditable(false);

        rsb_addCliente.setBackground(new java.awt.Color(255, 255, 255));
        rsb_addCliente.setForegroundIcon(new java.awt.Color(0, 112, 192));
        rsb_addCliente.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.RECT);
        rsb_addCliente.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON_ADD);

        jb_warningAdvicePedido.setBackground(new java.awt.Color(255, 255, 255));
        jb_warningAdvicePedido.setToolTipText("");
        jb_warningAdvicePedido.setBackgroundHover(new java.awt.Color(255, 0, 0));
        jb_warningAdvicePedido.setForegroundIcon(new java.awt.Color(255, 0, 0));
        jb_warningAdvicePedido.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.RECT);
        jb_warningAdvicePedido.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.WARNING);

        javax.swing.GroupLayout jp_pedidoLayout = new javax.swing.GroupLayout(jp_pedido);
        jp_pedido.setLayout(jp_pedidoLayout);
        jp_pedidoLayout.setHorizontalGroup(
            jp_pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_pedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_pedidoLayout.createSequentialGroup()
                        .addGroup(jp_pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jp_pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcb_estadoPedido, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_pedidoLayout.createSequentialGroup()
                                .addGroup(jp_pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jp_pedidoLayout.createSequentialGroup()
                                        .addComponent(jt_idPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jt_idCliente))
                                    .addComponent(jdatec_fechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jp_pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rsb_addCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb_warningAdvicePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1)
                    .addGroup(jp_pedidoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp_pedidoLayout.setVerticalGroup(
            jp_pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_pedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jt_idPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rsb_addCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jdatec_fechaEntrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jb_warningAdvicePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_pedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_estadoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );

        rsb_addCliente.setFocusPainted(false);
        jb_warningAdvicePedido.setFocusPainted(false);
        jb_warningAdvicePedido.setVisible(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Venta Asociada"));

        jt_idVenta.setEditable(false);

        jLabel9.setText("Id Venta:");

        jLabel10.setText("Método Pago:");

        jcb_metodoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta", "Efectivo", "Transferencia Bancaria", "Yape/Plin" }));

        jLabel11.setText("Estado Pago:");

        jcb_estadoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pagado Parcialmente", "Pagado" }));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Comprobante de Pago"));

        jLabel12.setText("Ruta Archivo:");

        jb_addComprobante.setText("Añadir Comprobante");

        jt_rutaArchivo.setEditable(false);

        rsb_verDocumento.setBackground(new java.awt.Color(255, 255, 255));
        rsb_verDocumento.setForegroundIcon(new java.awt.Color(0, 112, 192));
        rsb_verDocumento.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.RECT);
        rsb_verDocumento.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LIBRARY_BOOKS);

        jLabel14.setText("Id Comp. Pago:");

        jt_idCompPago.setEditable(false);

        jLabel15.setText("Tipo Comprobante:");

        jLabel16.setText("N° Comprobante:");

        jcb_tipoComprobante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Factura", "Boleta" }));

        jLabel18.setText("MontoTotal");

        jLabel19.setText("Fecha Emisión:");

        jb_warningAdviceVenta.setBackground(new java.awt.Color(255, 255, 255));
        jb_warningAdviceVenta.setToolTipText("");
        jb_warningAdviceVenta.setBackgroundHover(new java.awt.Color(255, 0, 0));
        jb_warningAdviceVenta.setForegroundIcon(new java.awt.Color(255, 0, 0));
        jb_warningAdviceVenta.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.RECT);
        jb_warningAdviceVenta.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.WARNING);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_rutaArchivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rsb_verDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcb_tipoComprobante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_montoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jb_addComprobante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14)
                            .addComponent(jLabel19))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_idCompPago)
                            .addComponent(jt_numComprobante)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jdatec_fechaEmision, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jb_warningAdviceVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jt_rutaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rsb_verDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_addComprobante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdatec_fechaEmision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_warningAdviceVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_idCompPago, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_numComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_tipoComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_montoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rsb_verDocumento.setFocusPainted(false);
        jb_warningAdviceVenta.setFocusPainted(false);
        jb_warningAdviceVenta.setVisible(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jcb_estadoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcb_metodoPago, 0, 0, Short.MAX_VALUE))
                            .addComponent(jt_idVenta))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_idVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_estadoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_metodoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos Terminados y Materiales Intermedios:"));

        jb_pedidoAddPT.setText("Añadir Productos Terminados");

        jp_contenido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jp_contenido.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jb_pedidoAddPT, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                        .addGap(7, 7, 7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jp_contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addComponent(jSeparator1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_pedidoAddPT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jb_addPedido.setText("Agregar Pedido");

        jb_cancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jb_addPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jp_pedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jb_addPedido)
                    .addComponent(jb_cancelar))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jp_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
			java.util.logging.Logger.getLogger(AddPedidoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AddPedidoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AddPedidoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AddPedidoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				AddPedidoVista dialog = new AddPedidoVista(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_addComprobante;
    private javax.swing.JButton jb_addPedido;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_pedidoAddPT;
    private RSMaterialComponent.RSButtonFormaIcon jb_warningAdvicePedido;
    private RSMaterialComponent.RSButtonFormaIcon jb_warningAdviceVenta;
    private javax.swing.JComboBox<String> jcb_estadoPago;
    private javax.swing.JComboBox<String> jcb_estadoPedido;
    private javax.swing.JComboBox<String> jcb_metodoPago;
    private javax.swing.JComboBox<String> jcb_tipoComprobante;
    private com.toedter.calendar.JDateChooser jdatec_fechaEmision;
    private com.toedter.calendar.JDateChooser jdatec_fechaEntrega;
    private javax.swing.JPanel jp_contenido;
    private javax.swing.JPanel jp_pedido;
    private javax.swing.JTextField jt_idCliente;
    private javax.swing.JTextField jt_idCompPago;
    private javax.swing.JTextField jt_idPedido;
    private javax.swing.JTextField jt_idVenta;
    private javax.swing.JTextField jt_montoTotal;
    private javax.swing.JTextField jt_numComprobante;
    private javax.swing.JTextField jt_rutaArchivo;
    private javax.swing.JTextArea jta_observaciones;
    private RSMaterialComponent.RSButtonFormaIcon rsb_addCliente;
    private RSMaterialComponent.RSButtonFormaIcon rsb_verDocumento;
    // End of variables declaration//GEN-END:variables
}
