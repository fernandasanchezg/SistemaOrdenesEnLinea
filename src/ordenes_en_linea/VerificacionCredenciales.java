package ordenes_en_linea;

public class VerificacionCredenciales implements Verificador{
	
	//Se crea un usuario, pero tambien se podria hacer una lista con varios usarios
	Usuario usuarioEnfasis = new Usuario("Administrador", "pruebaudem@gmail.com", "123456");

	@Override
	public boolean verificar(String usuario, String clave) {
		
		if (usuario.equals(usuarioEnfasis.correo) && clave.equals(usuarioEnfasis.clave)) {
			//Verificamos que el usuario y la clave coincidan con los ingresado por el usuario
			System.out.println("Login exitoso");
			return true;
		}else {
			System.out.println("Fallo login, credenciales incorrectas");
			return false;
		}
	
	}

}
