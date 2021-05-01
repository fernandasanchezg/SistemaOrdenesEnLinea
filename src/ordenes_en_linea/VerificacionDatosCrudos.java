package ordenes_en_linea;

public class VerificacionDatosCrudos implements Verificador {

	@Override
	public boolean verificar(String usuario, String clave) {
		
		//Se verifican si los campos tienen palabras como SQL o SELECT
		if (usuario.toString().contains("SQL") || usuario.toString().contains("SELECT") || clave.toString().contains("SQL")
				|| usuario.toString().contains("SELECT")) {
			return true;
		}else {
			return false;
		}
		
	}
}
