package util;

import org.apache.poi.ss.usermodel.Row;

public abstract class ConvertidorExcelUtil<Entidad> extends ConvertidorUtil<Entidad> {
    public abstract Entidad convertirRowEnProductoEspecifico(Row row);

}
