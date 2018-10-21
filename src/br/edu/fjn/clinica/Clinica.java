package br.edu.fjn.clinica;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Clinica {
	
	@Id
	private Integer id;
	private String especializacao;
	private String nome;
	
	public Clinica() {
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEspecializacao() {
		return especializacao;
	}
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
