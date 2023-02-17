package deberes_pareja;
 import java.util.ArrayList;
public class personas {
	 private String nombre;
	 private int edad;
	 
	public personas(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	ArrayList<personas> persona = new ArrayList<personas>();
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	
	
}