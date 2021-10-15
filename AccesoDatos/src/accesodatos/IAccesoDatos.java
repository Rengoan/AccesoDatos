
package accesodatos;


public interface IAccesoDatos {
    
    int max_registro = 10;
    
     //SON METODOS ABSTRACTOS Y PUBLICOS
    
    void insertar(); 
    
    void listar();

    void actualizar();

    void eliminar();
}
