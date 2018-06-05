package br.com.truesystem.superfinanceiroapi.seguranca.filtro;

import br.com.truesystem.superfinanceiroapi.mensagem.Mensagem;
import br.com.truesystem.superfinanceiroapi.seguranca.JWTUtil;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author gilmario
 */
@Provider
public class TokenFilter implements ContainerRequestFilter {

    private static final Set<String> ROTAS_PUBLICAS;
    public static final String AUTHORIZATION = "Authorization";

    static {
        ROTAS_PUBLICAS = new HashSet<>();
        ROTAS_PUBLICAS.add("/administrador/login");
        ROTAS_PUBLICAS.add("/seguranca");
        ROTAS_PUBLICAS.add("/status");
        ROTAS_PUBLICAS.add("/documento/upload");
        ROTAS_PUBLICAS.add("/documento/upload/01");
    }

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        String url = requestContext.getUriInfo().getPath();
        System.out.println(url);
        if (!ROTAS_PUBLICAS.contains(requestContext.getUriInfo().getPath())) {
            try {
                String token = requestContext.getHeaderString(AUTHORIZATION);
                if (Objects.isNull(token) || token.trim().isEmpty()) {
                    requestContext.getHeaders().add("WWW-Autenticate", "Bearer token_type='JWT'");
                    requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED).entity(new Mensagem("Não autorizado", "não possui token")).build());
                }
                String username = JWTUtil.verificar(token);
                requestContext.getHeaders().add("username", username);
            } catch (Exception e) {
                requestContext.getHeaders().add("WWW-Autenticate", "Bearer token_type='JWT'");
                requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED).entity(new Mensagem("Erro", "não autorizado")).build());
            }
        }
    }

}
