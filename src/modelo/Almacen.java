package modelo;

public class Almacen {

	private String idAlmacen;
	private String nombre;
	private String ubicacionFisica;

	// Constructor vacío
	public Almacen() {
	}

	// Constructor completo
	public Almacen(String idAlmacen, String nombre, String ubicacionFisica) {
		this.idAlmacen = idAlmacen;
		this.nombre = nombre;
		this.ubicacionFisica = ubicacionFisica;
	}

	// Getters y setters
	public String getIdAlmacen() {
		return idAlmacen;
	}

	public void setIdAlmacen(String idAlmacen) {
		this.idAlmacen = idAlmacen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacionFisica() {
		return ubicacionFisica;
	}

	public void setUbicacionFisica(String ubicacionFisica) {
		this.ubicacionFisica = ubicacionFisica;
	}

	// Validación básica
	public boolean isValid() {
		return idAlmacen != null && !idAlmacen.isBlank();
	}

	// toString para depuración
	@Override
	public String toString() {
		return "Almacen{"
				+ "idAlmacen='" + idAlmacen + '\''
				+ ", nombre='" + nombre + '\''
				+ ", ubicacionFisica='" + ubicacionFisica + '\''
				+ '}';
	}
}
