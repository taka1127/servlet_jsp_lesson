package ex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/FruitServlet")
public class FruitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Fruit f = new Fruit("イチゴ", 700);
		HttpSession session = request.getSession();
		session.setAttribute("fruit", f);
//		request.setAttribute("fruit", f);
		RequestDispatcher d = request.getRequestDispatcher("WEB-INF/ex/fruit.jsp");
		d.forward(request, response);
	}

}
