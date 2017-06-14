package edu.ubbcluj.webprog.backend.util;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by kincso on 14.06.2017.
 */
public class EncryptData extends JdbcDaoSupport {

    public static String encrypt(String password) {
        return convertHexToString(hashPassword(password));
    }

    private static byte[] hashPassword(String password){
        MessageDigest md;
        byte byteData[] = null;
        try {
            md = MessageDigest.getInstance("SHA-1");
            md.update(password.getBytes());
            byteData = md.digest();
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e.getLocalizedMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return byteData;
    }

    private static String convertHexToString(byte[] byteData){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }
}
