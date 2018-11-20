package com;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {
      //  String str = "Hello world";
        String str = "hU324@9f:2^&#";
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] bytes = md5.digest(str.getBytes());
        byte[] bytes2 = sha1.digest(str.getBytes());
        StringBuilder builder = new StringBuilder();
        for (byte b : bytes) {
            builder.append(String.format("%02X",b));
        }
        System.out.println(builder.toString());

    }
}



























































