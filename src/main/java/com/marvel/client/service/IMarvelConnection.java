package com.marvel.client.service;

import com.marvel.client.models.responses.CharactersResponse;

public interface IMarvelConnection {

	public CharactersResponse getComicCharacters();

	public CharactersResponse getComicCharactersId(int id);
}