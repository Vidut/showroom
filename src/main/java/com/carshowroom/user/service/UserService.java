package com.carshowroom.user.service;

import java.util.List;

import com.carshowroom.user.model.User;


public interface UserService {
	
	public User getUserById(int userId);
	public List<User> getUserListByCity(String city);
	public void updateUser (User user);
	public void deleteUserbyId (int userId);
	public void deleteUserByBean(User user);
	

}
