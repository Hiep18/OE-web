package fpoly;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.UserDAO;
import enity.Users;

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
				doGetDangKy(req, resp);
				break;
		}
	}
	private void doPostDangNhap(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String method = req.getMethod();
		if(method.equalsIgnoreCase("POST")) {
		// TODO: ĐĂNG NHẬP
			String id = req.getParameter("username");
			String pw = req.getParameter("password");
			try {
			UserDAO dao = new UserDAO();
			Users user = dao.findById(id);
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
	private void doGetQuenMatKhau(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("views/user/quenmatkhau.jsp").forward(req, resp);
	}
	private void doGetDangXuat(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("views/user/dangxuat.jsp").forward(req, resp);
	}
}
