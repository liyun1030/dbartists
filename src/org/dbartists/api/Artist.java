package org.dbartists.api;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import org.dbartists.StreamProxy;

public class Artist {
	
	// artist id
	private String id;
	
	// artist name
	private String name;
	
	// artist site url
	private String url;
	
	// artist image
	private String img;
	
	public Artist(String name, String img, String url) {
		try {
			this.id = StreamProxy.MD5(url);
		} catch (NoSuchAlgorithmException e) {
			this.id = "tmp";
		} catch (UnsupportedEncodingException e) {
			this.id = "tmp";
		}
		this.name = name;
		this.img = img;
		this.url = url;
	}

	public String getId() {
		return id;
	}

	public String getImg() {
		return img;
	}

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
