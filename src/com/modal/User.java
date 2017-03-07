package com.modal;

import org.json.simple.JSONObject;

public class User {
	private String id = null;
	private String name = null;
	private String birthdate = null;
	private String gender = null;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public JSONObject getJSONObj() {
		JSONObject object = null;
		try {
			object = new JSONObject();
			object.put("id", id);
	    	object.put("name", name);
	    	object.put("gender", gender);
	    	object.put("birthdate", birthdate);
	    	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;
	}
}
