package pe.com.adra.config;

public class Test {
	public static void main(String[] args) {
        // TODO code application logic here
        if(Conexion.getConexion()!=null){
            System.out.println("Conectado");
        }else{
            System.out.println("No conectado");
        }
    }
}
