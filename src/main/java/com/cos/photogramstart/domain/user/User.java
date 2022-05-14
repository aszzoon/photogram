package com.cos.photogramstart.domain.user;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//JPA - Java Persistence API(자바로 Data를 영구적으로 저장(DB)할수 있는 API를 제공)

@AllArgsConstructor // 전체 생성자
@NoArgsConstructor // 빈 생성자
@Data // Getter, Setter
@Entity // DB에 테이블을 생성
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 번호 증가 전략이 데이터 베이스를 따라간다
	private int id;
	
	private String username;
	private String password;
	
	private String name;
	private String website; // 웹사이트
	private String bio; // 자기소개
	private String email;
	private String phone;
	private String gender;
	
	private String profileImageUrl; // 사진
	private String role; // 권한
	
	private LocalDateTime createDate; // 데이터베이스에 항상 필요한것, 데이터가 언제들어왔는지?
	
	@PrePersist // DB에 Insert 되기직전에 실행
	public void createDate() { // 자동으로 실행하기 위함
		this.createDate = LocalDateTime.now();
	}
}
