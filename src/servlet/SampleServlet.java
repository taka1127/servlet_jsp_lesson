package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//運勢をランダムで決定
		String[] luckArray = {"大吉", "中吉", "小吉", "吉", "凶", "大凶" }; //0~5
		int index = (int) (Math.random() * 6);  //0~N-1の整数の乱数を取得
		String luck = luckArray[index];

		//実行日の取得
		Date date = new Date(); //実行日時の格納
		SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日"); //フォーマットを指定
		String today = sdf.format(date); //指定したフォーマットで取得

		//HTMLを出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>おみくじ</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>サーブレットです。" + today +"の運勢は「" + luck + "」です!</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
