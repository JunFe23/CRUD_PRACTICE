package sist.com.web;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import lombok.Data;
import lombok.extern.log4j.Log4j;
import sist.com.bean.MvcBoardBean;
import sist.com.bean.PageProcess;
import sist.com.dao.BoardDao;


@Controller

public class MvcBoardController {
	@Resource(name="boardDao")
	private BoardDao boardDao;	
	@Resource(name="pageProcess")
	private PageProcess process;
	
	@RequestMapping(value="boardLogin.do")
	public String idPassCheckMvc(String id,String password,HttpSession session) {
		if(boardDao.idMvcBoardCheck(id, password)) {
		session.setAttribute("id", id);
		session.setMaxInactiveInterval(600);	
		return "redirect:/bootBoard/write.jsp";
		}
		return "redirect:/bootBoard/signin.jsp";
	}
	@PostMapping(value="mvcBoardInsert.do")
	public String mvcBoardInsert(MvcBoardBean bean,@RequestParam(value="file",required=false)MultipartFile file) {
		bean.setFileName(file.getOriginalFilename());		
		System.out.println(bean);
		String loc="C:\\work3\\SpringCore\\web\\src\\main\\webapp\\upload\\";
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream(loc.concat(file.getOriginalFilename()));
			fos.write(file.getBytes());
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		boardDao.insertBoardMvc(bean);
		return "redirect:mvcList.do";
	}
	
	@GetMapping(value="mvcList.do")	
	public String mvcBoardList(Model model,HttpServletRequest request) {		
		HashMap<String,Object> map=process.paging(request);
		model.addAttribute("bList", boardDao.selectMvcBoard(map));
		process.makePage();
		model.addAttribute("paging",process.getStringBuffer());
		return "/bootBoard/board";
	}
	@RequestMapping(value="hitBoard.do")
	public String mvcHitAction(int no,String job,String page,RedirectAttributes ar) {
		ar.addFlashAttribute("job", job);
		ar.addFlashAttribute("no", no);
		ar.addFlashAttribute("page", page);		
		boardDao.updateHitBoard(no);
		
		return "redirect:mvcBoardInfo.do";
	}
	@RequestMapping(value="download.do")
	public ModelAndView downloadProcess(@RequestParam(value="fileName",
	                 required=false,defaultValue="100.jpg")String fileName) {
		String loc="C:\\work3\\SpringCore\\web\\src\\main\\webapp\\upload\\";
		File file=new File(loc.concat(fileName));	
		return new ModelAndView("downLoadView","downLoadFile",file);
	}
	
	@RequestMapping(value="myPage.do")
	public String myPageActionProcess(HttpSession session) {
		String id=(String)session.getAttribute("id");
		if(id==null)return "redirect:/bootBoard/signin.jsp";//
		
		
		String  resValue=boardDao.idChekValue(id);
		if(id!=null && resValue!=null) {
			//dao.mypageInfo(id);
			String []res=resValue.split("#");
			HashSet<String>set=new HashSet<String>();
			HashMap<String, Object>map=new HashMap<String, Object>();
			for(String s:res) {
				set.add(s);
			}
			map.put("ck", set);			
			session.setAttribute("my",boardDao.selectMvcBoard(map));			
			return "redirect:/bootBoard/mypage.jsp";
		}else if(id!=null && resValue==null){
			return "redirect:/mvcList.do";
		}else {
			return "redirect:/bootBoard/signin.jsp";
		}
		
	}	
	@RequestMapping(value="mvcBoardInfo.do")
	public String mvcInfoAction(ModelMap m, HttpServletRequest request) {
		Map<String,?>map=RequestContextUtils.getInputFlashMap(request);
		if(map==null)return "redirect:/mvcList.do";  
			
		m.addAttribute("info",boardDao.selectInfoBoard(map));		
		if(map.get("job").toString().equals("info"))
			return "/bootBoard/info";
		else {
			return "/bootBoard/modify";
		}
	}
	
	@RequestMapping(value="infoCheck.do")
	public String infoCheckProcess(HttpSession session,String no,@RequestParam(value="job",required=false,defaultValue="new")String job){
		String id=(String)session.getAttribute("id");
		HashMap<String, Object>map=new HashMap<String,Object>();
		String infoIx=boardDao.idChekValue(id);
		map.put("id", id);					
		if(infoIx==null&& !boardDao.selectGetId(id)){
			map.put("infoIx", no+"#");	
			boardDao.insertidChekValue(map);			
		}
		else {
			if(job.equals("new")) {
				System.out.println("else if(job.equals(new))");
			map.put("infoIx", (infoIx==null?"":infoIx)+(no+"#"));//추가				
			System.out.println("appendCheck");
			}else if(job.equals("del")) {//5#9#15#
				String []res=infoIx.split("#");
				infoIx="";
				for(int i=0;i<res.length;i++) {
					if(res[i].equals(no))continue;
					infoIx+=res[i].concat("#");
				}			
				System.out.println(infoIx+"---------------infofix");
				map.put("infoIx", infoIx);
			}
			boardDao.updateidChekValue(map);
			return "redirect:/myPage.do";
		}		
		return "redirect:/mvcList.do";
	}

}
































































































































































































