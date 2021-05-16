package sist.com.bean;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class AjaxMyBatisDao implements AjaxDao{
	@Override
	public List<HashMap<String, Object>> selectMapList() {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String, Object>>list=new ArrayList<HashMap<String, Object>>();
		HashMap<String, Object>map=new HashMap<String, Object>();
		map.put("id", "BLUE1");
		map.put("name", "OOP1");
		map.put("email", "sist1@nate.com");
		
		
		HashMap<String, Object>map2=new HashMap<String, Object>();
		map2.put("id", "BLUE2");
		map2.put("name", "OOP2");
		map2.put("email", "sist2@nate.com");
		
		
		
		HashMap<String, Object>map3=new HashMap<String, Object>();
		map3.put("id", "BLUE3");
		map3.put("name", "OOP3");
		map3.put("email", "sist3@nate.com");
		list.add(map);
		list.add(map2);
		list.add(map3);
		
		return list;
	}

	@Override
	public Enumeration<HashMap<String, Object>> selectMapEnumeration() {
		// TODO Auto-generated method stub
		Vector<HashMap<String, Object>>list=new Vector<HashMap<String, Object>>(); 
		HashMap<String, Object>map=new HashMap<String, Object>();
		map.put("id", "BLUE1");
		map.put("name", "OOP1");
		map.put("email", "sist1@nate.com");
		
		
		HashMap<String, Object>map2=new HashMap<String, Object>();
		map2.put("id", "BLUE2");
		map2.put("name", "OOP2");
		map2.put("email", "sist2@nate.com");
		
		
		
		HashMap<String, Object>map3=new HashMap<String, Object>();
		map3.put("id", "BLUE3");
		map3.put("name", "OOP3");
		map3.put("email", "sist3@nate.com");
		list.add(map);
		list.add(map2);
		list.add(map3);
				
		return list.elements();
	}

	@Override
	public List<HashMap<String, Object>> selectMapVector() {
		// TODO Auto-generated method stub
		Vector<HashMap<String, Object>>list=new Vector<HashMap<String, Object>>(); 
		HashMap<String, Object>map=new HashMap<String, Object>();
		map.put("id", "BLUE1");
		map.put("name", "OOP1");
		map.put("email", "sist1@nate.com");
		
		HashMap<String, Object>map2=new HashMap<String, Object>();
		map2.put("id", "BLUE2");
		map2.put("name", "OOP2");
		map2.put("email", "sist2@nate.com");		
		HashMap<String, Object>map3=new HashMap<String, Object>();
		map3.put("id", "BLUE3");
		map3.put("name", "OOP3");
		map3.put("email", "sist3@nate.com");
		list.add(map);
		list.add(map2);
		list.add(map3);				
		return list;
	}
	

}
