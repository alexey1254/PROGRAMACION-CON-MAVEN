package es.alejandro.programacion.modelo;

import java.sql.ResultSet;

/**
 * @author Alejandro
 */
public class ModeloDAO {

    private Producto registroProducto(ResultSet rs) {

    }

    public static int numProductos() throws Exception {
        ResultSet consulta = Conexion.consulta("select count(nombre) from producto;");

    }

    public static Producto getProductos(int page, int tamanioPage) {

    }

    public static Producto getProducto(int codigo) {

    }

    public static int actualizarProducto(Producto producto) {

    }

    public static int insertarProducto(Producto producto) {

    }

    public static int borrarProducto(int codigo) {

    }

    public static void main(String[] args) throws Exception {
        Conexion.getConexionBdFerreteria();

        ResultSet consulta = Conexion.consulta("select count(nombre) from producto;");
        System.out.println(consulta);
    }
}
