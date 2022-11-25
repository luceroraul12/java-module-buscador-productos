package entities;


import lombok.Getter;
import lombok.Setter;

/**
 * Clase padre de cualquier producto Entidad diferente de ProductoCliente.
 * Tiene la finalidad de unificar todas los productos de Entidades Especificas y que se trabaje en funcion a esta.
 * Cada clase especifica a cada distribuidora debe heredar de esta clase.
 */

@Getter
@Setter
public abstract class ProductoEspecifico {
}