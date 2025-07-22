package extra;

import java.math.BigDecimal;

public class Validaciones {

	public static boolean esBigDecimalValido(String valor) {
		try {
			new BigDecimal(valor);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean esEnteroValido(String valor) {
		if (valor == null || valor.trim().isEmpty()) {
			return false;
		}
		try {
			Integer.parseInt(valor.trim());
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
