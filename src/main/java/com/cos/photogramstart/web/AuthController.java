package com.cos.photogramstart.web; // 인증을 위한 컨트롤러

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cos.photogramstart.web.dto.auth.SignupDto;

@Controller // 1.IOC 2. 파일을 리턴하는 컨트롤러
public class AuthController {
	
	// 제대로 받았는지 logger로 확인
	private static final Logger log = LoggerFactory.getLogger(AuthController.class);

	@GetMapping("/auth/signin")
	public String signinForm() {
		return "auth/signin";
	}
	
	@GetMapping("/auth/signup")
	public String signupForm() {
		return "auth/signup";
	}
	
	//회원가입 버튼을 누르면 /auth/signup -> /auth/signin
	@PostMapping("/auth/signup")
	public String signup(SignupDto signupDto) {//key=value (x-www-form-urlencoded)
		log.info(signupDto.toString());
		return "auth/signin";
	}
}
