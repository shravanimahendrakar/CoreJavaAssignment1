package com.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InboxServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Cookie[] ck = req.getCookies();
		String name = null;
		if (ck != null) {
			for (Cookie c : ck) {
				if (c.getName().equals("user")) {
					name = c.getValue();
				}
			}
		}
		
		RequestDispatcher rd = null;
		
		if (name == null || name.isEmpty()) {
			req.setAttribute("errorMsg", "Login first");
			rd = req.getRequestDispatcher("login.jsp");
		} else {
			req.setAttribute("msg", "Inbox message for " + name);
			rd = req.getRequestDispatcher("inbox.jsp");
		}
		rd.forward(req, res);
	}
}
