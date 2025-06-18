package dao;

import modelo.Empleado;
import conf.Conexion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class EmpleadoDAOTest {

    @Mock
    private Connection mockConnection;

    @Mock
    private PreparedStatement mockPreparedStatement;

    @Mock
    private ResultSet mockResultSet;

    @InjectMocks
    private EmpleadoDAO empleadoDAO;

    @BeforeEach
    public void setUp() throws SQLException {
        // Inicializar los mocks
        MockitoAnnotations.openMocks(this);

        // Simular la conexión de la base de datos
        when(Conexion.conectar()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
    }

    @Test
    public void testObtenerTodos_devuelveListaVaciaCuandoNoHayEmpleados() throws SQLException {
        // Simular que no hay resultados en el ResultSet
        when(mockResultSet.next()).thenReturn(false);

        List<Empleado> result = empleadoDAO.obtenerTodos();

        assertNotNull(result);
        assertTrue(result.isEmpty());
        verify(mockPreparedStatement).executeQuery();
    }

    @Test
    public void testObtenerTodos_devuelveListaConEmpleados() throws SQLException {
        // Simular un empleado en el ResultSet
        when(mockResultSet.next()).thenReturn(true, false); // Un solo empleado
        when(mockResultSet.getString("idEmpleado")).thenReturn("1");
        when(mockResultSet.getString("idDocIdentidad")).thenReturn("DOC1");
        when(mockResultSet.getString("nombre")).thenReturn("Juan");
        when(mockResultSet.getString("apellido")).thenReturn("Pérez");
        when(mockResultSet.getString("direccion")).thenReturn("Calle 123");
        when(mockResultSet.getString("telefono")).thenReturn("123456789");
        when(mockResultSet.getString("correo")).thenReturn("juan@example.com");
        when(mockResultSet.getString("contraseña")).thenReturn("pass123");
        when(mockResultSet.getBoolean("estado")).thenReturn(true);

        List<Empleado> result = empleadoDAO.obtenerTodos();

        assertNotNull(result);
        assertEquals(1, result.size());
        Empleado empleado = result.get(0);
        assertEquals("1", empleado.getIdEmpleado());
        assertEquals("Juan", empleado.getNombre());
        assertEquals("Pérez", empleado.getApellido());
        verify(mockPreparedStatement).executeQuery();
    }

    @Test
    public void testBuscarPorDocumentoYContraseña_devuelveEmpleadoCuandoCredencialesValidas() throws SQLException {
        // Simular un empleado encontrado
        when(mockResultSet.next()).thenReturn(true);
        when(mockResultSet.getString("idEmpleado")).thenReturn("1");
        when(mockResultSet.getString("idDocIdentidad")).thenReturn("DOC1");
        when(mockResultSet.getString("nombre")).thenReturn("Juan");
        when(mockResultSet.getString("apellido")).thenReturn("Pérez");
        when(mockResultSet.getString("direccion")).thenReturn("Calle 123");
        when(mockResultSet.getString("telefono")).thenReturn("123456789");
        when(mockResultSet.getString("correo")).thenReturn("juan@example.com");
        when(mockResultSet.getString("contraseña")).thenReturn("pass123");
        when(mockResultSet.getBoolean("estado")).thenReturn(true);

        Empleado result = empleadoDAO.buscarPorDocumentoYContraseña("12345678", "pass123");

        assertNotNull(result);
        assertEquals("1", result.getIdEmpleado());
        assertEquals("Juan", result.getNombre());
        assertEquals("Pérez", result.getApellido());
        verify(mockPreparedStatement).setString(1, "12345678");
        verify(mockPreparedStatement).setString(2, "pass123");
        verify(mockPreparedStatement).executeQuery();
    }

    @Test
    public void testBuscarPorDocumentoYContraseña_devuelveNullCuandoCredencialesInvalidas() throws SQLException {
        // Simular que no se encuentra ningún empleado
        when(mockResultSet.next()).thenReturn(false);

        Empleado result = empleadoDAO.buscarPorDocumentoYContraseña("12345678", "wrongpass");

        assertNull(result);
        verify(mockPreparedStatement).setString(1, "12345678");
        verify(mockPreparedStatement).setString(2, "wrongpass");
        verify(mockPreparedStatement).executeQuery();
    }

    @Test
    public void testObtenerTodos_manejaExcepcionSQL() throws SQLException {
        // Simular una excepción en la conexión
        when(Conexion.conectar()).thenThrow(new SQLException("Error de conexión"));

        List<Empleado> result = empleadoDAO.obtenerTodos();

        assertNotNull(result);
        assertTrue(result.isEmpty()); // Se espera lista vacía al manejar la excepción
    }
}