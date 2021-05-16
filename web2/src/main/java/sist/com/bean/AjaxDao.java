package sist.com.bean;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

public interface AjaxDao {	
	public List<HashMap<String,Object>>selectMapList();
	public Enumeration<HashMap<String, Object>> selectMapEnumeration();
	public List<HashMap<String, Object>> selectMapVector();
}
