package br.com.truesystem.superfinanceiroapi.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author gilmario
 */
public class SHAUtils {

    public static String SHA512(String entrada) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-512");
        return new BigInteger(digest.digest(entrada.getBytes())).toString(16);
    }
}
