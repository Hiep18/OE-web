package fpoly;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import dao.UserDao;
import enity.User;

@WebServlet({ "/dangnhap", "/dangky", "/quenmatkhau", "/dangxuat" })
public class user extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		switch (path) {
			case "/dangnhap":
				doGetDangNhap(req, resp);
				break;
			case "/dangky":
				doGetDangKy(req, resp);
				break;
			case "/quenmatkhau":
				doGetQuenMatKhau(req, resp);
				break;
			case "/dangxuat":
				doGetDangXuat(req, resp);
				break;
		}
	}
	private void doGetDangNhap(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("views/user/dangnhap.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String path = req.getServletPath();
		switch (path) {
			case "/dangnhap":
				doPostDangNhap(req, resp);
				break;
			case "/dangky":
				doPostDangKy(req, resp);
				break;
			case "/quenmatkhau":
				doPostQuenMatKhau(req, resp);
		}
	}
	private void doPostDangNhap(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String method = req.getMethod();
		if(method.equalsIgnoreCase("POST")) {
		// TODO: ĐĂNG NHẬP
			String id = req.getParameter("user");
			String pw = req.getParameter("pass");
			try {
			UserDao dao = new UserDao();
			User user = dao.findById(id);
			if(!user.getPassword().equals(pw)) {
			req.setAttribute("message", "Sai mật khẩu!");
			}
			else {
			req.setAttribute("message", "Đăng nhập thành công!");
			req.getSession().setAttribute("user", user);
			resp.sendRedirect("/ASM/index");
			}
			} catch (Exception e) {
			req.setAttribute("message", "Sai tên đăng nhập!");
			resp.sendRedirect("/dangnhap");

			}
		}
	}
	private void doGetDangKy(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("views/user/dangky.jsp").forward(req, resp);
	}
	
	private void doPostDangKy(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		UserDao dao = new UserDao();
		User entity = new User();
		
		try {
			String result = req.getParameter("Admin");
			if("true".equals(result)) {
				entity.setAdmin(true);
			}else {
				entity.setAdmin(false);
			}
			entity.setId(req.getParameter("id"));
			entity.setFullname(req.getParameter("fullname"));
			entity.setEmail(req.getParameter("email"));
			entity.setPassword(req.getParameter("pass"));
			dao.create(entity);
			req.setAttribute("message","Thêm mới thành công!");
			resp.sendRedirect("/ASM/dangnhap");
		} catch (Exception e) {
			req.setAttribute("message","Thêm mới thất bại!");
			resp.sendRedirect("/dangky");
		}
	}
	
	private void doGetQuenMatKhau(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("views/user/quenmatkhau.jsp").forward(req, resp);
	}
	
	
	private void doPostQuenMatKhau(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
	}
	
	private void doGetDangXuat(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("views/user/dangxuat.jsp").forward(req, resp);
	}
}
