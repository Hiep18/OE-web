package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import enity.Users;
import utils.JPAEnity;


public class UserDAO {
	private EntityManager em = JPAEnity.getEntityManager();
	@Override
	protected void finalize() throws Throwable {
		em.close();
		super.finalize();
	}
	public Users create( Users entity) {
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
	public Users update( Users entity) {
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
	public Users remove( String id) {
		Users entity = em.find(Users.class, id);
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
	public Users findById( String id) {
		Users entity = em.find(Users.class, id);
		return entity;
	}
	public List<Users> findAll() {
		String sqpl="Select u from Users u";
		TypedQuery<Users> query = em.createQuery(sqpl,Users.class);
		List<Users> list = query.getResultList();
		return list;
	}
}
