package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import enity.Favorite;

public class FavoriteDao {
	EntityManagerFactory emf;
	EntityManager em;
	public FavoriteDao() {
		emf = Persistence.createEntityManagerFactory("OE-web");
		em = emf.createEntityManager();
	}
	public boolean insert(Favorite f) { 
		em.getTransaction().begin();
		try {
			em.persist(f);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		
		return false;
	}
	public boolean update(Favorite f) {
		em.getTransaction().begin();
		try {
			em.merge(f);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		return false;
	}
	public Favorite delete(String id) {
		em.getTransaction().begin();
		try {
			Favorite f = this.doGet(id);
			em.remove(f);
			em.getTransaction().commit();
			return f;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		return null;
	}
	public List<Favorite> get(){
		em.getTransaction().begin();
		try {
			String jpql = "SELECT o From Favorite o";
			TypedQuery<Favorite> query = em.createQuery(jpql, Favorite.class);
			List<Favorite> list = query.getResultList();
			em.getTransaction().commit();
			return list;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		return null;
	}
	public Favorite get(String id){
		em.getTransaction().begin();
		try {
			/*String jpql = "SELECT u From User u WHERE u.id = '"+id+"'";
			TypedQuery<User> query = em.createQuery(jpql, User.class);
			User user  = query.getSingleResult();*/
			Favorite favorite = this.doGet(id);
			em.getTransaction().commit();
			return favorite ;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		return null;
	}
	private Favorite doGet(String id) {
		String jpql = "SELECT o From Favorite o WHERE o.id = '"+id+"'";
		TypedQuery<Favorite> query = em.createQuery(jpql, Favorite.class);
		Favorite favorite  = query.getSingleResult();
		
		return favorite;
	}
}
