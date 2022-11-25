package util;

public abstract class Convertidor<Entidad> {
    public abstract <Tipo> Entidad convertirOrigenToEntidad(Tipo elemento);
}
