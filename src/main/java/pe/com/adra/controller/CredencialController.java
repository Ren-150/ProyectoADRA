package pe.com.adra.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.com.adra.dao.CredencialDao;
import pe.com.adra.daoImpl.CredencialDaoImpl;
import pe.com.adra.model.Credencial;

/**
 * Servlet implementation class CredencialController
 */
public class CredencialController extends HttpServlet {
	private CredencialDao cdao = new CredencialDaoImpl();
	private Gson gson = new Gson();
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CredencialController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		int opcion = Integer.parseInt(request.getParameter("opc"));//opc='1'
		switch (opcion) {
		case 1://todos los roles
				out.println(gson.toJson(cdao.readAll()));
			break;
		case 2://guardar
			out.println(gson.toJson(cdao.create(new Credencial(request.getParameter("nombre_usuario"), request.getParameter("contrasenia"), request.getParameter("estado")))));
			break;
		case 3://read
			out.println(gson.toJson(cdao.read(Integer.parseInt(request.getParameter("id")))));
			break;
		case 4://modificar
			Credencial c = new Credencial();
			c.setId_persona(Integer.parseInt(request.getParameter("id")));
			c.setNombre_usuario(request.getParameter("nombre_usuario"));
			c.setContrasenia(request.getParameter("contrasenia"));
			c.setEstado(request.getParameter("estado"));
			
			out.println(gson.toJson(cdao.update(c)));
			break;
		case 5://eliminar
			out.println(gson.toJson(cdao.delete(Integer.parseInt(request.getParameter("id")))));
			break;
		default:
			break;
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
