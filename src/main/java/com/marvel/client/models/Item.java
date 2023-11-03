package com.marvel.client.models;

public class Item {
	public String resourceURI;
	public String name;
	public String type;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}