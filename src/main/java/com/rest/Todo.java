package com.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Todo{
	private String id;
	private String description;
	private String summary;
	
	public Todo() {
		super();
	}

	public Todo(String id, String summary) {
		super();
		this.id = id;
		
		this.summary = summary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
}