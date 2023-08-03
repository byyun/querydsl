package study.querydsl.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {
	private String name;
	private int age;
// 기본 생성자가 없을때는 NoArgsConstructor
	public UserDto(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
