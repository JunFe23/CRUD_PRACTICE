package sist.com.basic1.di;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;



public class Room {
	private List<Person>list;
	private Set<Person>set;	
	private Map<Integer, Person>map;
	private Properties  properties;
	
	
	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Map<Integer, Person> getMap() {
		return map;
	}

	public void setMap(Map<Integer, Person> map) {
		this.map = map;
	}

	public List<Person> getList() {
		return list;
	}
  
	public void setList(List<Person> list) {
		this.list = list;
	}

	public Set<Person> getSet() {
		return set;
	}

	public void setSet(Set<Person> set) {
		this.set = set;
	}

	@Override
	public String toString() {
		return "Room [list=" + list + "]";
	}
	
	

}
