package sist.com.web;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sist.com.bean.ParamBean;
import sist.com.bean.ServletAction;

@RestController
public class RestControllerEx {
	
	
	@RequestMapping(value="restData1.do")
	public String dataRestProcess1() {
		return "HelloSpringAjax";
	}
	
	@RequestMapping(value="restData2.do")
	public String dataRestProcess2() {
		return "<font color='red'>HelloSpringAjax</font>";
	}
	@RequestMapping(value="restData3.do")
	public ServletAction dataRestProcess3() {
		return new ServletAction("http:localhost:8080", 50, 1,"ServletSuccess");
	}
	
	@RequestMapping(value="restData4.do")
	public HashMap<String, Object> dataRestProcess4() {
		HashMap<String, Object>map=new HashMap<String,Object>();
		map.put("start", 1);
		map.put("end", 10);
		map.put("startPage", 10);
		map.put("endPage", 100);
		map.put("user", "AdminAccount");
		return map;
	}
	
	@PostMapping(value="restData6.do")
	//public String dataRestProcess6(@RequestParam(value="job",required=false,defaultValue="")String job) {
	public String dataRestProcess6(ParamBean bean) {
		//System.out.println("job="+job);
		//String script="alert('ScriptAction')";
		//return job.equals("factory")?"alert('ScriptAction')":"alert('SpringAction')";
		System.out.println(bean);
		return "alert('ScriptAction')";
	}
	

}









