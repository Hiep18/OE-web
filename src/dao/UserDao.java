package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import enity.User;
import utils.JPAEntity;

public class UserDao {
	
	private EntityManager em = JPAEntity.getEntityManager();
	
	@Override
	protected void finalize() throws Throwable {
		em.close();
		super.finalize();
	}
	
	public void create( User entity) {
		try { 
			em.getTransaction().begin(); 
			em.persist(entity);
			em.getTransaction().commit();
			System.out.println("Thêm mới thành công!");
		} catch (Exception e) { 
			em.getTransaction().rollback();
			System.out.println("Thêm mới thất bại!"+ e);
		}
	}
	public void update( User entity) {
		try { 
			em.getTransaction().begin(); 
			em.merge(entity);
			em.getTransaction().commit();
			System.out.println("Cập nhật thành công!");
		} catch (Exception e) { 
			em.getTransaction().rollback(); 
			System.out.println("Cập nhật thất bại!");
		}
	}
	public void remove( String id) {
		User entity = em.find(User.class, id);
		try {
			em.getTransaction().begin();
			em.remove(entity);
			em.getTransaction().commit();
			System.out.println("Xóa thành công !");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Xóa thất bại !"+ e);
		}
	}
	public User findById( String id) {
		User entity = em.find(User.class, id);
		return entity;
	}
	public List<User> findAll() {
		String sqpl = "Select u from User u";
		TypedQuery<User> query = em.createQuery(sqpl,User.class);
		List<User> list = query.getResultList();
		return list;
	}
	
	public User findByEmail(String email) {
		String jpql ="select u from User u where u.email=:email";
		
			TypedQuery<User> query = em.createQuery(jpql,User.class);
			query.setParameter("email",email);
			return query.getSingleResult();
		
		
	}
	
}
