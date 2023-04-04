package services;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.net.URI;

import static org.junit.jupiter.api.Assertions.*;
class BuscadorDeProductosWebScrappingFacundoTest {

    @Test
    void pruebaDocumento() throws IOException {
        Document doc = Jsoup.connect("http://gglobal.net.ar/bernal/").get();
        String docString = doc.toString();
    }
}