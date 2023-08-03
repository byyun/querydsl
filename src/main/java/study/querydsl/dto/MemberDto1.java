package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;

import lombok.Data;

@Data
public class MemberDto1 {
	private String username;
	private int age;
	public MemberDto1() {
	}

	@QueryProjection
	public MemberDto1(String username, int age) {
		this.username = username;
		this.age = age;
	}
}
