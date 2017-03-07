package com.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.modal.User;

import java.util.*;

public class UserDao {
	HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	// method to save User
	public void saveUser(User e) {
		template.save(e);
	}

	// method to update User
	public void updateUser(User e) {
		template.update(e);
	}

	// method to delete User
	public void deleteUser(User e) {
		template.delete(e);
	}

	// method to return one User of given id
	public User getById(int id) {
		User e = (User) template.get(User.class, id);
		return e;
	}

	// method to return all Users
	public List<User> getUsers() {
		List<User> list = new ArrayList<User>();
		list = template.loadAll(User.class);
		return list;
	}
}