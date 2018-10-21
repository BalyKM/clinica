package br.edu.fjn.clinica;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.edu.fjn.pessoa.Medico;
import br.edu.fjn.pessoa.Paciente;

@Entity
public class Consulta {
	
	@Id
	private Integer id;
	@OneToOne(cascade = CascadeType.ALL)
	private Medico medico;
	@OneToOne(cascade = CascadeType.ALL)
	private Paciente paciente;
	@OneToOne(cascade = CascadeType.ALL)
	private Clinica clinica;
	
	public Consulta() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Clinica getClinica() {
		return clinica;
	}

	public void setClinica(Clinica clinica) {
		this.clinica = clinica;
	}
	
	
}
