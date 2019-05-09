package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DispatchServret extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		//セッション開始
		HttpSession ses = req.getSession(true);
		//セッション格納
		ses.setAttribute("NAME", "tab");
		req.setAttribute("AGE", 20);
		//遷移先指定
		RequestDispatcher rd = req.getRequestDispatcher("test.jsp");
		rd.forward(req, resp);
	}

}
