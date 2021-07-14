package pe.com.adra.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.com.adra.dao.CapacitacionDao;
import pe.com.adra.daoImpl.CapacitacionDaoImpl;
import pe.com.adra.model.Capacitacion;

/**
 * Servlet implementation class CapacitacionController
 */
public class CapacitacionController extends HttpServlet {
	private CapacitacionDao cdao = new CapacitacionDaoImpl();
	private Gson gson = new Gson();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CapacitacionController() {
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
			out.println(gson.toJson(cdao.create(new Capacitacion(request.getParameter("nombre"), request.getParameter("fecha_inicio"), request.getParameter("fecha_cierre"), Integer.parseInt(request.getParameter("cantidad_horas")), Integer.parseInt(request.getParameter("id_categoria"))))));
			break;
		case 3://read
			out.println(gson.toJson(cdao.read(Integer.parseInt(request.getParameter("id")))));
			break;
		case 4://modificar
			Capacitacion c = new Capacitacion();
			c.setId_capacitacion(Integer.parseInt(request.getParameter("id")));
			c.setNombre(request.getParameter("nombre"));
			c.setFecha_inicio(request.getParameter("fecha_inicio"));
			c.setFecha_cierre(request.getParameter("fecha_cierre"));
			c.setCantidad_horas(Integer.parseInt(request.getParameter("cantidad_horas")));
			c.setId_categoria(Integer.parseInt(request.getParameter("id_categoria")));

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
