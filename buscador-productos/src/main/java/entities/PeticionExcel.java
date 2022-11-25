package entities;

import lombok.Getter;
import org.springframework.web.multipart.MultipartFile;

/**
 * Es el tipo de dato que se obtiene del FrontEnd cuando se quiere hacer una actualizacion por medio de Documento
 */
@Getter
public class PeticionExcel extends Peticion {
    private MultipartFile[] excels;
}