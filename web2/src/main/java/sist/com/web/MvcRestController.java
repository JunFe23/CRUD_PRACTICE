package sist.com.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import sist.com.dao.OrangeBasicDao;

@RestController
public class MvcRestController {
	
	@Resource(name="orangeDao")
	private OrangeBasicDao dao;	
	
	@GetMapping(value="deptList.do")
	public List<Map<String,Object>>selectDeptJson(@RequestParam(value="state",defaultValue="big",required=false)String state){
		HashMap<String, Object>map=new HashMap<String, Object>();
		map.put("state", state);
		return dao.deptListAction(map);
	}
}
















