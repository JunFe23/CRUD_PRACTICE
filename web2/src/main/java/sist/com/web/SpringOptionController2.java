package sist.com.web;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class SpringOptionController2 {
	
	
	@GetMapping(value="exDemo1.do")
	public String exDemoProcess1(int no) {
		int rs=10/no;		
		return "/springOption/adviceSuccess";
	}
	
	@GetMapping(value="exDemo2.do")
	public String exDemoProcess2() {
		String str=null;
		str.charAt(0);		
		return "/springOption/adviceSuccess";
	}
	@GetMapping(value="/header1.do")
	public void exHeaderAction(Model model,@RequestHeader("Accept")String accept,
			@RequestHeader("Host")String host,@RequestHeader("User-Agent")String userAgent) {
		
		model.addAttribute("msg", "HeaderView");
		model.addAttribute("accept", accept);
		model.addAttribute("host", host);
		model.addAttribute("userAgent", userAgent);
		
	}
	@GetMapping(value="/header2.do")
	public  String exHeaderAction2(Model model,@RequestHeader Map<String, String>map) {
		model.addAttribute("injectMap", map);
		return "/springOption/header2";		
	}
	
	
	

}















