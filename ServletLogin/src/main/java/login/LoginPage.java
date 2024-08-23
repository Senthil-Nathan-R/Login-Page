package login;

import java.io.IOException;

import dao.database;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginPage extends HttpServlet {

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		database db=new database();
		if(email !=null ) {
		if(db.login(email, password)) {
			
			HttpSession session=request.getSession();
			session.setAttribute("email", email);
			response.sendRedirect("video.jsp");
			}
		else {
			response.sendRedirect("Login.jsp");
		}
		}
		else {
			response.sendRedirect("Login.jsp");
		}
	}
}
