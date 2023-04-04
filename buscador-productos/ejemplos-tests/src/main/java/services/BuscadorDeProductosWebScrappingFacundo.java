package services;

import entity.Facundo;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import principal.BuscadorDeProductosWebScrapping;

public class BuscadorDeProductosWebScrappingFacundo extends BuscadorDeProductosWebScrapping<Facundo> {
    @Override
    protected void initImplementacion() {
        setEsBuscadorConPaginador(false);
        setUrlBuscador("http://gglobal.net.ar/bernal/");
    }

    @Override
    protected boolean esDocumentValido(Document document) throws Exception {
        return false;
    }

    @Override
    protected Facundo obtenerProductosAPartirDeElements(Element elementProducto) {
        return null;
    }

    @Override
    protected Elements filtrarHTMLHastaDivProductos(Document documento) {
        return null;
    }
}
