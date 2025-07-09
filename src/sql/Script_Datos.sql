-- Llenando la tabla almacen
INSERT INTO papeleraartesanal.almacen (idAlmacen, nombre, ubicacionFisica) VALUES
('ALM001', 'Almacén Principal', 'Primer Piso, en Línea de Producción 1'),
('ALM002', 'Almacén Secundario', 'Segundo Piso, Sector B');

-- Llenando la tabla docidentidad
INSERT INTO papeleraartesanal.docidentidad (idDocIdentidad, tipoDocumento, numeroDocumento) VALUES
('DOC001', 'DNI', '72134465'),
('DOC002', 'Pasaporte', 'AB123456'),
('DOC003', 'Carné de Extranjería', '12345678'),
('DOC004', 'Pasaporte', '87654321');


-- Llenando la tabla cliente
INSERT INTO papeleraartesanal.cliente (idCliente, idDocIdentidad, nombre, apellido, direccion, telefono, correo, fechaRegistro) VALUES
('CLI001', 'DOC001', 'Juan', 'Pérez', 'Calle Los Olivos 456', '987654321', 'juan.perez@gmail.com', '2025-03-25 10:00:00'),
('CLI002', 'DOC002', 'Anfa', 'López', 'Av. Los Rosales 123', '912345678', 'ana.lopez@gmail.com', '2025-03-26 11:00:00');

-- Llenando la tabla proveedor
INSERT INTO papeleraartesanal.proveedor (idProveedor, nombre, ruc, direccion, telefono, activo) VALUES
('PROV001', 'Algodones del Perú SAC', '20123456789', 'Av. Industrial 789', '912345678', 1),
('PROV002', 'Textiles Andinos SAC', '20987654321', 'Calle Comercio 321', '987123456', 1);

-- Llenando la tabla empleado
INSERT INTO papeleraartesanal.empleado (idEmpleado, idDocIdentidad, nombre, apellido, direccion, telefono, correo, contraseña, activo, fechaRegistro) VALUES
('EMP001', 'DOC002', 'María', 'Gómez', 'Jr. Los Pinos 321', '987123456', 'maria.gomez@empresa.com', '1234', 1, '2025-03-25 09:00:00'),
('EMP002', 'DOC001', 'Carlos', 'Ramírez', 'Av. Central 654', '912345679', 'carlos.ramirez@empresa.com', '4321', 1, '2025-03-26 10:00:00'),
('EMP003', 'DOC003', 'Juanjo', 'Silas', 'Av. Central 656', '912142329', 'juanjo.silas@empresa.com', 'abcd', 1, '2025-03-26 11:00:00'),
('EMP004', 'DOC004', 'Akana', 'Toki', 'Av. Central 655', '983839835', 'akana.toki@empresa.com', 'dcba', 1, '2025-03-26 14:00:00');

-- Llenando la tabla compra
INSERT INTO papeleraartesanal.compra (idCompra, fechaCompra, totalPagado, estadoCompra, idProveedor, idEmpleado) VALUES
('COM001', '2025-04-01', 1500.50, 'Completada', 'PROV001', 'EMP001'),
('COM002', '2025-04-02', 2500.75, 'Pendiente', 'PROV002', 'EMP002');

-- Llenando la tabla comprobantecompra
INSERT INTO papeleraartesanal.comprobantecompra (idCompCompra, idCompra, codigoComprobante, tipoComprobante, fechaEmision, nombreArchivo, rutaArchivo, fechaSubida) VALUES
('CC001', 'COM001', 'F001-123', 'Factura', '2025-04-01', 'factura001.pdf', '/comprobantes/factura001.pdf', '2025-04-01 10:00:00'),
('CC002', 'COM002', 'F002-124', 'Boleta', '2025-04-02', 'boleta002.pdf', '/comprobantes/boleta002.pdf', '2025-04-02 11:00:00');

-- Llenando la tabla comprobantepago
INSERT INTO papeleraartesanal.comprobantepago (idCompPago, numeroComprobante, tipoComprobante, fechaEmision, montoTotal, nombreArchivo, rutaArchivo, fechaSubida) VALUES
('CP001', 'B001-456', 'Boleta', '2025-04-02', 200.75, 'boleta001.pdf', '/comprobantes/boleta001.pdf', '2025-04-02 11:00:00'),
('CP002', 'F001-457', 'Factura', '2025-04-03', 300.25, 'factura002.pdf', '/comprobantes/factura002.pdf', '2025-04-03 12:00:00');

-- Llenando la tabla materiaprima
INSERT INTO papeleraartesanal.materiaprima (idMateriaPrima, nombre, descripcion, unidadMedida, stockMinimo, tipoMP, rutaImagen, fechaSubida) VALUES
('MP001', 'Algodón peruano', 'Fibra de algodón de alta calidad', 'kg', 50, 'Fibra natural', '/imagenes/mp001.jpg', '2025-03-25 08:00:00'),
('MP002', 'Tinta ecológica', 'Tinta a base de agua', 'litro', 20, 'Tinta', '/imagenes/mp002.jpg', '2025-03-26 09:00:00');

-- Llenando la tabla materialintermedio
INSERT INTO papeleraartesanal.materialintermedio (idMaterialIntermedio, nombre, descripcion, unidad_medida, stockMinimo, tipoMI, rutaImagen, fechaSubida) VALUES
('MI001', 'Papel artesanal A4-001', 'Papel de algodón prensado', 'unidad', 100, 'Fabricado', '/ imagery/mi001.jpg', '2025-03-25 09:00:00'),
('MI002', 'Cartón reciclado', 'Cartón prensado para encuadernación', 'unidad', 80, 'Fabricado', '/imagenes/mi002.jpg', '2025-03-26 10:00:00');

-- Llenando la tabla detallecompra
INSERT INTO papeleraartesanal.detallecompra (idDetalleCompra, idCompra, nombreElemento, tipoElementoComprado, cantidad, idMateriaPrima, idMaterialIntermedio, costoUnitario, costoTotal) VALUES
('DC001', 'COM001', 'Algodón peruano', 'Materia Prima', 100, 'MP001', NULL, 5.50, 550.00),
('DC002', 'COM002', 'Papel artesanal A4-001', 'Material Intermedio', 50, NULL, 'MI001', 10.00, 500.00);

-- Llenando la tabla detallemifabricado
INSERT INTO papeleraartesanal.detallemifabricado (idDetalleMIFabricado, idMaterialIntermedio, dimensiones, gramaje, textura, remate) VALUES
('DMF001', 'MI001', 'A4', '200 g/m²', 'Lisa', 'Bordes rectos'),
('DMF002', 'MI002', 'A3', '300 g/m²', 'Rugosa', 'Bordes biselados');

-- Llenando la tabla venta
INSERT INTO papeleraartesanal.venta (idVenta, idCompPago, fechaVenta, metodoPago, estadoPago) VALUES
('VEN001', 'CP001', '2025-04-02', 'Efectivo', 'Pagado'),
('VEN002', 'CP002', '2025-04-03', 'Tarjeta', 'Pendiente');

-- Llenando la tabla pedido
INSERT INTO papeleraartesanal.pedido (idPedido, idCliente, idEmpleado, observaciones, fechaEntrega, estadoPedido, idVenta, fechaRegistro) VALUES
('PED001', 'CLI001', 'EMP001', 'Pedido de blocs de papel artesanal, con incrustaciones de camote.', '2025-04-10', 'Pendiente', 'VEN001', '2025-04-01 12:00:00'),
('PED002', 'CLI002', 'EMP002', 'Pedido de agendas personalizadas.', '2025-04-12', 'Completado', 'VEN002', '2025-04-02 13:00:00');

-- Llenando la tabla plantillami
INSERT INTO papeleraartesanal.plantillami (idPlantillaMI, observaciones, cantidadObtenidaPT) VALUES
('PLM001', 'Plantilla para agendas A5', 50),
('PLM002', 'Plantilla para cuadernos A4', 30);

-- Llenando la tabla productoterminado
INSERT INTO papeleraartesanal.productoterminado (idProductoTerminado, nombre, descripcion, precio, stockMinimo, tipoPT, dimensiones, idPlantillaMI, rutaImagen, fechaSubida) VALUES
('PT001', 'Agenda A5', 'Agenda artesanal de papel de algodón', 25.00, 20, 'Agenda', 'A5', 'PLM001', '/imagenes/pt001.jpg', '2025-03-25 10:00:00'),
('PT002', 'Cuaderno A4', 'Cuaderno artesanal de papel reciclado', 30.00, 15, 'Cuaderno', 'A4', 'PLM002', '/imagenes/pt002.jpg', '2025-03-26 11:00:00');

-- Llenando la tabla detallepedido
INSERT INTO papeleraartesanal.detallepedido (idPedido, idProductoTerminado, cantidad, precioUnitario) VALUES
('PED001', 'PT001', 10, 25.00),
('PED002', 'PT002', 5, 30.00);

-- Llenando la tabla detalleplantillami
INSERT INTO papeleraartesanal.detalleplantillami (idPlantillaMI, idMaterialIntermedio, cantidadRequerida, comentarios) VALUES
('PLM001', 'MI001', 2, 'Papel A4 para portada'),
('PLM002', 'MI002', 3, 'Cartón para encuadernación');

-- Llenando la tabla rol
INSERT INTO papeleraartesanal.rol (idRol, nombreRol, descripcion) VALUES
('ROL001', 'Administrador de Sistema', 'Gestiona todo el sistema, incluidos el resto de usuarios.'),
('ROL002', 'Supervisor de Inventario', 'Supervisa el inventario de materiales y productos.'),
('ROL003', 'Administrador', 'Supervisa las operaciones generales de la planta. Se encarga de las compras.'),
('ROL004', 'Artesano de PT', 'Se encarga de la fabricación e inventario de productos terminados, así como de los materiales intermedios.');

-- Llenando la tabla empleadoxrol
INSERT INTO papeleraartesanal.empleadoxrol (idEmpleado, idRol, fechaRolAñadido) VALUES
('EMP001', 'ROL001', '2025-03-25 08:00:00'),
('EMP002', 'ROL002', '2025-03-26 09:00:00'),
('EMP003', 'ROL003', '2025-05-26 10:00:00'),
('EMP004', 'ROL004', '2025-05-26 11:00:00');

-- Llenando la tabla inventariomi
INSERT INTO papeleraartesanal.inventariomi (idInventarioMI, idAlmacen, stockLogico, stockFisico, fechaActualizacion, periodo) VALUES
('INV_MI001', 'ALM001', 200, 195, '2025-04-01 09:00:00', '2025-Q1'),
('INV_MI002', 'ALM002', 150, 145, '2025-04-02 10:00:00', '2025-Q1');

-- Llenando la tabla inventariomp
INSERT INTO papeleraartesanal.inventariomp (idInventarioMP, idAlmacen, stockLogico, stockFisico, fechaActualizacion, periodo) VALUES
('INV_MP001', 'ALM001', 300, 290, '2025-04-01 09:00:00', '2025-Q1'),
('INV_MP002', 'ALM002', 250, 240, '2025-04-02 10:00:00', '2025-Q1');

-- Llenando la tabla inventariopt
INSERT INTO papeleraartesanal.inventariopt (idInventarioPT, idAlmacen, stockLogico, stockFisico, fechaActualizacion, periodo) VALUES
('INV_PT001', 'ALM001', 50, 48, '2025-04-01 09:00:00', '2025-Q1'),
('INV_PT002', 'ALM002', 30, 28, '2025-04-02 10:00:00', '2025-Q1');

-- Llenando la tabla movimientomi
INSERT INTO papeleraartesanal.movimientomi (idMovimientoMI, idMaterialIntermedio, fechaMovimiento, tipo, cantidad, idEmpleado, idCompra, idInventarioMI) VALUES
('MOV_MI001', 'MI001', '2025-04-01 10:00:00', 'Entrada', 50, 'EMP001', 'COM001', 'INV_MI001'),
('MOV_MI002', 'MI002', '2025-04-02 11:00:00', 'Salida', 20, 'EMP002', NULL, 'INV_MI002');

-- Llenando la tabla movimientomp
INSERT INTO papeleraartesanal.movimientomp (idMovimientoMP, idMateriaPrima, fechaMovimiento, tipo, cantidad, idEmpleado, idCompra, idInventarioMP) VALUES
('MOV_MP001', 'MP001', '2025-04-01 10:00:00', 'Entrada', 100, 'EMP001', 'COM001', 'INV_MP001'),
('MOV_MP002', 'MP002', '2025-04-02 11:00:00', 'Salida', 30, 'EMP002', NULL, 'INV_MP002');

-- Llenando la tabla movimientopt
INSERT INTO papeleraartesanal.movimientopt (idMovimientoPT, idProductoTerminado, fechaMovimiento, tipo, cantidad, idEmpleado, idInventarioPT) VALUES
('MOV_PT001', 'PT001', '2025-04-01 10:00:00', 'Salida', 10, 'EMP001', 'INV_PT001'),
('MOV_PT002', 'PT002', '2025-04-02 11:00:00', 'Entrada', 15, 'EMP002', 'INV_PT002');

-- Llenando la tabla proveedorxmaterialintermedio
INSERT INTO papeleraartesanal.proveedorxmaterialintermedio (idProveedor, idMaterialIntermedio) VALUES
('PROV001', 'MI001'),
('PROV002', 'MI002');

-- Llenando la tabla proveedorxmateriaprima
INSERT INTO papeleraartesanal.proveedorxmateriaprima (idProveedor, idMateriaPrima) VALUES
('PROV001', 'MP001'),
('PROV002', 'MP002');

-- Llenando la tabla listapedidomi
INSERT INTO papeleraartesanal.listapedidomi (idMaterialIntermedio, idPedido, cantidad, idProductoTerminado) VALUES
('MI001', 'PED001', 5, 'PT001'),
('MI002', 'PED002', 3, 'PT002');

-- Llenando la tabla reporte
INSERT INTO papeleraartesanal.reporte (idReporte, tipo_reporte, nombre, fecha_generacion, idEmpleado, filtros_aplicados, descripcion, estado) VALUES
('REP001', 'Inventario', 'Reporte de Stock 2025-Q1', '2025-04-01 15:00:00', 'EMP001', 'Periodo: 2025-Q1, Almacén: ALM001', 'Reporte de stock bajo', 'Generado'),
('REP002', 'Ventas', 'Reporte de Ventas 2025-Q1', '2025-04-02 16:00:00', 'EMP002', 'Periodo: 2025-Q1', 'Reporte de ventas trimestral', 'Generado');