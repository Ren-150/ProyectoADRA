package pe.com.adra.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.com.adra.dao.CategoriaDao;
import pe.com.adra.daoImpl.CategoriaDaoImpl;
import pe.com.adra.model.Categoria;

/**
 * Servlet implementation class CategoriaController
 */
public class CategoriaController extends HttpServlet {
	private CategoriaDao cdao = new CategoriaDaoImpl();
	private Gson gson = new Gson();
	private static final long serialVersionUID = 1L;       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoriaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		int opcion = Integer.parseInt(request.getParameter("opc"));//opc='1'
		switch (opcion) {
		case 1://todos los roles
				out.println(gson.toJson(cdao.readAll()));
			break;
		case 2://guardar
			out.println(gson.toJson(cdao.create(new Categoria(request.getParameter("nombre")))));
			break;
		case 3://read
			out.println(gson.toJson(cdao.read(Integer.parseInt(request.getParameter("id")))));
			break;
		case 4://modificar
			Categoria c = new Categoria();
			c.setId_categoria(Integer.parseInt(request.getParameter("id")));
			c.setNombre(request.getParameter("nombre"));
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
