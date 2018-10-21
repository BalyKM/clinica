package br.edu.fjn.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.edu.fjn.clinica.Clinica;
import br.edu.fjn.pessoa.Medico;

public class ClinicaRepositorio {

	public EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("OrmPU");
	
	public void salvar (Clinica clinica) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(clinica);
		em.getTransaction().commit();
		em.close();
	}
	
	public Clinica buscarPorId(Integer id) {
		EntityManager em = emf.createEntityManager();
		Clinica cl = em.find(Clinica.class, id);
		em.close();
		return cl;
	}
	
	public Clinica buscarPorNome(String nome) {
		EntityManager em = emf.createEntityManager();
		Clinica cl = em.find(Clinica.class, nome);
		em.close();
		return cl;
	}
	
	public Clinica buscarPorEspecializacao(String especializacao) {
		EntityManager em = emf.createEntityManager();
		Clinica cl = em.find(Clinica.class, especializacao);
		em.close();
		return cl;
	}
	
	public List<Clinica> listarTodos(){
		EntityManager em =
			emf.createEntityManager();
		Session session = (Session) em.getDelegate();
		Criteria criteria = session.createCriteria(Clinica.class);
		return criteria.list();
	}
}
