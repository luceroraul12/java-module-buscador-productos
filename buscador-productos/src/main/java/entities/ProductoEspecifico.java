package entities;


import constants.Distribuidora;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

/**
 * Clase padre de cualquier producto Entidad diferente de Producto.
 * Tiene la finalidad de unificar todas los productos de Entidades Especificas y que se trabaje en funcion a esta.
 * Cada clase especifica a cada distribuidora debe heredar de esta clase.
 */

@Getter
@Setter
public abstract class ProductoEspecifico {
    @Id
    private String id;
    private Distribuidora distribuidora;
}