package sist.com.bean;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServletAction {
	private String connectUrl;
	private int maxConnect;
	private int minConnect;
	private String servletMessage;	

}
