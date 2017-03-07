package com.demo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/hello")
public class HelloController {
   @RequestMapping(method = RequestMethod.GET)
   public String printHello(ModelMap model) {
      model.addAttribute("message", "User details");
      model.put("data", fetchUserData());
      return "UserDetails";
   }

private Object fetchUserData() {
	JSONArray jsonArray = null;
	JSONObject object = null;
	try {
		jsonArray = new JSONArray();

		object = new JSONObject();
    	object.put("id", 1);
    	object.put("name", "Jack");
    	object.put("gender", "M");
    	object.put("birthdate", "12/12/1991");
    	jsonArray.add(object);
    	
    	object = new JSONObject();
    	object.put("id", 2);
    	object.put("name", "Jenny");
    	object.put("gender", "F");
    	object.put("birthdate", "12/12/1992");
    	jsonArray.add(object);
    	
    	object = new JSONObject();
    	object.put("id", 3);
    	object.put("name", "Jenifer");
    	object.put("gender", "F");
    	object.put("birthdate", "12/12/1994");
    	jsonArray.add(object);
    	
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return jsonArray;
}
}