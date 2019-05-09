package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// エンコーディングとMIMEタイプ設定
		resp.setContentType("text/html ; charset = UTF-8");
		HttpSession ses = req.getSession(false);
		// ServletでHTMLを書くための準備
		PrintWriter out = resp.getWriter();
		// 変数名.の形式でHTMLが書ける
		out.print("<html>");
		out.print("<head><title>sample2</title></head>");
		out.print("<body>");
		out.print("<h1>Session Servlet2</h1>");
		if (ses == null) {
			out.println("<p>セッションが開始されていません</p>");
			out.println("</body>");
			out.println("</html>");
			return;
		}
		out.println("<p>セッションが継続しています</p>");
		out.println("<p>" + ses.getAttribute("NAME") + "</p>");
		out.print("</body>");
		out.print("</html>");
		out.close();

		//


	}

}
