package pe.com.adra.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.com.adra.dao.PersonaDao;
import pe.com.adra.daoImpl.PersonaDaoImpl;
import pe.com.adra.model.Persona;

/**
 * Servlet implementation class PersonaController
 */
public class PersonaController extends HttpServlet {
	private PersonaDao pdao = new PersonaDaoImpl();
	private Gson gson = new Gson();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonaController() {
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
				out.println(gson.toJson(pdao.readAll()));
			break;
		case 2://guardar
			out.println(gson.toJson(pdao.create(new Persona(request.getParameter("nombre"), request.getParameter("apellido_pat"), request.getParameter("apellido_mat"), request.getParameter("correo_electronico"), request.getParameter("dni")))));
			break;
		case 3://read
			out.println(gson.toJson(pdao.read(Integer.parseInt(request.getParameter("id")))));
			break;
		case 4://modificar
			Persona p = new Persona();
			p.setId_persona(Integer.parseInt(request.getParameter("id")));
			p.setNombre(request.getParameter("nombre"));
			p.setApellido_pat(request.getParameter("apellido_pat"));
			p.setApellido_mat(request.getParameter("apellido_mat"));
			p.setCorreo_electronico(request.getParameter("correo_electronico"));
			p.setDni(request.getParameter("dni"));

			out.println(gson.toJson(pdao.update(p)));
			break;
		case 5://eliminar
			out.println(gson.toJson(pdao.delete(Integer.parseInt(request.getParameter("id")))));
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
