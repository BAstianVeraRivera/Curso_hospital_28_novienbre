package model;

import java.util.ArrayList;
import model.Persona;

public class Hospital {
	private String nombreHospital;
	public ArrayList<Persona> personas = new ArrayList<Persona>();
	public ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
	public ArrayList<Medico> medicos = new ArrayList<Medico>();
	public ArrayList<Medico> getMedicos() {return medicos;}
	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}


	public Hospital(String nombreHospital) {
		this.nombreHospital = nombreHospital;
	}
	public String getNombreHospital() {
		return this.nombreHospital;
	}

	public void setNombreHospital(String nombreHospital) {
		this.nombreHospital = nombreHospital;
	}

	public void registrarPaciente(Paciente paciente) {
		this.pacientes.add(paciente);
		System.out.println("Paciente registrado");
	}

	public void contratarMedico(Medico doctor) {
		this.medicos.add(doctor);
		System.out.println("Médico contratado");
	}

	public void despedirMedico(Medico doctor) {
		this.personas.remove(doctor);
		System.out.println("Médico despedido");
	}
}