package model;

import java.util.ArrayList;
import model.Persona;

public class Hospital {
	private Object nombreHospital;
	public ArrayList<Persona> personas = new ArrayList<Persona>();

	public void getNombreHospital() {
		return this.nombreHospital;
	}

	public void setNombreHospital(Object nombreHospital) {
		this.nombreHospital = nombreHospital;
	}

	public void registrarPaciente() {
		throw new UnsupportedOperationException();
	}

	public void despedirMedico() {
		throw new UnsupportedOperationException();
	}

	public void contratarMedico() {
		throw new UnsupportedOperationException();
	}
}