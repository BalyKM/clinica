package br.edu.fjn.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.edu.fjn.pessoa.Medico;
import br.edu.fjn.pessoa.Paciente;

public class PacienteRepositorio {

	public EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("OrmPU");
	
	public void salvar (Paciente paciente) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(paciente);
		em.getTransaction().commit();
		em.close();
	}
	
	public Paciente buscarPorId(Integer id) {
		EntityManager em = emf.createEntityManager();
		Paciente p = em.find(Paciente.class, id);
		em.close();
		return p;
	}
	
	public Paciente buscarPorPeso(Double peso) {
		EntityManager em = emf.createEntityManager();
		Paciente p = em.find(Paciente.class, peso);
		em.close();
		return p;
	}
	
	public List<Paciente> listarTodos(){
		EntityManager em =
			emf.createEntityManager();
		Session session = (Session) em.getDelegate();
		Criteria criteria = session.createCriteria(Paciente.class);
		return criteria.list();
	}
}
