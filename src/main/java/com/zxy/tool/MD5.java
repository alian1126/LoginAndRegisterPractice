package com.zxy.tool;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author RockerBaozi
 * @date 2019/5/17 9:20
 */
public class MD5 {

    public String transferToMD5(String password) {

        if (password == null) {
            return null;
        }

        String newPassword = "";

        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            byte[] passwordMD5 = messageDigest.digest(password.getBytes());

            BASE64Encoder base64Encoder = new BASE64Encoder();

            newPassword = base64Encoder.encode(passwordMD5);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return newPassword;
    }
}
