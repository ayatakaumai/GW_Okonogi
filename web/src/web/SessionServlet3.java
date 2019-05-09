package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//エンコーディングとMIMEタイプ設定
		resp.setContentType("text/html ; charset = UTF-8");
		//ServletでHTMLを書くための準備
		PrintWriter out = resp.getWriter();
		HttpSession ses = req.getSession(false);
		if (ses != null) {
		ses.invalidate();
		}
		//変数名.の形式でHTMLが書ける
		out.print("<html>");
		out.print("<head><title>sample3</title></head>");
		out.print("<body>");
		out.print("<h1>Session Servlet3</h1>");
		out.print("セッションを終了しました");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
		out.close();
	}

}
