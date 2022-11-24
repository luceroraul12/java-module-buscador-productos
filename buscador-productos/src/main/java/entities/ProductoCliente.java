package entities;

import constants.Distribuidora;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoCliente {
    private String descripcion;
    private Double precioPorCantidadEspecifica;
    /**
     * nunca puede ser nulo, ya que es el dato necesario para identificar el origen de este producto
     * @see Distribuidora
     */
    private Distribuidora distribuidora;
}
