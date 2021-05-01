package ordenes_en_linea;

public class App {

	public static void main(String[] args) {
		
		//Se crea un objeto de tipo Verificador que apunta a la clase VerificacionFiltrarSolicitudesFallidas
		Verificador verificador = new VerificacionFiltrarSolicitudesFallidas(); 
				
		verificador.verificar(null, null);
		
	}

}
