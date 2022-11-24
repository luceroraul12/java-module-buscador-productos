package entities;

import constants.Distribuidora;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Peticion {
    private Distribuidora distribuidora;
}
