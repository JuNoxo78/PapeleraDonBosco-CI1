package modelo.autenticacion;

public class DocIdentidad {

    private String idDocIdentidad;
    private String tipoDocumento;
    private String numeroDocumento;

    // Constantes para tipos de documentos
    public static final String[] TIPOS_DOCUMENTOS = {"DNI", "Pasaporte", "RUC", "Carnet Extranjeria"};
    public static final int[] LONGITUDES_VALIDAS = {8, 9, 12, 12}; // Longitudes mínimas/máximas según tipo

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

    // Validación
    public boolean isValid() {
        if (idDocIdentidad == null || idDocIdentidad.isBlank() || numeroDocumento == null || numeroDocumento.isBlank()) {
            return false;
        }
        int index = -1;
        for (int i = 0; i < TIPOS_DOCUMENTOS.length; i++) {
            if (TIPOS_DOCUMENTOS[i].equals(tipoDocumento)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false; // Tipo de documento no válido
        }
        int longitudEsperada = LONGITUDES_VALIDAS[index];
        return numeroDocumento.matches("\\d{" + longitudEsperada + "}"); // Solo dígitos con longitud exacta
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
