
package co.com.poli.bussiness;

import co.com.model.Producto;
import java.util.List;

public interface IProductoBusiness {
    
    List<Producto> obtenerProductos();

    Producto obtenerProducto(String codigo);

    String crearProducto(Producto producto);

    String eliminarProducto(String codigo);

    String actualizarProducto(Producto producto);

}
    

