package accesodatos;

public class ImplementacionMysql implements IAccesoDatos {

    public void insertar() {
        System.out.println("Insertando desde Mysql");
    }

    public void listar() {
        System.out.println("Listando desde Mysql");
    }

    public void actualizar() {
        System.out.println("Actualizando desde Mysql");
    }

    public void eliminar() {
        System.out.println("Eliminando desde Mysql");
    }
}
