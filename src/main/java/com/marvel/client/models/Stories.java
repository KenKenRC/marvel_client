package com.marvel.client.models;

import java.util.ArrayList;

public class Stories {
	public String available;
    public String returned;
    public String collectionURI;
    public ArrayList<Item> items;
    
	/**
	 * @return the available
	 */
	public String getAvailable() {
		return available;
	}
	/**
	 * @param available the available to set
	 */
	public void setAvailable(String available) {
		this.available = available;
	}
	/**
	 * @return the returned
	 */
	public String getReturned() {
		return returned;
	}
	/**
	 * @param returned the returned to set
	 */
	public void setReturned(String returned) {
		this.returned = returned;
	}
	/**
	 * @return the collectionURI
	 */
	public String getCollectionURI() {
		return collectionURI;
	}
	/**
	 * @param collectionURI the collectionURI to set
	 */
	public void setCollectionURI(String collectionURI) {
		this.collectionURI = collectionURI;
	}
	/**
	 * @return the items
	 */
	public ArrayList<Item> getItems() {
		return items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
  
}