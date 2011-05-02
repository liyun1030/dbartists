package org.dbartists.api;

public class Track {

	// track id
	private int id;

	// track name
	private String name;

	// mp3 url
	private String url;

	public Track(int id, String name, String url) {
		this.id = id;
		this.name = name;
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
