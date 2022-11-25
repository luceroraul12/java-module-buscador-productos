package services;

import entity.LaGranjaDelCentro;
import org.jsoup.Jsoup;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BuscadorDeProductosWebScrappingLaGranjaDelCentroTest {

    @Mock
    static BuscadorDeProductosWebScrappingLaGranjaDelCentro servicio = Mockito.mock(BuscadorDeProductosWebScrappingLaGranjaDelCentro.class);

    @BeforeAll
    static void beforeAll() throws IOException {
        Mockito.when(servicio.generarDocumentos()).thenReturn(Arrays.asList(Jsoup.connect("https://lagranjadelcentro.com.ar/productos.php?pagina=3").get()));
    }

    @Test
    void obtenerProductosAPartirDeElements() {
        List<LaGranjaDelCentro> productos = servicio.adquirirProductosEntidad();
        Assertions.assertTrue(10 < productos.size());
    }
}