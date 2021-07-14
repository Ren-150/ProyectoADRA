package pe.com.adra.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.com.adra.dao.SesionDao;
import pe.com.adra.daoImpl.SesionDaoImpl;
import pe.com.adra.model.Sesion;

/**
 * Servlet implementation class SesionController
 */
public class SesionController extends HttpServlet {
	private SesionDao sdao = new SesionDaoImpl();
	private Gson gson = new Gson();
	private static final long serialVersionUID = 1L;
       
	/**
     * @see HttpServlet#HttpServlet()
     */
    public SesionController() {
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
				out.println(gson.toJson(sdao.readAll()));
			break;
		case 2://guardar
			out.println(gson.toJson(sdao.create(new Sesion(request.getParameter("tema"), request.getParameter("objetivo"), Integer.parseInt("id_capacitacion")))));
			break;
		case 3://read
			out.println(gson.toJson(sdao.read(Integer.parseInt(request.getParameter("id")))));
			break;
		case 4://modificar
			Sesion s = new Sesion();
			s.setId_sesion(Integer.parseInt(request.getParameter("id")));
			s.setTema(request.getParameter("tema"));
			s.setObjetivo(request.getParameter("objetivo"));
			s.setId_capacitacion(Integer.parseInt(request.getParameter("id_capacitacion")));

			out.println(gson.toJson(sdao.update(s)));
			break;
		case 5://eliminar
			out.println(gson.toJson(sdao.delete(Integer.parseInt(request.getParameter("id")))));
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
