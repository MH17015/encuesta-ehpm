package sv.gob.models;

public class PersonaEjemplo {
 
	private String nombre;
	private String apellido;
	private String carrera;
	
	public String getNombre(){
		return apellido;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	@Override
	public String toString() {
		return "Nombre: "+nombre+" Apellido: "+apellido+" Carrera: "+carrera;
	}
}
