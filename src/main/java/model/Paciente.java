package model;

public class Paciente extends Persona {
	private String estadoCivil;

	public Paciente(String nombre, String run, int edad, String estadoCivil) {
		super(nombre, run, edad);
		this.estadoCivil = estadoCivil;
	}
	public String toString(){
		return this.getNombre()+","+this.getEdad()+","+this.getRun()+","+this.getEstadoCivil();
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
}