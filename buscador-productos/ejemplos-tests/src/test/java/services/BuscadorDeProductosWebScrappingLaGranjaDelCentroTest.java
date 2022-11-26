package services;

import entity.LaGranjaDelCentro;
import org.jsoup.Jsoup;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockedConstruction;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BuscadorDeProductosWebScrappingLaGranjaDelCentroTest {

    BuscadorDeProductosWebScrappingLaGranjaDelCentro servicio;

    @BeforeEach
    void beforeAll() throws IOException {
        servicio = Mockito.spy(new BuscadorDeProductosWebScrappingLaGranjaDelCentro());
        Mockito
                .doReturn(Arrays.asList(Jsoup.parse(new File("src/main/resources/la-granja-del-centro.html"))))
                .when(servicio).generarDocumentos();
    }

    @Test
    void obtenerProductosAPartirDeElements() throws IOException {

        List<LaGranjaDelCentro> productos = servicio.adquirirProductosEntidad();
        Assertions.assertEquals(4 , productos.size());
    }
}