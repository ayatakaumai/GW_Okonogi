package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServret extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 取得パラメーターのエンコーディング設定
		req.setCharacterEncoding("UTF-8");
		// htmlの文字列取得
		// 出力エンコーディングとMIMEタイプ設定
		resp.setContentType("text/html; charset = UTF-8");
		// ServletでHTMLを書くための準備
		PrintWriter out = resp.getWriter();
		// 変数名.の形式でHTMLが書ける
		out.print("<html>");
		out.print("<head><title>表示</title></head>");
		out.print("<body>");
		out.print("<h1>" + req.getParameter("param")+ "</h1>");
		out.print("</body>");
		out.print("</html>");
		out.close();

	}

}
