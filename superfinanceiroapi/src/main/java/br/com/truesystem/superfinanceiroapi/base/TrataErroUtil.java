package br.com.truesystem.superfinanceiroapi.base;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Response;

/**
 *
 * @author gilmario
 */
public class TrataErroUtil {

    private static final Logger LOG = Logger.getLogger(TrataErroUtil.class.getName());

    public static Response retornaErro(Exception e) {
        LOG.log(Level.SEVERE, "", e);
        return Response.serverError().entity(new Erro[]{new Erro(getMensagemFrom(e), "Erro")}).build();
    }

    public static Response retornaErro(Exception e, Response.Status status) {
        LOG.log(Level.SEVERE, "", e);
        return Response.status(status).entity(new Erro[]{new Erro(getMensagemFrom(e), "Erro")}).build();
    }

    private static String getMensagemFrom(Throwable e) {
        if (Objects.nonNull(e.getCause())) {
            return getMensagemFrom(e.getCause());
        }
        return e.getLocalizedMessage();
    }
}
