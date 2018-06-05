package br.com.truesystem.superfinanceiroapi.seguranca;

import br.com.truesystem.superfinanceiroapi.base.TrataErroUtil;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author gilmario
 */
@Provider
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("seguranca")
public class SegurancaResource {

    @EJB
    private AutenticadorService service;

    @POST
    public Response login(Credencial login) {
        try {
            return service.autenticar(login);
        } catch (Exception e) {
            return TrataErroUtil.retornaErro(e);
        }
    }
}
