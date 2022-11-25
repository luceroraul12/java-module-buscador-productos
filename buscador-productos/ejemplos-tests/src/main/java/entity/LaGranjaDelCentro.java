package entity;

import entities.ProductoEspecifico;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LaGranjaDelCentro extends ProductoEspecifico {
    private String nombreProducto;
    private Double precio;
}
