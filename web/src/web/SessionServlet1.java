package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//エンコーディングとMIMEタイプ設定
		resp.setContentType("text/html ; charset = UTF-8");
		//セッション起動開始
		HttpSession ses =req.getSession(true);
		ses.setAttribute("NAME", "oi");
		//ServletでHTMLを書くための準備
		PrintWriter out = resp.getWriter();
		//変数名.の形式でHTMLが書ける
		out.println("<html>");
		out.println("<head><title>Session Servlet 1</title></head>");
		out.println("<body>");
		out.println("<h1>Session Servlet 1</h1>");
		out.println("<p>セッションを開始しました</p>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
