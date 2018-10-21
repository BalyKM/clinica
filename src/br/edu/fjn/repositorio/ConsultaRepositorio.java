package br.edu.fjn.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.edu.fjn.clinica.Consulta;
import br.edu.fjn.pessoa.Medico;

public class ConsultaRepositorio {

	public EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("OrmPU");
	
	public void salvar (Consulta consulta) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(consulta);
		em.getTransaction().commit();
		em.close();
	}
	
	public Consulta buscarPorId(Integer id) {
		EntityManager em = emf.createEntityManager();
		Consulta co = em.find(Consulta.class, id);
		em.close();
		return co;
	}
	
	public List<Consulta> listarTodos(){
		EntityManager em =
				emf.createEntityManager();
		Session session = (Session) em.getDelegate();
		Criteria criteria = session.createCriteria(Consulta.class);
		return criteria.list();
	}
}
