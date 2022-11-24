package entities;

import constants.Distribuidora;
import lombok.Builder;
import lombok.Getter;

@Getter
public class PeticionWebScrapping extends Peticion {

    @Builder
    public PeticionWebScrapping(Distribuidora distribuidora) {
        super(distribuidora);
    }
}
