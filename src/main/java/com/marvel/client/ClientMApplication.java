package com.marvel.client;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import com.marvel.client.utils.Crypto;

//@SpringBootApplication
public class ClientMApplication {

	private static final Charset UTF_8 = StandardCharsets.UTF_8;
	
	@Value("${private.apikey}")
	public static String apikeyPriv;
	
	@Value("${public.apikey}")
	public static String apikey;

	@Value("${timestamp}")
	public static String ts;
	
	@Value("${url.api.marvel}")
	public static String url;
	
	@Value("${url.api.marvel.characters}")
	public static String characters;
	
	public static void main(String[] args) {
		//SpringApplication.run(ClientMApplication.class, args);
		

		String pText = ts+apikeyPriv+apikey;	
		
		System.out.println("characters: "+characters);
		System.out.println("url: "+url);
		System.out.println("ts: "+ts);
		System.out.println("apikeyPriv: "+apikeyPriv);
		System.out.println("apikey: "+apikey);
		
		final String hash;
		
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
			byte[] md5InBytes = md.digest(pText.getBytes(UTF_8));
			hash=bytesToHex(md5InBytes);
		
		
		System.out.println("hash: "+hash);
		
		WebClient.RequestBodySpec  requestServicio = WebClient.create(url).method(HttpMethod.GET).uri(uriBuilder -> uriBuilder.path(characters).queryParam("apikey", apikey).queryParam("hash", hash).queryParam("ts", ts).build());
		ClientResponse clientResponse = requestServicio.exchange().block();
		String bodyRespuesta = clientResponse.bodyToMono(String.class).block();
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
	
	  private static String bytesToHex(byte[] bytes) {
	        StringBuilder sb = new StringBuilder();
	        for (byte b : bytes) {
	            sb.append(String.format("%02x", b));
	        }
	        return sb.toString();
	    }
}

@Component
class Test {

    @Value("${password}")
    private String password;

    public String getPassword() {
        return password;
    }
}
