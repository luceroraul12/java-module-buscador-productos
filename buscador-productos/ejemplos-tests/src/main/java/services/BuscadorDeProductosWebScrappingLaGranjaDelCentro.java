package services;

import entity.LaGranjaDelCentro;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import principal.BuscadorDeProductosWebScrapping;

public class BuscadorDeProductosWebScrappingLaGranjaDelCentro extends BuscadorDeProductosWebScrapping<LaGranjaDelCentro> {
    public BuscadorDeProductosWebScrappingLaGranjaDelCentro() {
        initImplementacion();
    }

    @Override
    protected void initImplementacion() {
        setEsBuscadorConPaginador(true);
        setUrlBuscador("https://lagranjadelcentro.com.ar/productos.php?pagina=");
    }

    @Override
    protected boolean esDocumentValido(Document document) throws Exception {
        boolean esValido = false;
        for (Element element : document.getElementsByTag("span")){
            if (element.hasClass("p-activo")){
                esValido = true;
            };
        }

        return esValido;
    }

    @Override
    protected LaGranjaDelCentro obtenerProductosAPartirDeElements(Element elementProducto) {
        return LaGranjaDelCentro.builder()
                .nombreProducto(
                        elementProducto.getElementsByClass("h3-content-1").text()
                )
                .precio(
                        Double.valueOf(elementProducto
                                .getElementsByClass("p-precio-content-1")
                                .text()
                                .replaceAll("[$.]","")
                                .replaceAll(",","."))
                )
                .build();
    }

    @Override
    protected Elements filtrarElementos(Document documento) {
        return documento
                .select("div.box-content-1");
    }
}
