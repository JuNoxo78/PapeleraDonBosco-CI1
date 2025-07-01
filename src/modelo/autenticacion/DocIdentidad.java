package modelo.autenticacion;

public class DocIdentidad {

	private String idDocIdentidad;
	private String tipoDocumento;
	private String numeroDocumento;

	// Constructor vacío
	public DocIdentidad() {
	}

	// Constructor completo
	public DocIdentidad(String idDocIdentidad, String tipoDocumento, String numeroDocumento) {
		this.idDocIdentidad = idDocIdentidad;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}

	// Getters y setters
	public String getIdDocIdentidad() {
		return idDocIdentidad;
	}

	public void setIdDocIdentidad(String idDocIdentidad) {
		this.idDocIdentidad = idDocIdentidad;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	// Validación básica
	public boolean isValid() {
		return idDocIdentidad != null && !idDocIdentidad.isBlank()
				&& numeroDocumento != null && !numeroDocumento.isBlank();
	}

	// toString para depuración
	@Override
	public String toString() {
		return "DocIdentidad{"
				+ "idDocIdentidad='" + idDocIdentidad + '\''
				+ ", tipoDocumento='" + tipoDocumento + '\''
				+ ", numeroDocumento='" + numeroDocumento + '\''
				+ '}';
	}
}
