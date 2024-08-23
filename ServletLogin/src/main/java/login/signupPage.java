package login;

import java.io.IOException;

import dao.database;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signin")
public class signupPage extends HttpServlet {
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		String name=request.getParameter("username");
		String email=request.getParameter("email");
		String newp=request.getParameter("password");
		
		database db=new database();
		
		if(db.signup(name, email, newp)) {
			response.sendRedirect("Login.jsp");
		}
		else {
			response.sendRedirect("Signup.jsp");
		}
		
	}
	

}

