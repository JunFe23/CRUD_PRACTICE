package sist.com.web;

import java.io.FileNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class AdviceException {	
	
	/*@ExceptionHandler(Exception.class)
	public ModelAndView commandException(Exception e) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/springOption/adviceExView");
		mv.addObject("ex", e);
		return mv;
	}
	
	@ExceptionHandler(ArithmeticException.class)
	public ModelAndView commandException2(Exception e) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/springOption/adviceExView2");
		mv.addObject("ex", e);
		return mv;
	}	*/
	
	
	@ExceptionHandler
	@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR)
	public ModelAndView commandException3(Exception e) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/springOption/adviceExView3");
		mv.addObject("ex", e);
		return mv;
	}
	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(code=HttpStatus.NOT_FOUND)
	public ModelAndView commandException4(NoHandlerFoundException e) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/springOption/adviceExView");
		mv.addObject("ex", e);
		return mv;
	}
	
	/*@ExceptionHandler(ArithmeticException.class)
	public ModelAndView commandException2(Exception e) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/springOption/adviceExView2");
		mv.addObject("ex", e);
		return mv;
	}	*/

}







