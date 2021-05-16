package sist.com.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import sist.com.bean.UIMemberBean;
import sist.com.bean.di.MessageAction;

//Mvc Model View Controller
@Controller
@SessionAttributes(value= {"sList","queryData","str"})
public class ActionDiController {	
	@Inject
	private MessageAction m;
	//private Dao dao;
	
	
	@ModelAttribute(name="queryData")
	public List<Object> listDataProcess() {
		Vector<Object>v=new Vector<Object>();
		v.add("SELECT * FROM EMP");
		v.add("SELECT * FROM STUDENT");
		v.add("SELECT * FROM DEPT");
		return v;
	}
	@ModelAttribute(name="str")
	public String[]getLessonData(){
		String []str= {"Ajax","Spring","Xml","ReAct"};
		return str;
	}
	
	@RequestMapping(value="elist.do")
	public String eSelectData(Model model) {
		System.out.println("eSelectData");
		ArrayList<String>list=new ArrayList<String>();
		list.add("empno");
		list.add("sal");
		list.add("comm");
		list.add("mgr");
		model.addAttribute("eList", list);
		return "mvc/actionDi/eListView";
	}
	
	@RequestMapping(value="dlist.do")
	public String dSelectData(Model model) {
		System.out.println("dSelectData");
		ArrayList<String>list=new ArrayList<String>();
		list.add("deptno");
		list.add("dname");
		list.add("loc");
		list.add("college");
		model.addAttribute("dList", list);
		return "mvc/actionDi/dListView";
	}
	
	@RequestMapping(value="mvc/basicDi/slist.do")
	public String sSelectData(Model model) {
		System.out.println("sSelectData");
		ArrayList<String>list=new ArrayList<String>();
		list.add("studno");
		list.add("name");
		list.add("weight");
		list.add("height");
		model.addAttribute("sList", list);
		return "mvc/actionDi/sListView";
	}
	//@RequestMapping(value="memberCheckData.do",method=RequestMethod.POST)
	@PostMapping(value="memberCheckData.do")
	public String memberInject(/*Model model,*/ @ModelAttribute(name="memberBean") UIMemberBean bean) {
		System.out.println(bean);
		//model.addAttribute("memberBean", bean);
		return "mvc/actionDi/memberView";
	}
	@GetMapping(value="alist.do")
	public String alistProcess(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
		//System.out.println(request.getParameter("job"));
		String job=request.getParameter("job");
	    
	    session.setAttribute("msg",m.getMessageData(job));
	    try {
	    	if(job.equals("a1")||job.equals("a2"))
	    	response.sendRedirect(m.getLocation(job));	    	
	    } catch (Exception e) {
	    	// TODO: handle exception
	    }	    	    
		return "mvc/actionDi/jobView";
	}

}


/*@GetMapping(value="alist.do")
public String alistProcess(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
   //System.out.println(request.getParameter("job"));
   String job=request.getParameter("job");
    
    session.setAttribute("msg",m.getMessageData(job));
    try {
       response.sendRedirect(m.getLocation(job));   
   } catch (Exception e) {
      // TODO: handle exception
   }              
   return "mvc/actionDi/jobView";
}
*/









