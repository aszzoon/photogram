package com.cos.photogramstart.web; // 인증을 위한 컨트롤러

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller // 1.IOC 2. 파일을 리턴하는 컨트롤러
public class AuthController {

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
	public String signup() {
		System.out.println("되니");
		return "auth/signin";
	}
}