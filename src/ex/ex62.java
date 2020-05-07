package ex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex62")
public class ex62 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int rand = (int)(Math.random() * 10);
		if(rand % 2 == 1) {
			response.sendRedirect(" /example/sample.jsp");
		}else {
			RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/forwardSample.jsp");
			d.forward(request, response);
		}

	}

}
