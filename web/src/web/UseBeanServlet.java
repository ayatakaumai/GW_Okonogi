package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UseBeanServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ

		HttpSession ses = req.getSession(true);
		//インスタンス化
		EmpBean bean = new EmpBean();
		//setterの使用
		bean.setName("KnowledgeTaro");
		ses.setAttribute("age",20);
		//reqにセット
		req.setAttribute("EMP", bean);
		//遷移先指定
		RequestDispatcher rd = req.getRequestDispatcher("useBean.jsp");
		rd.forward(req, resp);
	}

}
