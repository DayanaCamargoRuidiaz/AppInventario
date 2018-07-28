
package co.com.dao;

import co.com.model.Producto;
import java.util.List;


public interface IProductoDao {

    List<Producto> obtenerProductos();

    Producto obtenerProducto(String codigo);

    void crearProducto(Producto producto);

    void eliminarProducto(String codigo);

    void actualizarProducto(Producto producto);

}
