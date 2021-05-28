package criterio;

import app.Comercio;

public class CriterioImplementaProtocolo implements Criterio{
    private String protocolo;

    public CriterioImplementaProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    @Override
    public boolean cumple(Comercio c) {
        return c.implementaProtocolo(protocolo);
    }
}
