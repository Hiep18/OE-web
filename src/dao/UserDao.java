package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import enity.User;

public class UserDao {
	EntityManagerFactory emf;
	EntityManager em;
	public UserDao() {
		emf = Persistence.createEntityManagerFactory("OE-web");
		em = emf.createEntityManager();
	}
	public List<User> get(){
		em.getTransaction().begin();
		try {
			String jpql = "SELECT o From User o";
			TypedQuery<User> query = em.createQuery(jpql, User.class);
			List<User> list = query.getResultList();
			em.getTransaction().commit();
			return list;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		return null;
	}
	public User get(String id){
		em.getTransaction().begin();
		try {
			/*String jpql = "SELECT u From User u WHERE u.id = '"+id+"'";
			TypedQuery<User> query = em.createQuery(jpql, User.class);
			User user  = query.getSingleResult();*/
			User user = this.doGet(id);
			em.getTransaction().commit();
			return user ;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		return null;
	}
	private User doGet(String id) {
		String jpql = "SELECT o From User o WHERE o.id = '"+id+"'";
		TypedQuery<User> query = em.createQuery(jpql, User.class);
		User user  = query.getSingleResult();
		
		return user;
	}
	public boolean insert(User u) { 
		em.getTransaction().begin();
		try {
			em.persist(u);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		
		return false;
	}
	public boolean update(User u) {
		em.getTransaction().begin();
		try {
			em.merge(u);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		return false;
	}
	public User delete(String id) {
		em.getTransaction().begin();
		try {
			User u = this.doGet(id);
			em.remove(u);
			em.getTransaction().commit();
			return u;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		return null;
	}
	
}
