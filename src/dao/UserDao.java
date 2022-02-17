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
	public User create( User entity) {
		try { 
			em.getTransaction().begin(); 
			em.persist(entity);
			em.getTransaction().commit();
			System.out.println("Thêm mới thành công!");
		} catch (Exception e) { 
			em.getTransaction().rollback();
			System.out.println("Thêm mới thất bại!"+ e);
		}
		return entity; 
	}
	public User update( User entity) {
		try { 
			em.getTransaction().begin(); 
			em.merge(entity);
			em.getTransaction().commit();
			System.out.println("Cập nhật thành công!");
		} catch (Exception e) { 
			em.getTransaction().rollback(); 
			System.out.println("Cập nhật thất bại!");
		}
		return entity;
	}
	public User remove( String id) {
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
		return entity;
	}
	public User findById( String id) {
		User entity = em.find(User.class, id);
		return entity;
	}
	public List<User> findAll() {
		String sqpl="Select u from Users u";
		TypedQuery<User> query = em.createQuery(sqpl,User.class);
		List<User> list = query.getResultList();
		return list;
	}
	
}
