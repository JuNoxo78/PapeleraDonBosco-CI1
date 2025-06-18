-- Documento de identidad
INSERT INTO `papeleraartesanal`.`docidentidad`
(`idDocIdentidad`, `tipoDocumento`, `numeroDocumento`)
VALUES
('DOC001', 'DNI', '72134465');

-- Rol
INSERT INTO `papeleraartesanal`.`rol`
(`idRol`, `nombreRol`, `descripcion`)
VALUES
('ROL001', 'Administrador', 'Acceso total al sistema, incluyendo gestión de usuarios y configuración.');

-- Empleado
INSERT INTO `papeleraartesanal`.`empleado`
(`idEmpleado`, `idDocIdentidad`, `nombre`, `apellido`, `direccion`, `telefono`, `correo`, `contraseña`, `estado`)
VALUES
('EMP001', 'DOC001', 'Carlos', 'Fernández', 'Av. La Marina 123, Lima', '987654321', 'carlos.fernandez@papelera.com', 'admin123', true);

-- Relación entre Empleado y Rol
INSERT INTO `papeleraartesanal`.`empleadoxrol`
(`idEmpleado`, `idRol`, `fechaRolAñadido`)
VALUES
('EMP001', 'ROL001', '2024-06-01 03:00:00');