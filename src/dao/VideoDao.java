package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import enity.Video;

public class VideoDao {
	EntityManagerFactory emf;
	EntityManager em;
	public VideoDao() {
		emf = Persistence.createEntityManagerFactory("OE-web");
		em = emf.createEntityManager();
	}
	public boolean insert(Video v) { 
		em.getTransaction().begin();
		try {
			em.persist(v);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		
		return false;
	}
	public boolean update(Video v) {
		em.getTransaction().begin();
		try {
			em.merge(v);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		return false;
	}
	public Video delete(String id) {
		em.getTransaction().begin();
		try {
			Video v = this.doGet(id);
			em.remove(v);
			em.getTransaction().commit();
			return v;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		return null;
	}
	public List<Video> get(){
		em.getTransaction().begin();
		try {
			String jpql = "SELECT o From Video o";
			TypedQuery<Video> query = em.createQuery(jpql, Video.class);
			List<Video> list = query.getResultList();
			em.getTransaction().commit();
			return list;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		return null;
	}
	public Video get(String id){
		em.getTransaction().begin();
		try {
			/*String jpql = "SELECT u From User u WHERE u.id = '"+id+"'";
			TypedQuery<User> query = em.createQuery(jpql, User.class);
			User user  = query.getSingleResult();*/
			Video video = this.doGet(id);
			em.getTransaction().commit();
			return video ;
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		return null;
	}
	private Video doGet(String id) {
		String jpql = "SELECT o From Video o WHERE o.id = '"+id+"'";
		TypedQuery<Video> query = em.createQuery(jpql, Video.class);
		Video video  = query.getSingleResult();
		
		return video;
	}
}
