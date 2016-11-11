package ModAcc;

/**
 * 
 * @author Diego
 * Modificar de Acceso private
 */

public class AccesoPrivado {

	private String sexo = "Hombre";
	private String nombre = "Diego";
	private String apellido = "Arellano";
	
	private void sex(){
		System.out.println(sexo);
	}
	private void name(){
		System.out.println(nombre);
	}
	private void lastname(){
		System.out.println(apellido);
	}
		
	public static void main(String args[]){
		AccesoPrivado ac = new AccesoPrivado();
		
		ac.sex();
		ac.name();
		ac.lastname();
		
		
	}
	
}