package pe.com.adra.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import pe.com.adra.daoImpl.LoginDaoImpl;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private LoginDaoImpl ld = new LoginDaoImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HashMap<String, Object> datos = ld.validar(request.getParameter("Nombre_usuario"), request.getParameter("Contrasenia"));
        HttpSession sesion = request.getSession();
		if (datos.size()>0) {
            sesion.setAttribute("Nombre", datos.get("Nombre"));
            sesion.setAttribute("Rol", datos.get("Nombre"));
			response.sendRedirect("main.jsp");
		} else {
			response.sendRedirect("login.html");
		}
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
