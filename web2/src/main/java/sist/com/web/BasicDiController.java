package sist.com.web;

import java.util.HashMap;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import sist.com.basic5.di.ValidateAction;

@Controller
//@RequestMapping(value="/nameSpace")
public class BasicDiController {
	@Inject
	ValidateAction v;
	
	
	@RequestMapping(value="loccation.do")
	/*@GetMapping
	@PostMapping*/
	public String messageAction(Model model) {
		model.addAttribute("message", "Hi SpringMVC!");
		model.addAttribute("fileSize",v.getFileSize());		
		return "/WEB-INF/views/locView";
		
		//WEB-INF/views/locView.jsp
	}
	@RequestMapping("mvc/basicDi/message.do")
	public String actionMsg() {
		System.out.println(v.getFileSize());
		return "/mvc/basicDi/msgView";
	}
	@RequestMapping(value="msgAction.do")
	public ModelAndView actionMsg2() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("Msg", "ModelAndViewString");
		modelAndView.setViewName("mvc/basicDi/msgView2");
		return modelAndView;
	}
	
	
	@RequestMapping(value="msgdirect.do")
	public String actionMsg3(Model model,HttpSession session) {
		//ModelAndView modelAndView=new ModelAndView();
		//modelAndView.addObject("Msg", "DirectLocation");
		//modelAndView.setViewName("mvc/basicDi/msgView3");
		//model.addAttribute("Msg", "DirectLocation");
		session.setAttribute("Msg", "DirectLocation");
		
		return "redirect:mvc/basicDi/msgView3.jsp";
	}
	@RequestMapping(value="method.do")
	public String actionMsg4(Model model,@RequestParam(value="job",required=false,defaultValue="job")String job,
			           @RequestParam(value="no",required=false,defaultValue="0")int no) {
		HashMap<String, Object>map=new HashMap<String,Object>();
		map.put("job", job);
		map.put("no", no);
		model.addAttribute("map", map);
		
		return "mvc/basicDi/msgView4";
	}
	
	@RequestMapping(value="methodMsg.do",method=RequestMethod.POST)
	public String actionMsg5(Model model,String job,int No) {
              HashMap<String, Object>map=new HashMap<String,Object>();
              map.put("job", job);
              map.put("no", No);
              model.addAttribute("map", map);
              return "mvc/basicDi/msgView4";
     }
	

}







