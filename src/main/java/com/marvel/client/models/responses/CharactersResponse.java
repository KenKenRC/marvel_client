package com.marvel.client.models.responses;

import com.marvel.client.models.Data;

public class CharactersResponse {
	public String code;
	public String status;
	public String copyright;
	public String attributionText;
	public String attributionHTML;
	public Data data;
	public String etag;
	
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the copyright
	 */
	public String getCopyright() {
		return copyright;
	}
	/**
	 * @param copyright the copyright to set
	 */
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	/**
	 * @return the attributionText
	 */
	public String getAttributionText() {
		return attributionText;
	}
	/**
	 * @param attributionText the attributionText to set
	 */
	public void setAttributionText(String attributionText) {
		this.attributionText = attributionText;
	}
	/**
	 * @return the attributionHTML
	 */
	public String getAttributionHTML() {
		return attributionHTML;
	}
	/**
	 * @param attributionHTML the attributionHTML to set
	 */
	public void setAttributionHTML(String attributionHTML) {
		this.attributionHTML = attributionHTML;
	}
	/**
	 * @return the data
	 */
	public Data getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Data data) {
		this.data = data;
	}
	/**
	 * @return the etag
	 */
	public String getEtag() {
		return etag;
	}
	/**
	 * @param etag the etag to set
	 */
	public void setEtag(String etag) {
		this.etag = etag;
	}

}
