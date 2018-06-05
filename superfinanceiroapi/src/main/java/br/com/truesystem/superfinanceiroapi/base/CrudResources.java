package br.com.truesystem.superfinanceiroapi.base;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author gilmario
 * @param <T>
 */
public abstract class CrudResources<T> implements Serializable {

//    public abstract ServiceInfra<T> getServico();
    protected static final Logger LOG = Logger.getLogger(CrudResources.class.getName());

//    @GET
//    @Path("/{id}")
//    public Response getEntity(@HeaderParam("username") String username, @PathParam(value = "id") Long id) {
//        try {
//            return Response.ok(getServico().carregar(id)).build();
//        } catch (Exception e) {
//            LOG.log(Level.SEVERE, "Erro", e);
//            return deuErro(e);
//        }
//    }
//
//    @GET
//    public Response getLista(@HeaderParam("username") String username) {
//        try {
//            return Response.ok(getServico().listar()).build();
//        } catch (Exception e) {
//            return deuErro(e);
//        }
//    }
//
//    @POST
//    public Response add(@HeaderParam("username") String username, T t) {
//        try {
//            return Response.ok(getServico().salvar(t)).build();
//        } catch (Exception e) {
//            LOG.log(Level.SEVERE, "Erro", e);
//            return deuErro(e);
//        }
//    }
//
//    @PUT
//    public Response update(@HeaderParam("username") String username, T t) {
//        try {
//            return Response.ok(getServico().atualizar(t)).build();
//        } catch (Exception e) {
//            LOG.log(Level.SEVERE, "Erro", e);
//            return deuErro(e);
//        }
//    }
//
//    @DELETE
//    @Path(value = "{id}")
//    public Response remove(@HeaderParam("username") String username, @PathParam(value = "id") Long id) {
//        try {
//            return Response.ok(getServico().excluir(id)).build();
//        } catch (Exception e) {
//            LOG.log(Level.SEVERE, "Erro", e);
//            return deuErro(e);
//        }
//    }
//
//    protected Response deuErro(Exception e) {
//        return TrataErroUtil.retornaErro(e);
//    }
}
