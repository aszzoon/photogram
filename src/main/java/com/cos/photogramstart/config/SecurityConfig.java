package com.cos.photogramstart.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity // 해당파일로 시큐리티를 활성화
@Configuration // IoC
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	//super 삭제 - 기존 시큐리티가 가조기 있는 기능이 전부 비활성화 됨
	http.authorizeRequests()
		.antMatchers("/","/user/**","/image/**","/subscribe/**","/comment/**").authenticated() // 해당 주소는 인증이 필요하게 처리
		.anyRequest().permitAll() // 그렇지 않은 모든 페이지는 받음
		.and()
		.formLogin()
		.loginPage("/auth/signin") // formlogin page로 이동
		.defaultSuccessUrl("/"); // 로그인을 정상처리하게 되면 /로 이동
	}
}
