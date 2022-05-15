package com.cos.photogramstart.web.dto.auth;
//Dto = data transfer object 통신할때 필요한 데이터를 담는 객체

import com.cos.photogramstart.domain.user.User;

import lombok.Data;

@Data // Getter, Setter
public class SignupDto {
	private String username;
	private String password;
	private String email;
	private String name;
	
	public User toEntity() {
		return User.builder()
			.username(username)
			.password(password)
			.email(email)
			.name(name)
			.build();
	}
}
