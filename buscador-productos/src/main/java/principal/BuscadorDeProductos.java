package principal;

import constants.Distribuidora;
import constants.TipoDistribuidora;
import entities.ProductoEspecifico;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import util.ConvertidorUtil;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

/**
 * Clase padre de todos los servicios de tipos de busqueda.
 * Contiene metodos sobre la base de datos y el abstract para una entidadEspecifica.
 * @param <Entidad> necesario para saber el tipo de distribuidora
 * @param <Auxiliar> clase con los datos necesarios para poder comenzar busqueda
 */
@Data
public abstract class BuscadorDeProductos<Entidad extends ProductoEspecifico, Auxiliar>
{

    /**
     * Es la enumeracion que identifica a cada implementacion de este servicio.
     * Toda implementacion utilizada debe tenerlo seteado.
     */
    private Distribuidora distribuidora;
    /**
     * Es la enumeracion que identifica el tipo de busqueda.
     * Toda implementacion utilizada debe tenerlo seteado.
     */
    private TipoDistribuidora tipoDistribuidora;

    /**
     * Clase utilitaria para realizar conversiones.
     */
    @Autowired
    private ConvertidorUtil<Entidad> productoUtil;

    /**
     * Metodo post constructor para poder setear atributos de cada clase.
     */
    @PostConstruct
    private void init(){
        initTipoBusqueda();
        initImplementacion();
    }

    /**
     * Metodo iniciador para el tipo de busqueda
     */
    protected abstract void initTipoBusqueda();

    /**
     * Metodo iniciador para la implementacion.
     */
    protected abstract void initImplementacion();

    /**
     * Metodo pre destruccion del bean.<br>
     * De momento no hay nada asignado en el, pero esta.
     */
    @PreDestroy
    protected abstract void destroy();

    /**
     * Metodo a implementar por cada clase de tipo de busqueda.
     * Este metodo permite unicamente la adquisicion de productos de cierta entidad y solo eso.
     * @param elementoAuxiliar
     * @return lista de productos
     */
    protected abstract List<Entidad> adquirirProductosEntidad(Auxiliar elementoAuxiliar);;



}