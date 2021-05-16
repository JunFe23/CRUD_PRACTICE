package sist.com.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReplyBean {
	private int no;
	private String contents;
	private String id;
	private int step;
	private int lev;
	private int ref;
	private int pnum;
	private int reply;
	private String img;
	private String regdate;
	private int infoPk;
	private String job;

}
