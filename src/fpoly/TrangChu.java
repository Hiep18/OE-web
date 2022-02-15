package fpoly;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/index", "/yeuthich", "/lichsu" })
public class TrangChu extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		switch (path) {
			case "/index":
				doGetIndex(req, resp);
				break;
			case "/yeuthich":
				doGetYeuThich(req, resp);
				break;
			case "/lichsu":
				doGetLichSu(req, resp);
				break;
		}
	}
	private void doGetIndex(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("views/user/index.jsp").forward(req, resp);
	}
	private void doGetYeuThich(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("views/user/yeuthich.jsp").forward(req, resp);
	}
	private void doGetLichSu(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("views/user/lichsu.jsp").forward(req, resp);
	}
	
}
