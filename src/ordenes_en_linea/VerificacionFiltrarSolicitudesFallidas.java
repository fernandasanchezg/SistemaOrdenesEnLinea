package ordenes_en_linea;

import java.util.Scanner;

public class VerificacionFiltrarSolicitudesFallidas implements Verificador{

	Verificador verificador = new VerificacionCredenciales(); 
	Verificador verificadorSaneador = new VerificacionDatosCrudos();
	Verificador verificadorEnCache = new VerificacionRespuestaCacheada();
	
	Scanner teclado1 = new Scanner(System.in);
	
	@Override
	public boolean verificar(String usuario, String clave) {
		
		//Se define el numero de intentos permitidos para loguearse
		int intentos = 4;
		
		//Ciclo para realizar el o los login
		for (int i = 0; i <= 3; i++) {
			System.out.println("Tiene " + intentos + " intentos");
			
			//Se pide el usuario al cliente
			System.out.println("Ingrese su usuario:");
			usuario = teclado1.nextLine();
			
			//Se pide la clave al cliente
			System.out.println("Ingrese su clave:");
			clave = teclado1.nextLine();
			
			//Se verifican si hay datos crudos con el objeto creado verificador2 
			if(verificadorSaneador.verificar(usuario, clave)) {
				System.out.println("PILAS!! No puede ingresar datos crudos \n Lo vamos a sacar del aplicativo");
				break;
			}
			
			//Se verifica si el login es exitoso y nos salimos del ciclo
			if(verificador.verificar(usuario, clave)) {
				verificadorEnCache.verificar(usuario, clave);
				break;
			}
			intentos -= 1;
		}
		
		return true;
	}

}
