package com.marvel.client.models;

public class Character {
	public String id;
	public String name;
	public String description;
	public String resourceURI;
	public Comics comics;
	public Stories stories;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the resourceURI
	 */
	public String getResourceURI() {
		return resourceURI;
	}
	/**
	 * @param resourceURI the resourceURI to set
	 */
	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}
	/**
	 * @return the comics
	 */
	public Comics getComics() {
		return comics;
	}
	/**
	 * @param comics the comics to set
	 */
	public void setComics(Comics comics) {
		this.comics = comics;
	}
	/**
	 * @return the stories
	 */
	public Stories getStories() {
		return stories;
	}
	/**
	 * @param stories the stories to set
	 */
	public void setStories(Stories stories) {
		this.stories = stories;
	}

}