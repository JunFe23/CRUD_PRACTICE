package sist.com.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MvcBoardBean {
	private int    no;
	private String id;
	private String password;
	private String title;
	private String writer;
	private String contents;
	private int    hit;
	private String fileName;
	private String regdate;
}
