package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServret extends HttpServlet {
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
		System.out.println(req.getParameter("name"));
		System.out.println(req.getParameter("age"));
		System.out.println(req.getParameter("sei"));
		System.out.println(req.getParameter("like1"));
		System.out.println(req.getParameter("like2"));
		System.out.println(req.getParameter("like3"));
		System.out.println(req.getParameter("kome"));
		out.print("<html>");
		out.print("<head><title>表示</title></head>");
		out.print("<body>");
		out.print("<h1>申し込み内容確認画面</h1>");
		out.print("<h2>お名前</h2>");
		out.print(req.getParameter("name"));
		out.print("<h2>年齢</h2>");
		out.print(req.getParameter("age") + "代");
		out.print("<h2>性別</h2>");
		if ((req.getParameter("sei").equals("1"))) {
			out.print("男性");
		} else {
			out.print("女性");
		}
		out.print("<h2>興味のある言語</h2>");
		if (req.getParameter("like1") == null) {
		} else {
			out.print("Java　");
		}
		if (req.getParameter("like2") == null) {
		} else {
			out.print("PHP　");
		}
		if (req.getParameter("like2") == null) {
		} else {
			out.print("C言語");
		}
		out.print("<h2>何か一言</h2>");
		out.print(req.getParameter("kome"));
		out.print("</body>");
		out.print("</html>");
		out.close();

	}

}
