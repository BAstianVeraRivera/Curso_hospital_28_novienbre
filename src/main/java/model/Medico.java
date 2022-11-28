package model;

public class Medico extends Persona {
	private String tituloProfesional;

	public Medico (String nombre, String run, int edad, String tituloProfesional){
		super(nombre, run, edad);
		this.tituloProfesional=tituloProfesional;
	}
	public String toString(){
		return this.getNombre()+","+this.getEdad()+","+this.getRun()+","+this.getTituloProfesional();
	}

	public String getTituloProfesional() {
		return this.tituloProfesional;
	}

	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
	}
}