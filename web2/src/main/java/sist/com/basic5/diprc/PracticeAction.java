package sist.com.basic5.diprc;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class PracticeAction {
	private String name;
	private int age;
	private String job;
}
