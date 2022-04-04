package ar.com.eldars.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptarPassword {
    public static void main(String[] args) {
        String password = "123";

        System.out.println("Pass sin Encriptacion: " + password);
        System.out.println("Pass CON Encriptacion: " + encriptarPassword(password));

    }
    public static String encriptarPassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }

}
