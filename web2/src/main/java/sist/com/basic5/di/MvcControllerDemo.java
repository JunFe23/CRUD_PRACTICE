package sist.com.basic5.di;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcControllerDemo {	
	@RequestMapping(value="list.do")
	@GetMapping
	@PostMapping
	public void loginCheck() {	
		
	}

}
