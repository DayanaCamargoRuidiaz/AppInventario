package co.com.data;

import co.com.model.Producto;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

public class ProductoData {

    @Setter
    @Getter
    private static List<Producto> listado;

    static {
        listado = new ArrayList<Producto>();
    }

}
