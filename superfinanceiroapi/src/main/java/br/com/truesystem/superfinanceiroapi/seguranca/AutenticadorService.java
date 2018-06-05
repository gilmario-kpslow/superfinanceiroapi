package br.com.truesystem.superfinanceiroapi.seguranca;

import br.com.truesystem.superfinanceiroapi.mensagem.Mensagem;
import br.com.truesystem.superfinanceiroapi.usuario.Usuario;
import br.com.truesystem.superfinanceiroapi.utils.SHAUtils;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.core.Response;

/**
 *
 * @author gilmario
 */
@Stateless
public class AutenticadorService implements Serializable {

//    @EJB
//    private UsuarioServico servico;
    public Response autenticar(Credencial login) {
        try {
//            Usuario usuario = servico.login(login.getUsername(), SHAUtils.SHA512(login.getSenha()));
//            String token = JWTUtil.getToken(usuario.getUsername());
            UsuarioToken usuarioToken = new UsuarioToken();
//            usuarioToken.setUsername(usuario.getUsername());
//            usuarioToken.setNome(usuario.getNome());
//            usuarioToken.setToken(token);
            return Response.ok(usuarioToken).build();
        } catch (Exception e) {
            return Response.status(Response.Status.UNAUTHORIZED).entity(new Mensagem("Erro", "Usuario não Autorizado")).build();
        }
    }

}
