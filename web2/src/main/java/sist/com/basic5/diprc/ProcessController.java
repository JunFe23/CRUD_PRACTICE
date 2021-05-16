package sist.com.basic5.diprc;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import lombok.Setter;
import sist.com.basic5.di.ValidateAction;

@Controller(value="junfe")
public class ProcessController {
	@Setter(onMethod_= {@Resource(name="v1")})
	private PracticeAction practiceAction;
}
