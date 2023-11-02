package com.marvel.client.utils;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Value;

public class Crypto {
	
	@Value("${private.apikey}")
	private static String apikeyPriv;
	
	private static final Charset UTF_8 = StandardCharsets.UTF_8;
	
	public static String getHashMD5(String ts, String apikey) {

		String pText = ts+apikeyPriv+apikey;	
		String hash = "";
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
			byte[] md5InBytes = md.digest(pText.getBytes(UTF_8));
			hash=bytesToHex(md5InBytes);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		return hash;
		
	}

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
    
}
