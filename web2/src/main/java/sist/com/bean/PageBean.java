package sist.com.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageBean {
	private int currentPage;
	private int startPage;
	private int endPage;
	private int totalPage;
	private int currentBlock;	

}
