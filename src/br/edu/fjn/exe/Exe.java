package br.edu.fjn.exe;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.edu.fjn.clinica.Clinica;
import br.edu.fjn.clinica.Consulta;
import br.edu.fjn.pessoa.Medico;
import br.edu.fjn.pessoa.Paciente;
import br.edu.fjn.pessoa.Pessoa;
import br.edu.fjn.repositorio.ClinicaRepositorio;
import br.edu.fjn.repositorio.ConsultaRepositorio;
import br.edu.fjn.repositorio.MedicoRepositorio;
import br.edu.fjn.repositorio.PacienteRepositorio;

public class Exe{

public static void main(String[] args) {
		
		MedicoRepositorio MedicoRepositorio = 
				new MedicoRepositorio();
	
		ClinicaRepositorio ClinicaRepositorio =
				new ClinicaRepositorio();
		
		PacienteRepositorio PacienteRepositorio = 
				new PacienteRepositorio();
	
		ConsultaRepositorio ConsultaRepositorio =
				new ConsultaRepositorio();

		List<Clinica> clinica = ClinicaRepositorio.listarTodos();
		for (Clinica clinica1: clinica) {
			System.out.println(clinica1.getId());
		}
		List<Consulta> consulta = ConsultaRepositorio.listarTodos();
		for (Consulta consulta1: consulta) {
			System.out.println(consulta1.getId());
		}	
		List<Medico> medico = MedicoRepositorio.listarTodos();
		for (Medico medico1: medico) {
			System.out.println(medico1.getId());
		}			
		List<Paciente> paciente = PacienteRepositorio.listarTodos();
		for (Paciente paciente1: paciente) {
			System.out.println(paciente1.getId());
		}
	
	}
}
		
