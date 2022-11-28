package model;

public abstract class Persona {
	private String nombre;
	private String run;
	private int edad;
	public Persona (String nombre, String run, int edad){
		this.nombre=nombre;
		this.run=run;
		this.edad=edad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRun() {
		return this.run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}