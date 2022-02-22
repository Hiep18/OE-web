package fpoly;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import dao.UserDao;
import enity.User;

@WebServlet({"/admin/ove","/admin/user-edit.jsp","/admin/user-overview.jsp" ,"/admin/user-edit/create",
	"/admin/user-edit/delete","/admin/user-edit/update","/admin/user-overview/edit/*"})
public class AdminUser extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserDao uDao = new UserDao();
		User user = new User();
		List<User> list = uDao.findAll();
		String url ;
		url = req.getRequestURI();
		if(url.contains("/admin/user-edit.jsp")) {
			req.getRequestDispatcher("/views/admin/user-edit.jsp").forward(req, resp);
		}else if(url.contains("/admin/user-overview/edit/")){
			String id = url.substring(url.lastIndexOf("/")+1);
			user = uDao.findById(id);
			req.setAttribute("form", user);
			req.getRequestDispatcher("/views/admin/user-edit.jsp").forward(req, resp);
		}else if(url.contains("/admin/user-overview.jsp")){
			req.setAttribute("items", uDao.findAll());
			req.getRequestDispatcher("/views/admin/user-overview.jsp").forward(req, resp);
		}else if(url.contains("create")) {
			try {
				
					BeanUtils.populate(user, req.getParameterMap());
					uDao.create(user);
					req.setAttribute("items", uDao.findAll());
					req.getRequestDispatcher("/views/admin/user-overview.jsp").forward(req, resp);
				
			} catch (Exception e) {
				req.setAttribute("msg","Tạo không thành công.");
				e.printStackTrace();
			}
		}else if(url.contains("update")) {
			try {
				BeanUtils.populate(user, req.getParameterMap());
				uDao.update(user);
				req.setAttribute("items", uDao.findAll());
				req.getRequestDispatcher("/views/admin/user-overview.jsp").forward(req, resp);
			} catch (Exception e) {
				req.setAttribute("msg","Cập nhập không thành công.");
				e.printStackTrace();
			}
		}else if(url.contains("delete")) {
			try {
				String id = req.getParameter("userID");
				uDao.remove(id);
				req.setAttribute("items", uDao.findAll());
				req.getRequestDispatcher("/views/admin/user-overview.jsp").forward(req, resp);
			} catch (Exception e) {
				e.printStackTrace();
				req.setAttribute("msg","Xóa không thành công.");
			}
		}else {
			req.setAttribute("items", uDao.findAll());
			req.getRequestDispatcher("/views/admin/user-overview.jsp").forward(req, resp);
		} 
		req.setAttribute("form", user);
		req.setAttribute("items", uDao.findAll());
		
	}
	
	protected boolean check(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getParameter("id").equalsIgnoreCase("")) {
			req.setAttribute("msg", "Vui lòng nhập id");
			return false;
		}
		return true;
	}

}
