package com.marvel.client.service;

import org.springframework.http.HttpMethod;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import com.marvel.client.models.responses.CharactersResponse;
import com.marvel.client.utils.Crypto;

public class MarvelConnection implements IMarvelConnection{

	@Override
	public CharactersResponse getComicCharacters() {
		return getMarvelConection(0);
	}

	@Override
	public CharactersResponse getComicCharactersId(int id) {
		return getMarvelConection(id);
	}

	public CharactersResponse getMarvelConection(int id) {
		String url = "https://gateway.marvel.com";
		String characters = "/v1/public/characters";
		String charactersId = "/v1/public/characters/{characterId}";
		String apikey = "cb7d77ab1339b43f0f096ae3befac3d1";
		String ts = "1";

		String hash = Crypto.getHashMD5(ts, apikey);
		WebClient.RequestBodySpec requestServicio = null;
		if(id!=0) {
			requestServicio = WebClient.create(url).method(HttpMethod.GET).uri(uriBuilder -> uriBuilder.path(charactersId).queryParam("apikey", apikey).queryParam("hash", hash).queryParam("ts", ts).build(id));
		}else {
			requestServicio = WebClient.create(url).method(HttpMethod.GET).uri(uriBuilder -> uriBuilder.path(characters).queryParam("apikey", apikey).queryParam("hash", hash).queryParam("ts", ts).build());
		}

		ClientResponse clientResponse = requestServicio.exchange().block();
		CharactersResponse bodyRespuesta = clientResponse.bodyToMono(CharactersResponse.class).block();

		return bodyRespuesta;
	}
}

