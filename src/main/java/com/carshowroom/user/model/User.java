package com.carshowroom.user.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document("user")
public class User {
	@Id
	private Integer userid;
	private String userName;
	private String contactNo;
	private String city;
	private String state;
	
	

}
