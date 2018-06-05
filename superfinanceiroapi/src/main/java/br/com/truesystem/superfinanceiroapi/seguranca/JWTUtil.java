package br.com.truesystem.superfinanceiroapi.seguranca;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author gilmario
 */
public class JWTUtil {

    // Gerar uma chave atraves de um MD5
    private static final String KEY = "3ff5692bbb5ddc07ba94c01f213df5bed932849d07138d5e8741eac35e1e641902ef0a0a6fa78b662ab37e7e77be5814b65bcc5d72fb699ada1e0977152976e4";
    private static final String ISSUER = "superfinanceiro-api";

    /**
     * Valida um Token retornando o nome de usuario associado oa token
     *
     * @param token
     * @return username
     */
    public static String verificar(String token) {
        return Jwts.parser().setSigningKey(KEY).parseClaimsJws(token).getBody().getSubject();
    }

    public static String getToken(String username) {
        Instant validade = Instant.now().plus(1, ChronoUnit.DAYS);
        return Jwts.builder()
                .setSubject(username)
                .setIssuer(ISSUER)
                .setExpiration(Date.from(validade))
                .signWith(SignatureAlgorithm.HS512, KEY).compact();
    }
}
