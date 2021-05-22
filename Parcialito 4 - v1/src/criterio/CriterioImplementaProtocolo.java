package criterio;

import app.Comercio;

import java.util.Locale;

public class CriterioImplementaProtocolo implements Criterio{
    private String protocolo;

    public CriterioImplementaProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    @Override
    public boolean cumple(Comercio c) {
        return c.implementaProtocolo(protocolo.toLowerCase());
    }
}
