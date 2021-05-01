package ordenes_en_linea;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VerificacionRespuestaCacheada implements Verificador{

	Scanner teclado1 = new Scanner(System.in);
	String peticion;
	
	@Override
	public boolean verificar(String usuario, String clave) {
	
		List<String> listaPeticiones = new ArrayList<String>();
		listaPeticiones.add("GET ALL USER");
		listaPeticiones.add("DELETE ALL");
		
		System.out.println("¿Qué petición desea hacer?");
		peticion = teclado1.nextLine();
		
		if(listaPeticiones.contains(peticion)) {
			System.out.println("La petición se encuentra cacheada, ya se proceso Exitosamente");
		}else {
			
			try {
				System.out.println("La peticion no se encuentra cacheada \nProcesando en sistema...");
				Thread.sleep(8000);
				System.out.println("Petición procesada");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		return false;
	}

	

}
