package co.com.dao.imp;

import co.com.dao.IProductoDao;
import co.com.data.ProductoData;
import co.com.model.Producto;
import java.util.List;

public class ProductoDaoImpl implements IProductoDao {

    @Override
    public List<Producto> obtenerProductos() {
        return ProductoData.getListado();
    }

    @Override
    public Producto obtenerProducto(String codigo) {
        List<Producto> listado = ProductoData.getListado();
        return listado.get(listado.indexOf(new Producto(codigo)));
    }

    @Override
    public void crearProducto(Producto producto) {
        List<Producto> listado = ProductoData.getListado();
        listado.add(producto);
        ProductoData.setListado(listado);

    }

    @Override
    public void eliminarProducto(String codigo) {
        List<Producto> listado = ProductoData.getListado();
        listado.remove(new Producto(codigo));
        ProductoData.setListado(listado);
    }

    @Override
    public void actualizarProducto(Producto producto) {
        List<Producto> listado = ProductoData.getListado();
        listado.set(listado.indexOf(producto), producto);

        ProductoData.setListado(listado);

    }

}
