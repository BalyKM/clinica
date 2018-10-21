package br.edu.fjn.repositorio;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.Criteria;
import org.hibernate.Session;
import br.edu.fjn.pessoa.Medico;
import br.edu.fjn.repositorio.MedicoRepositorio;

public class MedicoRepositorio {

	public EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("OrmPU");
	
	public void salvar (Medico medico) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(medico);
		em.getTransaction().commit();
		em.close();
	}
	
	public Medico buscarPorId(Integer id) {
		EntityManager em = emf.createEntityManager();
		Medico m = em.find(Medico.class, id);
		em.close();
		return m;
	}
	
	public List<Medico> listarTodos(){
		EntityManager em =
			emf.createEntityManager();
		Session session = (Session) em.getDelegate();
		Criteria criteria = session.createCriteria(Medico.class);
		return criteria.list();
	}
		
}
