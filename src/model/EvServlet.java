package model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EvServlet")
public class EvServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletContext application = this.getServletContext();
		SiteEv siteEv = (SiteEv)application.getAttribute("siteEv");

		if(siteEv == null) {
			siteEv = new SiteEv();
		}
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");

		SiteEvLogic siteEvLogic = new SiteEvLogic();
		if(action != null && action.equals("good")) {
			siteEvLogic.good(siteEv);
		}else if(action != null && action.equals("bad")) {
			siteEvLogic.bad(siteEv);
		}
		application.setAttribute("siteEv", siteEv);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/evServlet.jsp");
		dispatcher.forward(request, response);

	}

}
