package co.com.poli.imp.business;

import co.com.dao.imp.ProductoDaoImpl;
import co.com.model.Producto;
import co.com.poli.bussiness.IProductoBusiness;
import java.util.List;

public class ProductoBusinessImp implements IProductoBusiness {

    private ProductoDaoImpl productoDao = new ProductoDaoImpl();

    @Override
    public List<Producto> obtenerProductos() {
        return productoDao.obtenerProductos();
    }

    @Override
    public Producto obtenerProducto(String codigo) {
        Producto producto = null;
        List<Producto> listado = obtenerProductos();
        if (listado.contains(new Producto(codigo))) {
            producto = productoDao.obtenerProducto(codigo);
        }
        return producto;
    }

    @Override
    public String crearProducto(Producto producto) {
        
        String mensaje = null;
        if (producto.getStock() <= 0) {
            mensaje = "El stock debe ser mayor de cero";
        }
        if (producto.getCantidad() <= 0) {
            mensaje = "La cantidad debe ser mayor de cero";
        }
        if (mensaje == null) {
            if (obtenerProducto(producto.getCodigo()) == null) {
                productoDao.crearProducto(producto);
                mensaje = "producto creado con exito";
            } else {
                mensaje = "producto ya existe";
            }
        }
        return mensaje;
    }

    @Override
    public String eliminarProducto(String codigo) {

        String mensaje = "Producto no existe";
        if (obtenerProducto(codigo) != null) {
            productoDao.eliminarProducto(codigo);
            mensaje = "Producto eliminado";
        }
        return mensaje;
    }

    @Override
    public String actualizarProducto(Producto producto) {
         String mensaje = "Producto no existe";
        if (obtenerProducto(producto.getCodigo()) != null) {
            productoDao.actualizarProducto(producto);
            mensaje = "Producto actualizado";
        }
        return mensaje;
    }

                
    }

