package entity;

import entities.ProductoEspecifico;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Facundo extends ProductoEspecifico {
    private String descripcion;
    private String categoria;
    private Double precioMayorista;
    private Double precioVenta;
}
