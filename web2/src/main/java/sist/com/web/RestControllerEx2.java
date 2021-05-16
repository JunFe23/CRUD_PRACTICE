package sist.com.web;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import sist.com.bean.AjaxDao;

@RestController
public class RestControllerEx2 {
	
	@Resource(name="ajaxMyBatisDao")
	//@Autowired
	private AjaxDao ajaxDao;
	
	
	@GetMapping(value="dataAjax1")
	public List<HashMap<String,Object>> dataAjaxProcess1(String job,int no) {	
		return ajaxDao.selectMapList();
	}
	@PostMapping(value="dataAjax2")
	public Iterator<HashMap<String,Object>> dataAjaxProcess2() {	
		return ajaxDao.selectMapList().iterator();
	}
	
	@GetMapping({"dataAjax3","dataAjax4"})
	public  List<HashMap<String, Object>> dataAjaxProcess3() {	
		return  ajaxDao.selectMapVector();
	}

}








