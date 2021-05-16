package sist.com.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sist.com.dao.OrangeBasicDao;

@Controller
public class MvcCrudController {	
	@Autowired
	private OrangeBasicDao dao;
	@RequestMapping(value="connectDemo.do")
	public String connectView(Model model) {		
		model.addAttribute("msg", dao);
		return "mvc/ormMvc/basicEx1View";		
	}
	
	@RequestMapping(value="empListData.do")
	public String empSelectProcess(Model model) {
			model.addAttribute("empList", dao.empListAction());
		return "mvc/ormMvc/basicEmpView";
	}
	@PostMapping(value="chartAction.do")
	public String chartProcess(Model model,HttpServletRequest request,HttpServletResponse response,HttpSession session) {
		int []m={5000,95,6500,10020};
		model.addAttribute("m", m);
		
		return "/jQueryLesson/ajaxData/ajaxData3";
	}
	
	

}









